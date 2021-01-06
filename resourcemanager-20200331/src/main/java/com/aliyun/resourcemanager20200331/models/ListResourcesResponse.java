// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListResourcesResponse extends TeaModel {
    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("Resources")
    @Validation(required = true)
    public ListResourcesResponseResources resources;

    public static ListResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListResourcesResponse self = new ListResourcesResponse();
        return TeaModel.build(map, self);
    }

    public ListResourcesResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListResourcesResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListResourcesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListResourcesResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListResourcesResponse setResources(ListResourcesResponseResources resources) {
        this.resources = resources;
        return this;
    }
    public ListResourcesResponseResources getResources() {
        return this.resources;
    }

    public static class ListResourcesResponseResourcesResource extends TeaModel {
        @NameInMap("ResourceGroupId")
        @Validation(required = true)
        public String resourceGroupId;

        @NameInMap("ResourceId")
        @Validation(required = true)
        public String resourceId;

        @NameInMap("Service")
        @Validation(required = true)
        public String service;

        @NameInMap("ResourceType")
        @Validation(required = true)
        public String resourceType;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("CreateDate")
        @Validation(required = true)
        public String createDate;

        public static ListResourcesResponseResourcesResource build(java.util.Map<String, ?> map) throws Exception {
            ListResourcesResponseResourcesResource self = new ListResourcesResponseResourcesResource();
            return TeaModel.build(map, self);
        }

        public ListResourcesResponseResourcesResource setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListResourcesResponseResourcesResource setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListResourcesResponseResourcesResource setService(String service) {
            this.service = service;
            return this;
        }
        public String getService() {
            return this.service;
        }

        public ListResourcesResponseResourcesResource setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListResourcesResponseResourcesResource setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListResourcesResponseResourcesResource setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

    }

    public static class ListResourcesResponseResources extends TeaModel {
        @NameInMap("Resource")
        @Validation(required = true)
        public java.util.List<ListResourcesResponseResourcesResource> resource;

        public static ListResourcesResponseResources build(java.util.Map<String, ?> map) throws Exception {
            ListResourcesResponseResources self = new ListResourcesResponseResources();
            return TeaModel.build(map, self);
        }

        public ListResourcesResponseResources setResource(java.util.List<ListResourcesResponseResourcesResource> resource) {
            this.resource = resource;
            return this;
        }
        public java.util.List<ListResourcesResponseResourcesResource> getResource() {
            return this.resource;
        }

    }

}
