// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetMessageCallbackRequest extends TeaModel {
    /**
     * <p>The ID of the application. If you leave this parameter empty, the default value <strong>app-1000000</strong> is used.</p>
     * 
     * <strong>example:</strong>
     * <p>app-1000000</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The authentication key. The key can be up to 32 characters in length and must contain uppercase letters, lowercase letters, and digits. This parameter takes effect only when you set CallbackType to <strong>HTTP</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>dsf346dvet</p>
     */
    @NameInMap("AuthKey")
    public String authKey;

    /**
     * <p>Specifies whether to enable callback authentication. This parameter takes effect only when you set CallbackType to <strong>HTTP</strong>. Valid values:</p>
     * <ul>
     * <li><strong>on</strong></li>
     * <li><strong>off</strong></li>
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
     * <li><strong>MNS</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HTTP</p>
     */
    @NameInMap("CallbackType")
    public String callbackType;

    /**
     * <p>The callback URL. This parameter is required if you set CallbackType to <strong>HTTP</strong>. The callback URL cannot exceed 256 bytes in length. You can specify only one callback URL.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://developer.aliyundoc.com">http://developer.aliyundoc.com</a></p>
     */
    @NameInMap("CallbackURL")
    public String callbackURL;

    /**
     * <p>The type of the callback event. If you do not set this parameter, notifications for all types of events are disabled. If you set this parameter to <strong>ALL</strong>, notifications for all types of events are enabled. You can specify the event types for which notifications are enabled. Separate multiple event types with commas (,). For more information about the valid values of this parameter, see <a href="https://help.aliyun.com/document_detail/55627.html">Overview</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>FileUploadComplete</p>
     */
    @NameInMap("EventTypeList")
    public String eventTypeList;

    /**
     * <p>The public endpoint of Message Service (MNS). This parameter only takes effect when the CallbackType parameter is set to <strong>MNS</strong>. To obtain the public endpoint, log on to the <a href="https://account.aliyun.com/login/login.html">MNS console</a> and click <strong>Get Endpoint</strong> in the upper-right corner of the Topics page. For more information, see <a href="https://help.aliyun.com/document_detail/27480.html">Endpoint</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>http://****.mns.cn-shanghai.aliyuncs.com/</p>
     */
    @NameInMap("MnsEndpoint")
    public String mnsEndpoint;

    /**
     * <p>The name of the MNS queue. You can obtain the name of the MNS queue on the <strong>Queues</strong> page in the <a href="https://account.aliyun.com/login/login.html">MNS console</a>. This parameter is required when you set CallbackType to <strong>MNS</strong>.</p>
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
