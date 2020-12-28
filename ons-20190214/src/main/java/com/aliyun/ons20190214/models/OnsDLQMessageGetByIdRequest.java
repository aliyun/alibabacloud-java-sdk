// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsDLQMessageGetByIdRequest extends TeaModel {
    @NameInMap("MsgId")
    public String msgId;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("InstanceId")
    public String instanceId;

    public static OnsDLQMessageGetByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        OnsDLQMessageGetByIdRequest self = new OnsDLQMessageGetByIdRequest();
        return TeaModel.build(map, self);
    }

    public OnsDLQMessageGetByIdRequest setMsgId(String msgId) {
        this.msgId = msgId;
        return this;
    }
    public String getMsgId() {
        return this.msgId;
    }

    public OnsDLQMessageGetByIdRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public OnsDLQMessageGetByIdRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
