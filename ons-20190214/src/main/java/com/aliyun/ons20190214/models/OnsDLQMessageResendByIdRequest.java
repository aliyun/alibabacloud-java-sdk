// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsDLQMessageResendByIdRequest extends TeaModel {
    /**
     * <p>The ID of the consumer group whose dead-letter messages you want to query.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The ID of the instance to which the message you want to query belongs.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the dead-letter message that you want to query.</p>
     */
    @NameInMap("MsgId")
    public String msgId;

    public static OnsDLQMessageResendByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        OnsDLQMessageResendByIdRequest self = new OnsDLQMessageResendByIdRequest();
        return TeaModel.build(map, self);
    }

    public OnsDLQMessageResendByIdRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public OnsDLQMessageResendByIdRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public OnsDLQMessageResendByIdRequest setMsgId(String msgId) {
        this.msgId = msgId;
        return this;
    }
    public String getMsgId() {
        return this.msgId;
    }

}
