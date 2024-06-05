// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class AuthorizeShrinkRequest extends TeaModel {
    /**
     * <p>The application ID returned when the application was created.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("client_id")
    public String clientId;

    /**
     * <p>Specifies whether to hide the consent page.</p>
     */
    @NameInMap("hide_consent")
    public Boolean hideConsent;

    /**
     * <p>The authentication method. Valid values:</p>
     * <br>
     * <p>*   default: all logon methods that are integrated on the default logon page provided by Drive and Photo Service.</p>
     * <p>*   ding: logs on by scanning a DingTalk QR code.</p>
     * <p>*   ding_sns: logs on by entering a DingTalk account and its password.</p>
     * <p>*   ram: logs on as an Alibaba Cloud Resource Access Management (RAM) user.</p>
     * <p>*   wechat: logs on by scanning a WeCom QR code.</p>
     * <p>*   wechat_app: logs on without authentication in WeCom.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("login_type")
    public String loginType;

    /**
     * <p>The callback URL specified when the application was created.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("redirect_uri")
    public String redirectUri;

    /**
     * <p>The format in which to return the response. Set the value to code.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("response_type")
    public String responseType;

    /**
     * <p>The requested permissions. By default, all permissions are requested.</p>
     */
    @NameInMap("scope")
    public String scopeShrink;

    /**
     * <p>The user-defined parameter to return in the callback URL after the requested permissions are granted.</p>
     */
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
