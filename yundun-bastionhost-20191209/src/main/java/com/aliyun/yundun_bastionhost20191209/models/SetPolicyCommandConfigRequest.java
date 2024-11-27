// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class SetPolicyCommandConfigRequest extends TeaModel {
    /**
     * <p>The command control settings.</p>
     * <blockquote>
     * <p>This parameter applies only to Linux hosts.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CommandConfig")
    public SetPolicyCommandConfigRequestCommandConfig commandConfig;

    /**
     * <p>The bastion host ID.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the bastion host ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-78v1ghxxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the control policy that you want to modify.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2758876.html">ListPolicies</a> operation to query the control policy ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>45</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    /**
     * <p>The region ID of the bastion host.</p>
     * <blockquote>
     * <p> For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
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
        /**
         * <p>The commands that can be run only after approval.</p>
         */
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
        /**
         * <p>The type of command control. Valid values:</p>
         * <ul>
         * <li><strong>black</strong>: blacklist mode.</li>
         * <li><strong>white</strong>: whitelist mode.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>white</p>
         */
        @NameInMap("AclType")
        public String aclType;

        /**
         * <p>The commands to be controlled.</p>
         * <blockquote>
         * <p>This parameter is required if AclType is set to white.</p>
         * </blockquote>
         */
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
        /**
         * <p>The command approval settings.</p>
         * <blockquote>
         * <p>A command approval policy is used to approve the commands that are excluded from a whitelist or blacklist specified in a command control policy. The command control policy takes precedence over the command approval policy in validation.</p>
         * </blockquote>
         */
        @NameInMap("Approval")
        public SetPolicyCommandConfigRequestCommandConfigApproval approval;

        /**
         * <p>The command control settings.</p>
         * <p>This parameter is required.</p>
         */
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
