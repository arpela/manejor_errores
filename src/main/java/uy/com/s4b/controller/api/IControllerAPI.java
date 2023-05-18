package uy.com.s4b.controller.api;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author arpela
 *
 */
@RestController()
@RequestMapping(IControllerAPI.CONTENT_BASE)
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Mapping
public @interface IControllerAPI {
	public static final String CONTENT_BASE = "/prueba/api/v1";
}

