// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeRouterInterfacesRequest extends TeaModel {
    @NameInMap("Filter")
    public java.util.List<DescribeRouterInterfacesRequestFilter> filter;

    /**
     * <p>Specifies whether renewal data is included. Default value: false. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("IncludeReservationData")
    public Boolean includeReservationData;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of the page to return. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Maximum value: **50**. Default value: **10**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the router interface.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

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
         * <br>
         * <p>*   **RouterInterfaceId**: the ID of the router interface.</p>
         * <p>*   **RouterId**: the ID of the router.</p>
         * <p>*   **RouterType**: the router type. Valid values: **VRouter** and **VBR**.</p>
         * <p>*   **RouterInterfaceOwnerId**: the ID of the Alibaba Cloud account to which the router interface belongs.</p>
         * <p>*   **OppositeInterfaceId**: the ID of the peer router interface.</p>
         * <p>*   **OppositeRouterType**: the type of the peer router interface. Valid values: **VRouter** and **VBR**.</p>
         * <p>*   **OppositeRouterId**: the ID of the peer router.</p>
         * <p>*   **OppositeInterfaceOwnerId**: the ID of the Alibaba Cloud account to which the peer router interface belongs.</p>
         * <p>*   **Status**: the status of the router interface.</p>
         * <p>*   **Name**: the name of the router interface.</p>
         * <br>
         * <p>>  The logical operator between multiple values in the filter condition is OR. In this case, the filter condition is met if one of the values is matched. The logical operator between filter conditions is AND, which means that a result is returned only when all conditions are met.</p>
         */
        @NameInMap("Key")
        public String key;

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
        @NameInMap("Key")
        public String key;

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
