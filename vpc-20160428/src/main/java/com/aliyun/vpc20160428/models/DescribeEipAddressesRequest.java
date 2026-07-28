// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeEipAddressesRequest extends TeaModel {
    @NameInMap("Filter")
    public java.util.List<DescribeEipAddressesRequestFilter> filter;

    /**
     * <p>The ID of the EIP instance to query. </p>
     * <p>You can specify up to 50 EIP instance IDs. Separate multiple instance IDs with commas (,).</p>
     * <blockquote>
     * <p>If you specify both <strong>EipAddress</strong> and <strong>AllocationId</strong>, you can specify up to 50 EIP instance IDs for <strong>AllocationId</strong> and up to 50 EIP IP addresses for <strong>EipAddress</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>eip-2zeerraiwb7ujxscd****</p>
     */
    @NameInMap("AllocationId")
    public String allocationId;

    /**
     * <p>The instance ID of the cloud resource.</p>
     * 
     * <strong>example:</strong>
     * <p>i-2zebb08phyccdvf****</p>
     */
    @NameInMap("AssociatedInstanceId")
    public String associatedInstanceId;

    /**
     * <p>The type of the cloud resource instance to attach. Valid values: </p>
     * <ul>
     * <li><strong>EcsInstance</strong> (default): an ECS instance in a VPC.</li>
     * <li><strong>SlbInstance</strong>: a CLB instance in a VPC.</li>
     * <li><strong>Nat</strong>: a NAT gateway.</li>
     * <li><strong>HaVip</strong>: a high-availability virtual IP address. </li>
     * <li><strong>NetworkInterface</strong>: a secondary elastic network interface (ENI).</li>
     * <li><strong>IpAddress</strong>: an IP address.</li>
     * </ul>
     * <blockquote>
     * <p>Each ECS instance, CLB instance, high-availability virtual IP address, and IP address can be attached with only one EIP at a time. A NAT gateway can be attached with multiple EIPs. The number of EIPs that can be attached to a secondary elastic network interface (ENI) depends on the EIP association pattern. For more information, see <a href="https://help.aliyun.com/document_detail/72125.html">EIP overview</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>EcsInstance</p>
     */
    @NameInMap("AssociatedInstanceType")
    public String associatedInstanceType;

    /**
     * <p>The billing method of the EIP. Valid values:</p>
     * <ul>
     * <li><strong>PostPaid</strong>: pay-as-you-go.</li>
     * <li><strong>PrePaid</strong>: subscription.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: performs a dry run. The system checks the required parameters, request syntax, and business restrictions. If the check fails, the corresponding error is returned. If the check succeeds, the <code>DryRunOperation</code> error code is returned.</p>
     * </li>
     * <li><p><strong>false</strong> (default): performs a dry run and sends the request. If the check succeeds, an HTTP 2xx status code is returned and the operation is performed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The IP address of the EIP to query.</p>
     * <p>You can specify up to 50 EIP addresses. Separate multiple IP addresses with commas (,).</p>
     * <blockquote>
     * <p>If you specify both <strong>EipAddress</strong> and <strong>AllocationId</strong>, you can specify up to 50 EIP IP addresses for <strong>EipAddress</strong> and up to 50 EIP instance IDs for <strong>AllocationId</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>47.75.XX.XX</p>
     */
    @NameInMap("EipAddress")
    public String eipAddress;

    /**
     * <p>The name of the EIP.</p>
     * <p>The name must be 1 to 128 characters in length and must start with a letter or Chinese character. It can contain digits, underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>EIP-01</p>
     */
    @NameInMap("EipName")
    public String eipName;

    /**
     * <p>The line type. Valid values:</p>
     * <ul>
     * <li><strong>BGP</strong> (default): BGP (multi-ISP) line. All regions support BGP (multi-ISP) EIPs.</li>
     * <li><strong>BGP_PRO</strong>: BGP (multi-ISP) Pro line. Only Hong Kong (China), Singapore, Tokyo (Japan), Kuala Lumpur (Malaysia), Manila (Philippines), Jakarta (Indonesia), and Bangkok (Thailand) regions support BGP (multi-ISP) Pro EIPs.</li>
     * </ul>
     * <p>For more information about BGP (multi-ISP) and BGP (multi-ISP) Pro lines, see <a href="https://help.aliyun.com/document_detail/32321.html">EIP line types</a>.</p>
     * <p>If you are a whitelist user of single-ISP bandwidth, you can also specify the following values:</p>
     * <ul>
     * <li><strong>ChinaTelecom</strong>: China Telecom</li>
     * <li><strong>ChinaUnicom</strong>: China Unicom</li>
     * <li><strong>ChinaMobile</strong>: China Mobile</li>
     * <li><strong>ChinaTelecom_L2</strong>: China Telecom L2</li>
     * <li><strong>ChinaUnicom_L2</strong>: China Unicom L2</li>
     * <li><strong>ChinaMobile_L2</strong>: China Mobile L2</li>
     * </ul>
     * <p>If you are a user of Alibaba Finance Cloud in the China (Hangzhou) region, this parameter is required. Set the value to <strong>BGP_FinanceCloud</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>BGP</p>
     */
    @NameInMap("ISP")
    public String ISP;

    /**
     * <p>Specifies whether to include pending order data. Valid values:</p>
     * <ul>
     * <li><p><strong>false</strong> (default): Does not include pending order data.</p>
     * </li>
     * <li><p><strong>true</strong>: Includes pending order data.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IncludeReservationData")
    public Boolean includeReservationData;

    /**
     * <p>The lock type. Valid values:</p>
     * <ul>
     * <li><p><strong>financial</strong>: locked due to overdue payment.</p>
     * </li>
     * <li><p><strong>security</strong>: locked for security reasons.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>financial</p>
     */
    @NameInMap("LockReason")
    public String lockReason;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number of the list. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page in a paged query. Maximum value: <strong>100</strong>. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the IP address pool to which the EIP belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>pippool-2vc0kxcedhquybdsz****</p>
     */
    @NameInMap("PublicIpAddressPoolId")
    public String publicIpAddressPoolId;

    /**
     * <p>The region ID of the EIP.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the EIP belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxazb4pcdvf****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Indicates whether Anti-DDoS (Enhanced) is enabled. Valid values:</p>
     * <ul>
     * <li><strong>false</strong>: not enabled.</li>
     * <li><strong>true</strong>: enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SecurityProtectionEnabled")
    public Boolean securityProtectionEnabled;

    /**
     * <p>The instance ID of the contiguous EIP group.</p>
     * 
     * <strong>example:</strong>
     * <p>eipsg-t4nr90yik5oy38xdy****</p>
     */
    @NameInMap("SegmentInstanceId")
    public String segmentInstanceId;

    /**
     * <p>Specifies whether the instance is a managed instance. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: a managed instance.</li>
     * <li><strong>false</strong>: not a managed instance.</li>
     * </ul>
     * <p>If you leave this parameter empty, all instances are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ServiceManaged")
    public Boolean serviceManaged;

    /**
     * <p>The status of the EIP. Valid values:</p>
     * <ul>
     * <li><p><strong>Associating</strong>: being associated.</p>
     * </li>
     * <li><p><strong>Unassociating</strong>: being disassociated.</p>
     * </li>
     * <li><p><strong>InUse</strong>: allocated.</p>
     * </li>
     * <li><p><strong>Available</strong>: available.</p>
     * </li>
     * <li><p><strong>Releasing</strong>: being released.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Available</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The tags used to filter EIPs.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeEipAddressesRequestTag> tag;

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

    public DescribeEipAddressesRequest setServiceManaged(Boolean serviceManaged) {
        this.serviceManaged = serviceManaged;
        return this;
    }
    public Boolean getServiceManaged() {
        return this.serviceManaged;
    }

    public DescribeEipAddressesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeEipAddressesRequest setTag(java.util.List<DescribeEipAddressesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeEipAddressesRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeEipAddressesRequestFilter extends TeaModel {
        /**
         * <p>The filter key for querying resources. Set the value to <strong>CreationStartTime</strong>, which specifies the start time when the resource was created.</p>
         * 
         * <strong>example:</strong>
         * <p>CreationStartTime</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The filter value for querying resources. Specify the value in UTC. Format: <code>YYYY-MM-DDThh:mmZ</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-01-01T01:00Z</p>
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

    public static class DescribeEipAddressesRequestTag extends TeaModel {
        /**
         * <p>The tag key. You can specify up to 20 tag keys. The tag key cannot be an empty string.</p>
         * <p>A tag key can be up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. You can specify up to 20 tag values. The tag value can be an empty string.</p>
         * <p>A tag value can be up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeEipAddressesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeEipAddressesRequestTag self = new DescribeEipAddressesRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeEipAddressesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeEipAddressesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
