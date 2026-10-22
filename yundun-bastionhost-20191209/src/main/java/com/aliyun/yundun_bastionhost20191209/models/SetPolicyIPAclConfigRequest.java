// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class SetPolicyIPAclConfigRequest extends TeaModel {
    /**
     * <p>The source IP address restriction configuration.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("IPAclConfig")
    public SetPolicyIPAclConfigRequestIPAclConfig IPAclConfig;

    /**
     * <p>The ID of the bastion host instance.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to obtain the bastion host instance ID.</p>
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
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2758876.html">ListPolicies</a> operation to obtain this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    /**
     * <p>The project ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The region ID of the bastion host.</p>
     * <blockquote>
     * <p>For the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
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

    public SetPolicyIPAclConfigRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
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
         * <p>The source IP address restriction mode. Valid values:</p>
         * <ul>
         * <li><strong>black</strong>: blacklist mode</li>
         * <li><strong>white</strong>: whitelist mode</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>white</p>
         */
        @NameInMap("AclType")
        public String aclType;

        /**
         * <p>The list of restricted source IP addresses.</p>
         * <blockquote>
         * <ul>
         * <li>When AclType is set to white, the IPs list is required.</li>
         * <li>When AclType is set to black but you do not need to set a source IP blacklist, pass an empty list for IPs.</li>
         * </ul>
         * </blockquote>
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
