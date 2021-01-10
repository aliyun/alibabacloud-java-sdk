// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ResendMqSofamqDLQMessageBatchRequest extends TeaModel {
    @NameInMap("Cell")
    public String cell;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MsgIds")
    public String msgIds;

    public static ResendMqSofamqDLQMessageBatchRequest build(java.util.Map<String, ?> map) throws Exception {
        ResendMqSofamqDLQMessageBatchRequest self = new ResendMqSofamqDLQMessageBatchRequest();
        return TeaModel.build(map, self);
    }

    public ResendMqSofamqDLQMessageBatchRequest setCell(String cell) {
        this.cell = cell;
        return this;
    }
    public String getCell() {
        return this.cell;
    }

    public ResendMqSofamqDLQMessageBatchRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ResendMqSofamqDLQMessageBatchRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ResendMqSofamqDLQMessageBatchRequest setMsgIds(String msgIds) {
        this.msgIds = msgIds;
        return this;
    }
    public String getMsgIds() {
        return this.msgIds;
    }

}
