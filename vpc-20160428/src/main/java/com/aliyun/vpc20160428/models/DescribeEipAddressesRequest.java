// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeEipAddressesRequest extends TeaModel {
    @NameInMap("Filter")
    public java.util.List<DescribeEipAddressesRequestFilter> filter;

    /**
     * <p>The ID of the EIP that you want to query.</p>
     * <p>You can specify up to 50 EIP IDs. Separate multiple IDs with commas (,).</p>
     * <blockquote>
     * <p> If both <strong>EipAddress</strong> and <strong>AllocationId</strong> are specified, you can specify up to 50 EIP IDs for <strong>AllocationId</strong>, and specify up to 50 EIPs for <strong>EipAddress</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>eip-2zeerraiwb7ujxscd****</p>
     */
    @NameInMap("AllocationId")
    public String allocationId;

    /**
     * <p>The ID of the instance associated with the EIP.</p>
     * 
     * <strong>example:</strong>
     * <p>i-2zebb08phyccdvf****</p>
     */
    @NameInMap("AssociatedInstanceId")
    public String associatedInstanceId;

    /**
     * <p>The type of the cloud resource with which you want to associate the EIP. Valid values:</p>
     * <ul>
     * <li><strong>EcsInstance</strong> (default): an Elastic Compute Service (ECS) instance in a virtual private cloud (VPC).</li>
     * <li><strong>SlbInstance</strong>: a CLB instance in a VPC.</li>
     * <li><strong>Nat</strong>: a NAT gateway.</li>
     * <li><strong>HaVip</strong>: an HAVIP.</li>
     * <li><strong>NetworkInterface</strong>: a secondary ENI.</li>
     * <li><strong>IpAddress</strong>: an IP address.</li>
     * </ul>
     * <blockquote>
     * <p> Each ECS instance, CLB instance, HAVIP, and IP address can be associated with only one EIP. A NAT gateway can be associated with multiple EIPs. The number of EIPs that you can associate with a secondary ENI depends on the association mode. For more information, see <a href="https://help.aliyun.com/document_detail/72125.html">Associate EIPs with and disassociate EIPs from cloud resources</a>.</p>
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
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The EIP that you want to query.</p>
     * <p>You can specify up to 50 EIPs. Separate multiple EIPs with commas (,).</p>
     * <blockquote>
     * <p> If both <strong>EipAddress</strong> and <strong>AllocationId</strong> are specified, you can specify up to 50 EIPs for <strong>EipAddress</strong>, and specify up to 50 EIP IDs for <strong>AllocationId</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>47.75.XX.XX</p>
     */
    @NameInMap("EipAddress")
    public String eipAddress;

    /**
     * <p>The name of the EIP.</p>
     * <p>The name must be 1 to 128 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The name must start with a letter.</p>
     * 
     * <strong>example:</strong>
     * <p>EIP-01</p>
     */
    @NameInMap("EipName")
    public String eipName;

    /**
     * <p>The line type. Valid values:</p>
     * <ul>
     * <li><strong>BGP</strong> (default): Border Gateway Protocol (BGP) (Multi-ISP) lines. All regions support BGP (Multi-ISP) EIPs.</li>
     * <li><strong>BGP_PRO</strong>: BGP (Multi-ISP) Pro lines. Only the following regions support BGP (Multi-ISP) Pro lines: China (Hong Kong), Singapore, Japan (Tokyo), Malaysia (Kuala Lumpur), Philippines (Manila), Indonesia (Jakarta), and Thailand (Bangkok).</li>
     * </ul>
     * <p>For more information about BGP (Multi-ISP) and BGP (Multi-ISP) Pro, see the <a href="https://help.aliyun.com/document_detail/32321.html">Line types</a> section of the &quot;What is EIP?&quot; topic.</p>
     * <p>If you are allowed to use single-ISP bandwidth, you can also use one of the following values:</p>
     * <ul>
     * <li><strong>ChinaTelecom</strong></li>
     * <li><strong>ChinaUnicom</strong></li>
     * <li><strong>ChinaMobile</strong></li>
     * <li><strong>ChinaTelecom_L2</strong></li>
     * <li><strong>ChinaUnicom_L2</strong></li>
     * <li><strong>ChinaMobile_L2</strong></li>
     * </ul>
     * <p>If your services are deployed in China East 1 Finance, this parameter is required and you must set the value to <strong>BGP_FinanceCloud</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>BGP</p>
     */
    @NameInMap("ISP")
    public String ISP;

    /**
     * <p>Specifies whether to return information about pending orders. Valid values:</p>
     * <ul>
     * <li><strong>false</strong> (default)</li>
     * <li><strong>true</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IncludeReservationData")
    public Boolean includeReservationData;

    /**
     * <p>The reason why the EIP is locked. Valid values:</p>
     * <ul>
     * <li><strong>financial</strong>: The EIP is locked due to overdue payments.</li>
     * <li><strong>security</strong>: The EIP is locked for security reasons.</li>
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
     * <p>The page number. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 1 to <strong>100</strong>. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The IP address pool to which the EIP that you want to query belongs.</p>
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
     * <p>Specifies whether to activate Anti-DDoS Pro/Premium. Valid values:</p>
     * <ul>
     * <li><strong>false</strong></li>
     * <li><strong>true</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SecurityProtectionEnabled")
    public Boolean securityProtectionEnabled;

    /**
     * <p>The ID of the contiguous EIP group.</p>
     * 
     * <strong>example:</strong>
     * <p>eipsg-t4nr90yik5oy38xdy****</p>
     */
    @NameInMap("SegmentInstanceId")
    public String segmentInstanceId;

    @NameInMap("ServiceManaged")
    public Boolean serviceManaged;

    /**
     * <p>The state of the EIP. Valid values:</p>
     * <ul>
     * <li><strong>Associating</strong></li>
     * <li><strong>Unassociating</strong></li>
     * <li><strong>InUse</strong></li>
     * <li><strong>Available</strong></li>
     * <li><strong>Releasing</strong></li>
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
         * <p>The filter key used to query resources. Set the value to <strong>CreationStartTime</strong>, which specifies the time when the system started to create the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>CreationStartTime</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The filter value used to query resources. Specify the time in the ISO 8601 standard in the <code>YYYY-MM-DDThh:mmZ</code> format. The time must be in Coordinated Universal Time (UTC).</p>
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
         * <p>The key of the tag. You can specify up to 20 tag keys. The tag key cannot be an empty string.</p>
         * <p>The tag key can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>. The tag key cannot start with <code>acs:</code> or <code>aliyun</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag. You can specify up to 20 tag values. The tag value can be an empty string.</p>
         * <p>The tag value can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>. The tag value cannot start with <code>acs:</code> or <code>aliyun</code>.</p>
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
