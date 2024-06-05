// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class TokenRequest extends TeaModel {
    /**
     * <p>The JWT assertion that is signed by using the JWT private key. The JWT assertion contains the information about the user to be authorized and the authorization parameters. For more information about the structure of the JWT assertion, see JWTPayload. This parameter is required if grant_type is set to urn:ietf:params:oauth:grant-type:jwt-bearer.</p>
     */
    @NameInMap("assertion")
    public String assertion;

    /**
     * <p>The AppId of the application that is created in the Drive and Photo Service console.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("client_id")
    public String clientId;

    /**
     * <p>The AppSecret of the application that is created in the Drive and Photo Service console. This parameter is required if the application is of the WebServer type.</p>
     */
    @NameInMap("client_secret")
    public String clientSecret;

    /**
     * <p>The authorization code in the redirect URI that is specified after the authorization process is complete. This parameter is required if grant_type is set to authorization_code.</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The method that is used to generate an access token. Valid values:</p>
     * <br>
     * <p>authorization_code: generates an access token by using the authorization code that is returned after the authorization process is complete.</p>
     * <br>
     * <p>refresh_token: generates an access token by using the refresh token that is returned after the authorization process is complete.</p>
     * <br>
     * <p>urn:ietf:params:oauth:grant-type:jwt-bearer: generates an access token by using a JWT assertion.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("grant_type")
    public String grantType;

    /**
     * <p>The redirect URI that is specified when you initiate the authorization request. This parameter is required if grant_type is set to authorization_code.</p>
     */
    @NameInMap("redirect_uri")
    public String redirectUri;

    /**
     * <p>The refresh token that is used to refresh the access token. This parameter is required if grant_type is set to refresh_token.</p>
     */
    @NameInMap("refresh_token")
    public String refreshToken;

    public static TokenRequest build(java.util.Map<String, ?> map) throws Exception {
        TokenRequest self = new TokenRequest();
        return TeaModel.build(map, self);
    }

    public TokenRequest setAssertion(String assertion) {
        this.assertion = assertion;
        return this;
    }
    public String getAssertion() {
        return this.assertion;
    }

    public TokenRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public TokenRequest setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    public String getClientSecret() {
        return this.clientSecret;
    }

    public TokenRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TokenRequest setGrantType(String grantType) {
        this.grantType = grantType;
        return this;
    }
    public String getGrantType() {
        return this.grantType;
    }

    public TokenRequest setRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
        return this;
    }
    public String getRedirectUri() {
        return this.redirectUri;
    }

    public TokenRequest setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }
    public String getRefreshToken() {
        return this.refreshToken;
    }

}
