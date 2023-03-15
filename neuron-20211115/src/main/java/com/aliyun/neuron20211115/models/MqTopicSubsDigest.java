// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class MqTopicSubsDigest extends TeaModel {
    @NameInMap("MessageModel")
    public String messageModel;

    @NameInMap("ServiceId")
    public String serviceId;

    @NameInMap("ServiceName")
    public String serviceName;

    @NameInMap("SubsExpression")
    public String subsExpression;

    public static MqTopicSubsDigest build(java.util.Map<String, ?> map) throws Exception {
        MqTopicSubsDigest self = new MqTopicSubsDigest();
        return TeaModel.build(map, self);
    }

    public MqTopicSubsDigest setMessageModel(String messageModel) {
        this.messageModel = messageModel;
        return this;
    }
    public String getMessageModel() {
        return this.messageModel;
    }

    public MqTopicSubsDigest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public MqTopicSubsDigest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public MqTopicSubsDigest setSubsExpression(String subsExpression) {
        this.subsExpression = subsExpression;
        return this;
    }
    public String getSubsExpression() {
        return this.subsExpression;
    }

}
