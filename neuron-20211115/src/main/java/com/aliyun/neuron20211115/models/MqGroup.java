// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class MqGroup extends TeaModel {
    @NameInMap("env")
    public String env;

    @NameInMap("gmtCreate")
    public String gmtCreate;

    @NameInMap("gmtModified")
    public String gmtModified;

    @NameInMap("groupId")
    public String groupId;

    @NameInMap("id")
    public Long id;

    @NameInMap("messageType")
    public Integer messageType;

    @NameInMap("protocolType")
    public String protocolType;

    @NameInMap("remark")
    public String remark;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("serviceId")
    public String serviceId;

    public static MqGroup build(java.util.Map<String, ?> map) throws Exception {
        MqGroup self = new MqGroup();
        return TeaModel.build(map, self);
    }

    public MqGroup setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public MqGroup setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public MqGroup setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public MqGroup setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public MqGroup setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public MqGroup setMessageType(Integer messageType) {
        this.messageType = messageType;
        return this;
    }
    public Integer getMessageType() {
        return this.messageType;
    }

    public MqGroup setProtocolType(String protocolType) {
        this.protocolType = protocolType;
        return this;
    }
    public String getProtocolType() {
        return this.protocolType;
    }

    public MqGroup setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public MqGroup setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MqGroup setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

}
