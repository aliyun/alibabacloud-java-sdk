// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateCommonBandwidthPackageRequest extends TeaModel {
    /**
     * <p>The maximum bandwidth of the Internet Shared Bandwidth instance. Unit: Mbit/s.</p>
     * <br>
     * <p>Valid values: **1** to **1000**. Default value: **1**.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the Internet Shared Bandwidth instance.</p>
     * <br>
     * <p>The description must be 2 to 256 characters in length and start with a letter. The description cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The line type. Valid values:</p>
     * <br>
     * <p>*   **BGP** All regions support BGP (Multi-ISP).</p>
     * <p>*   **BGP_PRO** BGP (Multi-ISP) Pro lines are available in the China (Hong Kong), Singapore, Japan (Tokyo), Philippines (Manila), Malaysia (Kuala Lumpur), Indonesia (Jakarta), and Thailand (Bangkok) regions.</p>
     * <br>
     * <p>If you are allowed to use single-ISP bandwidth, you can also use one of the following values:</p>
     * <br>
     * <p>*   **ChinaTelecom**</p>
     * <p>*   **ChinaUnicom**</p>
     * <p>*   **ChinaMobile**</p>
     * <p>*   **ChinaTelecom_L2**</p>
     * <p>*   **ChinaUnicom_L2**</p>
     * <p>*   **ChinaMobile_L2**</p>
     * <br>
     * <p>If your services are deployed in China East 1 Finance, this parameter is required and you must set the value to **BGP_FinanceCloud**.</p>
     */
    @NameInMap("ISP")
    public String ISP;

    /**
     * <p>The billing method of the Internet Shared Bandwidth instance. Set the value to **PayByTraffic**, which specifies the pay-by-data-transfer billing method.</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The name of the Internet Shared Bandwidth instance.</p>
     * <br>
     * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The name must start with a letter.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The percentage of the minimum bandwidth commitment. Set the parameter to **20**.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>This parameter is available only on the Alibaba Cloud China site.</p>
     */
    @NameInMap("Ratio")
    public Integer ratio;

    /**
     * <p>The region ID of the Internet Shared Bandwidth instance.</p>
     * <br>
     * <p>You can call the [DescribeRegions](https://help.aliyun.com/document_detail/36063.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
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

    /**
     * <p>The zone of the Internet Shared Bandwidth instance. This parameter is required if you create an Internet Shared Bandwidth instance for a cloud box.</p>
     */
    @NameInMap("Zone")
    public String zone;

    public static CreateCommonBandwidthPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCommonBandwidthPackageRequest self = new CreateCommonBandwidthPackageRequest();
        return TeaModel.build(map, self);
    }

    public CreateCommonBandwidthPackageRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public CreateCommonBandwidthPackageRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateCommonBandwidthPackageRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateCommonBandwidthPackageRequest setISP(String ISP) {
        this.ISP = ISP;
        return this;
    }
    public String getISP() {
        return this.ISP;
    }

    public CreateCommonBandwidthPackageRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public CreateCommonBandwidthPackageRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCommonBandwidthPackageRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateCommonBandwidthPackageRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateCommonBandwidthPackageRequest setRatio(Integer ratio) {
        this.ratio = ratio;
        return this;
    }
    public Integer getRatio() {
        return this.ratio;
    }

    public CreateCommonBandwidthPackageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateCommonBandwidthPackageRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateCommonBandwidthPackageRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateCommonBandwidthPackageRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateCommonBandwidthPackageRequest setSecurityProtectionTypes(java.util.List<String> securityProtectionTypes) {
        this.securityProtectionTypes = securityProtectionTypes;
        return this;
    }
    public java.util.List<String> getSecurityProtectionTypes() {
        return this.securityProtectionTypes;
    }

    public CreateCommonBandwidthPackageRequest setZone(String zone) {
        this.zone = zone;
        return this;
    }
    public String getZone() {
        return this.zone;
    }

}
