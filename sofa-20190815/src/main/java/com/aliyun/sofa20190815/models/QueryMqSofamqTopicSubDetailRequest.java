// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMqSofamqTopicSubDetailRequest extends TeaModel {
    @NameInMap("Cell")
    public String cell;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Topic")
    public String topic;

    public static QueryMqSofamqTopicSubDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMqSofamqTopicSubDetailRequest self = new QueryMqSofamqTopicSubDetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryMqSofamqTopicSubDetailRequest setCell(String cell) {
        this.cell = cell;
        return this;
    }
    public String getCell() {
        return this.cell;
    }

    public QueryMqSofamqTopicSubDetailRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryMqSofamqTopicSubDetailRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
