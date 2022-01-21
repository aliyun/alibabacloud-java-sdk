// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifyACLRuleResponseBody extends TeaModel {
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
    public ModifyACLRuleResponseBodyDpiGroupIds dpiGroupIds;

    @NameInMap("DpiSignatureIds")
    public ModifyACLRuleResponseBodyDpiSignatureIds dpiSignatureIds;

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
