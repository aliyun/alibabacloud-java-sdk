// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsConfigResourcesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("PageNum")
    public Long pageNum;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("Resources")
    public java.util.List<QueryMsConfigResourcesResponseBodyResources> resources;

    public static QueryMsConfigResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMsConfigResourcesResponseBody self = new QueryMsConfigResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMsConfigResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMsConfigResourcesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMsConfigResourcesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryMsConfigResourcesResponseBody setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryMsConfigResourcesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryMsConfigResourcesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryMsConfigResourcesResponseBody setResources(java.util.List<QueryMsConfigResourcesResponseBodyResources> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<QueryMsConfigResourcesResponseBodyResources> getResources() {
        return this.resources;
    }

    public static class QueryMsConfigResourcesResponseBodyResourcesAttributes extends TeaModel {
        @NameInMap("AttributeName")
        public String attributeName;

        @NameInMap("Desc")
        public String desc;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceId")
        public String instanceId;

        public static QueryMsConfigResourcesResponseBodyResourcesAttributes build(java.util.Map<String, ?> map) throws Exception {
            QueryMsConfigResourcesResponseBodyResourcesAttributes self = new QueryMsConfigResourcesResponseBodyResourcesAttributes();
            return TeaModel.build(map, self);
        }

        public QueryMsConfigResourcesResponseBodyResourcesAttributes setAttributeName(String attributeName) {
            this.attributeName = attributeName;
            return this;
        }
        public String getAttributeName() {
            return this.attributeName;
        }

        public QueryMsConfigResourcesResponseBodyResourcesAttributes setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public QueryMsConfigResourcesResponseBodyResourcesAttributes setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryMsConfigResourcesResponseBodyResourcesAttributes setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class QueryMsConfigResourcesResponseBodyResources extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("Desc")
        public String desc;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Region")
        public String region;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("Attributes")
        public java.util.List<QueryMsConfigResourcesResponseBodyResourcesAttributes> attributes;

        public static QueryMsConfigResourcesResponseBodyResources build(java.util.Map<String, ?> map) throws Exception {
            QueryMsConfigResourcesResponseBodyResources self = new QueryMsConfigResourcesResponseBodyResources();
            return TeaModel.build(map, self);
        }

        public QueryMsConfigResourcesResponseBodyResources setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryMsConfigResourcesResponseBodyResources setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public QueryMsConfigResourcesResponseBodyResources setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryMsConfigResourcesResponseBodyResources setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryMsConfigResourcesResponseBodyResources setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public QueryMsConfigResourcesResponseBodyResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public QueryMsConfigResourcesResponseBodyResources setAttributes(java.util.List<QueryMsConfigResourcesResponseBodyResourcesAttributes> attributes) {
            this.attributes = attributes;
            return this;
        }
        public java.util.List<QueryMsConfigResourcesResponseBodyResourcesAttributes> getAttributes() {
            return this.attributes;
        }

    }

}
