// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListAppGroupsRequest extends TeaModel {
    @NameInMap("instanceId")
    public String instanceId;

    @NameInMap("name")
    public String name;

    @NameInMap("pageNumber")
    public Integer pageNumber;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    @NameInMap("sortBy")
    public Integer sortBy;

    @NameInMap("tags")
    public java.util.List<ListAppGroupsRequestTags> tags;

    @NameInMap("type")
    public String type;

    public static ListAppGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppGroupsRequest self = new ListAppGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListAppGroupsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListAppGroupsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListAppGroupsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAppGroupsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAppGroupsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListAppGroupsRequest setSortBy(Integer sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public Integer getSortBy() {
        return this.sortBy;
    }

    public ListAppGroupsRequest setTags(java.util.List<ListAppGroupsRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ListAppGroupsRequestTags> getTags() {
        return this.tags;
    }

    public ListAppGroupsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class ListAppGroupsRequestTags extends TeaModel {
        @NameInMap("key")
        public String key;

        @NameInMap("value")
        public String value;

        public static ListAppGroupsRequestTags build(java.util.Map<String, ?> map) throws Exception {
            ListAppGroupsRequestTags self = new ListAppGroupsRequestTags();
            return TeaModel.build(map, self);
        }

        public ListAppGroupsRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListAppGroupsRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
