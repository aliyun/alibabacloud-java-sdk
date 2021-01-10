// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ResendMqSofamqDLQMessageByIdRequest extends TeaModel {
    @NameInMap("Cell")
    public String cell;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MsgId")
    public String msgId;

    public static ResendMqSofamqDLQMessageByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        ResendMqSofamqDLQMessageByIdRequest self = new ResendMqSofamqDLQMessageByIdRequest();
        return TeaModel.build(map, self);
    }

    public ResendMqSofamqDLQMessageByIdRequest setCell(String cell) {
        this.cell = cell;
        return this;
    }
    public String getCell() {
        return this.cell;
    }

    public ResendMqSofamqDLQMessageByIdRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ResendMqSofamqDLQMessageByIdRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ResendMqSofamqDLQMessageByIdRequest setMsgId(String msgId) {
        this.msgId = msgId;
        return this;
    }
    public String getMsgId() {
        return this.msgId;
    }

}
