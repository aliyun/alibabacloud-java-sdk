// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class MqTopicDigest extends TeaModel {
    @NameInMap("Alias")
    public String alias;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("Id")
    public Long id;

    @NameInMap("MessageType")
    public String messageType;

    @NameInMap("Name")
    public String name;

    @NameInMap("Remark")
    public String remark;

    public static MqTopicDigest build(java.util.Map<String, ?> map) throws Exception {
        MqTopicDigest self = new MqTopicDigest();
        return TeaModel.build(map, self);
    }

    public MqTopicDigest setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public MqTopicDigest setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public MqTopicDigest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public MqTopicDigest setMessageType(String messageType) {
        this.messageType = messageType;
        return this;
    }
    public String getMessageType() {
        return this.messageType;
    }

    public MqTopicDigest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public MqTopicDigest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
