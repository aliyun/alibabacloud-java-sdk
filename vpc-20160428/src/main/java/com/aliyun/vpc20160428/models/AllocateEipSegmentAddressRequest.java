// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AllocateEipSegmentAddressRequest extends TeaModel {
    /**
     * <p>The maximum bandwidth of the EIP. Unit: Mbit/s.</p>
     * <br>
     * <p>*   When **InstanceChargeType** is set to **PostPaid** and **InternetChargeType** is set to **PayByBandwidth**, the valid values for **Bandwidth** are **1** to **500**.</p>
     * <p>*   When **InstanceChargeType** is set to **PostPaid** and **InternetChargeType** is set to **PayByTraffic**, the valid values for **Bandwidth** are **1** to **200**.</p>
     * <p>*   When **InstanceChargeType** is set to **PrePaid**, the valid values for **Bandwidth** are **1** to **1000**.</p>
     * <br>
     * <p>Default value: **5**. Unit: Mbit/s.</p>
     */
    @NameInMap("Bandwidth")
    public String bandwidth;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. </p>
     * <br>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among all requests. The **client token** can contain only ASCII characters. </p>
     * <br>
     * <p>>  If you do not specify this parameter, the system uses **RequestId** as **ClientToken**. The value of **RequestId** for each API request may be different.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The subnet mask length of the contiguous EIPs. Valid values:</p>
     * <br>
     * <p>- **28**: applies for 16 contiguous EIPs in each call.</p>
     * <p>- **27**: applies for 32 contiguous EIPs in each call.</p>
     * <p>- **26**: applies for 64 contiguous EIPs each call.</p>
     * <p>- **25**: applies for 128 contiguous EIPs in each call.</p>
     * <p>- **24**: applies for 256 contiguous EIPs in each call.</p>
     * <br>
     * <p>>  The number of contiguous EIPs allocated by the system may be less than the requested number because one, three, or four EIPs may be reserved.</p>
     */
    @NameInMap("EipMask")
    public String eipMask;

    /**
     * <p>The metering method of the contiguous EIPs. Valid values:</p>
     * <br>
     * <p>*   **PayByBandwidth** (default): pay-by-bandwidth</p>
     * <p>*   **PayByTraffic**: pay-by-data-transfer</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The line type. Valid values:</p>
     * <br>
     * <p>*   **BGP** (default): BGP (Multi-ISP) lines All regions support BGP (Multi-ISP) EIPs.</p>
     * <p>*   **BGP_PRO**: BGP (Multi-ISP) Pro lines. Only the following regions support BGP (Multi-ISP) Pro lines: China (Hong Kong), Singapore, Malaysia (Kuala Lumpur), Philippines (Manila), Indonesia (Jakarta), and Thailand (Bangkok).</p>
     * <br>
     * <p>For more information about BGP (Multi-ISP) and BGP (Multi-ISP) Pro, see [EIP line types](~~32321~~).</p>
     * <br>
     * <p>If you are allowed to use single-ISP bandwidth, you can also choose one of the following values:</p>
     * <br>
     * <p>*   **ChinaTelecom**: China Telecom</p>
     * <p>*   **ChinaUnicom**: China Unicom</p>
     * <p>*   **ChinaMobile**: China Mobile</p>
     * <p>*   **ChinaTelecom_L2**: China Telecom L2</p>
     * <p>*   **ChinaUnicom_L2**: China Unicom L2</p>
     * <p>*   **ChinaMobile_L2**: China Mobile L2</p>
     * <br>
     * <p>If your services are deployed in China East 1 Finance, this parameter is required and you must set the value to **BGP_FinanceCloud**.</p>
     */
    @NameInMap("Isp")
    public String isp;

    /**
     * <p>Set the value to **public**, which specifies the Internet.</p>
     */
    @NameInMap("Netmode")
    public String netmode;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the contiguous EIPs.</p>
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

    public static AllocateEipSegmentAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        AllocateEipSegmentAddressRequest self = new AllocateEipSegmentAddressRequest();
        return TeaModel.build(map, self);
    }

    public AllocateEipSegmentAddressRequest setBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public String getBandwidth() {
        return this.bandwidth;
    }

    public AllocateEipSegmentAddressRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AllocateEipSegmentAddressRequest setEipMask(String eipMask) {
        this.eipMask = eipMask;
        return this;
    }
    public String getEipMask() {
        return this.eipMask;
    }

    public AllocateEipSegmentAddressRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public AllocateEipSegmentAddressRequest setIsp(String isp) {
        this.isp = isp;
        return this;
    }
    public String getIsp() {
        return this.isp;
    }

    public AllocateEipSegmentAddressRequest setNetmode(String netmode) {
        this.netmode = netmode;
        return this;
    }
    public String getNetmode() {
        return this.netmode;
    }

    public AllocateEipSegmentAddressRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public AllocateEipSegmentAddressRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AllocateEipSegmentAddressRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AllocateEipSegmentAddressRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public AllocateEipSegmentAddressRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AllocateEipSegmentAddressRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
