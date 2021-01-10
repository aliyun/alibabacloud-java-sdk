// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsDrmResourcesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("StartIndex")
    public Long startIndex;

    @NameInMap("TotalSize")
    public Long totalSize;

    @NameInMap("DrmResources")
    public java.util.List<QueryMsDrmResourcesResponseBodyDrmResources> drmResources;

    public static QueryMsDrmResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMsDrmResourcesResponseBody self = new QueryMsDrmResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMsDrmResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMsDrmResourcesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMsDrmResourcesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryMsDrmResourcesResponseBody setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryMsDrmResourcesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryMsDrmResourcesResponseBody setStartIndex(Long startIndex) {
        this.startIndex = startIndex;
        return this;
    }
    public Long getStartIndex() {
        return this.startIndex;
    }

    public QueryMsDrmResourcesResponseBody setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

    public QueryMsDrmResourcesResponseBody setDrmResources(java.util.List<QueryMsDrmResourcesResponseBodyDrmResources> drmResources) {
        this.drmResources = drmResources;
        return this;
    }
    public java.util.List<QueryMsDrmResourcesResponseBodyDrmResources> getDrmResources() {
        return this.drmResources;
    }

    public static class QueryMsDrmResourcesResponseBodyDrmResourcesAttributes extends TeaModel {
        @NameInMap("AttributeName")
        public String attributeName;

        @NameInMap("DataId")
        public String dataId;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Name")
        public String name;

        @NameInMap("ParentId")
        public Long parentId;

        public static QueryMsDrmResourcesResponseBodyDrmResourcesAttributes build(java.util.Map<String, ?> map) throws Exception {
            QueryMsDrmResourcesResponseBodyDrmResourcesAttributes self = new QueryMsDrmResourcesResponseBodyDrmResourcesAttributes();
            return TeaModel.build(map, self);
        }

        public QueryMsDrmResourcesResponseBodyDrmResourcesAttributes setAttributeName(String attributeName) {
            this.attributeName = attributeName;
            return this;
        }
        public String getAttributeName() {
            return this.attributeName;
        }

        public QueryMsDrmResourcesResponseBodyDrmResourcesAttributes setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public QueryMsDrmResourcesResponseBodyDrmResourcesAttributes setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryMsDrmResourcesResponseBodyDrmResourcesAttributes setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryMsDrmResourcesResponseBodyDrmResourcesAttributes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryMsDrmResourcesResponseBodyDrmResourcesAttributes setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

    }

    public static class QueryMsDrmResourcesResponseBodyDrmResources extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Region")
        public String region;

        @NameInMap("ResourceDomain")
        public String resourceDomain;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceVersion")
        public String resourceVersion;

        @NameInMap("Type")
        public String type;

        @NameInMap("Attributes")
        public java.util.List<QueryMsDrmResourcesResponseBodyDrmResourcesAttributes> attributes;

        public static QueryMsDrmResourcesResponseBodyDrmResources build(java.util.Map<String, ?> map) throws Exception {
            QueryMsDrmResourcesResponseBodyDrmResources self = new QueryMsDrmResourcesResponseBodyDrmResources();
            return TeaModel.build(map, self);
        }

        public QueryMsDrmResourcesResponseBodyDrmResources setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryMsDrmResourcesResponseBodyDrmResources setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryMsDrmResourcesResponseBodyDrmResources setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryMsDrmResourcesResponseBodyDrmResources setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryMsDrmResourcesResponseBodyDrmResources setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public QueryMsDrmResourcesResponseBodyDrmResources setResourceDomain(String resourceDomain) {
            this.resourceDomain = resourceDomain;
            return this;
        }
        public String getResourceDomain() {
            return this.resourceDomain;
        }

        public QueryMsDrmResourcesResponseBodyDrmResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public QueryMsDrmResourcesResponseBodyDrmResources setResourceVersion(String resourceVersion) {
            this.resourceVersion = resourceVersion;
            return this;
        }
        public String getResourceVersion() {
            return this.resourceVersion;
        }

        public QueryMsDrmResourcesResponseBodyDrmResources setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryMsDrmResourcesResponseBodyDrmResources setAttributes(java.util.List<QueryMsDrmResourcesResponseBodyDrmResourcesAttributes> attributes) {
            this.attributes = attributes;
            return this;
        }
        public java.util.List<QueryMsDrmResourcesResponseBodyDrmResourcesAttributes> getAttributes() {
            return this.attributes;
        }

    }

}
