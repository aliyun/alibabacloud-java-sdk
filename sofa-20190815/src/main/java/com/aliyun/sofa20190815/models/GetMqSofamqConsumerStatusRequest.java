// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetMqSofamqConsumerStatusRequest extends TeaModel {
    @NameInMap("Cell")
    public String cell;

    @NameInMap("Detail")
    public Boolean detail;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("NeedJstack")
    public Boolean needJstack;

    public static GetMqSofamqConsumerStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMqSofamqConsumerStatusRequest self = new GetMqSofamqConsumerStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetMqSofamqConsumerStatusRequest setCell(String cell) {
        this.cell = cell;
        return this;
    }
    public String getCell() {
        return this.cell;
    }

    public GetMqSofamqConsumerStatusRequest setDetail(Boolean detail) {
        this.detail = detail;
        return this;
    }
    public Boolean getDetail() {
        return this.detail;
    }

    public GetMqSofamqConsumerStatusRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public GetMqSofamqConsumerStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetMqSofamqConsumerStatusRequest setNeedJstack(Boolean needJstack) {
        this.needJstack = needJstack;
        return this;
    }
    public Boolean getNeedJstack() {
        return this.needJstack;
    }

}
