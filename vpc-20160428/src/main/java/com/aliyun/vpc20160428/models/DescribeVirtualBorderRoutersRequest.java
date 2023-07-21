// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVirtualBorderRoutersRequest extends TeaModel {
    @NameInMap("Filter")
    public java.util.List<DescribeVirtualBorderRoutersRequestFilter> filter;

    /**
     * <p>Specifies whether cross-account VBRs are included.</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <p>*   **false**: no. This is the default value.</p>
     */
    @NameInMap("IncludeCrossAccountVbr")
    public Boolean includeCrossAccountVbr;

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
     * <p>The ID of the region where the VBRs are deployed. You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.</p>
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
    public java.util.List<DescribeVirtualBorderRoutersRequestTags> tags;

    public static DescribeVirtualBorderRoutersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVirtualBorderRoutersRequest self = new DescribeVirtualBorderRoutersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVirtualBorderRoutersRequest setFilter(java.util.List<DescribeVirtualBorderRoutersRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<DescribeVirtualBorderRoutersRequestFilter> getFilter() {
        return this.filter;
    }

    public DescribeVirtualBorderRoutersRequest setIncludeCrossAccountVbr(Boolean includeCrossAccountVbr) {
        this.includeCrossAccountVbr = includeCrossAccountVbr;
        return this;
    }
    public Boolean getIncludeCrossAccountVbr() {
        return this.includeCrossAccountVbr;
    }

    public DescribeVirtualBorderRoutersRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeVirtualBorderRoutersRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeVirtualBorderRoutersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVirtualBorderRoutersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeVirtualBorderRoutersRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeVirtualBorderRoutersRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeVirtualBorderRoutersRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeVirtualBorderRoutersRequest setTags(java.util.List<DescribeVirtualBorderRoutersRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<DescribeVirtualBorderRoutersRequestTags> getTags() {
        return this.tags;
    }

    public static class DescribeVirtualBorderRoutersRequestFilter extends TeaModel {
        /**
         * <p>The filter conditions. You can specify at most five filter conditions. The following filter conditions are supported:</p>
         * <br>
         * <p>*   **PhysicalConnectionId**: Filter by Express Connect circuit ID.</p>
         * <p>*   **VbrId**: Filter by VBR ID.</p>
         * <p>*   **Status**: Filter by VBR status.</p>
         * <p>*   **Name**: Filter by VBR name.</p>
         * <p>*   **AccessPointId**: Filter by access point ID.</p>
         * <p>*   **eccId**: Filter by Express Cloud Connect (ECC) instance ID.</p>
         * <p>*   **type**: Filter by Express Connect circuit type.</p>
         */
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public java.util.List<String> value;

        public static DescribeVirtualBorderRoutersRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            DescribeVirtualBorderRoutersRequestFilter self = new DescribeVirtualBorderRoutersRequestFilter();
            return TeaModel.build(map, self);
        }

        public DescribeVirtualBorderRoutersRequestFilter setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeVirtualBorderRoutersRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

    public static class DescribeVirtualBorderRoutersRequestTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeVirtualBorderRoutersRequestTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeVirtualBorderRoutersRequestTags self = new DescribeVirtualBorderRoutersRequestTags();
            return TeaModel.build(map, self);
        }

        public DescribeVirtualBorderRoutersRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeVirtualBorderRoutersRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
