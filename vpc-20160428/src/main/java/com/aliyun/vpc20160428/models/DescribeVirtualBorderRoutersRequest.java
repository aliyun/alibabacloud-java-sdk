// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVirtualBorderRoutersRequest extends TeaModel {
    /**
     * <p>The information about the filter.</p>
     */
    @NameInMap("Filter")
    public java.util.List<DescribeVirtualBorderRoutersRequestFilter> filter;

    /**
     * <p>Specifies whether cross-account VBRs are included.</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong> (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IncludeCrossAccountVbr")
    public Boolean includeCrossAccountVbr;

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
     * <p>The number of entries per page. Valid values: <strong>1 to 50</strong>. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the region in which the VBR is deployed. You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to obtain the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * <p>For more information about resource groups, see <a href="https://help.aliyun.com/document_detail/94475.html">What is a resource group?</a></p>
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
     * <p>The list of tags.</p>
     */
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
         * <p>The filter conditions. You can specify up to five filter conditions. Valid values:</p>
         * <ul>
         * <li><strong>PhysicalConnectionId</strong>: Filter by Express Connect circuit ID.</li>
         * <li><strong>VbrId</strong>: Filter by VBR ID.</li>
         * <li><strong>Status</strong>: Filter by VBR status.</li>
         * <li><strong>Name</strong>: Filter by VBR name.</li>
         * <li><strong>AccessPointId</strong>: Filter by access point ID.</li>
         * <li><strong>eccId:</strong> Filter by Express Cloud Connect (ECC) instance ID.</li>
         * <li><strong>type</strong>: Filter by Express Connect circuit type.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Status</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The filter values for keys. You can specify multiple filter values for one key. The logical operator between filter values is OR. If one filter value is matched, the filter condition is matched.</p>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
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
        /**
         * <p>The tag key. You can specify at most 20 tag keys. The tag key cannot be an empty string.</p>
         * <p>The key cannot exceed 128 characters in length, and cannot start with <code>aliyun</code> or <code>acs:</code>. The key cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. You can specify at most 20 tag values. The tag value can be an empty string.</p>
         * <p>The tag value cannot exceed 128 characters in length, and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
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
