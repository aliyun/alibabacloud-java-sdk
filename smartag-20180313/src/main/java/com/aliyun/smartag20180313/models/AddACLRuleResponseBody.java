// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class AddACLRuleResponseBody extends TeaModel {
    @NameInMap("AclId")
    public String aclId;

    @NameInMap("AcrId")
    public String acrId;

    @NameInMap("Description")
    public String description;

    @NameInMap("DestCidr")
    public String destCidr;

    @NameInMap("DestPortRange")
    public String destPortRange;

    @NameInMap("Direction")
    public String direction;

    @NameInMap("DpiGroupIds")
    public AddACLRuleResponseBodyDpiGroupIds dpiGroupIds;

    @NameInMap("DpiSignatureIds")
    public AddACLRuleResponseBodyDpiSignatureIds dpiSignatureIds;

    @NameInMap("GmtCreate")
    public Long gmtCreate;

    @NameInMap("IpProtocol")
    public String ipProtocol;

    @NameInMap("Name")
    public String name;

    @NameInMap("Policy")
    public String policy;

    @NameInMap("Priority")
    public Integer priority;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SourceCidr")
    public String sourceCidr;

    @NameInMap("SourcePortRange")
    public String sourcePortRange;

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
