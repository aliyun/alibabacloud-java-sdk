// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateMqSofamqGroupRemarkRequest extends TeaModel {
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Remark")
    public String remark;

    public static UpdateMqSofamqGroupRemarkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMqSofamqGroupRemarkRequest self = new UpdateMqSofamqGroupRemarkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMqSofamqGroupRemarkRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public UpdateMqSofamqGroupRemarkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateMqSofamqGroupRemarkRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
