// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class AddACLRuleResponseBody extends TeaModel {
    /**
     * <p>The ID of the access control instance.</p>
     * 
     * <strong>example:</strong>
     * <p>acl-xhwhyuo43l0*******</p>
     */
    @NameInMap("AclId")
    public String aclId;

    /**
     * <p>The ID of the access control rule.</p>
     * 
     * <strong>example:</strong>
     * <p>acr-c1hkd054qywi******</p>
     */
    @NameInMap("AcrId")
    public String acrId;

    /**
     * <p>The description of the access control rule.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The destination CIDR block.</p>
     * <p>The destination CIDR block must be in CIDR format, such as 192.168.10.0/24.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.10.0/24</p>
     */
    @NameInMap("DestCidr")
    public String destCidr;

    /**
     * <p>The destination port range.</p>
     * 
     * <strong>example:</strong>
     * <p>1/65535</p>
     */
    @NameInMap("DestPortRange")
    public String destPortRange;

    /**
     * <p>The direction in which the access control rule is applied. Valid values:</p>
     * <ul>
     * <li><strong>in</strong>: inbound. This value specifies traffic from external networks to the local branch where the Smart Access Gateway (SAG) instance is deployed.</li>
     * <li><strong>out</strong>: outbound. This value specifies traffic from the local branch where the SAG instance is deployed to external networks.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>out</p>
     */
    @NameInMap("Direction")
    public String direction;

    @NameInMap("DpiGroupIds")
    public AddACLRuleResponseBodyDpiGroupIds dpiGroupIds;

    @NameInMap("DpiSignatureIds")
    public AddACLRuleResponseBodyDpiSignatureIds dpiSignatureIds;

    /**
     * <p>The timestamp when the access control rule was created.</p>
     * <p>The timestamp is of the Long type. If multiple rules have the same priority, the rule with the smaller timestamp takes effect first.</p>
     * 
     * <strong>example:</strong>
     * <p>1553766882689</p>
     */
    @NameInMap("GmtCreate")
    public Long gmtCreate;

    /**
     * <p>The protocol used by the access control rule.</p>
     * 
     * <strong>example:</strong>
     * <p>TCP</p>
     */
    @NameInMap("IpProtocol")
    public String ipProtocol;

    /**
     * <p>The name of the access control rule.</p>
     * 
     * <strong>example:</strong>
     * <p>doctest</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The authorization policy of the access control rule.</p>
     * <ul>
     * <li><p><strong>accept</strong>: Allows the traffic.</p>
     * </li>
     * <li><p><strong>drop</strong>: Denies the traffic.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>drop</p>
     */
    @NameInMap("Policy")
    public String policy;

    /**
     * <p>The priority of the access control rule.</p>
     * <p>A smaller value indicates a higher priority. If multiple rules have the same priority, the rule that is first delivered to the Smart Access Gateway device takes effect first.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>880F84CB-9B54-4413-A8A3-8832C82D1BC4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The source CIDR block.</p>
     * <p>The source CIDR block must be in CIDR format, such as 192.168.1.0/24.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.20.0/24</p>
     */
    @NameInMap("SourceCidr")
    public String sourceCidr;

    /**
     * <p>The source port range.</p>
     * 
     * <strong>example:</strong>
     * <p>1/65535</p>
     */
    @NameInMap("SourcePortRange")
    public String sourcePortRange;

    /**
     * <p>The type of the access control rule.</p>
     * <ul>
     * <li><p><strong>LAN</strong>: private network. This value specifies that the access control rule is applied to traffic destined for private IP addresses.</p>
     * </li>
     * <li><p><strong>WAN</strong>: public network. This value specifies that the access control rule is applied to traffic destined for public IP addresses.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>LAN</p>
     */
    @NameInMap("Type")
    public String type;

    public static AddACLRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddACLRuleResponseBody self = new AddACLRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public AddACLRuleResponseBody setAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }
    public String getAclId() {
        return this.aclId;
    }

    public AddACLRuleResponseBody setAcrId(String acrId) {
        this.acrId = acrId;
        return this;
    }
    public String getAcrId() {
        return this.acrId;
    }

    public AddACLRuleResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AddACLRuleResponseBody setDestCidr(String destCidr) {
        this.destCidr = destCidr;
        return this;
    }
    public String getDestCidr() {
        return this.destCidr;
    }

    public AddACLRuleResponseBody setDestPortRange(String destPortRange) {
        this.destPortRange = destPortRange;
        return this;
    }
    public String getDestPortRange() {
        return this.destPortRange;
    }

    public AddACLRuleResponseBody setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public AddACLRuleResponseBody setDpiGroupIds(AddACLRuleResponseBodyDpiGroupIds dpiGroupIds) {
        this.dpiGroupIds = dpiGroupIds;
        return this;
    }
    public AddACLRuleResponseBodyDpiGroupIds getDpiGroupIds() {
        return this.dpiGroupIds;
    }

    public AddACLRuleResponseBody setDpiSignatureIds(AddACLRuleResponseBodyDpiSignatureIds dpiSignatureIds) {
        this.dpiSignatureIds = dpiSignatureIds;
        return this;
    }
    public AddACLRuleResponseBodyDpiSignatureIds getDpiSignatureIds() {
        return this.dpiSignatureIds;
    }

    public AddACLRuleResponseBody setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public AddACLRuleResponseBody setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    public AddACLRuleResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddACLRuleResponseBody setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public AddACLRuleResponseBody setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public AddACLRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddACLRuleResponseBody setSourceCidr(String sourceCidr) {
        this.sourceCidr = sourceCidr;
        return this;
    }
    public String getSourceCidr() {
        return this.sourceCidr;
    }

    public AddACLRuleResponseBody setSourcePortRange(String sourcePortRange) {
        this.sourcePortRange = sourcePortRange;
        return this;
    }
    public String getSourcePortRange() {
        return this.sourcePortRange;
    }

    public AddACLRuleResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class AddACLRuleResponseBodyDpiGroupIds extends TeaModel {
        @NameInMap("DpiGroupId")
        public java.util.List<String> dpiGroupId;

        public static AddACLRuleResponseBodyDpiGroupIds build(java.util.Map<String, ?> map) throws Exception {
            AddACLRuleResponseBodyDpiGroupIds self = new AddACLRuleResponseBodyDpiGroupIds();
            return TeaModel.build(map, self);
        }

        public AddACLRuleResponseBodyDpiGroupIds setDpiGroupId(java.util.List<String> dpiGroupId) {
            this.dpiGroupId = dpiGroupId;
            return this;
        }
        public java.util.List<String> getDpiGroupId() {
            return this.dpiGroupId;
        }

    }

    public static class AddACLRuleResponseBodyDpiSignatureIds extends TeaModel {
        @NameInMap("DpiSignatureId")
        public java.util.List<String> dpiSignatureId;

        public static AddACLRuleResponseBodyDpiSignatureIds build(java.util.Map<String, ?> map) throws Exception {
            AddACLRuleResponseBodyDpiSignatureIds self = new AddACLRuleResponseBodyDpiSignatureIds();
            return TeaModel.build(map, self);
        }

        public AddACLRuleResponseBodyDpiSignatureIds setDpiSignatureId(java.util.List<String> dpiSignatureId) {
            this.dpiSignatureId = dpiSignatureId;
            return this;
        }
        public java.util.List<String> getDpiSignatureId() {
            return this.dpiSignatureId;
        }

    }

}
