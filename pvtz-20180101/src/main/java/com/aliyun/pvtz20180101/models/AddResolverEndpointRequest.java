// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class AddResolverEndpointRequest extends TeaModel {
    @NameInMap("IpConfig")
    public java.util.List<AddResolverEndpointRequestIpConfig> ipConfig;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Name")
    public String name;

    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    @NameInMap("VpcId")
    public String vpcId;

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
        @NameInMap("AzId")
        public String azId;

        @NameInMap("CidrBlock")
        public String cidrBlock;

        @NameInMap("Ip")
        public String ip;

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
