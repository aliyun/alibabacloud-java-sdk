// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListPublicIpAddressPoolsResponseBody extends TeaModel {
    /**
     * <p>The pagination token that is used to retrieve the next page of results. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, no subsequent page exists.</li>
     * <li>If <strong>NextToken</strong> is returned, the value indicates the token used to start the next query.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The list of IP address pools.</p>
     */
    @NameInMap("PublicIpAddressPoolList")
    public java.util.List<ListPublicIpAddressPoolsResponseBodyPublicIpAddressPoolList> publicIpAddressPoolList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4EC47282-1B74-4534-BD0E-403F3EE64CAF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned for the current request.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListPublicIpAddressPoolsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPublicIpAddressPoolsResponseBody self = new ListPublicIpAddressPoolsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPublicIpAddressPoolsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPublicIpAddressPoolsResponseBody setPublicIpAddressPoolList(java.util.List<ListPublicIpAddressPoolsResponseBodyPublicIpAddressPoolList> publicIpAddressPoolList) {
        this.publicIpAddressPoolList = publicIpAddressPoolList;
        return this;
    }
    public java.util.List<ListPublicIpAddressPoolsResponseBodyPublicIpAddressPoolList> getPublicIpAddressPoolList() {
        return this.publicIpAddressPoolList;
    }

    public ListPublicIpAddressPoolsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPublicIpAddressPoolsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListPublicIpAddressPoolsResponseBodyPublicIpAddressPoolListTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListPublicIpAddressPoolsResponseBodyPublicIpAddressPoolListTags build(java.util.Map<String, ?> map) throws Exception {
            ListPublicIpAddressPoolsResponseBodyPublicIpAddressPoolListTags self = new ListPublicIpAddressPoolsResponseBodyPublicIpAddressPoolListTags();
            return TeaModel.build(map, self);
        }

        public ListPublicIpAddressPoolsResponseBodyPublicIpAddressPoolListTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListPublicIpAddressPoolsResponseBodyPublicIpAddressPoolListTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListPublicIpAddressPoolsResponseBodyPublicIpAddressPoolList extends TeaModel {
        /**
         * <p>The business type of the IP address pool. Valid values:</p>
         * <ul>
         * <li><strong>CloudBox</strong>: CloudBox. This type is supported only for CloudBox users.</li>
         * <li><strong>Default</strong> (default): Default. This indicates a non-special type.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CloudBox</p>
         */
        @NameInMap("BizType")
        public String bizType;

        /**
         * <p>The business status of the IP address pool. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong>: Normal.</li>
         * <li><strong>FinancialLocked</strong>: Locked.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("BusinessStatus")
        public String businessStatus;

        /**
         * <p>The creation time. The time follows the <code>YYYY-MM-DDThh:mm:ssZ</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-05-10T01:37:38Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the IP address pool.</p>
         * 
         * <strong>example:</strong>
         * <p>AddressPoolDescription</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether idle IP addresses are available. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IpAddressRemaining")
        public Boolean ipAddressRemaining;

        /**
         * <p>The line type.</p>
         * <ul>
         * <li><p><strong>BGP</strong>: BGP (Multi-ISP) line.</p>
         * </li>
         * <li><p><strong>BGP_PRO</strong>: BGP (Multi-ISP) Pro line.</p>
         * </li>
         * </ul>
         * <p>For more information about BGP (Multi-ISP) and BGP (Multi-ISP) Pro lines, see <a href="https://help.aliyun.com/document_detail/32321.html">EIP line types</a>.</p>
         * <p>If you are a single-ISP bandwidth whitelist user, the following types may also be returned:</p>
         * <ul>
         * <li><strong>ChinaTelecom</strong>: China Telecom</li>
         * <li><strong>ChinaUnicom</strong>: China Unicom</li>
         * <li><strong>ChinaMobile</strong>: China Mobile</li>
         * <li><strong>ChinaTelecom_L2</strong>: China Telecom L2</li>
         * <li><strong>ChinaUnicom_L2</strong>: China Unicom L2</li>
         * <li><strong>ChinaMobile_L2</strong>: China Mobile L2</li>
         * </ul>
         * <p>If you are an Alibaba Finance Cloud user in the China (Hangzhou) region, <strong>BGP_FinanceCloud</strong> is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>BGP</p>
         */
        @NameInMap("Isp")
        public String isp;

        /**
         * <p>The name of the IP address pool.</p>
         * 
         * <strong>example:</strong>
         * <p>AddressPoolName</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The Alibaba Cloud account to which the IP address pool belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>121012345612*****</p>
         */
        @NameInMap("OwnerId")
        public Long ownerId;

        /**
         * <p>The instance ID of the IP address pool.</p>
         * 
         * <strong>example:</strong>
         * <p>pippool-6wetvn6fumkgycssx****</p>
         */
        @NameInMap("PublicIpAddressPoolId")
        public String publicIpAddressPoolId;

        /**
         * <p>The region ID of the IP address pool.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-chengdu</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group to which the IP address pool belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxazb4pcdvf****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The security protection level.</p>
         * <ul>
         * <li><p>If this parameter is empty, Anti-DDoS Basic is used by default.</p>
         * </li>
         * <li><p>If this parameter is set to <strong>AntiDDoS_Enhanced</strong>, Anti-DDoS (Enhanced) is used.</p>
         * </li>
         * </ul>
         */
        @NameInMap("SecurityProtectionTypes")
        public java.util.List<String> securityProtectionTypes;

        /**
         * <p>The sharing type of the IP address pool. Valid values:</p>
         * <ul>
         * <li><strong>Shared</strong>: The IP address pool is shared.</li>
         * <li>Empty: The IP address pool is not shared.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Shared</p>
         */
        @NameInMap("ShareType")
        public String shareType;

        /**
         * <p>The instance status of the IP address pool. Valid values:</p>
         * <ul>
         * <li><strong>Created</strong>: available.</li>
         * <li><strong>Deleting</strong>: delete in progress.</li>
         * <li><strong>Modifying</strong>: modify in progress.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Created</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The list of tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListPublicIpAddressPoolsResponseBodyPublicIpAddressPoolListTags> tags;

        /**
         * <p>The total number of available IP addresses in the IP address pool.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalIpNum")
        public Integer totalIpNum;

        /**
         * <p>The number of used IP addresses in the IP address pool.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("UsedIpNum")
        public Integer usedIpNum;

        /**
         * <p>The user type. Valid values:</p>
         * <ul>
         * <li><strong>admin</strong>: administrator. Administrators can delete, modify, and query IP address pools, and allocate Elastic IP Addresses (EIPs) to IP address pools.</li>
         * <li><strong>user</strong>: regular user. Regular users can only allocate EIPs to IP address pools and query IP address pools. They cannot modify or delete IP address pools.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
        @NameInMap("UserType")
        public String userType;

        /**
         * <p>The zone of the IP address pool.
         * This parameter is returned only when the business type of the IP address pool is CloudBox.</p>
         */
        @NameInMap("Zones")
        public java.util.List<String> zones;

        public static ListPublicIpAddressPoolsResponseBodyPublicIpAddressPoolList build(java.util.Map<String, ?> map) throws Exception {
            ListPublicIpAddressPoolsResponseBodyPublicIpAddressPoolList self = new ListPublicIpAddressPoolsResponseBodyPublicIpAddressPoolList();
            return TeaModel.build(map, self);
        }

        public ListPublicIpAddressPoolsResponseBodyPublicIpAddressPoolList setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public ListPublicIpAddressPoolsResponseBodyPublicIpAddressPoolList setBusinessStatus(String businessStatus) {
            this.businessStatus = businessStatus;
            return this;
        }
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        public ListPublicIpAddressPoolsResponseBodyPublicIpAddressPoolList setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListPublicIpAddressPoolsResponseBodyPublicIpAddressPoolList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListPublicIpAddressPoolsResponseBodyPublicIpAddressPoolList setIpAddressRemaining(Boolean ipAddressRemaining) {
            this.ipAddressRemaining = ipAddressRemaining;
            return this;
        }
        public Boolean getIpAddressRemaining() {
            return this.ipAddressRemaining;
        }

        public ListPublicIpAddressPoolsResponseBodyPublicIpAddressPoolList setIsp(String isp) {
            this.isp = isp;
            return this;
        }
        public String getIsp() {
            return this.isp;
        }

        public ListPublicIpAddressPoolsResponseBodyPublicIpAddressPoolList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListPublicIpAddressPoolsResponseBodyPublicIpAddressPoolList setOwnerId(Long ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Long getOwnerId() {
            return this.ownerId;
        }

        public ListPublicIpAddressPoolsResponseBodyPublicIpAddressPoolList setPublicIpAddressPoolId(String publicIpAddressPoolId) {
            this.publicIpAddressPoolId = publicIpAddressPoolId;
            return this;
        }
        public String getPublicIpAddressPoolId() {
            return this.publicIpAddressPoolId;
        }

        public ListPublicIpAddressPoolsResponseBodyPublicIpAddressPoolList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListPublicIpAddressPoolsResponseBodyPublicIpAddressPoolList setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListPublicIpAddressPoolsResponseBodyPublicIpAddressPoolList setSecurityProtectionTypes(java.util.List<String> securityProtectionTypes) {
            this.securityProtectionTypes = securityProtectionTypes;
            return this;
        }
        public java.util.List<String> getSecurityProtectionTypes() {
            return this.securityProtectionTypes;
        }

        public ListPublicIpAddressPoolsResponseBodyPublicIpAddressPoolList setShareType(String shareType) {
            this.shareType = shareType;
            return this;
        }
        public String getShareType() {
            return this.shareType;
        }

        public ListPublicIpAddressPoolsResponseBodyPublicIpAddressPoolList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListPublicIpAddressPoolsResponseBodyPublicIpAddressPoolList setTags(java.util.List<ListPublicIpAddressPoolsResponseBodyPublicIpAddressPoolListTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListPublicIpAddressPoolsResponseBodyPublicIpAddressPoolListTags> getTags() {
            return this.tags;
        }

        public ListPublicIpAddressPoolsResponseBodyPublicIpAddressPoolList setTotalIpNum(Integer totalIpNum) {
            this.totalIpNum = totalIpNum;
            return this;
        }
        public Integer getTotalIpNum() {
            return this.totalIpNum;
        }

        public ListPublicIpAddressPoolsResponseBodyPublicIpAddressPoolList setUsedIpNum(Integer usedIpNum) {
            this.usedIpNum = usedIpNum;
            return this;
        }
        public Integer getUsedIpNum() {
            return this.usedIpNum;
        }

        public ListPublicIpAddressPoolsResponseBodyPublicIpAddressPoolList setUserType(String userType) {
            this.userType = userType;
            return this;
        }
        public String getUserType() {
            return this.userType;
        }

        public ListPublicIpAddressPoolsResponseBodyPublicIpAddressPoolList setZones(java.util.List<String> zones) {
            this.zones = zones;
            return this;
        }
        public java.util.List<String> getZones() {
            return this.zones;
        }

    }

}
