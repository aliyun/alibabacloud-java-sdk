// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class AddACLRuleResponseBody extends TeaModel {
    /**
     * <p>The ID of the ACL.</p>
     * 
     * <strong>example:</strong>
     * <p>acl-xhwhyuo43l0*******</p>
     */
    @NameInMap("AclId")
    public String aclId;

    /**
     * <p>The ID of the ACL rule.</p>
     * 
     * <strong>example:</strong>
     * <p>acr-c1hkd054qywi******</p>
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
     * <p>The value of this parameter is specified in CIDR notation. Example: 192.168.10.0/24.</p>
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
     * <p>The direction of traffic in which the ACL rule is applied. Valid values:</p>
     * <ul>
     * <li><strong>in</strong>: The ACL rule controls inbound network traffic of the on-premises network that is associated with the SAG instance.</li>
     * <li><strong>out</strong>: The ACL rule controls outbound network traffic of the on-premises network that is associated with the SAG instance.</li>
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
     * <p>The timestamp when the ACL rule was created.</p>
     * <p>The timestamp is of the Long data type. If multiple ACL rules have the same priority, the rule with the earliest timestamp takes effect.</p>
     * 
     * <strong>example:</strong>
     * <p>1553766882689</p>
     */
    @NameInMap("GmtCreate")
    public Long gmtCreate;

    /**
     * <p>The protocol used by the ACL rule.</p>
     * 
     * <strong>example:</strong>
     * <p>TCP</p>
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
     * <p>The action policy of the ACL rule.</p>
     * <ul>
     * <li><strong>accept</strong>: allows the network traffic.</li>
     * <li><strong>drop</strong>: blocks the network traffic.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>drop</p>
     */
    @NameInMap("Policy")
    public String policy;

    /**
     * <p>The priority of the ACL rule.</p>
     * <p>A smaller value indicates a higher priority. If rules have the same priority, whichever applied to the SAG devices earlier takes effect.</p>
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
     * <p>880F84CB-9B54-4413-A8A3-8832C82D1BC4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The source CIDR block.</p>
     * <p>The value of this parameter is specified in CIDR notation. Example: 192.168.1.0/24.</p>
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
     * <p>The type of the ACL rule:</p>
     * <ul>
     * <li><strong>LAN</strong>: The ACL rule controls network traffic transmitted through private IP addresses.</li>
     * <li><strong>WAN</strong>: The ACL rule controls network traffic transmitted through public IP addresses.</li>
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
