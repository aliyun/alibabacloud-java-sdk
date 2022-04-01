// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class UpdateSecurityModeParam extends TeaModel {
    // 集群ID。
    @NameInMap("clusterId")
    public String clusterId;

    // 操作用户ID。
    @NameInMap("operateUserId")
    public String operateUserId;

    // 资源所有者ID。
    @NameInMap("resourceOwnerUid")
    public String resourceOwnerUid;

    // 安全模式。
    @NameInMap("securityMode")
    public String securityMode;

    public static UpdateSecurityModeParam build(java.util.Map<String, ?> map) throws Exception {
        UpdateSecurityModeParam self = new UpdateSecurityModeParam();
        return TeaModel.build(map, self);
    }

    public UpdateSecurityModeParam setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateSecurityModeParam setOperateUserId(String operateUserId) {
        this.operateUserId = operateUserId;
        return this;
    }
    public String getOperateUserId() {
        return this.operateUserId;
    }

    public UpdateSecurityModeParam setResourceOwnerUid(String resourceOwnerUid) {
        this.resourceOwnerUid = resourceOwnerUid;
        return this;
    }
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

    public UpdateSecurityModeParam setSecurityMode(String securityMode) {
        this.securityMode = securityMode;
        return this;
    }
    public String getSecurityMode() {
        return this.securityMode;
    }

}
