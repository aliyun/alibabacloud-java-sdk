// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsDLQMessageResendByIdRequest extends TeaModel {
    @NameInMap("MsgId")
    public String msgId;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static OnsDLQMessageResendByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        OnsDLQMessageResendByIdRequest self = new OnsDLQMessageResendByIdRequest();
        return TeaModel.build(map, self);
    }

    public OnsDLQMessageResendByIdRequest setMsgId(String msgId) {
        this.msgId = msgId;
        return this;
    }
    public String getMsgId() {
        return this.msgId;
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

}
