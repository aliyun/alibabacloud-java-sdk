// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListResourceGroupsRequest extends TeaModel {
    @NameInMap("DisplayName")
    public String displayName;

    @NameInMap("IncludeTags")
    public Boolean includeTags;

    @NameInMap("Name")
    public String name;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceGroupIds")
    public java.util.List<String> resourceGroupIds;

    @NameInMap("Status")
    public String status;

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
        @NameInMap("Key")
        public String key;

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
