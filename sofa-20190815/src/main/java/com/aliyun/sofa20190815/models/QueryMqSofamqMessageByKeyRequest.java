// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMqSofamqMessageByKeyRequest extends TeaModel {
    @NameInMap("Cell")
    public String cell;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Key")
    public String key;

    @NameInMap("Topic")
    public String topic;

    public static QueryMqSofamqMessageByKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMqSofamqMessageByKeyRequest self = new QueryMqSofamqMessageByKeyRequest();
        return TeaModel.build(map, self);
    }

    public QueryMqSofamqMessageByKeyRequest setCell(String cell) {
        this.cell = cell;
        return this;
    }
    public String getCell() {
        return this.cell;
    }

    public QueryMqSofamqMessageByKeyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryMqSofamqMessageByKeyRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public QueryMqSofamqMessageByKeyRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
