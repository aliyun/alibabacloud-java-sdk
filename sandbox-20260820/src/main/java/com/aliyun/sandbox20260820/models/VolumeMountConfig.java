// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class VolumeMountConfig extends TeaModel {
    @NameInMap("role")
    public String role;

    @NameInMap("vpcConfig")
    public VolumeMountConfigVpcConfig vpcConfig;

    public static VolumeMountConfig build(java.util.Map<String, ?> map) throws Exception {
        VolumeMountConfig self = new VolumeMountConfig();
        return TeaModel.build(map, self);
    }

    public VolumeMountConfig setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public VolumeMountConfig setVpcConfig(VolumeMountConfigVpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
        return this;
    }
    public VolumeMountConfigVpcConfig getVpcConfig() {
        return this.vpcConfig;
    }

    public static class VolumeMountConfigVpcConfig extends TeaModel {
        @NameInMap("securityGroupId")
        public String securityGroupId;

        @NameInMap("vSwitchIds")
        public java.util.List<String> vSwitchIds;

        @NameInMap("vpcId")
        public String vpcId;

        public static VolumeMountConfigVpcConfig build(java.util.Map<String, ?> map) throws Exception {
            VolumeMountConfigVpcConfig self = new VolumeMountConfigVpcConfig();
            return TeaModel.build(map, self);
        }

        public VolumeMountConfigVpcConfig setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public VolumeMountConfigVpcConfig setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public VolumeMountConfigVpcConfig setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
