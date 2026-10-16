// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListResourceGroupsRequest extends TeaModel {
    /**
     * <p>The display name of the resource group. This parameter is used as a filter condition. Fuzzy match is supported.</p>
     * <p>The value cannot exceed 50 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>my-project</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>Specifies whether to return tag information. Valid values:</p>
     * <ul>
     * <li><p>false (default): Tag information is not returned.</p>
     * </li>
     * <li><p>true: Tag information is returned.</p>
     * <blockquote>
     * <p>If you specify tag-based filter conditions, tag information is always returned regardless of the value of IncludeTags.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IncludeTags")
    public Boolean includeTags;

    /**
     * <p>The unique identifier of the resource group. This parameter is used as a filter condition. Fuzzy match is supported.</p>
     * <p>The value cannot exceed 50 characters in length and can contain letters, digits, and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>my-project</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The page number.</p>
     * <p>Minimum value: 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * <p>Valid values: 1 to 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The resource group ID. This parameter is used as a filter condition.</p>
     * <p>The value cannot exceed 18 characters in length and must start with <code>rg-</code>.</p>
     * <blockquote>
     * <p>This parameter has been incorporated into the ResourceGroupIds parameter. If you set both ResourceGroupId and ResourceGroupIds, the value of ResourceGroupIds takes precedence.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rg-9gLOoK****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The list of resource group IDs. This parameter is used as a filter condition.</p>
     * <p>You can specify up to 100 resource group IDs.</p>
     * <blockquote>
     * <p>If you set both ResourceGroupId and ResourceGroupIds, the value of ResourceGroupIds takes precedence.</p>
     * </blockquote>
     */
    @NameInMap("ResourceGroupIds")
    public java.util.List<String> resourceGroupIds;

    /**
     * <p>The resource group status. This parameter is used as a filter condition. Valid values:</p>
     * <ul>
     * <li>Creating: The resource group is being created.</li>
     * <li>OK: The resource group is created.</li>
     * <li>PendingDelete: The resource group is pending deletion.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The tags. This parameter is used as a filter condition.</p>
     * <p>You can specify up to 20 tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListResourceGroupsRequestTag> tag;

    public static ListResourceGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourceGroupsRequest self = new ListResourceGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListResourceGroupsRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public ListResourceGroupsRequest setIncludeTags(Boolean includeTags) {
        this.includeTags = includeTags;
        return this;
    }
    public Boolean getIncludeTags() {
        return this.includeTags;
    }

    public ListResourceGroupsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListResourceGroupsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListResourceGroupsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListResourceGroupsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListResourceGroupsRequest setResourceGroupIds(java.util.List<String> resourceGroupIds) {
        this.resourceGroupIds = resourceGroupIds;
        return this;
    }
    public java.util.List<String> getResourceGroupIds() {
        return this.resourceGroupIds;
    }

    public ListResourceGroupsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListResourceGroupsRequest setTag(java.util.List<ListResourceGroupsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListResourceGroupsRequestTag> getTag() {
        return this.tag;
    }

    public static class ListResourceGroupsRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>k1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListResourceGroupsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListResourceGroupsRequestTag self = new ListResourceGroupsRequestTag();
            return TeaModel.build(map, self);
        }

        public ListResourceGroupsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListResourceGroupsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
