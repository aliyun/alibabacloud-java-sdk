// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribePhysicalConnectionsRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the value, but you must make sure that it is unique among different requests. ClientToken can contain only ASCII characters.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Filter")
    public java.util.List<DescribePhysicalConnectionsRequestFilter> filter;

    /**
     * <p>Specifies whether to return the data about pending orders. Valid values:</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <p>*   **false** (default): no</p>
     */
    @NameInMap("IncludeReservationData")
    public Boolean includeReservationData;

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
     * <p>The number of entries to return on each page. Default value: **10**. Valid values: **1** to **50**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the Express Connect circuit.</p>
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
    public java.util.List<DescribePhysicalConnectionsRequestTags> tags;

    public static DescribePhysicalConnectionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePhysicalConnectionsRequest self = new DescribePhysicalConnectionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribePhysicalConnectionsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribePhysicalConnectionsRequest setFilter(java.util.List<DescribePhysicalConnectionsRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<DescribePhysicalConnectionsRequestFilter> getFilter() {
        return this.filter;
    }

    public DescribePhysicalConnectionsRequest setIncludeReservationData(Boolean includeReservationData) {
        this.includeReservationData = includeReservationData;
        return this;
    }
    public Boolean getIncludeReservationData() {
        return this.includeReservationData;
    }

    public DescribePhysicalConnectionsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribePhysicalConnectionsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribePhysicalConnectionsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribePhysicalConnectionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePhysicalConnectionsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribePhysicalConnectionsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribePhysicalConnectionsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribePhysicalConnectionsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribePhysicalConnectionsRequest setTags(java.util.List<DescribePhysicalConnectionsRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<DescribePhysicalConnectionsRequestTags> getTags() {
        return this.tags;
    }

    public static class DescribePhysicalConnectionsRequestFilter extends TeaModel {
        /**
         * <p>The key of the filter. Valid values:</p>
         * <br>
         * <p>*   **PhysicalConnectionId**: the ID of the Express Connect circuit.</p>
         * <br>
         * <p>*   **AccessPointId**: the ID of the access point.</p>
         * <br>
         * <p>*   **Type**: the type of the Express Connect circuit. You can set Type only to **VPC**.</p>
         * <br>
         * <p>*   **LineOperator**: the connectivity provider of the Express Connect circuit. Valid values:</p>
         * <br>
         * <p>    *   **CT**: China Telecom.</p>
         * <p>    *   **CU**: China Unicom.</p>
         * <p>    *   **CM**: China Mobile.</p>
         * <p>    *   **CO**: other connectivity providers in the Chinese mainland.</p>
         * <p>    *   **Equinix**: Equinix.</p>
         * <p>    *   **Other**: other connectivity providers outside the Chinese mainland.</p>
         * <br>
         * <p>*   **Spec**: the specification of the Express Connect circuit. Valid values:</p>
         * <br>
         * <p>    *   **1G and below**</p>
         * <br>
         * <p>    *   **10G**</p>
         * <br>
         * <p>    *   **40G**</p>
         * <br>
         * <p>    *   **100G**</p>
         * <br>
         * <p>> By default, you cannot set Spec to **40G** or **100G**. To query 40 Gbit/s or 100 Gbit/s Express Connect circuits, you must first submit an application to acquire the permissions.</p>
         * <br>
         * <p>*   **Status**: the status of the Express Connect circuit. Valid values:</p>
         * <br>
         * <p>    *   **Initial**: The application is under review.</p>
         * <p>    *   **Approved**: The application is approved.</p>
         * <p>    *   **Allocating**: The system is allocating resources.</p>
         * <p>    *   **Allocated**: The Express Connect circuit is under construction.</p>
         * <p>    *   **Confirmed**: The Express Connect circuit is pending user confirmation.</p>
         * <p>    *   **Enabled**: The Express Connect circuit is enabled.</p>
         * <p>    *   **Rejected**: The application is rejected.</p>
         * <p>    *   **Canceled**: The application is canceled.</p>
         * <p>    *   **Allocation Failed**: The system failed to allocate resources.</p>
         * <p>    *   **Terminating**: The Express Connect circuit is being disabled.</p>
         * <p>    *   **Terminated**: The Express Connect circuit is disabled.</p>
         * <br>
         * <p>*   **Name**: the name of the Express Connect circuit.</p>
         * <br>
         * <p>You can specify at most five filter conditions in each call. The logical relation among the filter conditions is **AND**. Therefore, an Express Connect circuit is returned only when all specified filter conditions are matched.</p>
         */
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public java.util.List<String> value;

        public static DescribePhysicalConnectionsRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            DescribePhysicalConnectionsRequestFilter self = new DescribePhysicalConnectionsRequestFilter();
            return TeaModel.build(map, self);
        }

        public DescribePhysicalConnectionsRequestFilter setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribePhysicalConnectionsRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

    public static class DescribePhysicalConnectionsRequestTags extends TeaModel {
        /**
         * <p>The key of the tag that is added to the resource. You can specify at most 20 tag keys. The tag value cannot be an empty string.</p>
         * <br>
         * <p>The key cannot exceed 64 characters in length, and can contain digits, periods (.), underscores (\_), and hyphens (-). The key must start with a letter but cannot start with `aliyun` or `acs:`. The key cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag that is added to the resource. You can specify at most 20 tag values. The tag value can be an empty string.</p>
         * <br>
         * <p>The value cannot exceed 128 characters in length and can contain digits, periods (.), underscores (\_), and hyphens (-). The value must start with a letter but cannot start with `aliyun` or `acs:`. The value cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribePhysicalConnectionsRequestTags build(java.util.Map<String, ?> map) throws Exception {
            DescribePhysicalConnectionsRequestTags self = new DescribePhysicalConnectionsRequestTags();
            return TeaModel.build(map, self);
        }

        public DescribePhysicalConnectionsRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribePhysicalConnectionsRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
