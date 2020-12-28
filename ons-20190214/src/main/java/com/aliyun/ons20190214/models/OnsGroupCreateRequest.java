// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsGroupCreateRequest extends TeaModel {
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("GroupType")
    public String groupType;

    public static OnsGroupCreateRequest build(java.util.Map<String, ?> map) throws Exception {
        OnsGroupCreateRequest self = new OnsGroupCreateRequest();
        return TeaModel.build(map, self);
    }

    public OnsGroupCreateRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public OnsGroupCreateRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public OnsGroupCreateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public OnsGroupCreateRequest setGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }
    public String getGroupType() {
        return this.groupType;
    }

}
