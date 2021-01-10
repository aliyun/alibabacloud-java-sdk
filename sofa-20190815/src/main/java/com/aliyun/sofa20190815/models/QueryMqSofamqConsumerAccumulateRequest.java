// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMqSofamqConsumerAccumulateRequest extends TeaModel {
    @NameInMap("Cell")
    public String cell;

    @NameInMap("Detail")
    public Boolean detail;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static QueryMqSofamqConsumerAccumulateRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMqSofamqConsumerAccumulateRequest self = new QueryMqSofamqConsumerAccumulateRequest();
        return TeaModel.build(map, self);
    }

    public QueryMqSofamqConsumerAccumulateRequest setCell(String cell) {
        this.cell = cell;
        return this;
    }
    public String getCell() {
        return this.cell;
    }

    public QueryMqSofamqConsumerAccumulateRequest setDetail(Boolean detail) {
        this.detail = detail;
        return this;
    }
    public Boolean getDetail() {
        return this.detail;
    }

    public QueryMqSofamqConsumerAccumulateRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public QueryMqSofamqConsumerAccumulateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
