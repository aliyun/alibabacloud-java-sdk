// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifyACLRuleResponseBody extends TeaModel {
    /**
     * <p>The ID of ACL.</p>
     * 
     * <strong>example:</strong>
     * <p>acl-jdc7tir4fkplwr****</p>
     */
    @NameInMap("AclId")
    public String aclId;

    /**
     * <p>The ID of the ACL rule.</p>
     * 
     * <strong>example:</strong>
     * <p>acr-r8hezn2pi39s5a****</p>
     */
    @NameInMap("AcrId")
    public String acrId;

    /**
     * <p>The description of the ACL rule.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The destination CIDR block.</p>
     * <p>The value of this parameter is in CIDR notation. Example: 192.168.10.0/24.</p>
     * 
     * <strong>example:</strong>
     * <p>0.0.0.0/0</p>
     */
    @NameInMap("DestCidr")
    public String destCidr;

    /**
     * <p>The destination port range.</p>
     * 
     * <strong>example:</strong>
     * <p>-1/-1</p>
     */
    @NameInMap("DestPortRange")
    public String destPortRange;

    /**
     * <p>The direction of traffic in which the ACL rule is applied. Valid values:</p>
     * <ul>
     * <li><strong>in</strong>: The ACL rule controls inbound network traffic of the on-premises network that is associated with the SAG instance.</li>
     * <li><strong>out</strong>: The ACL rule controls outbound network traffic of the on-premises network that is associated with the SAG instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>in</p>
     */
    @NameInMap("Direction")
    public String direction;

    @NameInMap("DpiGroupIds")
    public ModifyACLRuleResponseBodyDpiGroupIds dpiGroupIds;

    @NameInMap("DpiSignatureIds")
    public ModifyACLRuleResponseBodyDpiSignatureIds dpiSignatureIds;

    /**
     * <p>The timestamp when the ACL rule was created.</p>
     * <p>The timestamp is of the Long data type. If multiple ACL rules have the same priority, the rule with the earliest timestamp takes effect.</p>
     * 
     * <strong>example:</strong>
     * <p>1553777700000</p>
     */
    @NameInMap("GmtCreate")
    public Long gmtCreate;

    /**
     * <p>The protocol used by the ACL rule.</p>
     * 
     * <strong>example:</strong>
     * <p>ALL</p>
     */
    @NameInMap("IpProtocol")
    public String ipProtocol;

    /**
     * <p>The name of the ACL rule.</p>
     * 
     * <strong>example:</strong>
     * <p>doctest</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The action of the ACL rule.</p>
     * <ul>
     * <li><strong>accept</strong>: allows network traffic.</li>
     * <li><strong>drop</strong>: blocks network traffic.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>accept</p>
     */
    @NameInMap("Policy")
    public String policy;

    /**
     * <p>The priority of the ACL rule.</p>
     * <p>A smaller value indicates a higher priority. If multiple rules have the same priority, the rule that is applied earlier takes effect.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>7F3DD2C1-0F6B-4575-9106-B2D50DF7A711</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The source CIDR block.</p>
     * <p>The value of this parameter is in CIDR notation. Example: 192.168.1.0/24.</p>
     * 
     * <strong>example:</strong>
     * <p>0.0.0.0/0</p>
     */
    @NameInMap("SourceCidr")
    public String sourceCidr;

    /**
     * <p>The source port range.</p>
     * 
     * <strong>example:</strong>
     * <p>-1/-1</p>
     */
    @NameInMap("SourcePortRange")
    public String sourcePortRange;

    public static ModifyACLRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyACLRuleResponseBody self = new ModifyACLRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyACLRuleResponseBody setAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }
    public String getAclId() {
        return this.aclId;
    }

    public ModifyACLRuleResponseBody setAcrId(String acrId) {
        this.acrId = acrId;
        return this;
    }
    public String getAcrId() {
        return this.acrId;
    }

    public ModifyACLRuleResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyACLRuleResponseBody setDestCidr(String destCidr) {
        this.destCidr = destCidr;
        return this;
    }
    public String getDestCidr() {
        return this.destCidr;
    }

    public ModifyACLRuleResponseBody setDestPortRange(String destPortRange) {
        this.destPortRange = destPortRange;
        return this;
    }
    public String getDestPortRange() {
        return this.destPortRange;
    }

    public ModifyACLRuleResponseBody setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public ModifyACLRuleResponseBody setDpiGroupIds(ModifyACLRuleResponseBodyDpiGroupIds dpiGroupIds) {
        this.dpiGroupIds = dpiGroupIds;
        return this;
    }
    public ModifyACLRuleResponseBodyDpiGroupIds getDpiGroupIds() {
        return this.dpiGroupIds;
    }

    public ModifyACLRuleResponseBody setDpiSignatureIds(ModifyACLRuleResponseBodyDpiSignatureIds dpiSignatureIds) {
        this.dpiSignatureIds = dpiSignatureIds;
        return this;
    }
    public ModifyACLRuleResponseBodyDpiSignatureIds getDpiSignatureIds() {
        return this.dpiSignatureIds;
    }

    public ModifyACLRuleResponseBody setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public ModifyACLRuleResponseBody setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    public ModifyACLRuleResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyACLRuleResponseBody setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public ModifyACLRuleResponseBody setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public ModifyACLRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyACLRuleResponseBody setSourceCidr(String sourceCidr) {
        this.sourceCidr = sourceCidr;
        return this;
    }
    public String getSourceCidr() {
        return this.sourceCidr;
    }

    public ModifyACLRuleResponseBody setSourcePortRange(String sourcePortRange) {
        this.sourcePortRange = sourcePortRange;
        return this;
    }
    public String getSourcePortRange() {
        return this.sourcePortRange;
    }

    public static class ModifyACLRuleResponseBodyDpiGroupIds extends TeaModel {
        @NameInMap("DpiGroupId")
        public java.util.List<String> dpiGroupId;

        public static ModifyACLRuleResponseBodyDpiGroupIds build(java.util.Map<String, ?> map) throws Exception {
            ModifyACLRuleResponseBodyDpiGroupIds self = new ModifyACLRuleResponseBodyDpiGroupIds();
            return TeaModel.build(map, self);
        }

        public ModifyACLRuleResponseBodyDpiGroupIds setDpiGroupId(java.util.List<String> dpiGroupId) {
            this.dpiGroupId = dpiGroupId;
            return this;
        }
        public java.util.List<String> getDpiGroupId() {
            return this.dpiGroupId;
        }

    }

    public static class ModifyACLRuleResponseBodyDpiSignatureIds extends TeaModel {
        @NameInMap("DpiSignatureId")
        public java.util.List<String> dpiSignatureId;

        public static ModifyACLRuleResponseBodyDpiSignatureIds build(java.util.Map<String, ?> map) throws Exception {
            ModifyACLRuleResponseBodyDpiSignatureIds self = new ModifyACLRuleResponseBodyDpiSignatureIds();
            return TeaModel.build(map, self);
        }

        public ModifyACLRuleResponseBodyDpiSignatureIds setDpiSignatureId(java.util.List<String> dpiSignatureId) {
            this.dpiSignatureId = dpiSignatureId;
            return this;
        }
        public java.util.List<String> getDpiSignatureId() {
            return this.dpiSignatureId;
        }

    }

}
