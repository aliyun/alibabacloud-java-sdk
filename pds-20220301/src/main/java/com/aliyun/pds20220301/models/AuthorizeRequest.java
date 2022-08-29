// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class AuthorizeRequest extends TeaModel {
    @NameInMap("client_id")
    public String clientId;

    @NameInMap("hide_consent")
    public Boolean hideConsent;

    @NameInMap("login_type")
    public String loginType;

    @NameInMap("redirect_uri")
    public String redirectUri;

    @NameInMap("response_type")
    public String responseType;

    @NameInMap("scope")
    public java.util.List<String> scope;

    @NameInMap("state")
    public String state;

    public static AuthorizeRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeRequest self = new AuthorizeRequest();
        return TeaModel.build(map, self);
    }

    public AuthorizeRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public AuthorizeRequest setHideConsent(Boolean hideConsent) {
        this.hideConsent = hideConsent;
        return this;
    }
    public Boolean getHideConsent() {
        return this.hideConsent;
    }

    public AuthorizeRequest setLoginType(String loginType) {
        this.loginType = loginType;
        return this;
    }
    public String getLoginType() {
        return this.loginType;
    }

    public AuthorizeRequest setRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
        return this;
    }
    public String getRedirectUri() {
        return this.redirectUri;
    }

    public AuthorizeRequest setResponseType(String responseType) {
        this.responseType = responseType;
        return this;
    }
    public String getResponseType() {
        return this.responseType;
    }

    public AuthorizeRequest setScope(java.util.List<String> scope) {
        this.scope = scope;
        return this;
    }
    public java.util.List<String> getScope() {
        return this.scope;
    }

    public AuthorizeRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
