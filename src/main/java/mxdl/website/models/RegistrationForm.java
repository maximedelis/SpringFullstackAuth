package mxdl.website.models;

import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record RegistrationForm (

    @Size(min = 4, max = 16)
    @Pattern(regexp = "[ -~]*", message = "username must contain printable ascii characters")
    String username,

    @Size(min = 8, max = 64)
    String password

) {}