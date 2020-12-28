// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsMessageTraceRequest extends TeaModel {
    @NameInMap("Topic")
    public String topic;

    @NameInMap("MsgId")
    public String msgId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static OnsMessageTraceRequest build(java.util.Map<String, ?> map) throws Exception {
        OnsMessageTraceRequest self = new OnsMessageTraceRequest();
        return TeaModel.build(map, self);
    }

    public OnsMessageTraceRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public OnsMessageTraceRequest setMsgId(String msgId) {
        this.msgId = msgId;
        return this;
    }
    public String getMsgId() {
        return this.msgId;
    }

    public OnsMessageTraceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
