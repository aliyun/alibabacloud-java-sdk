// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsMessageTraceRequest extends TeaModel {
    /**
     * <p>The ID of the instance where the message that you want to query resides.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the message that you want to query.</p>
     */
    @NameInMap("MsgId")
    public String msgId;

    /**
     * <p>The topic to which the message belongs.</p>
     */
    @NameInMap("Topic")
    public String topic;

    public static OnsMessageTraceRequest build(java.util.Map<String, ?> map) throws Exception {
        OnsMessageTraceRequest self = new OnsMessageTraceRequest();
        return TeaModel.build(map, self);
    }

    public OnsMessageTraceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public OnsMessageTraceRequest setMsgId(String msgId) {
        this.msgId = msgId;
        return this;
    }
    public String getMsgId() {
        return this.msgId;
    }

    public OnsMessageTraceRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
