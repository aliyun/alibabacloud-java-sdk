// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStackGroupsRequest extends TeaModel {
    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Status")
    public String status;

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
        @NameInMap("Key")
        public String key;

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
