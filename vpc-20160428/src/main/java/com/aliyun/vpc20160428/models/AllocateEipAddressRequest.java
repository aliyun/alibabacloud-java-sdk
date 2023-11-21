// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AllocateEipAddressRequest extends TeaModel {
    /**
     * <p>The promotion code. This parameter is not required.</p>
     */
    @NameInMap("ActivityId")
    public Long activityId;

    /**
     * <p>Specifies whether to enable automatic payment. Valid values:</p>
     * <br>
     * <p>*   **false** (default): The automatic payment is disabled. If you select this option, you must go to the Order Center to complete the payment after an order is generated.</p>
     * <p>*   **true**: The automatic payment is enabled. Payments are automatically complete after an order is generated.</p>
     * <br>
     * <p>If **InstanceChargeType** is set to **PrePaid**, this parameter is required. If **InstanceChargeType** is set to **PostPaid**, this parameter is not required.</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The maximum bandwidth of the EIP. Unit: Mbit/s.</p>
     * <br>
     * <p>*   Valid values when **InstanceChargeType** is set to **PostPaid** and **InternetChargeType** is set to **PayByBandwidth**: **1** to **500**.****</p>
     * <p>*   Valid values when **InstanceChargeType** is set to **PostPaid** and **InternetChargeType** is set to **PayByTraffic**: **1** to **200**.****</p>
     * <p>*   Valid values when **InstanceChargeType** is set to **PrePaid**: **1** to **1000**.****</p>
     * <br>
     * <p>Default value: **5**. Unit: Mbit/s.</p>
     */
    @NameInMap("Bandwidth")
    public String bandwidth;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate a token, but you must make sure that the token is unique among different requests. The **client token** can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not specify this parameter, the system automatically uses the value of **RequestId** as the **client token**. The value of **RequestId** is different for each API request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the EIP.</p>
     * <br>
     * <p>The description must be 2 to 256 characters in length. The description must start with a letter but cannot start with `http://` or `https://`.</p>
     * <br>
     * <p>>  You cannot specify this parameter if you create a subscription EIP.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The line type. Valid values:</p>
     * <br>
     * <p>*   **BGP** (default): BGP (Multi-ISP) All regions support BGP (Multi-ISP) EIPs.</p>
     * <p>*   **BGP_PRO**: BGP (Multi-ISP) Pro Only the following regions support BGP (Multi-ISP) Pro lines: China (Hong Kong), Singapore, Japan (Tokyo), Malaysia (Kuala Lumpur), Philippines (Manila), Indonesia (Jakarta), and Thailand (Bangkok).</p>
     * <br>
     * <p>For more information about BGP (Multi-ISP) and BGP (Multi-ISP) Pro, see the "Line types" section of [What is EIP?](~~32321~~)</p>
     * <br>
     * <p>*   If you are allowed to use single-ISP bandwidth, you can also choose one of the following values:</p>
     * <br>
     * <p>    *   **ChinaTelecom**</p>
     * <p>    *   **ChinaUnicom**</p>
     * <p>    *   **ChinaMobile**</p>
     * <p>    *   **ChinaTelecom_L2**</p>
     * <p>    *   **ChinaUnicom_L2**</p>
     * <p>    *   **ChinaMobile_L2**</p>
     * <br>
     * <p>*   If your services are deployed in China East 1 Finance, this parameter is required and you must set the value to **BGP_FinanceCloud**.</p>
     */
    @NameInMap("ISP")
    public String ISP;

    /**
     * <p>The billing method of the EIP. Valid values:</p>
     * <br>
     * <p>*   **PrePaid**: subscription</p>
     * <p>*   **PostPaid** (default): pay-as-you-go</p>
     * <br>
     * <p>If **InstanceChargeType** is set to **PrePaid**, set **InternetChargeType** to **PayByBandwidth**. If **InstanceChargeType** is set to **PostPaid**, set **InternetChargeType** to **PayByBandwidth** or **PayByTraffic**.</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The EIP ID.</p>
     * <br>
     * <p>Specify **IpAddress** or **InstanceId**. If you leave both parameters empty, the system randomly allocates an EIP.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The metering method of the EIP. Valid values:</p>
     * <br>
     * <p>*   **PayByBandwidth** (default): pay-by-bandwidth</p>
     * <p>*   **PayByTraffic**: pay-by-data-transfer</p>
     * <br>
     * <p>When **InstanceChargeType** is set to **PrePaid**, set **InternetChargeType** to **PayByBandwidth**.</p>
     * <br>
     * <p>When **InstanceChargeType** is set to **PostPaid**, set **InternetChargeType** to **PayByBandwidth** or **PayByTraffic**.</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The IP address of the EIP that you want to request.</p>
     * <br>
     * <p>Specify **IpAddress** or **InstanceId**. If you leave both parameters empty, the system randomly allocates an EIP.</p>
     */
    @NameInMap("IpAddress")
    public String ipAddress;

    /**
     * <p>The EIP name.</p>
     * <br>
     * <p>The name must be 1 to 128 characters in length and start with a letter, and can contain letters, digits, periods (.), underscores (\_), and hyphens (-).</p>
     * <br>
     * <p>>  You cannot specify this parameter if you create a subscription EIP.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The network type. Default value: **public**.</p>
     */
    @NameInMap("Netmode")
    public String netmode;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The subscription duration of the EIP.</p>
     * <br>
     * <p>Valid values when **PricingCycle** is set to **Month**: **1** to **9**.****</p>
     * <br>
     * <p>Valid values when **PricingCycle** is set to **Year**: **1** to **5**.****</p>
     * <br>
     * <p>This parameter must be specified when **InstanceChargeType** is set to **PrePaid**. This parameter is optional when **InstanceChargeType** is set to **PostPaid**.</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The billing cycle of the subscription EIP. Valid values:</p>
     * <br>
     * <p>*   **Month** (default)</p>
     * <p>*   **Year**</p>
     * <br>
     * <p>If **InstanceChargeType** is set to **PrePaid**, this parameter is required. If **InstanceChargeType** is set to **PostPaid**, this parameter is not required.</p>
     */
    @NameInMap("PricingCycle")
    public String pricingCycle;

    /**
     * <p>The ID of the IP address pool.</p>
     * <br>
     * <p>The EIP is allocated from the IP address pool.</p>
     * <br>
     * <p>By default, the IP address pool feature is unavailable. To use the IP address pool, apply for the privilege in the Quota Center console. For more information, see the "Request a quota increase in the Quota Center console" section in [Manage EIP quotas](~~108213~~).</p>
     */
    @NameInMap("PublicIpAddressPoolId")
    public String publicIpAddressPoolId;

    /**
     * <p>The ID of the region to which the EIP belongs.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~36063~~) operation to query the region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The editions of Anti-DDoS.</p>
     * <br>
     * <p>*   If you do not specify this parameter, Anti-DDoS Origin Basic is used.</p>
     * <p>*   If you set the parameter to **AntiDDoS_Enhanced**, Anti-DDoS Pro/Premium is used.</p>
     * <br>
     * <p>You can specify up to 10 editions of Anti-DDoS.</p>
     */
    @NameInMap("SecurityProtectionTypes")
    public java.util.List<String> securityProtectionTypes;

    /**
     * <p>The zone of the EIP.</p>
     * <br>
     * <p>When the service type of the IP address pool specified by **PublicIpAddressPoolId** is CloudBox, the default value is the zone of the IP address pool.</p>
     * <br>
     * <p>For more information, see [ListPublicIpAddressPools](~~429433~~).</p>
     */
    @NameInMap("Zone")
    public String zone;

    public static AllocateEipAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        AllocateEipAddressRequest self = new AllocateEipAddressRequest();
        return TeaModel.build(map, self);
    }

    public AllocateEipAddressRequest setActivityId(Long activityId) {
        this.activityId = activityId;
        return this;
    }
    public Long getActivityId() {
        return this.activityId;
    }

    public AllocateEipAddressRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public AllocateEipAddressRequest setBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public String getBandwidth() {
        return this.bandwidth;
    }

    public AllocateEipAddressRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AllocateEipAddressRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AllocateEipAddressRequest setISP(String ISP) {
        this.ISP = ISP;
        return this;
    }
    public String getISP() {
        return this.ISP;
    }

    public AllocateEipAddressRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public AllocateEipAddressRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AllocateEipAddressRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public AllocateEipAddressRequest setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }
    public String getIpAddress() {
        return this.ipAddress;
    }

    public AllocateEipAddressRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AllocateEipAddressRequest setNetmode(String netmode) {
        this.netmode = netmode;
        return this;
    }
    public String getNetmode() {
        return this.netmode;
    }

    public AllocateEipAddressRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public AllocateEipAddressRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AllocateEipAddressRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public AllocateEipAddressRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public AllocateEipAddressRequest setPublicIpAddressPoolId(String publicIpAddressPoolId) {
        this.publicIpAddressPoolId = publicIpAddressPoolId;
        return this;
    }
    public String getPublicIpAddressPoolId() {
        return this.publicIpAddressPoolId;
    }

    public AllocateEipAddressRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AllocateEipAddressRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public AllocateEipAddressRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AllocateEipAddressRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AllocateEipAddressRequest setSecurityProtectionTypes(java.util.List<String> securityProtectionTypes) {
        this.securityProtectionTypes = securityProtectionTypes;
        return this;
    }
    public java.util.List<String> getSecurityProtectionTypes() {
        return this.securityProtectionTypes;
    }

    public AllocateEipAddressRequest setZone(String zone) {
        this.zone = zone;
        return this;
    }
    public String getZone() {
        return this.zone;
    }

}
