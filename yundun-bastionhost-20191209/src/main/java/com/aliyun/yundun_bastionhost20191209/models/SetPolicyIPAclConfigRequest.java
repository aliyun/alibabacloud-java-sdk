// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class SetPolicyIPAclConfigRequest extends TeaModel {
    @NameInMap("IPAclConfig")
    public SetPolicyIPAclConfigRequestIPAclConfig IPAclConfig;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PolicyId")
    public String policyId;

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
        @NameInMap("AclType")
        public String aclType;

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
