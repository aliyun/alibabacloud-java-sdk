// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class InnerSandboxRuntimeConfig extends TeaModel {
    /**
     * <p>The RAM role that grants the required permissions to the sandbox.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::xxxx:role/xxx_role</p>
     */
    @NameInMap("role")
    public String role;

    /**
     * <p>The VPC configuration.</p>
     */
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
        /**
         * <p>The security group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-xxxx</p>
         */
        @NameInMap("securityGroupId")
        public String securityGroupId;

        /**
         * <p>The vSwitch IDs.</p>
         */
        @NameInMap("vSwitchIds")
        public java.util.List<String> vSwitchIds;

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-xxxx</p>
         */
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
