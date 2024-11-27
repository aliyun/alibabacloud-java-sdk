// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class SetPolicyIPAclConfigRequest extends TeaModel {
    /**
     * <p>The access control settings for source IP addresses.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("IPAclConfig")
    public SetPolicyIPAclConfigRequestIPAclConfig IPAclConfig;

    /**
     * <p>The bastion host ID.</p>
     * <blockquote>
     * <p>You can call the DescribeInstances operation to query the bastion host ID.<a href="~~153281~~"></a></p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-st220aw****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the control policy that you want to modify.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/2758876.html">ListPolicies</a> operation to query the control policy ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    /**
     * <p>The region ID of the bastion host.</p>
     * <blockquote>
     * <p>For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static SetPolicyIPAclConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetPolicyIPAclConfigRequest self = new SetPolicyIPAclConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetPolicyIPAclConfigRequest setIPAclConfig(SetPolicyIPAclConfigRequestIPAclConfig IPAclConfig) {
        this.IPAclConfig = IPAclConfig;
        return this;
    }
    public SetPolicyIPAclConfigRequestIPAclConfig getIPAclConfig() {
        return this.IPAclConfig;
    }

    public SetPolicyIPAclConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SetPolicyIPAclConfigRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public SetPolicyIPAclConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class SetPolicyIPAclConfigRequestIPAclConfig extends TeaModel {
        /**
         * <p>The mode of access control on source IP addresses. Valid values:</p>
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
         * <p>The source IP addresses in the blacklist or whitelist.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>This parameter is required if AclType is set to white.</p>
         * </li>
         * <li><p>If AclType is set to black but you do not want to add IP addresses to the blacklist, you can leave IPs empty.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         */
        @NameInMap("IPs")
        public java.util.List<String> IPs;

        public static SetPolicyIPAclConfigRequestIPAclConfig build(java.util.Map<String, ?> map) throws Exception {
            SetPolicyIPAclConfigRequestIPAclConfig self = new SetPolicyIPAclConfigRequestIPAclConfig();
            return TeaModel.build(map, self);
        }

        public SetPolicyIPAclConfigRequestIPAclConfig setAclType(String aclType) {
            this.aclType = aclType;
            return this;
        }
        public String getAclType() {
            return this.aclType;
        }

        public SetPolicyIPAclConfigRequestIPAclConfig setIPs(java.util.List<String> IPs) {
            this.IPs = IPs;
            return this;
        }
        public java.util.List<String> getIPs() {
            return this.IPs;
        }

    }

}
