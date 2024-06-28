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
     * <p>Specifies whether renewal data is included. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong> (default)</li>
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
     * <p>The number of entries per page. Maximum value: <strong>50</strong>. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the router interface.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Resource Group ID.</p>
     * <p>For more information about resource groups, please refer to <a href="https://help.aliyun.com/document_detail/94475.html">What is a Resource Group?</a></p>
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
         * <p>The filter conditions. You can specify up to five filter conditions. The following filter conditions are supported:</p>
         * <ul>
         * <li><strong>RouterInterfaceId</strong>: the ID of the router interface.</li>
         * <li><strong>RouterId</strong>: the ID of the router.</li>
         * <li><strong>RouterType</strong>: the router type. Valid values: <strong>VRouter</strong> and <strong>VBR</strong>.</li>
         * <li><strong>RouterInterfaceOwnerId</strong>: the ID of the Alibaba Cloud account to which the router interface belongs.</li>
         * <li><strong>OppositeInterfaceId</strong>: the ID of the peer router interface.</li>
         * <li><strong>OppositeRouterType</strong>: the type of the peer router interface. Valid values: <strong>VRouter</strong> and <strong>VBR</strong>.</li>
         * <li><strong>OppositeRouterId</strong>: the ID of the peer router.</li>
         * <li><strong>OppositeInterfaceOwnerId</strong>: the ID of the Alibaba Cloud account to which the peer router interface belongs.</li>
         * <li><strong>Status</strong>: the status of the router interface.</li>
         * <li><strong>Name</strong>: the name of the router interface.</li>
         * </ul>
         * <blockquote>
         * <p> The logical operator among multiple values in a filter condition is OR. In this case, the filter condition is met if one of the values is matched. The logical operator among filter conditions is AND. Only routers that meet all the filter conditions are queried.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Filter.1.Status</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>Specifies the value in the filter condition based on the key. You can specify multiple filter values for one key. The logical operator among filter values is OR. If one filter value is matched, the filter condition is matched.</p>
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
         * <p>The key of the resource tag. At least one tag key must be entered, and a maximum of 20 tag keys are supported. If this value needs to be passed in, it cannot be an empty string.</p>
         * <p>A tag key can support up to 128 characters, cannot start with \&quot;aliyun\&quot; or \&quot;acs:\&quot;, and cannot contain \&quot;http://\&quot; or \&quot;https://\&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the resource tag. A maximum of 20 tag values can be entered. If this value needs to be passed in, an empty string can be entered.</p>
         * <p>A maximum of 128 characters are supported, it cannot start with \&quot;aliyun\&quot; or \&quot;acs:\&quot;, and it cannot contain \&quot;http://\&quot; or \&quot;https://\&quot;.</p>
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
