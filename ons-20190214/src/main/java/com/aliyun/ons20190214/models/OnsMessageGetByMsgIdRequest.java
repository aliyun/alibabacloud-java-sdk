// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsMessageGetByMsgIdRequest extends TeaModel {
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
     * <p>The topic that contains the message that you want to query.</p>
     */
    @NameInMap("Topic")
    public String topic;

    public static OnsMessageGetByMsgIdRequest build(java.util.Map<String, ?> map) throws Exception {
        OnsMessageGetByMsgIdRequest self = new OnsMessageGetByMsgIdRequest();
        return TeaModel.build(map, self);
    }

    public OnsMessageGetByMsgIdRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public OnsMessageGetByMsgIdRequest setMsgId(String msgId) {
        this.msgId = msgId;
        return this;
    }
    public String getMsgId() {
        return this.msgId;
    }

    public OnsMessageGetByMsgIdRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
