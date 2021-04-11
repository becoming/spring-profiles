Repo to test the order of profiles overrides in spring boot apps.
https://spring.io/projects/spring-boot#learn

General rule

1. [spring-boot / profiles](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#boot-features-profiles)
1. [spring-boot / external-config-files-profile-specific](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#boot-features-external-config-files-profile-specific)

> Profile-specific properties are loaded from the same locations as standard application.properties, with profile-specific files always overriding the non-specific ones. If several profiles are specified, a __last-wins strategy__ applies. 
> 
> For example, if profiles prod,live are specified by the spring.profiles.active property, values in application-prod.properties can be overridden by those in application-live.properties.

The __default__ profile

> The Environment has a set of default profiles (by default, [default]) that are used __if no active profiles are set__. In other words, if no profiles are explicitly activated, then properties from application-default are considered.