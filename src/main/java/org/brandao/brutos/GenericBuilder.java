/*
 * Brutos Web MVC http://www.brutosframework.com.br/
 * Copyright (C) 2009-2017 Afonso Brandao. (afonso.rbn@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.brandao.brutos;

import org.brandao.brutos.type.Type;

/**
 * 
 * @author Brandao
 */
public interface GenericBuilder 
	extends ComponentBuilder{

	MetaBeanBuilder buildMetaBean(String name, Class<?> classType);

	MetaBeanBuilder buildMetaBean(String name, EnumerationType enumProperty,
			String temporalProperty, Class<?> classType);

	MetaBeanBuilder buildMetaBean(String name, Type type);

	MetaBeanBuilder buildMetaBean(String name, ScopeType scope,
			Class<?> classType);

	MetaBeanBuilder buildMetaBean(String name, ScopeType scope, Type type);

	MetaBeanBuilder buildMetaBean(String name, ScopeType scope,
			EnumerationType enumProperty, String temporalProperty,
			Class<?> classType, Type type);

}
