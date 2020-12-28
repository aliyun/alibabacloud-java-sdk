// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsMessageGetByMsgIdRequest extends TeaModel {
    @NameInMap("MsgId")
    public String msgId;

    @NameInMap("Topic")
    public String topic;

    @NameInMap("InstanceId")
    public String instanceId;

    public static OnsMessageGetByMsgIdRequest build(java.util.Map<String, ?> map) throws Exception {
        OnsMessageGetByMsgIdRequest self = new OnsMessageGetByMsgIdRequest();
        return TeaModel.build(map, self);
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

    public OnsMessageGetByMsgIdRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
