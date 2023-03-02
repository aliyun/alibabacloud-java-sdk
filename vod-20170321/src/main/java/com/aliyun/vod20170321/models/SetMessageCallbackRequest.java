// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetMessageCallbackRequest extends TeaModel {
    /**
     * <p>The ID of the application. If you do not set this parameter, the default value **app-1000000** is used.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The cryptographic key. This parameter only takes effect when the CallbackType parameter is set to HTTP. The key can be up to 32 characters in length and must contain uppercase letters, lowercase letters, and digits.</p>
     */
    @NameInMap("AuthKey")
    public String authKey;

    /**
     * <p>Specifies whether to enable callback authentication. This parameter only takes effect when the CallbackType parameter is set to HTTP. Valid values:</p>
     * <br>
     * <p>*   **on**: enables authentication.</p>
     * <p>*   **off**: disables authentication.</p>
     */
    @NameInMap("AuthSwitch")
    public String authSwitch;

    /**
     * <p>The callback method. Valid values:</p>
     * <br>
     * <p>*   **HTTP**</p>
     * <p>*   **MNS**</p>
     */
    @NameInMap("CallbackType")
    public String callbackType;

    /**
     * <p>The callback URL. This parameter only takes effect when the CallbackType parameter is set to HTTP.</p>
     */
    @NameInMap("CallbackURL")
    public String callbackURL;

    /**
     * <p>The type of the callback event. If you do not set this parameter, notifications for all types of events are disabled. If you set this parameter to ALL, notifications for all types of events are enabled. You can specify the event types for which notifications are enabled. Separate multiple event types with commas (,). For more information about the valid values of this parameter, see [Event type](~~55627~~).</p>
     */
    @NameInMap("EventTypeList")
    public String eventTypeList;

    /**
     * <p>The public endpoint of Message Service (MNS). This parameter only takes effect when the CallbackType parameter is set to MNS. For more information, see [Endpoint](~~27480#concept-2028913~~ "An endpoint is the address that you specify for a subscription to receive messages. When messages are published to a topic, Message Service (MNS) pushes the messages to the specified endpoints. You can specify the same endpoint for multiple subscriptions.").</p>
     */
    @NameInMap("MnsEndpoint")
    public String mnsEndpoint;

    /**
     * <p>The name of the MNS queue. This parameter only takes effect when the CallbackType parameter is set to MNS.</p>
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
