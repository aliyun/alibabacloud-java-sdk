// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.support_plan20210706.models;

import com.aliyun.tea.*;

public class AddEnterpriseGroupMemberToTaskGroupRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>E240815B72K5D3</p>
     */
    @NameInMap("TaskOrderId")
    public String taskOrderId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PtWoW82DJI1zcTwsT98kLIgAj7kfASzfC6StcpV7hKs=</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static AddEnterpriseGroupMemberToTaskGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AddEnterpriseGroupMemberToTaskGroupRequest self = new AddEnterpriseGroupMemberToTaskGroupRequest();
        return TeaModel.build(map, self);
    }

    public AddEnterpriseGroupMemberToTaskGroupRequest setTaskOrderId(String taskOrderId) {
        this.taskOrderId = taskOrderId;
        return this;
    }
    public String getTaskOrderId() {
        return this.taskOrderId;
    }

    public AddEnterpriseGroupMemberToTaskGroupRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
