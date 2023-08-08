// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVpnGatewayRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic payment for the VPN gateway. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false** (default)</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The maximum bandwidth of the VPN gateway. Unit: Mbit/s.</p>
     * <br>
     * <p>*   If you want to create a public VPN gateway, valid values are **10**, **100**, **200**, **500**, and **1000**.</p>
     * <p>*   If you want to create a private VPN gateway, valid values are **200** and **1000**.</p>
     * <br>
     * <p>>  The maximum bandwidth supported by VPN gateways in some regions is 200 Mbit/s. For more information, see [VPN gateway limits](~~65290~~).</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <br>
     * <p>> If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>指定VPN网关实例关联的第二个交换机实例。</p>
     * <br>
     * <p>- 如果当前地域支持创建双隧道模式的IPsec-VPN连接，则本参数必填。</p>
     * <p>- 您需要从VPN网关实例关联的VPC实例下指定两个分布在不同可用区的交换机实例，以实现IPsec-VPN连接可用区级别的容灾。</p>
     * <p>- 对于仅支持一个可用区的地域 ，不支持可用区级别的容灾，建议您在该可用区下指定两个不同的交换机实例以实现IPsec-VPN连接的高可用，支持指定相同的交换机实例。</p>
     * <br>
     * <p>关于支持双隧道模式IPsec-VPN连接的地域和可用区的信息，请参见[IPsec-VPN连接升级为双隧道模式](~~2358946~~)。</p>
     */
    @NameInMap("DisasterRecoveryVSwitchId")
    public String disasterRecoveryVSwitchId;

    /**
     * <p>Specifies whether to enable the IPsec-VPN feature. Valid values:</p>
     * <br>
     * <p>*   **true** (default)</p>
     * <p>*   **false**</p>
     */
    @NameInMap("EnableIpsec")
    public Boolean enableIpsec;

    /**
     * <p>Specifies whether to enable the SSL-VPN feature for the VPN gateway. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false** (default)</p>
     */
    @NameInMap("EnableSsl")
    public Boolean enableSsl;

    /**
     * <p>The billing method of the VPN gateway. Set the value to **POSTPAY**, which specifies the pay-as-you-go billing method.</p>
     * <br>
     * <p>>  This parameter is required when you create a VPN gateway.</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The name of the VPN gateway. The default value is the ID of the VPN gateway.</p>
     * <br>
     * <p>The name must be 1 to 100 characters in length and cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The network type of the VPN gateway. Valid values:</p>
     * <br>
     * <p>*   **public** (default)</p>
     * <p>*   **private**</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The subscription duration. Unit: month. Valid values: **1** to **9**, **12**, **24**, and **36**.</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The region ID of the VPN gateway. You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The maximum number of clients that can be connected at the same time. Valid values: **5** (default), **10**, **20**, **50**, **100**, **200**, **500**, and **1000**.</p>
     */
    @NameInMap("SslConnections")
    public Integer sslConnections;

    /**
     * <p>The ID of the vSwitch to which the VPN gateway belongs.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the virtual private cloud (VPC) where you want to create the VPN gateway.</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The type of the VPN gateway.</p>
     * <br>
     * <p>Set the value to **Normal** (default), which specifies a standard NAT gateway.</p>
     */
    @NameInMap("VpnType")
    public String vpnType;

    public static CreateVpnGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVpnGatewayRequest self = new CreateVpnGatewayRequest();
        return TeaModel.build(map, self);
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

    public CreateVpnGatewayRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateVpnGatewayRequest setDisasterRecoveryVSwitchId(String disasterRecoveryVSwitchId) {
        this.disasterRecoveryVSwitchId = disasterRecoveryVSwitchId;
        return this;
    }
    public String getDisasterRecoveryVSwitchId() {
        return this.disasterRecoveryVSwitchId;
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

    public CreateVpnGatewayRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public CreateVpnGatewayRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateVpnGatewayRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public CreateVpnGatewayRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateVpnGatewayRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateVpnGatewayRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateVpnGatewayRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateVpnGatewayRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateVpnGatewayRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
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

    public CreateVpnGatewayRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateVpnGatewayRequest setVpnType(String vpnType) {
        this.vpnType = vpnType;
        return this;
    }
    public String getVpnType() {
        return this.vpnType;
    }

}
