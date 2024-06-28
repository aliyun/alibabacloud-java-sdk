// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListPublicIpAddressPoolsResponseBody extends TeaModel {
    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, no next page exists.</li>
     * <li>If a value is returned for <strong>NextToken</strong>, the value is used to retrieve a new page of results.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The IP address pools.</p>
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
     * <p>The total number of entries returned.</p>
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
         * <p>The key of tag N.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N.</p>
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
         * <p>The service type of the IP address pool.</p>
         * <ul>
         * <li><strong>CloudBox</strong> Only cloud box users can select this type.</li>
         * <li><strong>Default</strong> (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CloudBox</p>
         */
        @NameInMap("BizType")
        public String bizType;

        @NameInMap("BusinessStatus")
        public String businessStatus;

        /**
         * <p>The time when the IP address pool was created. The time is displayed in the <code>YYYY-MM-DDThh:mm:ssZ</code> format.</p>
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
         * <p>Indicates whether idle IP addresses exist.</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
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
         * <li><strong>BGP</strong>: BGP (Multi-ISP)</li>
         * <li><strong>BGP_PRO</strong>: BGP (Multi-ISP) Pro</li>
         * </ul>
         * <p>For more information about BGP (Multi-ISP) and BGP (Multi-ISP) Pro, see <a href="https://help.aliyun.com/document_detail/32321.html">EIP line types</a>.</p>
         * <p>If you are allowed to use single-ISP bandwidth, one of the following values may be returned:</p>
         * <ul>
         * <li><strong>ChinaTelecom</strong></li>
         * <li><strong>ChinaUnicom</strong></li>
         * <li><strong>ChinaMobile</strong></li>
         * <li><strong>ChinaTelecom_L2</strong></li>
         * <li><strong>ChinaUnicom_L2</strong></li>
         * <li><strong>ChinaMobile_L2</strong></li>
         * </ul>
         * <p>If your services are deployed in China East 1 Finance, <strong>BGP_FinanceCloud</strong> is returned.</p>
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
         * <p>121012345612****</p>
         */
        @NameInMap("OwnerId")
        public Long ownerId;

        /**
         * <p>The ID of the IP address pool.</p>
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
         * <p>The edition of Anti-DDoS.</p>
         * <ul>
         * <li>If you do not set this parameter, Anti-DDoS Origin Basic is used.</li>
         * <li>If the value is set to <strong>AntiDDoS_Enhanced</strong>, Anti-DDoS Pro/Premium is used.</li>
         * </ul>
         */
        @NameInMap("SecurityProtectionTypes")
        public java.util.List<String> securityProtectionTypes;

        /**
         * <p>The sharing type of the IP address pool.</p>
         * <ul>
         * <li>If <strong>Shared</strong> is returned, the IP address pool is shared.</li>
         * <li>If an empty value is returned, the IP address pool is not shared.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Shared</p>
         */
        @NameInMap("ShareType")
        public String shareType;

        /**
         * <p>The status of the IP address pool.</p>
         * <ul>
         * <li><strong>Created</strong></li>
         * <li><strong>Deleting</strong></li>
         * <li><strong>Modifying</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Created</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tag list.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListPublicIpAddressPoolsResponseBodyPublicIpAddressPoolListTags> tags;

        /**
         * <p>The total number of available IP addresses in the public IP address pool.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalIpNum")
        public Integer totalIpNum;

        /**
         * <p>The number of used IP addresses in the public IP address pool.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("UsedIpNum")
        public Integer usedIpNum;

        /**
         * <p>The user type. Valid values:</p>
         * <ul>
         * <li><strong>admin</strong>: An administrator can delete, modify, and query IP address pools, and can assign elastic IP addresses (EIPs) to the pool.</li>
         * <li><strong>user</strong>: A user can only assign EIPs to the IP address pool and query the IP address pool, but cannot modify or delete the IP address pool.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
        @NameInMap("UserType")
        public Boolean userType;

        /**
         * <p>The zone of the IP address pool. This parameter is returned only when the service type of the IP address pool is CloudBox.</p>
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

        public ListPublicIpAddressPoolsResponseBodyPublicIpAddressPoolList setUserType(Boolean userType) {
            this.userType = userType;
            return this;
        }
        public Boolean getUserType() {
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
