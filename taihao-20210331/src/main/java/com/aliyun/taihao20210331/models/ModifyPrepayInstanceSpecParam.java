// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ModifyPrepayInstanceSpecParam extends TeaModel {
    // clusterId
    @NameInMap("clusterId")
    public String clusterId;

    // instanceTypeConfig
    @NameInMap("instanceTypeConfig")
    public java.util.List<InstanceTypeConfig> instanceTypeConfig;

    // operateUserId
    @NameInMap("operateUserId")
    public String operateUserId;

    // resourceOwnerUid
    @NameInMap("resourceOwnerUid")
    public String resourceOwnerUid;

    // rollingRestart
    @NameInMap("rollingRestart")
    public Boolean rollingRestart;

    // token
    @NameInMap("token")
    public String token;

    public static ModifyPrepayInstanceSpecParam build(java.util.Map<String, ?> map) throws Exception {
        ModifyPrepayInstanceSpecParam self = new ModifyPrepayInstanceSpecParam();
        return TeaModel.build(map, self);
    }

    public ModifyPrepayInstanceSpecParam setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ModifyPrepayInstanceSpecParam setInstanceTypeConfig(java.util.List<InstanceTypeConfig> instanceTypeConfig) {
        this.instanceTypeConfig = instanceTypeConfig;
        return this;
    }
    public java.util.List<InstanceTypeConfig> getInstanceTypeConfig() {
        return this.instanceTypeConfig;
    }

    public ModifyPrepayInstanceSpecParam setOperateUserId(String operateUserId) {
        this.operateUserId = operateUserId;
        return this;
    }
    public String getOperateUserId() {
        return this.operateUserId;
    }

    public ModifyPrepayInstanceSpecParam setResourceOwnerUid(String resourceOwnerUid) {
        this.resourceOwnerUid = resourceOwnerUid;
        return this;
    }
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

    public ModifyPrepayInstanceSpecParam setRollingRestart(Boolean rollingRestart) {
        this.rollingRestart = rollingRestart;
        return this;
    }
    public Boolean getRollingRestart() {
        return this.rollingRestart;
    }

    public ModifyPrepayInstanceSpecParam setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public static class InstanceTypeConfig extends TeaModel {
        // instanceType
        @NameInMap("instanceType")
        public String instanceType;

        // nodeGroupId
        @NameInMap("nodeGroupId")
        public String nodeGroupId;

        public static InstanceTypeConfig build(java.util.Map<String, ?> map) throws Exception {
            InstanceTypeConfig self = new InstanceTypeConfig();
            return TeaModel.build(map, self);
        }

        public InstanceTypeConfig setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public InstanceTypeConfig setNodeGroupId(String nodeGroupId) {
            this.nodeGroupId = nodeGroupId;
            return this;
        }
        public String getNodeGroupId() {
            return this.nodeGroupId;
        }

    }

}
