// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVirtualBorderRoutersForPhysicalConnectionRequest extends TeaModel {
    /**
     * <p>The filter keys.</p>
     */
    @NameInMap("Filter")
    public java.util.List<DescribeVirtualBorderRoutersForPhysicalConnectionRequestFilter> filter;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Maximum value: **50**. Default value: **10**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the Express Connect circuit.</p>
     */
    @NameInMap("PhysicalConnectionId")
    public String physicalConnectionId;

    /**
     * <p>The region in which the Express Connect circuit is deployed. You can call the [DescribeRegions](~~36063~~) operation to obtain the region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DescribeVirtualBorderRoutersForPhysicalConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVirtualBorderRoutersForPhysicalConnectionRequest self = new DescribeVirtualBorderRoutersForPhysicalConnectionRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVirtualBorderRoutersForPhysicalConnectionRequest setFilter(java.util.List<DescribeVirtualBorderRoutersForPhysicalConnectionRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<DescribeVirtualBorderRoutersForPhysicalConnectionRequestFilter> getFilter() {
        return this.filter;
    }

    public DescribeVirtualBorderRoutersForPhysicalConnectionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeVirtualBorderRoutersForPhysicalConnectionRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeVirtualBorderRoutersForPhysicalConnectionRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVirtualBorderRoutersForPhysicalConnectionRequest setPhysicalConnectionId(String physicalConnectionId) {
        this.physicalConnectionId = physicalConnectionId;
        return this;
    }
    public String getPhysicalConnectionId() {
        return this.physicalConnectionId;
    }

    public DescribeVirtualBorderRoutersForPhysicalConnectionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeVirtualBorderRoutersForPhysicalConnectionRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeVirtualBorderRoutersForPhysicalConnectionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static class DescribeVirtualBorderRoutersForPhysicalConnectionRequestFilter extends TeaModel {
        /**
         * <p>The filter conditions. You can specify at most five filter conditions. The following filter conditions are supported:</p>
         * <br>
         * <p>*   **PhysicalConnectionId**: filter VBRs by the Express Connect circuit ID.</p>
         * <p>*   **VbrId**: filter VBRs by ID.</p>
         * <p>*   **Status**: filter VBRs by status.</p>
         * <p>*   **Name**: filter VBRs by name.</p>
         * <p>*   **AccessPointId**: filter VBRs by access point ID.</p>
         * <p>*   **eccId**: filter VBRs by ID of Express Cloud Connect (ECC) instance.</p>
         * <p>*   **type**: filter VBRs by type.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The filter value for the key. You can specify multiple filter values for one key. The logical operator among filter values is OR. If one filter value is matched, the filter condition is matched.</p>
         */
        @NameInMap("Value")
        public java.util.List<String> value;

        public static DescribeVirtualBorderRoutersForPhysicalConnectionRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            DescribeVirtualBorderRoutersForPhysicalConnectionRequestFilter self = new DescribeVirtualBorderRoutersForPhysicalConnectionRequestFilter();
            return TeaModel.build(map, self);
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionRequestFilter setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeVirtualBorderRoutersForPhysicalConnectionRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

}
