// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateDmsMsgTypeRequest extends TeaModel {
    @NameInMap("Desc")
    public String desc;

    @NameInMap("Eventcode")
    public String eventcode;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Topic")
    public String topic;

    public static CreateDmsMsgTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDmsMsgTypeRequest self = new CreateDmsMsgTypeRequest();
        return TeaModel.build(map, self);
    }

    public CreateDmsMsgTypeRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public CreateDmsMsgTypeRequest setEventcode(String eventcode) {
        this.eventcode = eventcode;
        return this;
    }
    public String getEventcode() {
        return this.eventcode;
    }

    public CreateDmsMsgTypeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateDmsMsgTypeRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
