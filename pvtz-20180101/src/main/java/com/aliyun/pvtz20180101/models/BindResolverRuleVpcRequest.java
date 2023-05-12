// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class BindResolverRuleVpcRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("RuleId")
    public String ruleId;

    @NameInMap("Vpc")
    public java.util.List<BindResolverRuleVpcRequestVpc> vpc;

    public static BindResolverRuleVpcRequest build(java.util.Map<String, ?> map) throws Exception {
        BindResolverRuleVpcRequest self = new BindResolverRuleVpcRequest();
        return TeaModel.build(map, self);
    }

    public BindResolverRuleVpcRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public BindResolverRuleVpcRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public BindResolverRuleVpcRequest setVpc(java.util.List<BindResolverRuleVpcRequestVpc> vpc) {
        this.vpc = vpc;
        return this;
    }
    public java.util.List<BindResolverRuleVpcRequestVpc> getVpc() {
        return this.vpc;
    }

    public static class BindResolverRuleVpcRequestVpc extends TeaModel {
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>vpcID</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VpcType")
        public String vpcType;

        public static BindResolverRuleVpcRequestVpc build(java.util.Map<String, ?> map) throws Exception {
            BindResolverRuleVpcRequestVpc self = new BindResolverRuleVpcRequestVpc();
            return TeaModel.build(map, self);
        }

        public BindResolverRuleVpcRequestVpc setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public BindResolverRuleVpcRequestVpc setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public BindResolverRuleVpcRequestVpc setVpcType(String vpcType) {
            this.vpcType = vpcType;
            return this;
        }
        public String getVpcType() {
            return this.vpcType;
        }

    }

}
