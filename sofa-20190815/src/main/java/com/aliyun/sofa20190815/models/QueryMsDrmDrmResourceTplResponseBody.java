// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMsDrmDrmResourceTplResponseBody extends TeaModel {
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

    @NameInMap("DrmResourceTpls")
    public java.util.List<QueryMsDrmDrmResourceTplResponseBodyDrmResourceTpls> drmResourceTpls;

    public static QueryMsDrmDrmResourceTplResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMsDrmDrmResourceTplResponseBody self = new QueryMsDrmDrmResourceTplResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMsDrmDrmResourceTplResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMsDrmDrmResourceTplResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMsDrmDrmResourceTplResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryMsDrmDrmResourceTplResponseBody setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryMsDrmDrmResourceTplResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryMsDrmDrmResourceTplResponseBody setStartIndex(Long startIndex) {
        this.startIndex = startIndex;
        return this;
    }
    public Long getStartIndex() {
        return this.startIndex;
    }

    public QueryMsDrmDrmResourceTplResponseBody setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

    public QueryMsDrmDrmResourceTplResponseBody setDrmResourceTpls(java.util.List<QueryMsDrmDrmResourceTplResponseBodyDrmResourceTpls> drmResourceTpls) {
        this.drmResourceTpls = drmResourceTpls;
        return this;
    }
    public java.util.List<QueryMsDrmDrmResourceTplResponseBodyDrmResourceTpls> getDrmResourceTpls() {
        return this.drmResourceTpls;
    }

    public static class QueryMsDrmDrmResourceTplResponseBodyDrmResourceTplsAttributesParent extends TeaModel {
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

        public static QueryMsDrmDrmResourceTplResponseBodyDrmResourceTplsAttributesParent build(java.util.Map<String, ?> map) throws Exception {
            QueryMsDrmDrmResourceTplResponseBodyDrmResourceTplsAttributesParent self = new QueryMsDrmDrmResourceTplResponseBodyDrmResourceTplsAttributesParent();
            return TeaModel.build(map, self);
        }

        public QueryMsDrmDrmResourceTplResponseBodyDrmResourceTplsAttributesParent setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryMsDrmDrmResourceTplResponseBodyDrmResourceTplsAttributesParent setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryMsDrmDrmResourceTplResponseBodyDrmResourceTplsAttributesParent setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryMsDrmDrmResourceTplResponseBodyDrmResourceTplsAttributesParent setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryMsDrmDrmResourceTplResponseBodyDrmResourceTplsAttributesParent setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public QueryMsDrmDrmResourceTplResponseBodyDrmResourceTplsAttributesParent setResourceDomain(String resourceDomain) {
            this.resourceDomain = resourceDomain;
            return this;
        }
        public String getResourceDomain() {
            return this.resourceDomain;
        }

        public QueryMsDrmDrmResourceTplResponseBodyDrmResourceTplsAttributesParent setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public QueryMsDrmDrmResourceTplResponseBodyDrmResourceTplsAttributesParent setResourceVersion(String resourceVersion) {
            this.resourceVersion = resourceVersion;
            return this;
        }
        public String getResourceVersion() {
            return this.resourceVersion;
        }

        public QueryMsDrmDrmResourceTplResponseBodyDrmResourceTplsAttributesParent setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryMsDrmDrmResourceTplResponseBodyDrmResourceTplsAttributes extends TeaModel {
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

        @NameInMap("Parent")
        public QueryMsDrmDrmResourceTplResponseBodyDrmResourceTplsAttributesParent parent;

        public static QueryMsDrmDrmResourceTplResponseBodyDrmResourceTplsAttributes build(java.util.Map<String, ?> map) throws Exception {
            QueryMsDrmDrmResourceTplResponseBodyDrmResourceTplsAttributes self = new QueryMsDrmDrmResourceTplResponseBodyDrmResourceTplsAttributes();
            return TeaModel.build(map, self);
        }

        public QueryMsDrmDrmResourceTplResponseBodyDrmResourceTplsAttributes setAttributeName(String attributeName) {
            this.attributeName = attributeName;
            return this;
        }
        public String getAttributeName() {
            return this.attributeName;
        }

        public QueryMsDrmDrmResourceTplResponseBodyDrmResourceTplsAttributes setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public QueryMsDrmDrmResourceTplResponseBodyDrmResourceTplsAttributes setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryMsDrmDrmResourceTplResponseBodyDrmResourceTplsAttributes setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryMsDrmDrmResourceTplResponseBodyDrmResourceTplsAttributes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryMsDrmDrmResourceTplResponseBodyDrmResourceTplsAttributes setParentId(Long parentId) {
            this.parentId = parentId;
            return this;
        }
        public Long getParentId() {
            return this.parentId;
        }

        public QueryMsDrmDrmResourceTplResponseBodyDrmResourceTplsAttributes setParent(QueryMsDrmDrmResourceTplResponseBodyDrmResourceTplsAttributesParent parent) {
            this.parent = parent;
            return this;
        }
        public QueryMsDrmDrmResourceTplResponseBodyDrmResourceTplsAttributesParent getParent() {
            return this.parent;
        }

    }

    public static class QueryMsDrmDrmResourceTplResponseBodyDrmResourceTpls extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("Desc")
        public String desc;

        @NameInMap("HasInstance")
        public Boolean hasInstance;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Region")
        public String region;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("Attributes")
        public java.util.List<QueryMsDrmDrmResourceTplResponseBodyDrmResourceTplsAttributes> attributes;

        public static QueryMsDrmDrmResourceTplResponseBodyDrmResourceTpls build(java.util.Map<String, ?> map) throws Exception {
            QueryMsDrmDrmResourceTplResponseBodyDrmResourceTpls self = new QueryMsDrmDrmResourceTplResponseBodyDrmResourceTpls();
            return TeaModel.build(map, self);
        }

        public QueryMsDrmDrmResourceTplResponseBodyDrmResourceTpls setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryMsDrmDrmResourceTplResponseBodyDrmResourceTpls setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public QueryMsDrmDrmResourceTplResponseBodyDrmResourceTpls setHasInstance(Boolean hasInstance) {
            this.hasInstance = hasInstance;
            return this;
        }
        public Boolean getHasInstance() {
            return this.hasInstance;
        }

        public QueryMsDrmDrmResourceTplResponseBodyDrmResourceTpls setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryMsDrmDrmResourceTplResponseBodyDrmResourceTpls setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryMsDrmDrmResourceTplResponseBodyDrmResourceTpls setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public QueryMsDrmDrmResourceTplResponseBodyDrmResourceTpls setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public QueryMsDrmDrmResourceTplResponseBodyDrmResourceTpls setAttributes(java.util.List<QueryMsDrmDrmResourceTplResponseBodyDrmResourceTplsAttributes> attributes) {
            this.attributes = attributes;
            return this;
        }
        public java.util.List<QueryMsDrmDrmResourceTplResponseBodyDrmResourceTplsAttributes> getAttributes() {
            return this.attributes;
        }

    }

}
