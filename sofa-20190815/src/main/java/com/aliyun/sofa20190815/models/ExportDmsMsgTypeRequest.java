// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExportDmsMsgTypeRequest extends TeaModel {
    @NameInMap("Eventcode")
    public String eventcode;

    @NameInMap("Id")
    public String id;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Topic")
    public String topic;

    public static ExportDmsMsgTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportDmsMsgTypeRequest self = new ExportDmsMsgTypeRequest();
        return TeaModel.build(map, self);
    }

    public ExportDmsMsgTypeRequest setEventcode(String eventcode) {
        this.eventcode = eventcode;
        return this;
    }
    public String getEventcode() {
        return this.eventcode;
    }

    public ExportDmsMsgTypeRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ExportDmsMsgTypeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ExportDmsMsgTypeRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
