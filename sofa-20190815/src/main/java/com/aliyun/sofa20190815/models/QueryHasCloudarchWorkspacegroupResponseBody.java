// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasCloudarchWorkspacegroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public QueryHasCloudarchWorkspacegroupResponseBodyResultContent resultContent;

    public static QueryHasCloudarchWorkspacegroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHasCloudarchWorkspacegroupResponseBody self = new QueryHasCloudarchWorkspacegroupResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHasCloudarchWorkspacegroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHasCloudarchWorkspacegroupResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHasCloudarchWorkspacegroupResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryHasCloudarchWorkspacegroupResponseBody setResultContent(QueryHasCloudarchWorkspacegroupResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryHasCloudarchWorkspacegroupResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class QueryHasCloudarchWorkspacegroupResponseBodyResultContentData extends TeaModel {
        @NameInMap("Uid")
        public String uid;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("YunyouId")
        public String yunyouId;

        @NameInMap("EnvType")
        public String envType;

        @NameInMap("Ldc")
        public Boolean ldc;

        @NameInMap("Source")
        public String source;

        @NameInMap("Tenant")
        public String tenant;

        @NameInMap("Status")
        public String status;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("UtcModified")
        public String utcModified;

        public static QueryHasCloudarchWorkspacegroupResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryHasCloudarchWorkspacegroupResponseBodyResultContentData self = new QueryHasCloudarchWorkspacegroupResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryHasCloudarchWorkspacegroupResponseBodyResultContentData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public QueryHasCloudarchWorkspacegroupResponseBodyResultContentData setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public QueryHasCloudarchWorkspacegroupResponseBodyResultContentData setYunyouId(String yunyouId) {
            this.yunyouId = yunyouId;
            return this;
        }
        public String getYunyouId() {
            return this.yunyouId;
        }

        public QueryHasCloudarchWorkspacegroupResponseBodyResultContentData setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public QueryHasCloudarchWorkspacegroupResponseBodyResultContentData setLdc(Boolean ldc) {
            this.ldc = ldc;
            return this;
        }
        public Boolean getLdc() {
            return this.ldc;
        }

        public QueryHasCloudarchWorkspacegroupResponseBodyResultContentData setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public QueryHasCloudarchWorkspacegroupResponseBodyResultContentData setTenant(String tenant) {
            this.tenant = tenant;
            return this;
        }
        public String getTenant() {
            return this.tenant;
        }

        public QueryHasCloudarchWorkspacegroupResponseBodyResultContentData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryHasCloudarchWorkspacegroupResponseBodyResultContentData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryHasCloudarchWorkspacegroupResponseBodyResultContentData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryHasCloudarchWorkspacegroupResponseBodyResultContentData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryHasCloudarchWorkspacegroupResponseBodyResultContentData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

    }

    public static class QueryHasCloudarchWorkspacegroupResponseBodyResultContentTopErrorCode extends TeaModel {
        @NameInMap("ExceptionCode")
        public String exceptionCode;

        @NameInMap("ExceptionCodeDescription")
        public String exceptionCodeDescription;

        @NameInMap("Level")
        public String level;

        @NameInMap("Prefix")
        public String prefix;

        @NameInMap("Scene")
        public String scene;

        @NameInMap("SceneName")
        public String sceneName;

        @NameInMap("Type")
        public String type;

        @NameInMap("Version")
        public String version;

        public static QueryHasCloudarchWorkspacegroupResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            QueryHasCloudarchWorkspacegroupResponseBodyResultContentTopErrorCode self = new QueryHasCloudarchWorkspacegroupResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public QueryHasCloudarchWorkspacegroupResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public QueryHasCloudarchWorkspacegroupResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public QueryHasCloudarchWorkspacegroupResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryHasCloudarchWorkspacegroupResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public QueryHasCloudarchWorkspacegroupResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryHasCloudarchWorkspacegroupResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public QueryHasCloudarchWorkspacegroupResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasCloudarchWorkspacegroupResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryHasCloudarchWorkspacegroupResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static QueryHasCloudarchWorkspacegroupResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            QueryHasCloudarchWorkspacegroupResponseBodyResultContentTopErrorReason self = new QueryHasCloudarchWorkspacegroupResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public QueryHasCloudarchWorkspacegroupResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasCloudarchWorkspacegroupResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class QueryHasCloudarchWorkspacegroupResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("CurrentPage")
        public Long currentPage;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("Data")
        public java.util.List<QueryHasCloudarchWorkspacegroupResponseBodyResultContentData> data;

        @NameInMap("TopErrorCode")
        public QueryHasCloudarchWorkspacegroupResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public QueryHasCloudarchWorkspacegroupResponseBodyResultContentTopErrorReason topErrorReason;

        public static QueryHasCloudarchWorkspacegroupResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryHasCloudarchWorkspacegroupResponseBodyResultContent self = new QueryHasCloudarchWorkspacegroupResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryHasCloudarchWorkspacegroupResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasCloudarchWorkspacegroupResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryHasCloudarchWorkspacegroupResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryHasCloudarchWorkspacegroupResponseBodyResultContent setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public QueryHasCloudarchWorkspacegroupResponseBodyResultContent setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QueryHasCloudarchWorkspacegroupResponseBodyResultContent setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public QueryHasCloudarchWorkspacegroupResponseBodyResultContent setData(java.util.List<QueryHasCloudarchWorkspacegroupResponseBodyResultContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryHasCloudarchWorkspacegroupResponseBodyResultContentData> getData() {
            return this.data;
        }

        public QueryHasCloudarchWorkspacegroupResponseBodyResultContent setTopErrorCode(QueryHasCloudarchWorkspacegroupResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public QueryHasCloudarchWorkspacegroupResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public QueryHasCloudarchWorkspacegroupResponseBodyResultContent setTopErrorReason(QueryHasCloudarchWorkspacegroupResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public QueryHasCloudarchWorkspacegroupResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
