// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeRouterInterfacesRequest extends TeaModel {
    /**
     * <p>The filter information.</p>
     */
    @NameInMap("Filter")
    public java.util.List<DescribeRouterInterfacesRequestFilter> filter;

    /**
     * <p>Specifies whether to include renewal data. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong></p>
     * </li>
     * <li><p><strong>false</strong> (default)</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IncludeReservationData")
    public Boolean includeReservationData;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page for paging queries. Maximum value: <strong>50</strong>. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the router interface.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * <p>For more information about resource groups, see <a href="https://help.aliyun.com/document_detail/2381067.html">What is a resource group?</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxazb4ph6aiy****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The tags of the resource.</p>
     */
    @NameInMap("Tags")
    public java.util.List<DescribeRouterInterfacesRequestTags> tags;

    public static DescribeRouterInterfacesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRouterInterfacesRequest self = new DescribeRouterInterfacesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRouterInterfacesRequest setFilter(java.util.List<DescribeRouterInterfacesRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<DescribeRouterInterfacesRequestFilter> getFilter() {
        return this.filter;
    }

    public DescribeRouterInterfacesRequest setIncludeReservationData(Boolean includeReservationData) {
        this.includeReservationData = includeReservationData;
        return this;
    }
    public Boolean getIncludeReservationData() {
        return this.includeReservationData;
    }

    public DescribeRouterInterfacesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeRouterInterfacesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRouterInterfacesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRouterInterfacesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeRouterInterfacesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeRouterInterfacesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeRouterInterfacesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeRouterInterfacesRequest setTags(java.util.List<DescribeRouterInterfacesRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<DescribeRouterInterfacesRequestTags> getTags() {
        return this.tags;
    }

    public static class DescribeRouterInterfacesRequestFilter extends TeaModel {
        /**
         * <p>The filter condition. You can specify up to 5 filter conditions. The following filter conditions are supported:</p>
         * <ul>
         * <li><p><strong>RouterInterfaceId</strong>: the router interface ID.</p>
         * </li>
         * <li><p><strong>RouterId</strong>: the router ID.</p>
         * </li>
         * <li><p><strong>RouterType</strong>: the router type. Valid values: <strong>VRouter</strong> and <strong>VBR</strong>.</p>
         * </li>
         * <li><p><strong>RouterInterfaceOwnerId</strong>: the ID of the account that owns the router interface.</p>
         * </li>
         * <li><p><strong>OppositeInterfaceId</strong>: the peer router interface ID.</p>
         * </li>
         * <li><p><strong>OppositeRouterType</strong>: the peer router interface type. Valid values: <strong>VRouter</strong> and <strong>VBR</strong>.</p>
         * </li>
         * <li><p><strong>OppositeRouterId</strong>: the peer router interface ID.</p>
         * </li>
         * <li><p><strong>OppositeInterfaceOwnerId</strong>: the ID of the account that owns the peer router interface.</p>
         * </li>
         * <li><p><strong>Status</strong>: the router interface status.</p>
         * </li>
         * <li><p><strong>Name</strong>: the router interface name.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Multiple values for a filter condition are evaluated by using the OR operator. A result is returned if any of the values match. Filter conditions are evaluated by using the AND operator. A result is returned only if all filter conditions are matched.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Filter.1.Status</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The filter value based on the specified Key. You can specify multiple filter values for a Key. Multiple filter values are evaluated by using the OR operator. A result is returned if any of the filter values match.</p>
         * 
         * <strong>example:</strong>
         * <p>Filter.1.Active 1</p>
         */
        @NameInMap("Value")
        public java.util.List<String> value;

        public static DescribeRouterInterfacesRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouterInterfacesRequestFilter self = new DescribeRouterInterfacesRequestFilter();
            return TeaModel.build(map, self);
        }

        public DescribeRouterInterfacesRequestFilter setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeRouterInterfacesRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

    public static class DescribeRouterInterfacesRequestTags extends TeaModel {
        /**
         * <p>The tag key of the resource. You must specify at least 1 tag key and can specify up to 20 tag keys. The tag key cannot be an empty string.</p>
         * <p>The tag key can be up to 128 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the resource. You can specify up to 20 tag values. The tag value can be an empty string.</p>
         * <p>The tag value can be up to 128 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeRouterInterfacesRequestTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouterInterfacesRequestTags self = new DescribeRouterInterfacesRequestTags();
            return TeaModel.build(map, self);
        }

        public DescribeRouterInterfacesRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeRouterInterfacesRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
