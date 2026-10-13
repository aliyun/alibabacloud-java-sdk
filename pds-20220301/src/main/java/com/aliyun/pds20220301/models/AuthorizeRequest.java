// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class AuthorizeRequest extends TeaModel {
    /**
     * <p>The client ID assigned when you create an app.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>47eUHhrzgWBvlLWj</p>
     */
    @NameInMap("client_id")
    public String clientId;

    /**
     * <p>Specifies whether to hide the consent page. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("hide_consent")
    public Boolean hideConsent;

    /**
     * <p>The authentication method. Valid values:</p>
     * <ul>
     * <li><p>default (The default PDS login page that integrates all authentication methods)</p>
     * </li>
     * <li><p>ding (Log in on a PC by scanning a QR code with DingTalk)</p>
     * </li>
     * <li><p>ding_sns (Log in on a mobile phone with a DingTalk username and password)</p>
     * </li>
     * <li><p>ram (Log in with an Alibaba Cloud RAM user)</p>
     * </li>
     * <li><p>wechat (Log in with WeCom by scanning a QR code)</p>
     * </li>
     * <li><p>wechat_app (Single Sign-On (SSO) within the WeCom app)</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("login_type")
    public String loginType;

    /**
     * <p>The redirect URI specified when you created the app. This URI must be URL-encoded.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>https%3A%2F%2F<a href="http://www.aliyunpds.com%2Fsign%2Fcallback">www.aliyunpds.com%2Fsign%2Fcallback</a></p>
     */
    @NameInMap("redirect_uri")
    public String redirectUri;

    /**
     * <p>The response type. This parameter must be set to code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>code</p>
     */
    @NameInMap("response_type")
    public String responseType;

    /**
     * <p>The requested permissions. If omitted, the request defaults to all permissions.</p>
     */
    @NameInMap("scope")
    public java.util.List<String> scope;

    /**
     * <p>A value to maintain state between the request and callback. This value is returned to your redirect URI. We recommend using this parameter to prevent cross-site request forgery (CSRF) attacks.</p>
     * 
     * <strong>example:</strong>
     * <p>customdata</p>
     */
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
