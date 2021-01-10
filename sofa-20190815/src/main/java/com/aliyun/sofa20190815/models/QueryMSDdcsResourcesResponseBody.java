// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMSDdcsResourcesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Resources")
    public java.util.List<QueryMSDdcsResourcesResponseBodyResources> resources;

    public static QueryMSDdcsResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMSDdcsResourcesResponseBody self = new QueryMSDdcsResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMSDdcsResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMSDdcsResourcesResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryMSDdcsResourcesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryMSDdcsResourcesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public QueryMSDdcsResourcesResponseBody setResources(java.util.List<QueryMSDdcsResourcesResponseBodyResources> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<QueryMSDdcsResourcesResponseBodyResources> getResources() {
        return this.resources;
    }

    public static class QueryMSDdcsResourcesResponseBodyResourcesAttributes extends TeaModel {
        @NameInMap("AttributeName")
        public String attributeName;

        @NameInMap("Desc")
        public String desc;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("InstanceId")
        public String instanceId;

        public static QueryMSDdcsResourcesResponseBodyResourcesAttributes build(java.util.Map<String, ?> map) throws Exception {
            QueryMSDdcsResourcesResponseBodyResourcesAttributes self = new QueryMSDdcsResourcesResponseBodyResourcesAttributes();
            return TeaModel.build(map, self);
        }

        public QueryMSDdcsResourcesResponseBodyResourcesAttributes setAttributeName(String attributeName) {
            this.attributeName = attributeName;
            return this;
        }
        public String getAttributeName() {
            return this.attributeName;
        }

        public QueryMSDdcsResourcesResponseBodyResourcesAttributes setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public QueryMSDdcsResourcesResponseBodyResourcesAttributes setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public QueryMSDdcsResourcesResponseBodyResourcesAttributes setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class QueryMSDdcsResourcesResponseBodyResources extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("Desc")
        public String desc;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Region")
        public String region;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("Attributes")
        public java.util.List<QueryMSDdcsResourcesResponseBodyResourcesAttributes> attributes;

        public static QueryMSDdcsResourcesResponseBodyResources build(java.util.Map<String, ?> map) throws Exception {
            QueryMSDdcsResourcesResponseBodyResources self = new QueryMSDdcsResourcesResponseBodyResources();
            return TeaModel.build(map, self);
        }

        public QueryMSDdcsResourcesResponseBodyResources setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryMSDdcsResourcesResponseBodyResources setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public QueryMSDdcsResourcesResponseBodyResources setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public QueryMSDdcsResourcesResponseBodyResources setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryMSDdcsResourcesResponseBodyResources setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public QueryMSDdcsResourcesResponseBodyResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public QueryMSDdcsResourcesResponseBodyResources setAttributes(java.util.List<QueryMSDdcsResourcesResponseBodyResourcesAttributes> attributes) {
            this.attributes = attributes;
            return this;
        }
        public java.util.List<QueryMSDdcsResourcesResponseBodyResourcesAttributes> getAttributes() {
            return this.attributes;
        }

    }

}
