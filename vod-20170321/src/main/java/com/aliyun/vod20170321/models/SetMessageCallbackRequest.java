// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetMessageCallbackRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("AuthKey")
    public String authKey;

    @NameInMap("AuthSwitch")
    public String authSwitch;

    @NameInMap("CallbackType")
    public String callbackType;

    @NameInMap("CallbackURL")
    public String callbackURL;

    @NameInMap("EventTypeList")
    public String eventTypeList;

    @NameInMap("MnsEndpoint")
    public String mnsEndpoint;

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
