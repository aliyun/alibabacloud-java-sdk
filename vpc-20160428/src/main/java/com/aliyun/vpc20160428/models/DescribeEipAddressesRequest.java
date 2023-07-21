// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeEipAddressesRequest extends TeaModel {
    @NameInMap("Filter")
    public java.util.List<DescribeEipAddressesRequestFilter> filter;

    /**
     * <p>The ID of the EIP that you want to query.</p>
     * <br>
     * <p>You can enter up to 50 IDs of EIPs. Separate multiple IDs with commas (,).</p>
     * <br>
     * <p>>  If both the **EipAddress** and **AllocationId** parameters are set, you can enter up to 50 IDs of EIPs in **AllocationId**, and enter up to 50 IP addresses of EIPs in **EipAddress**.</p>
     */
    @NameInMap("AllocationId")
    public String allocationId;

    /**
     * <p>The ID of the cloud resource.</p>
     */
    @NameInMap("AssociatedInstanceId")
    public String associatedInstanceId;

    /**
     * <p>The type of the cloud resource with which you want to associate the EIP. Valid values:</p>
     * <br>
     * <p>*   **EcsInstance** (default): an Elastic Compute Service (ECS) instance in a virtual private cloud (VPC)</p>
     * <p>*   **SlbInstance**: a Server Load Balancer (SLB) instance in a VPC</p>
     * <p>*   **Nat**: a NAT gateway</p>
     * <p>*   **HaVip**: a high-availability virtual IP address (HAVIP)</p>
     * <p>*   **NetworkInterface**: a secondary ENI</p>
     * <p>*   **IpAddress**: an IP address</p>
     * <br>
     * <p>>  You can associate only one EIP with each ECS instance, SLB instance, HAVIP, or IP address. You can associate multiple EIPs with each NAT gateway. The number of EIPs that you can associate with a secondary ENI depends on the association mode. For more information, see [EIP overview](~~72125~~).</p>
     */
    @NameInMap("AssociatedInstanceType")
    public String associatedInstanceType;

    /**
     * <p>The billing method of the EIP. Valid values:</p>
     * <br>
     * <p>*   **PostPaid**: pay-as-you-go</p>
     * <p>*   **PrePaid**: subscription</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <br>
     * <p>*   **true**: performs a dry run. The system checks the required parameters, request syntax, and limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false** (default): performs a dry run and sends the request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The IP address of the EIP that you want to query.</p>
     * <br>
     * <p>You can enter up to 50 IP addresses of EIPs. Separate multiple IP addresses with commas (,).</p>
     * <br>
     * <p>>  If both the **EipAddress** and **AllocationId** parameters are set, you can enter up to 50 IP addresses of EIPs in **EipAddress**, and enter up to 50 IDs of EIPs in **AllocationId**.</p>
     */
    @NameInMap("EipAddress")
    public String eipAddress;

    /**
     * <p>The name of the EIP.</p>
     * <br>
     * <p>The name must be 1 to 128 characters in length, and can contain letters, digits, underscores (\_), and hyphens (-). The name must start with a letter.</p>
     */
    @NameInMap("EipName")
    public String eipName;

    /**
     * <p>The line type. Valid values:</p>
     * <br>
     * <p>*   **BGP** (default): BGP (Multi-ISP) lines. All regions support BGP (Multi-ISP) EIPs.</p>
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
     * <p>If your services are deployed in China East 1 Finance, you must set this parameter to **BGP_FinanceCloud**.</p>
     */
    @NameInMap("ISP")
    public String ISP;

    /**
     * <p>Specifies whether to return information about pending orders. Valid values:</p>
     * <br>
     * <p>*   **false** (default): does not return information about pending orders.</p>
     * <p>*   **true**: returns information about pending orders.</p>
     */
    @NameInMap("IncludeReservationData")
    public Boolean includeReservationData;

    /**
     * <p>The reason why the EIP is locked. Valid values:</p>
     * <br>
     * <p>*   **financial**: The EIP is locked due to overdue payments.</p>
     * <p>*   **security**: The EIP is locked for security reasons.</p>
     */
    @NameInMap("LockReason")
    public String lockReason;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of the page to return. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Maximum value: **100**. Default value: **10**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The IP address pool to which the EIP that you want to query belongs.</p>
     */
    @NameInMap("PublicIpAddressPoolId")
    public String publicIpAddressPoolId;

    /**
     * <p>The region ID of the EIP.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the EIPs belong.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Specifies whether to enable Anti-DDoS Pro/Premium. Valid values:</p>
     * <br>
     * <p>*   **false** (default): no</p>
     * <p>*   **true**: yes</p>
     */
    @NameInMap("SecurityProtectionEnabled")
    public Boolean securityProtectionEnabled;

    /**
     * <p>The IDs of the contiguous EIPs.</p>
     */
    @NameInMap("SegmentInstanceId")
    public String segmentInstanceId;

    /**
     * <p>The status of the EIP. Valid values:</p>
     * <br>
     * <p>*   **Associating**: being associated</p>
     * <p>*   **Unassociating**: being disassociated</p>
     * <p>*   **InUse**: allocated</p>
     * <p>*   **Available**: available</p>
     * <p>*   **Releasing**: being released</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeEipAddressesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEipAddressesRequest self = new DescribeEipAddressesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEipAddressesRequest setFilter(java.util.List<DescribeEipAddressesRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<DescribeEipAddressesRequestFilter> getFilter() {
        return this.filter;
    }

    public DescribeEipAddressesRequest setAllocationId(String allocationId) {
        this.allocationId = allocationId;
        return this;
    }
    public String getAllocationId() {
        return this.allocationId;
    }

    public DescribeEipAddressesRequest setAssociatedInstanceId(String associatedInstanceId) {
        this.associatedInstanceId = associatedInstanceId;
        return this;
    }
    public String getAssociatedInstanceId() {
        return this.associatedInstanceId;
    }

    public DescribeEipAddressesRequest setAssociatedInstanceType(String associatedInstanceType) {
        this.associatedInstanceType = associatedInstanceType;
        return this;
    }
    public String getAssociatedInstanceType() {
        return this.associatedInstanceType;
    }

    public DescribeEipAddressesRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public DescribeEipAddressesRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DescribeEipAddressesRequest setEipAddress(String eipAddress) {
        this.eipAddress = eipAddress;
        return this;
    }
    public String getEipAddress() {
        return this.eipAddress;
    }

    public DescribeEipAddressesRequest setEipName(String eipName) {
        this.eipName = eipName;
        return this;
    }
    public String getEipName() {
        return this.eipName;
    }

    public DescribeEipAddressesRequest setISP(String ISP) {
        this.ISP = ISP;
        return this;
    }
    public String getISP() {
        return this.ISP;
    }

    public DescribeEipAddressesRequest setIncludeReservationData(Boolean includeReservationData) {
        this.includeReservationData = includeReservationData;
        return this;
    }
    public Boolean getIncludeReservationData() {
        return this.includeReservationData;
    }

    public DescribeEipAddressesRequest setLockReason(String lockReason) {
        this.lockReason = lockReason;
        return this;
    }
    public String getLockReason() {
        return this.lockReason;
    }

    public DescribeEipAddressesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeEipAddressesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeEipAddressesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeEipAddressesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeEipAddressesRequest setPublicIpAddressPoolId(String publicIpAddressPoolId) {
        this.publicIpAddressPoolId = publicIpAddressPoolId;
        return this;
    }
    public String getPublicIpAddressPoolId() {
        return this.publicIpAddressPoolId;
    }

    public DescribeEipAddressesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeEipAddressesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeEipAddressesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeEipAddressesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeEipAddressesRequest setSecurityProtectionEnabled(Boolean securityProtectionEnabled) {
        this.securityProtectionEnabled = securityProtectionEnabled;
        return this;
    }
    public Boolean getSecurityProtectionEnabled() {
        return this.securityProtectionEnabled;
    }

    public DescribeEipAddressesRequest setSegmentInstanceId(String segmentInstanceId) {
        this.segmentInstanceId = segmentInstanceId;
        return this;
    }
    public String getSegmentInstanceId() {
        return this.segmentInstanceId;
    }

    public DescribeEipAddressesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class DescribeEipAddressesRequestFilter extends TeaModel {
        /**
         * <p>The filter key used to query resources. Set the value to **CreationStartTime**, which indicates the time when the system started to create the resource.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The filter value used to query resources. Specify the time in the ISO 8601 standard in `YYYY-MM-DDThh:mmZ` format. The time must be in UTC.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeEipAddressesRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            DescribeEipAddressesRequestFilter self = new DescribeEipAddressesRequestFilter();
            return TeaModel.build(map, self);
        }

        public DescribeEipAddressesRequestFilter setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeEipAddressesRequestFilter setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
