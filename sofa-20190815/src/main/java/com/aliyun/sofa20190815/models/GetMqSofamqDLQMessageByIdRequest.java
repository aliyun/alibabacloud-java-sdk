// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetMqSofamqDLQMessageByIdRequest extends TeaModel {
    @NameInMap("Cell")
    public String cell;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MsgId")
    public String msgId;

    public static GetMqSofamqDLQMessageByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMqSofamqDLQMessageByIdRequest self = new GetMqSofamqDLQMessageByIdRequest();
        return TeaModel.build(map, self);
    }

    public GetMqSofamqDLQMessageByIdRequest setCell(String cell) {
        this.cell = cell;
        return this;
    }
    public String getCell() {
        return this.cell;
    }

    public GetMqSofamqDLQMessageByIdRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public GetMqSofamqDLQMessageByIdRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetMqSofamqDLQMessageByIdRequest setMsgId(String msgId) {
        this.msgId = msgId;
        return this;
    }
    public String getMsgId() {
        return this.msgId;
    }

}
