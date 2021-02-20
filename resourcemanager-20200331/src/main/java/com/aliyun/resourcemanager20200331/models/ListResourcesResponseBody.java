// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListResourcesResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Resources")
    public ListResourcesResponseBodyResources resources;

    public static ListResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourcesResponseBody self = new ListResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResourcesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListResourcesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListResourcesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListResourcesResponseBody setResources(ListResourcesResponseBodyResources resources) {
        this.resources = resources;
        return this;
    }
    public ListResourcesResponseBodyResources getResources() {
        return this.resources;
    }

    public static class ListResourcesResponseBodyResourcesResource extends TeaModel {
        @NameInMap("Service")
        public String service;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("RegionId")
        public String regionId;

        public static ListResourcesResponseBodyResourcesResource build(java.util.Map<String, ?> map) throws Exception {
            ListResourcesResponseBodyResourcesResource self = new ListResourcesResponseBodyResourcesResource();
            return TeaModel.build(map, self);
        }

        public ListResourcesResponseBodyResourcesResource setService(String service) {
            this.service = service;
            return this;
        }
        public String getService() {
            return this.service;
        }

        public ListResourcesResponseBodyResourcesResource setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListResourcesResponseBodyResourcesResource setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListResourcesResponseBodyResourcesResource setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListResourcesResponseBodyResourcesResource setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public ListResourcesResponseBodyResourcesResource setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class ListResourcesResponseBodyResources extends TeaModel {
        @NameInMap("Resource")
        public java.util.List<ListResourcesResponseBodyResourcesResource> resource;

        public static ListResourcesResponseBodyResources build(java.util.Map<String, ?> map) throws Exception {
            ListResourcesResponseBodyResources self = new ListResourcesResponseBodyResources();
            return TeaModel.build(map, self);
        }

        public ListResourcesResponseBodyResources setResource(java.util.List<ListResourcesResponseBodyResourcesResource> resource) {
            this.resource = resource;
            return this;
        }
        public java.util.List<ListResourcesResponseBodyResourcesResource> getResource() {
            return this.resource;
        }

    }

}
