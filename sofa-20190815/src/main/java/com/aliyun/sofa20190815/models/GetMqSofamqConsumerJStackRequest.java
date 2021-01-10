// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetMqSofamqConsumerJStackRequest extends TeaModel {
    @NameInMap("Cell")
    public String cell;

    @NameInMap("ClientId")
    public String clientId;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static GetMqSofamqConsumerJStackRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMqSofamqConsumerJStackRequest self = new GetMqSofamqConsumerJStackRequest();
        return TeaModel.build(map, self);
    }

    public GetMqSofamqConsumerJStackRequest setCell(String cell) {
        this.cell = cell;
        return this;
    }
    public String getCell() {
        return this.cell;
    }

    public GetMqSofamqConsumerJStackRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public GetMqSofamqConsumerJStackRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public GetMqSofamqConsumerJStackRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
