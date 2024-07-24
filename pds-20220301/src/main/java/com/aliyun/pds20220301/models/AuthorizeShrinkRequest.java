// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class AuthorizeShrinkRequest extends TeaModel {
    /**
     * <p>The application ID returned when the application was created.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>47eUHhrzgWBvlLWj</p>
     */
    @NameInMap("client_id")
    public String clientId;

    /**
     * <p>Specifies whether to hide the consent page.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("hide_consent")
    public Boolean hideConsent;

    /**
     * <p>The authentication method. Valid values:</p>
     * <ul>
     * <li>default: all logon methods that are integrated on the default logon page provided by Drive and Photo Service.</li>
     * <li>ding: logs on by scanning a DingTalk QR code.</li>
     * <li>ding_sns: logs on by entering a DingTalk account and its password.</li>
     * <li>ram: logs on as an Alibaba Cloud Resource Access Management (RAM) user.</li>
     * <li>wechat: logs on by scanning a WeCom QR code.</li>
     * <li>wechat_app: logs on without authentication in WeCom.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("login_type")
    public String loginType;

    /**
     * <p>The callback URL specified when the application was created.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://www.aliyunpds.com/sign/callback">https://www.aliyunpds.com/sign/callback</a></p>
     */
    @NameInMap("redirect_uri")
    public String redirectUri;

    /**
     * <p>The format in which to return the response. Set the value to code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>code</p>
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
     * 
     * <strong>example:</strong>
     * <p>customdata</p>
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
