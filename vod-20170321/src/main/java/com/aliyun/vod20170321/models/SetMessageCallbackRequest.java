// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetMessageCallbackRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("CallbackSwitch")
    public String callbackSwitch;

    @NameInMap("CallbackType")
    public String callbackType;

    @NameInMap("CallbackURL")
    public String callbackURL;

    @NameInMap("EventTypeList")
    public String eventTypeList;

    @NameInMap("AuthSwitch")
    public String authSwitch;

    @NameInMap("AuthKey")
    public String authKey;

    @NameInMap("ResourceRealOwnerId")
    public Long resourceRealOwnerId;

    @NameInMap("MnsEndpoint")
    public String mnsEndpoint;

    @NameInMap("MnsQueueName")
    public String mnsQueueName;

    @NameInMap("AppId")
    public String appId;

    public static SetMessageCallbackRequest build(java.util.Map<String, ?> map) throws Exception {
        SetMessageCallbackRequest self = new SetMessageCallbackRequest();
        return TeaModel.build(map, self);
    }

    public SetMessageCallbackRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public SetMessageCallbackRequest setCallbackSwitch(String callbackSwitch) {
        this.callbackSwitch = callbackSwitch;
        return this;
    }
    public String getCallbackSwitch() {
        return this.callbackSwitch;
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

    public SetMessageCallbackRequest setAuthSwitch(String authSwitch) {
        this.authSwitch = authSwitch;
        return this;
    }
    public String getAuthSwitch() {
        return this.authSwitch;
    }

    public SetMessageCallbackRequest setAuthKey(String authKey) {
        this.authKey = authKey;
        return this;
    }
    public String getAuthKey() {
        return this.authKey;
    }

    public SetMessageCallbackRequest setResourceRealOwnerId(Long resourceRealOwnerId) {
        this.resourceRealOwnerId = resourceRealOwnerId;
        return this;
    }
    public Long getResourceRealOwnerId() {
        return this.resourceRealOwnerId;
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

    public SetMessageCallbackRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
