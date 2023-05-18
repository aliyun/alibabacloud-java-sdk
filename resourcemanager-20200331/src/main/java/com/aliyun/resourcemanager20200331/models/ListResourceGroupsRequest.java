// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListResourceGroupsRequest extends TeaModel {
    /**
     * <p>The display name of the resource group. This parameter specifies a filter condition for the query. Fuzzy match is supported.</p>
     * <br>
     * <p>The display name can be a maximum of 50 characters in length.</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>Specifies whether to return the information of tags. Valid values:</p>
     * <br>
     * <p>*   false (default value)</p>
     * <p>*   true</p>
     * <br>
     * <p>>  If you configure the Tag parameter, the system returns the information of tags regardless of the setting of the `IncludeTags` parameter.</p>
     */
    @NameInMap("IncludeTags")
    public Boolean includeTags;

    /**
     * <p>The identifier of the resource group. This parameter specifies a filter condition for the query. Fuzzy match is supported.</p>
     * <br>
     * <p>The identifier can be a maximum of 50 characters in length and can contain letters, digits, and hyphens (-).</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The number of the page to return.</p>
     * <br>
     * <p>Pages start from page 1. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>Valid values: 1 to 100. Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the resource group. This parameter specifies a filter condition for the query.</p>
     * <br>
     * <p>The ID can be a maximum of 18 characters in length and must start with `rg-`.</p>
     * <br>
     * <p>>  This parameter is incorporated into the `ResourceGroupIds` parameter. If you configure both the `ResourceGroupId` and `ResourceGroupIds` parameters, the value of the `ResourceGroupIds` parameter prevails.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The IDs of the resource groups. This parameter specifies a filter condition for the query.</p>
     * <br>
     * <p>You can specify a maximum of 100 resource group IDs.</p>
     * <br>
     * <p>>  If you configure both the `ResourceGroupId` and `ResourceGroupIds` parameters, the value of the `ResourceGroupIds` parameter prevails.</p>
     */
    @NameInMap("ResourceGroupIds")
    public java.util.List<String> resourceGroupIds;

    /**
     * <p>The status of the resource group. This parameter specifies a filter condition for the query. Valid values:</p>
     * <br>
     * <p>*   Creating: The resource group is being created.</p>
     * <p>*   OK: The resource group is created.</p>
     * <p>*   PendingDelete: The resource group is waiting to be deleted.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The tag. This parameter specifies a filter condition for the query.</p>
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
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
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
