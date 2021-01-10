// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMqSofamqConsumerConnectionRequest extends TeaModel {
    @NameInMap("Cell")
    public String cell;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static QueryMqSofamqConsumerConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMqSofamqConsumerConnectionRequest self = new QueryMqSofamqConsumerConnectionRequest();
        return TeaModel.build(map, self);
    }

    public QueryMqSofamqConsumerConnectionRequest setCell(String cell) {
        this.cell = cell;
        return this;
    }
    public String getCell() {
        return this.cell;
    }

    public QueryMqSofamqConsumerConnectionRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public QueryMqSofamqConsumerConnectionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
