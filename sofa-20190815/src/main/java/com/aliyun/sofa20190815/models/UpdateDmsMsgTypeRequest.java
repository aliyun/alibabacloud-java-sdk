// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateDmsMsgTypeRequest extends TeaModel {
    @NameInMap("Desc")
    public String desc;

    @NameInMap("Eventcode")
    public String eventcode;

    @NameInMap("Id")
    public Long id;

    @NameInMap("InstanceId")
    public String instanceId;

    public static UpdateDmsMsgTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDmsMsgTypeRequest self = new UpdateDmsMsgTypeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDmsMsgTypeRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public UpdateDmsMsgTypeRequest setEventcode(String eventcode) {
        this.eventcode = eventcode;
        return this;
    }
    public String getEventcode() {
        return this.eventcode;
    }

    public UpdateDmsMsgTypeRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateDmsMsgTypeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
