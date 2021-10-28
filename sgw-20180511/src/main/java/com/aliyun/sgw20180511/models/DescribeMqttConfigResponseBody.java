// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeMqttConfigResponseBody extends TeaModel {
    @NameInMap("AuthType")
    public String authType;

    @NameInMap("BrokerUrl")
    public String brokerUrl;

    @NameInMap("Code")
    public String code;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("InternalBrokerUrl")
    public String internalBrokerUrl;

    @NameInMap("IsEnabled")
    public Boolean isEnabled;

    @NameInMap("Message")
    public String message;

    @NameInMap("MqttInstanceId")
    public String mqttInstanceId;

    @NameInMap("Password")
    public String password;

    @NameInMap("PublishTopic")
    public String publishTopic;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SubscribeTopic")
    public String subscribeTopic;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Username")
    public String username;

    public static DescribeMqttConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMqttConfigResponseBody self = new DescribeMqttConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMqttConfigResponseBody setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public DescribeMqttConfigResponseBody setBrokerUrl(String brokerUrl) {
        this.brokerUrl = brokerUrl;
        return this;
    }
    public String getBrokerUrl() {
        return this.brokerUrl;
    }

    public DescribeMqttConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeMqttConfigResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeMqttConfigResponseBody setInternalBrokerUrl(String internalBrokerUrl) {
        this.internalBrokerUrl = internalBrokerUrl;
        return this;
    }
    public String getInternalBrokerUrl() {
        return this.internalBrokerUrl;
    }

    public DescribeMqttConfigResponseBody setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
        return this;
    }
    public Boolean getIsEnabled() {
        return this.isEnabled;
    }

    public DescribeMqttConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeMqttConfigResponseBody setMqttInstanceId(String mqttInstanceId) {
        this.mqttInstanceId = mqttInstanceId;
        return this;
    }
    public String getMqttInstanceId() {
        return this.mqttInstanceId;
    }

    public DescribeMqttConfigResponseBody setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public DescribeMqttConfigResponseBody setPublishTopic(String publishTopic) {
        this.publishTopic = publishTopic;
        return this;
    }
    public String getPublishTopic() {
        return this.publishTopic;
    }

    public DescribeMqttConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMqttConfigResponseBody setSubscribeTopic(String subscribeTopic) {
        this.subscribeTopic = subscribeTopic;
        return this;
    }
    public String getSubscribeTopic() {
        return this.subscribeTopic;
    }

    public DescribeMqttConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeMqttConfigResponseBody setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
