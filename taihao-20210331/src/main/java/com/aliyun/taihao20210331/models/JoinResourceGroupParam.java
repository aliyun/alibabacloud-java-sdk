// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class JoinResourceGroupParam extends TeaModel {
    // 操作人员ID
    @NameInMap("operateUserId")
    public String operateUserId;

    // 目标资源组ID
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    // 资源ID
    @NameInMap("resourceId")
    public String resourceId;

    // 资源所有者ID
    @NameInMap("resourceOwnerUid")
    public String resourceOwnerUid;

    // 资源类型
    @NameInMap("resourceType")
    public String resourceType;

    public static JoinResourceGroupParam build(java.util.Map<String, ?> map) throws Exception {
        JoinResourceGroupParam self = new JoinResourceGroupParam();
        return TeaModel.build(map, self);
    }

    public JoinResourceGroupParam setOperateUserId(String operateUserId) {
        this.operateUserId = operateUserId;
        return this;
    }
    public String getOperateUserId() {
        return this.operateUserId;
    }

    public JoinResourceGroupParam setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public JoinResourceGroupParam setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public JoinResourceGroupParam setResourceOwnerUid(String resourceOwnerUid) {
        this.resourceOwnerUid = resourceOwnerUid;
        return this;
    }
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

    public JoinResourceGroupParam setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
