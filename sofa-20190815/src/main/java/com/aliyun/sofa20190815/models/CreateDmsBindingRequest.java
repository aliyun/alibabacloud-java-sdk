// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateDmsBindingRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("Eventcode")
    public String eventcode;

    @NameInMap("ExchangeType")
    public String exchangeType;

    @NameInMap("Expression")
    public String expression;

    @NameInMap("Group")
    public String group;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Persistence")
    public Boolean persistence;

    @NameInMap("Topic")
    public String topic;

    public static CreateDmsBindingRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDmsBindingRequest self = new CreateDmsBindingRequest();
        return TeaModel.build(map, self);
    }

    public CreateDmsBindingRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateDmsBindingRequest setEventcode(String eventcode) {
        this.eventcode = eventcode;
        return this;
    }
    public String getEventcode() {
        return this.eventcode;
    }

    public CreateDmsBindingRequest setExchangeType(String exchangeType) {
        this.exchangeType = exchangeType;
        return this;
    }
    public String getExchangeType() {
        return this.exchangeType;
    }

    public CreateDmsBindingRequest setExpression(String expression) {
        this.expression = expression;
        return this;
    }
    public String getExpression() {
        return this.expression;
    }

    public CreateDmsBindingRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public CreateDmsBindingRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateDmsBindingRequest setPersistence(Boolean persistence) {
        this.persistence = persistence;
        return this;
    }
    public Boolean getPersistence() {
        return this.persistence;
    }

    public CreateDmsBindingRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
