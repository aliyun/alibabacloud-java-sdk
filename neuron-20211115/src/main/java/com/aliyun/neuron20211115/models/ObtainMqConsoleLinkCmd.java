// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ObtainMqConsoleLinkCmd extends TeaModel {
    @NameInMap("env")
    public String env;

    @NameInMap("groupType")
    public String groupType;

    @NameInMap("mqGroupId")
    public String mqGroupId;

    @NameInMap("pbcId")
    public Long pbcId;

    @NameInMap("serviceName")
    public String serviceName;

    @NameInMap("topicName")
    public String topicName;

    public static ObtainMqConsoleLinkCmd build(java.util.Map<String, ?> map) throws Exception {
        ObtainMqConsoleLinkCmd self = new ObtainMqConsoleLinkCmd();
        return TeaModel.build(map, self);
    }

    public ObtainMqConsoleLinkCmd setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public ObtainMqConsoleLinkCmd setGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }
    public String getGroupType() {
        return this.groupType;
    }

    public ObtainMqConsoleLinkCmd setMqGroupId(String mqGroupId) {
        this.mqGroupId = mqGroupId;
        return this;
    }
    public String getMqGroupId() {
        return this.mqGroupId;
    }

    public ObtainMqConsoleLinkCmd setPbcId(Long pbcId) {
        this.pbcId = pbcId;
        return this;
    }
    public Long getPbcId() {
        return this.pbcId;
    }

    public ObtainMqConsoleLinkCmd setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public ObtainMqConsoleLinkCmd setTopicName(String topicName) {
        this.topicName = topicName;
        return this;
    }
    public String getTopicName() {
        return this.topicName;
    }

}
