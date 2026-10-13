// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class TokenRequest extends TeaModel {
    /**
     * <p>A JWT-signed string that contains user information and authorization parameters to be granted. For the structure, see JWTPayload. This parameter is required when <code>grant_type</code> is <code>urn:ietf:params:oauth:grant-type:jwt-bearer</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>ey***asd</p>
     */
    @NameInMap("assertion")
    public String assertion;

    /**
     * <p>The ID of the app you create in the Alibaba Cloud PDS console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1Zu***flH</p>
     */
    @NameInMap("client_id")
    public String clientId;

    /**
     * <p>The secret of the app you create in the Alibaba Cloud PDS console. This parameter is required for WebServer applications.</p>
     * 
     * <strong>example:</strong>
     * <p>80D***3i5</p>
     */
    @NameInMap("client_secret")
    public String clientSecret;

    /**
     * <p>The authorization code returned in the redirect URI after successful authentication. This parameter is required when <code>grant_type</code> is <code>authorization_code</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>0045157fa8e24f4f9a0d9e3ff158c1e0</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The grant type. Valid values:</p>
     * <p><code>authorization_code</code>: Exchanges an authorization code, returned after successful authentication, for an access token.</p>
     * <p><code>refresh_token</code>: Uses a refresh token from a previous authorization to obtain a new access token.</p>
     * <p><code>urn:ietf:params:oauth:grant-type:jwt-bearer</code>: Obtains an access token by using a JWT.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>refresh_token</p>
     */
    @NameInMap("grant_type")
    public String grantType;

    /**
     * <p>The redirect URI used in the authorization request. This parameter is required when <code>grant_type</code> is <code>authorization_code</code>.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://aliyun.com/pds">https://aliyun.com/pds</a></p>
     */
    @NameInMap("redirect_uri")
    public String redirectUri;

    /**
     * <p>The token used to refresh an access token. This parameter is required when <code>grant_type</code> is <code>refresh_token</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>399623e13353490391266c7d48a13ed1</p>
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
