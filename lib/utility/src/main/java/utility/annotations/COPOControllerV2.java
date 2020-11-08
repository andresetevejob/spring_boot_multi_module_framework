package utility.annotations;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target ({ ElementType.TYPE, ElementType.METHOD})
@Retention (RetentionPolicy.RUNTIME)
@RestController
@PreAuthorize ("isAuthenticated()")
@RequestMapping ("/api/v2")
public @interface COPOControllerV2 {
}
