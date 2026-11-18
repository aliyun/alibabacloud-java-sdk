// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetMessageCallbackRequest extends TeaModel {
    /**
     * <p>The application ID. If you do not specify this parameter, the ID of the default application is used, which is fixed at <strong>app-1000000</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>app-1000000</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The authentication key. The key can be up to 32 characters in length and must contain both uppercase and lowercase letters and digits. You can set this parameter when the callback method is set to <strong>HTTP</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>Dsf346dvet</p>
     */
    @NameInMap("AuthKey")
    public String authKey;

    /**
     * <p>Specifies whether to enable authentication for HTTP callbacks. This parameter takes effect only when the callback method is set to <strong>HTTP</strong>. Valid values:</p>
     * <ul>
     * <li><strong>on</strong>: Enabled.</li>
     * <li><strong>off</strong>: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("AuthSwitch")
    public String authSwitch;

    /**
     * <p>The callback method. Valid values:</p>
     * <ul>
     * <li><strong>HTTP</strong></li>
     * <li><strong>Simple MSMQ (formerly MNS)</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HTTP</p>
     */
    @NameInMap("CallbackType")
    public String callbackType;

    /**
     * <p>The callback URL. This parameter is required when the callback method is set to <strong>HTTP</strong>.
     * The callback URL cannot exceed 256 bytes in length. You cannot specify multiple callback URLs.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://developer.aliyundoc.com">http://developer.aliyundoc.com</a></p>
     */
    @NameInMap("CallbackURL")
    public String callbackURL;

    /**
     * <p>The callback event types. If this parameter is left empty, all message notifications are disabled. If this parameter is set to <strong>ALL</strong>, all message notifications are enabled. You can also specify specific event types to enable. Separate multiple event types with commas (,). For more information about the valid values, see <a href="https://help.aliyun.com/document_detail/55627.html">Event types</a>.</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <blockquote>
     * <p>All AI-related events, such as AIMediaAuditComplete and AIMediaDNAComplete, use the value <strong>AIComplete</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>FileUploadComplete</p>
     */
    @NameInMap("EventTypeList")
    public String eventTypeList;

    /**
     * <p>The public endpoint of the MSMQ. Settings for this parameter are required when the callback method is set to <strong>Simple MSMQ (formerly MNS)</strong>. You can logon to the <a href="https://account.aliyun.com/login/login.html">Message Service console</a> and click the <strong>Get Endpoint</strong> button in the upper-right corner to obtain the endpoint. For more information, see <a href="https://help.aliyun.com/document_detail/27480.html">Endpoints</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>http://****.mns.cn-shanghai.aliyuncs.com/</p>
     */
    @NameInMap("MnsEndpoint")
    public String mnsEndpoint;

    /**
     * <p>The name of the MSMQ. You can logon to the <a href="https://account.aliyun.com/login/login.html">Message Service console</a> and view the name in the <strong>Queue List</strong>. Settings for this parameter are required when the callback method is set to <strong>Simple MSMQ (formerly MNS)</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>quene_name</p>
     */
    @NameInMap("MnsQueueName")
    public String mnsQueueName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    public static SetMessageCallbackRequest build(java.util.Map<String, ?> map) throws Exception {
        SetMessageCallbackRequest self = new SetMessageCallbackRequest();
        return TeaModel.build(map, self);
    }

    public SetMessageCallbackRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SetMessageCallbackRequest setAuthKey(String authKey) {
        this.authKey = authKey;
        return this;
    }
    public String getAuthKey() {
        return this.authKey;
    }

    public SetMessageCallbackRequest setAuthSwitch(String authSwitch) {
        this.authSwitch = authSwitch;
        return this;
    }
    public String getAuthSwitch() {
        return this.authSwitch;
    }

    public SetMessageCallbackRequest setCallbackType(String callbackType) {
        this.callbackType = callbackType;
        return this;
    }
    public String getCallbackType() {
        return this.callbackType;
    }

    public SetMessageCallbackRequest setCallbackURL(String callbackURL) {
        this.callbackURL = callbackURL;
        return this;
    }
    public String getCallbackURL() {
        return this.callbackURL;
    }

    public SetMessageCallbackRequest setEventTypeList(String eventTypeList) {
        this.eventTypeList = eventTypeList;
        return this;
    }
    public String getEventTypeList() {
        return this.eventTypeList;
    }

    public SetMessageCallbackRequest setMnsEndpoint(String mnsEndpoint) {
        this.mnsEndpoint = mnsEndpoint;
        return this;
    }
    public String getMnsEndpoint() {
        return this.mnsEndpoint;
    }

    public SetMessageCallbackRequest setMnsQueueName(String mnsQueueName) {
        this.mnsQueueName = mnsQueueName;
        return this;
    }
    public String getMnsQueueName() {
        return this.mnsQueueName;
    }

    public SetMessageCallbackRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

}
