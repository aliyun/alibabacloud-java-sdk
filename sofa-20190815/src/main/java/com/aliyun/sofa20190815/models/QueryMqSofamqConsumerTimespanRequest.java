// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMqSofamqConsumerTimespanRequest extends TeaModel {
    @NameInMap("Cell")
    public String cell;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Topic")
    public String topic;

    public static QueryMqSofamqConsumerTimespanRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMqSofamqConsumerTimespanRequest self = new QueryMqSofamqConsumerTimespanRequest();
        return TeaModel.build(map, self);
    }

    public QueryMqSofamqConsumerTimespanRequest setCell(String cell) {
        this.cell = cell;
        return this;
    }
    public String getCell() {
        return this.cell;
    }

    public QueryMqSofamqConsumerTimespanRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public QueryMqSofamqConsumerTimespanRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryMqSofamqConsumerTimespanRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
