// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class BindResolverRuleVpcRequest extends TeaModel {
    /**
     * <p>The language.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The forwarding rule ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hra0**</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    /**
     * <p>The VPCs.</p>
     */
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
        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-kqk1i2o2ajsksl-vpc-test</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The VPC type. Valid values:</p>
         * <ul>
         * <li>STANDARD: standard VPC</li>
         * <li>EDS: Elastic Desktop Service (EDS) workspace VPC</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>STANDARD</p>
         */
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
