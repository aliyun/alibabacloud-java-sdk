// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStackGroupsRequest extends TeaModel {
    /**
     * <p>The number of the page to return.</p>
     * <ul>
     * <li>Pages start from page 1.</li>
     * <li>Default value: 1.</li>
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
     * <li>Valid values: 1 to 50.</li>
     * <li>Default value: 10.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The region ID of the stack group. You can call the <a href="https://help.aliyun.com/document_detail/131035.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group. If you do not specify this parameter, the stack groups in all the resource groups are queried.</p>
     * <blockquote>
     * <p>To obtain the resource group ID, go to the <strong>Resource Group</strong> page in the <strong>Resource Management</strong> console. For more information, see <a href="https://help.aliyun.com/document_detail/151181.html">View the basic information about a resource group</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzawhxxcj****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The state of the stack group. If you do not specify this parameter, the stack groups in all states in the specified region are queried.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>ACTIVE</li>
     * <li>DELETED</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ACTIVE</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The tags that are added to the stack group.</p>
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
         * <p>The key of the tag that is added to the stack group.</p>
         * <blockquote>
         * <p>Tags is optional. If you specify Tags, you must specify Tags.N.Key.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>usage</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag that is added to the stack group.</p>
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
