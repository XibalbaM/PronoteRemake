package libs.arilibfx.auth.premium.exceptions;

import libs.arilibfx.auth.premium.responses.ErrorResponse;

/**
 * Created by Arinonia on 10/04/2020 inside the package - libs.arilibfx.auth.premium.exceptions
 */
public class AuthenticationUnavailableException extends Exception {

    public AuthenticationUnavailableException(ErrorResponse error) {

    }
}
