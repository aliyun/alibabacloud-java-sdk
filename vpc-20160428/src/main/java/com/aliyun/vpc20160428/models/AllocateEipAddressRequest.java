// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AllocateEipAddressRequest extends TeaModel {
    /**
     * <p>The promotion code. Ignore this parameter.</p>
     */
    @NameInMap("ActivityId")
    public Long activityId;

    /**
     * <p>Specifies whether to enable automatic payment. Default value: false. Valid values:</p>
     * <br>
     * <p>*   **false**: disables automatic payment. This is the default value. If you select this option, you must go to the Order Center to complete the payment after an order is generated.</p>
     * <p>*   **true**: enables automatic payment. Payments are automatically completed.</p>
     * <br>
     * <p>When **InstanceChargeType** is set to **PrePaid**, this parameter is required. When **InstanceChargeType** is set to **PostPaid**, this parameter is not required.</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The maximum bandwidth of the EIP. Unit: Mbit/s.</p>
     * <br>
     * <p>*   When **InstanceChargeType** is set to **PostPaid** and **InternetChargeType** is set to **PayByBandwidth**, valid values for **Bandwidth** are **1** to **500**.</p>
     * <p>*   When **InstanceChargeType** is set to **PostPaid** and **InternetChargeType** is set to **PayByTraffic**, valid values for **Bandwidth** are **1** to **200**.</p>
     * <p>*   When **InstanceChargeType** is set to **PrePaid**, valid values for **Bandwidth** are **1** to **1000**.</p>
     * <br>
     * <p>Default value: **5**. Unit: Mbit/s.</p>
     */
    @NameInMap("Bandwidth")
    public String bandwidth;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The **token** can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not set this parameter, the system automatically uses the value of **RequestId** as the value of **ClientToken**. The value of **RequestId** for each API request is different.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the EIP.</p>
     * <br>
     * <p>The description must be 2 to 256 characters in length. It must start with a letter but cannot start with `http://` or `https://`.</p>
     * <br>
     * <p>>  This parameter is unavailable when you create a subscription EIP.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The line type. Valid values:</p>
     * <br>
     * <p>*   **BGP** (default): BGP (Multi-ISP) lines All regions support BGP (Multi-ISP) EIPs.</p>
     * <p>*   **BGP_PRO**: BGP (Multi-ISP) Pro lines Only the following regions support BGP (Multi-ISP) Pro lines: China (Hong Kong), Singapore, Malaysia (Kuala Lumpur), Philippines (Manila), Indonesia (Jakarta), and Thailand (Bangkok).</p>
     * <br>
     * <p>For more information about BGP (Multi-ISP) and BGP (Multi-ISP) Pro, see [EIP line types](~~32321~~).</p>
     * <br>
     * <p>*   If you are allowed to use single-ISP bandwidth, you can also choose one of the following values:</p>
     * <br>
     * <p>    *   **ChinaTelecom**: China Telecom</p>
     * <p>    *   **ChinaUnicom**: China Unicom</p>
     * <p>    *   **ChinaMobile**: China Mobile</p>
     * <p>    *   **ChinaTelecom_L2**: China Telecom L2</p>
     * <p>    *   **ChinaUnicom_L2**: China Unicom L2</p>
     * <p>    *   **ChinaMobile_L2**: China Mobile L2</p>
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
     * <p>When **InstanceChargeType** is set to **PrePaid**, set **InternetChargeType** to **PayByBandwidth**. When **InstanceChargeType** is set to **PostPaid**, set **InternetChargeType** to **PayByBandwidth** or **PayByTraffic**.</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The metering method of the EIP. Valid values:</p>
     * <br>
     * <p>*   **PayByBandwidth** (default): pay-by-bandwidth</p>
     * <p>*   **PayByTraffic**: pay-by-data-transfer</p>
     * <br>
     * <p>When **InstanceChargeType** is set to **PrePaid**, you must set **InternetChargeType** to **PayByBandwidth**.</p>
     * <br>
     * <p>When **InstanceChargeType** is set to **PostPaid**, set **InternetChargeType** to **PayByBandwidth** or **PayByTraffic**.</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The name of the EIP.</p>
     * <br>
     * <p>The name must be 1 to 128 characters in length, and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). It must start with a letter.</p>
     * <br>
     * <p>>  This parameter is unavailable when you create a subscription EIP.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The network type. Set the value to **public**, which specifies the Internet.</p>
     */
    @NameInMap("Netmode")
    public String netmode;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The subscription duration of the instance.</p>
     * <br>
     * <p>When **PricingCycle** is set to **Month**, set **Period** to a value from **1** to **9**.</p>
     * <br>
     * <p>When **PricingCycle** is set to **Year**, set **Period** to a value from **1** to **5**.</p>
     * <br>
     * <p>This parameter is required when **InstanceChargeType** is set to **PrePaid**. This parameter is optional when **InstanceChargeType** is set to **PostPaid**.</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The billing cycle of the subscription EIP. Valid values:</p>
     * <br>
     * <p>*   **Month** (default): The EIP is billed on a monthly basis.</p>
     * <p>*   **Year**: The EIP is billed on an annual basis.</p>
     * <br>
     * <p>When **InstanceChargeType** is set to **PrePaid**, this parameter is required. When **InstanceChargeType** is set to **PostPaid**, this parameter is not required.</p>
     */
    @NameInMap("PricingCycle")
    public String pricingCycle;

    /**
     * <p>The ID of the IP address pool.</p>
     * <br>
     * <p>The EIP is allocated from the IP address pool.</p>
     * <br>
     * <p>You cannot use the IP address pool feature by default. To use the IP address pool feature, apply for the privilege in the Quota Center console. For more information, see [Request a quota increase in the Quota Center console](~~108213~~).</p>
     */
    @NameInMap("PublicIpAddressPoolId")
    public String publicIpAddressPoolId;

    /**
     * <p>The ID of the region to which the EIP belongs.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.</p>
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

    @NameInMap("SecurityProtectionTypes")
    public java.util.List<String> securityProtectionTypes;

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

    public AllocateEipAddressRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
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

}
