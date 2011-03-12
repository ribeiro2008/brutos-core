/*
 * Brutos Web MVC http://brutos.sourceforge.net/
 * Copyright (C) 2009 Afonso Brandao. (afonso.rbn@gmail.com)
 *
 * This library is free software. You can redistribute it
 * and/or modify it under the terms of the GNU General Public
 * License (GPL) version 3.0 or (at your option) any later
 * version.
 * You may obtain a copy of the License at
 *
 * http://www.gnu.org/licenses/gpl.html
 *
 * Distributed WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied.
 *
 */
package org.brandao.brutos.io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 *
 * @author Brandao
 */
public class ClassPathResource extends AbstractResource{

    private Class clazz;
    
    private ClassLoader classLoader;

    private String path;

    public ClassPathResource( ClassLoader classLoader, String path ){
        this( null, classLoader, path );
    }

    public ClassPathResource( Class clazz, String path ){
        this( clazz, null, path );
    }

    public ClassPathResource( Class clazz, ClassLoader classLoader, String path ){

        path = path.startsWith("/")?
            path.substring(1,path.length()):
            path;

        this.classLoader = classLoader != null?
            classLoader :
            Thread.currentThread().getContextClassLoader();

        this.path = path;
    }

    public URL getURL() throws IOException {
        URL   url = null;

        if (this.clazz != null)
            url = this.clazz.getResource(this.path);
        else
            url = this.classLoader.getResource(this.path);

        if (url == null)
            throw new FileNotFoundException  (
                 this.path + " URL does not exist");


         return url;
    }

    public Resource getRelativeResource(String relativePath) throws IOException {
        return new ClassPathResource(
                clazz,
                classLoader,
                this.createRelativePath(this.path, relativePath) );
    }

    public InputStream getInputStream() throws IOException{
        InputStream input = null;

        if( this.clazz != null )
            input = this.clazz.getResourceAsStream(this.path);
        else
        if( this.classLoader != null )
            input = this.classLoader.getResourceAsStream(this.path);

         if (input == null)
             throw new FileNotFoundException(
                     this.path + " does not exist");

        return input;
    }

    public boolean exists() {
        try{
            InputStream is = getInputStream();
            is.close();
            return true;
        }
        catch( IOException e ){
            return false;
        }

    }

}