// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class AddResolverEndpointRequest extends TeaModel {
    /**
     * <p>The list of source IP addresses for outbound traffic. You must add at least two IP addresses. You can add up to six IP addresses.</p>
     * <blockquote>
     * <p>To ensure high availability (HA), add at least two source IP addresses for the outbound endpoint. We recommend that you allocate these IP addresses in different zones. You can add a maximum of six source IP addresses.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("IpConfig")
    public java.util.List<AddResolverEndpointRequestIpConfig> ipConfig;

    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p>zh: Chinese.</p>
     * </li>
     * <li><p>en: English.</p>
     * </li>
     * </ul>
     * <p>Default value: en</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The name of the endpoint. The name can be up to 20 characters long. An error is reported if the limit is exceeded.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>endpoint-test-name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the security group. The rules in the security group are applied to the outbound VPC.</p>
     * <blockquote>
     * <p>To prevent service interruptions, you cannot change this value after you create the outbound endpoint.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-0jld3m9yq7l2cw12****</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The ID of the outbound virtual private cloud (VPC). All outbound DNS query traffic from the Resolver is forwarded through this VPC.</p>
     * <blockquote>
     * <p>To prevent service interruptions, you cannot change this value after you create the outbound endpoint.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-0jl96awrjt75ezglc****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The region ID of the outbound VPC.</p>
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
         * <p>The ID of the zone where the vSwitch resides.</p>
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
         * <p>172.16.XX.XX/24</p>
         */
        @NameInMap("CidrBlock")
        public String cidrBlock;

        /**
         * <p>The IP address. The IP address must be within the specified CIDR block. If you leave this parameter empty, the system automatically assigns an IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.XX.XX</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The vSwitch ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-0jlgeyq4oazkh5xue****</p>
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
