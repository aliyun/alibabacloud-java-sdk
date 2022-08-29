// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class AuthorizeShrinkRequest extends TeaModel {
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
    public String scopeShrink;

    @NameInMap("state")
    public String state;

    public static AuthorizeShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeShrinkRequest self = new AuthorizeShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AuthorizeShrinkRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public AuthorizeShrinkRequest setHideConsent(Boolean hideConsent) {
        this.hideConsent = hideConsent;
        return this;
    }
    public Boolean getHideConsent() {
        return this.hideConsent;
    }

    public AuthorizeShrinkRequest setLoginType(String loginType) {
        this.loginType = loginType;
        return this;
    }
    public String getLoginType() {
        return this.loginType;
    }

    public AuthorizeShrinkRequest setRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
        return this;
    }
    public String getRedirectUri() {
        return this.redirectUri;
    }

    public AuthorizeShrinkRequest setResponseType(String responseType) {
        this.responseType = responseType;
        return this;
    }
    public String getResponseType() {
        return this.responseType;
    }

    public AuthorizeShrinkRequest setScopeShrink(String scopeShrink) {
        this.scopeShrink = scopeShrink;
        return this;
    }
    public String getScopeShrink() {
        return this.scopeShrink;
    }

    public AuthorizeShrinkRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
