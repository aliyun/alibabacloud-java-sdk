// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class SetPolicyCommandConfigRequest extends TeaModel {
    @NameInMap("CommandConfig")
    public SetPolicyCommandConfigRequestCommandConfig commandConfig;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PolicyId")
    public String policyId;

    @NameInMap("RegionId")
    public String regionId;

    public static SetPolicyCommandConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetPolicyCommandConfigRequest self = new SetPolicyCommandConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetPolicyCommandConfigRequest setCommandConfig(SetPolicyCommandConfigRequestCommandConfig commandConfig) {
        this.commandConfig = commandConfig;
        return this;
    }
    public SetPolicyCommandConfigRequestCommandConfig getCommandConfig() {
        return this.commandConfig;
    }

    public SetPolicyCommandConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SetPolicyCommandConfigRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public SetPolicyCommandConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class SetPolicyCommandConfigRequestCommandConfigApproval extends TeaModel {
        @NameInMap("Commands")
        public java.util.List<String> commands;

        public static SetPolicyCommandConfigRequestCommandConfigApproval build(java.util.Map<String, ?> map) throws Exception {
            SetPolicyCommandConfigRequestCommandConfigApproval self = new SetPolicyCommandConfigRequestCommandConfigApproval();
            return TeaModel.build(map, self);
        }

        public SetPolicyCommandConfigRequestCommandConfigApproval setCommands(java.util.List<String> commands) {
            this.commands = commands;
            return this;
        }
        public java.util.List<String> getCommands() {
            return this.commands;
        }

    }

    public static class SetPolicyCommandConfigRequestCommandConfigDeny extends TeaModel {
        @NameInMap("AclType")
        public String aclType;

        @NameInMap("Commands")
        public java.util.List<String> commands;

        public static SetPolicyCommandConfigRequestCommandConfigDeny build(java.util.Map<String, ?> map) throws Exception {
            SetPolicyCommandConfigRequestCommandConfigDeny self = new SetPolicyCommandConfigRequestCommandConfigDeny();
            return TeaModel.build(map, self);
        }

        public SetPolicyCommandConfigRequestCommandConfigDeny setAclType(String aclType) {
            this.aclType = aclType;
            return this;
        }
        public String getAclType() {
            return this.aclType;
        }

        public SetPolicyCommandConfigRequestCommandConfigDeny setCommands(java.util.List<String> commands) {
            this.commands = commands;
            return this;
        }
        public java.util.List<String> getCommands() {
            return this.commands;
        }

    }

    public static class SetPolicyCommandConfigRequestCommandConfig extends TeaModel {
        @NameInMap("Approval")
        public SetPolicyCommandConfigRequestCommandConfigApproval approval;

        @NameInMap("Deny")
        public SetPolicyCommandConfigRequestCommandConfigDeny deny;

        public static SetPolicyCommandConfigRequestCommandConfig build(java.util.Map<String, ?> map) throws Exception {
            SetPolicyCommandConfigRequestCommandConfig self = new SetPolicyCommandConfigRequestCommandConfig();
            return TeaModel.build(map, self);
        }

        public SetPolicyCommandConfigRequestCommandConfig setApproval(SetPolicyCommandConfigRequestCommandConfigApproval approval) {
            this.approval = approval;
            return this;
        }
        public SetPolicyCommandConfigRequestCommandConfigApproval getApproval() {
            return this.approval;
        }

        public SetPolicyCommandConfigRequestCommandConfig setDeny(SetPolicyCommandConfigRequestCommandConfigDeny deny) {
            this.deny = deny;
            return this;
        }
        public SetPolicyCommandConfigRequestCommandConfigDeny getDeny() {
            return this.deny;
        }

    }

}
