// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20161111.models;

import com.aliyun.tea.*;

public class QueryResourceResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Resources")
    public QueryResourceResponseBodyResources resources;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static QueryResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryResourceResponseBody self = new QueryResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryResourceResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryResourceResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryResourceResponseBody setResources(QueryResourceResponseBodyResources resources) {
        this.resources = resources;
        return this;
    }
    public QueryResourceResponseBodyResources getResources() {
        return this.resources;
    }

    public QueryResourceResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class QueryResourceResponseBodyResourcesResource extends TeaModel {
        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("Service")
        public String service;

        public static QueryResourceResponseBodyResourcesResource build(java.util.Map<String, ?> map) throws Exception {
            QueryResourceResponseBodyResourcesResource self = new QueryResourceResponseBodyResourcesResource();
            return TeaModel.build(map, self);
        }

        public QueryResourceResponseBodyResourcesResource setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public QueryResourceResponseBodyResourcesResource setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public QueryResourceResponseBodyResourcesResource setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public QueryResourceResponseBodyResourcesResource setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public QueryResourceResponseBodyResourcesResource setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public QueryResourceResponseBodyResourcesResource setService(String service) {
            this.service = service;
            return this;
        }
        public String getService() {
            return this.service;
        }

    }

    public static class QueryResourceResponseBodyResources extends TeaModel {
        @NameInMap("Resource")
        public java.util.List<QueryResourceResponseBodyResourcesResource> resource;

        public static QueryResourceResponseBodyResources build(java.util.Map<String, ?> map) throws Exception {
            QueryResourceResponseBodyResources self = new QueryResourceResponseBodyResources();
            return TeaModel.build(map, self);
        }

        public QueryResourceResponseBodyResources setResource(java.util.List<QueryResourceResponseBodyResourcesResource> resource) {
            this.resource = resource;
            return this;
        }
        public java.util.List<QueryResourceResponseBodyResourcesResource> getResource() {
            return this.resource;
        }

    }

}
