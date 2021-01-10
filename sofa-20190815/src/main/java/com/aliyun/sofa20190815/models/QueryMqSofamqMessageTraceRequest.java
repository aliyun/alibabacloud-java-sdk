// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMqSofamqMessageTraceRequest extends TeaModel {
    @NameInMap("Cell")
    public String cell;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MsgId")
    public String msgId;

    @NameInMap("Topic")
    public String topic;

    public static QueryMqSofamqMessageTraceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMqSofamqMessageTraceRequest self = new QueryMqSofamqMessageTraceRequest();
        return TeaModel.build(map, self);
    }

    public QueryMqSofamqMessageTraceRequest setCell(String cell) {
        this.cell = cell;
        return this;
    }
    public String getCell() {
        return this.cell;
    }

    public QueryMqSofamqMessageTraceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryMqSofamqMessageTraceRequest setMsgId(String msgId) {
        this.msgId = msgId;
        return this;
    }
    public String getMsgId() {
        return this.msgId;
    }

    public QueryMqSofamqMessageTraceRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
