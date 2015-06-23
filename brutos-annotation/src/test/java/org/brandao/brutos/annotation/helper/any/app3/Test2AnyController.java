package org.brandao.brutos.annotation.helper.any.app3;

import java.util.List;
import java.util.Map;

import org.brandao.brutos.annotation.Any;
import org.brandao.brutos.annotation.Basic;
import org.brandao.brutos.annotation.Controller;
import org.brandao.brutos.annotation.ElementCollection;
import org.brandao.brutos.annotation.KeyCollection;
import org.brandao.brutos.annotation.MetaValue;

@Controller("/controller")
public class Test2AnyController {

	@Basic(bean="propertyA")
	@KeyCollection(
		any=
			@Any(
				metaBean=@Basic(bean="propertyType"),
				metaType=String.class,
				metaValues={
					@MetaValue(name="decimal", target=DecimalProperty.class),
					@MetaValue(name="set", target=SetProperty.class)
				}
			)
		)
	public Map<Property,String> property1;
	
	private Map<Property,String> property2;

	public Map<Property,String> getProperty2() {
		return property2;
	}

	@Basic(bean="propertyB")
	@KeyCollection(
		any=
			@Any(
				metaBean=@Basic(bean="propertyType2"),
				metaType=String.class,
				metaValues={
					@MetaValue(name="decimal", target=DecimalProperty.class),
					@MetaValue(name="set", target=SetProperty.class)
				}
			)
		)
	public void setProperty2(Map<Property,String> property2) {
		this.property2 = property2;
	}
	
	
}