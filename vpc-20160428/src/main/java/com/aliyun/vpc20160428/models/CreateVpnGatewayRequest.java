// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVpnGatewayRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("Name")
    public String name;

    @NameInMap("VpcId")
    @Validation(required = true)
    public String vpcId;

    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("AutoPay")
    public Boolean autoPay;

    @NameInMap("Bandwidth")
    @Validation(required = true)
    public Integer bandwidth;

    @NameInMap("EnableIpsec")
    public Boolean enableIpsec;

    @NameInMap("EnableSsl")
    public Boolean enableSsl;

    @NameInMap("SslConnections")
    public Integer sslConnections;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    public static CreateVpnGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVpnGatewayRequest self = new CreateVpnGatewayRequest();
        return TeaModel.build(map, self);
    }

    public CreateVpnGatewayRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateVpnGatewayRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateVpnGatewayRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateVpnGatewayRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public CreateVpnGatewayRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateVpnGatewayRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateVpnGatewayRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public CreateVpnGatewayRequest setEnableIpsec(Boolean enableIpsec) {
        this.enableIpsec = enableIpsec;
        return this;
    }
    public Boolean getEnableIpsec() {
        return this.enableIpsec;
    }

    public CreateVpnGatewayRequest setEnableSsl(Boolean enableSsl) {
        this.enableSsl = enableSsl;
        return this;
    }
    public Boolean getEnableSsl() {
        return this.enableSsl;
    }

    public CreateVpnGatewayRequest setSslConnections(Integer sslConnections) {
        this.sslConnections = sslConnections;
        return this;
    }
    public Integer getSslConnections() {
        return this.sslConnections;
    }

    public CreateVpnGatewayRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

}
