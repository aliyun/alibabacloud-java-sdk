// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class MqGroupCreateCmd extends TeaModel {
    @NameInMap("env")
    public String env;

    @NameInMap("laneId")
    public Long laneId;

    @NameInMap("laneName")
    public String laneName;

    @NameInMap("messageType")
    public Integer messageType;

    @NameInMap("protocolType")
    public String protocolType;

    @NameInMap("remark")
    public String remark;

    @NameInMap("serviceId")
    public String serviceId;

    public static MqGroupCreateCmd build(java.util.Map<String, ?> map) throws Exception {
        MqGroupCreateCmd self = new MqGroupCreateCmd();
        return TeaModel.build(map, self);
    }

    public MqGroupCreateCmd setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public MqGroupCreateCmd setLaneId(Long laneId) {
        this.laneId = laneId;
        return this;
    }
    public Long getLaneId() {
        return this.laneId;
    }

    public MqGroupCreateCmd setLaneName(String laneName) {
        this.laneName = laneName;
        return this;
    }
    public String getLaneName() {
        return this.laneName;
    }

    public MqGroupCreateCmd setMessageType(Integer messageType) {
        this.messageType = messageType;
        return this;
    }
    public Integer getMessageType() {
        return this.messageType;
    }

    public MqGroupCreateCmd setProtocolType(String protocolType) {
        this.protocolType = protocolType;
        return this;
    }
    public String getProtocolType() {
        return this.protocolType;
    }

    public MqGroupCreateCmd setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public MqGroupCreateCmd setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

}
