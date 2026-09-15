// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class InnerSandboxRuntimeConfig extends TeaModel {
    @NameInMap("role")
    public String role;

    @NameInMap("vpcConfig")
    public InnerSandboxRuntimeConfigVpcConfig vpcConfig;

    public static InnerSandboxRuntimeConfig build(java.util.Map<String, ?> map) throws Exception {
        InnerSandboxRuntimeConfig self = new InnerSandboxRuntimeConfig();
        return TeaModel.build(map, self);
    }

    public InnerSandboxRuntimeConfig setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public InnerSandboxRuntimeConfig setVpcConfig(InnerSandboxRuntimeConfigVpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
        return this;
    }
    public InnerSandboxRuntimeConfigVpcConfig getVpcConfig() {
        return this.vpcConfig;
    }

    public static class InnerSandboxRuntimeConfigVpcConfig extends TeaModel {
        @NameInMap("securityGroupId")
        public String securityGroupId;

        @NameInMap("vSwitchIds")
        public java.util.List<String> vSwitchIds;

        @NameInMap("vpcId")
        public String vpcId;

        public static InnerSandboxRuntimeConfigVpcConfig build(java.util.Map<String, ?> map) throws Exception {
            InnerSandboxRuntimeConfigVpcConfig self = new InnerSandboxRuntimeConfigVpcConfig();
            return TeaModel.build(map, self);
        }

        public InnerSandboxRuntimeConfigVpcConfig setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public InnerSandboxRuntimeConfigVpcConfig setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public InnerSandboxRuntimeConfigVpcConfig setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
