// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeHaVipsRequest extends TeaModel {
    /**
     * <p>The filter conditions.</p>
     */
    @NameInMap("Filter")
    public java.util.List<DescribeHaVipsRequestFilter> filter;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number of the list. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page in a paging query. Maximum value: <strong>50</strong>. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the HaVip.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the HaVip belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-bp67acfmxazb4ph****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<DescribeHaVipsRequestTags> tags;

    public static DescribeHaVipsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHaVipsRequest self = new DescribeHaVipsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHaVipsRequest setFilter(java.util.List<DescribeHaVipsRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<DescribeHaVipsRequestFilter> getFilter() {
        return this.filter;
    }

    public DescribeHaVipsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeHaVipsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeHaVipsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeHaVipsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeHaVipsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeHaVipsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeHaVipsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeHaVipsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeHaVipsRequest setTags(java.util.List<DescribeHaVipsRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<DescribeHaVipsRequestTags> getTags() {
        return this.tags;
    }

    public static class DescribeHaVipsRequestFilter extends TeaModel {
        /**
         * <p>The filter condition. You can specify up to 5 filter conditions. Valid values of <strong>N</strong>: <strong>1 to 5</strong>.</p>
         * <p>The following filter conditions are supported:</p>
         * <ul>
         * <li><p><strong>VpcId</strong>: the virtual private cloud (VPC) ID.</p>
         * </li>
         * <li><p><strong>VSwitchId</strong>: the vSwitch ID.</p>
         * </li>
         * <li><p><strong>Status</strong>: the HaVip status.</p>
         * </li>
         * <li><p><strong>HaVipId</strong>: the HaVip ID.</p>
         * </li>
         * <li><p><strong>HaVipAddress</strong>: the IP address of the HaVip.</p>
         * </li>
         * </ul>
         * <p>Each filter condition (Filter Key) can have multiple values. The values have an OR relationship, which means that a match on any value satisfies the filter condition.</p>
         * <p>Different filter conditions (Filter Keys) have an AND relationship, which means that all parameter filter conditions must be met for a record to be returned.</p>
         * 
         * <strong>example:</strong>
         * <p>HaVipId</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The values of the specified filter condition. Valid values of <strong>N</strong>: <strong>1 to 5</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>havip-bp19o63nequs01i8d****</p>
         */
        @NameInMap("Value")
        public java.util.List<String> value;

        public static DescribeHaVipsRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            DescribeHaVipsRequestFilter self = new DescribeHaVipsRequestFilter();
            return TeaModel.build(map, self);
        }

        public DescribeHaVipsRequestFilter setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeHaVipsRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

    public static class DescribeHaVipsRequestTags extends TeaModel {
        /**
         * <p>The tag key of the resource. You can specify up to 20 tag keys. The tag key cannot be an empty string.</p>
         * <p>A tag key can be up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the resource. You can specify up to 20 tag values. The tag value can be an empty string.</p>
         * <p>The tag value can be up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeHaVipsRequestTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeHaVipsRequestTags self = new DescribeHaVipsRequestTags();
            return TeaModel.build(map, self);
        }

        public DescribeHaVipsRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeHaVipsRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
