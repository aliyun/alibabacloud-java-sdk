// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class AddResolverEndpointRequest extends TeaModel {
    /**
     * <p>The source IP addresses of outbound traffic. You must add two to six source IP addresses to ensure high availability.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("IpConfig")
    public java.util.List<AddResolverEndpointRequestIpConfig> ipConfig;

    /**
     * <p>The language.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The endpoint name. The name can be up to 20 characters in length. If the upper limit is exceeded, an error message is returned.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>endpoint-test-name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The security group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>kqlqlqjqqkq</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The outbound VPC ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-129343jslslsks</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The region ID of the outbound virtual private cloud (VPC).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("VpcRegionId")
    public String vpcRegionId;

    public static AddResolverEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        AddResolverEndpointRequest self = new AddResolverEndpointRequest();
        return TeaModel.build(map, self);
    }

    public AddResolverEndpointRequest setIpConfig(java.util.List<AddResolverEndpointRequestIpConfig> ipConfig) {
        this.ipConfig = ipConfig;
        return this;
    }
    public java.util.List<AddResolverEndpointRequestIpConfig> getIpConfig() {
        return this.ipConfig;
    }

    public AddResolverEndpointRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public AddResolverEndpointRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddResolverEndpointRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public AddResolverEndpointRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public AddResolverEndpointRequest setVpcRegionId(String vpcRegionId) {
        this.vpcRegionId = vpcRegionId;
        return this;
    }
    public String getVpcRegionId() {
        return this.vpcRegionId;
    }

    public static class AddResolverEndpointRequestIpConfig extends TeaModel {
        /**
         * <p>The zone ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-a</p>
         */
        @NameInMap("AzId")
        public String azId;

        /**
         * <p>The IPv4 CIDR block of the vSwitch.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.0.0/24</p>
         */
        @NameInMap("CidrBlock")
        public String cidrBlock;

        /**
         * <p>The source IP address of outbound traffic. The IP address must be within the specified CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.xx.xx</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The vSwitch ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sjqkql</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        public static AddResolverEndpointRequestIpConfig build(java.util.Map<String, ?> map) throws Exception {
            AddResolverEndpointRequestIpConfig self = new AddResolverEndpointRequestIpConfig();
            return TeaModel.build(map, self);
        }

        public AddResolverEndpointRequestIpConfig setAzId(String azId) {
            this.azId = azId;
            return this;
        }
        public String getAzId() {
            return this.azId;
        }

        public AddResolverEndpointRequestIpConfig setCidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public String getCidrBlock() {
            return this.cidrBlock;
        }

        public AddResolverEndpointRequestIpConfig setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public AddResolverEndpointRequestIpConfig setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

    }

}
