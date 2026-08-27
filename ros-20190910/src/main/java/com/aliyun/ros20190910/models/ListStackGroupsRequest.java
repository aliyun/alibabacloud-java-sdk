// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStackGroupsRequest extends TeaModel {
    /**
     * <p>The page number.</p>
     * <ul>
     * <li><p>Starts from 1.</p>
     * </li>
     * <li><p>Default value: 1.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * <ul>
     * <li><p>Valid values: 1 to 50.</p>
     * </li>
     * <li><p>Default value: 10.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The region ID of the stack group. Call <a href="https://help.aliyun.com/document_detail/131035.html">DescribeRegions</a> to query available regions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group. If not specified, stack groups in all resource groups are returned.</p>
     * <blockquote>
     * <p>You can find the resource group ID on the <strong>Resource Groups</strong> page in the <strong>Resource Management</strong> console. <a href="https://help.aliyun.com/document_detail/151181.html">View the basic information of a resource group</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzawhxxcj****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The status of the stack group. If not specified, stack groups in all states are returned.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>ACTIVE: The stack group is active.</p>
     * </li>
     * <li><p>DELETED: The stack group is deleted.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ACTIVE</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The tags of the stack group.</p>
     */
    @NameInMap("Tags")
    public java.util.List<ListStackGroupsRequestTags> tags;

    public static ListStackGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListStackGroupsRequest self = new ListStackGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListStackGroupsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListStackGroupsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListStackGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListStackGroupsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListStackGroupsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListStackGroupsRequest setTags(java.util.List<ListStackGroupsRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ListStackGroupsRequestTags> getTags() {
        return this.tags;
    }

    public static class ListStackGroupsRequestTags extends TeaModel {
        /**
         * <p>The tag key of the stack group.</p>
         * <blockquote>
         * <p>Tags is optional. If you specify Tags, Tags.N.Key is required.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>usage</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the stack group.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListStackGroupsRequestTags build(java.util.Map<String, ?> map) throws Exception {
            ListStackGroupsRequestTags self = new ListStackGroupsRequestTags();
            return TeaModel.build(map, self);
        }

        public ListStackGroupsRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListStackGroupsRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
