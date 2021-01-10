// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasUserappgroupRelationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public QueryHasUserappgroupRelationResponseBodyResultContent resultContent;

    public static QueryHasUserappgroupRelationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHasUserappgroupRelationResponseBody self = new QueryHasUserappgroupRelationResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHasUserappgroupRelationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHasUserappgroupRelationResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHasUserappgroupRelationResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryHasUserappgroupRelationResponseBody setResultContent(QueryHasUserappgroupRelationResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryHasUserappgroupRelationResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class QueryHasUserappgroupRelationResponseBodyResultContentData extends TeaModel {
        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("UserAppName")
        public String userAppName;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("Id")
        public String id;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("UtcModified")
        public String utcModified;

        public static QueryHasUserappgroupRelationResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryHasUserappgroupRelationResponseBodyResultContentData self = new QueryHasUserappgroupRelationResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryHasUserappgroupRelationResponseBodyResultContentData setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public QueryHasUserappgroupRelationResponseBodyResultContentData setUserAppName(String userAppName) {
            this.userAppName = userAppName;
            return this;
        }
        public String getUserAppName() {
            return this.userAppName;
        }

        public QueryHasUserappgroupRelationResponseBodyResultContentData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public QueryHasUserappgroupRelationResponseBodyResultContentData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public QueryHasUserappgroupRelationResponseBodyResultContentData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryHasUserappgroupRelationResponseBodyResultContentData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryHasUserappgroupRelationResponseBodyResultContentData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

    }

    public static class QueryHasUserappgroupRelationResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static QueryHasUserappgroupRelationResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            QueryHasUserappgroupRelationResponseBodyResultContentTopErrorCode self = new QueryHasUserappgroupRelationResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public QueryHasUserappgroupRelationResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public QueryHasUserappgroupRelationResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public QueryHasUserappgroupRelationResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryHasUserappgroupRelationResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public QueryHasUserappgroupRelationResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryHasUserappgroupRelationResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public QueryHasUserappgroupRelationResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasUserappgroupRelationResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryHasUserappgroupRelationResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static QueryHasUserappgroupRelationResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            QueryHasUserappgroupRelationResponseBodyResultContentTopErrorReason self = new QueryHasUserappgroupRelationResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public QueryHasUserappgroupRelationResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasUserappgroupRelationResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class QueryHasUserappgroupRelationResponseBodyResultContent extends TeaModel {
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
        public java.util.List<QueryHasUserappgroupRelationResponseBodyResultContentData> data;

        @NameInMap("TopErrorCode")
        public QueryHasUserappgroupRelationResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public QueryHasUserappgroupRelationResponseBodyResultContentTopErrorReason topErrorReason;

        public static QueryHasUserappgroupRelationResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryHasUserappgroupRelationResponseBodyResultContent self = new QueryHasUserappgroupRelationResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryHasUserappgroupRelationResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasUserappgroupRelationResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryHasUserappgroupRelationResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryHasUserappgroupRelationResponseBodyResultContent setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public QueryHasUserappgroupRelationResponseBodyResultContent setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QueryHasUserappgroupRelationResponseBodyResultContent setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public QueryHasUserappgroupRelationResponseBodyResultContent setData(java.util.List<QueryHasUserappgroupRelationResponseBodyResultContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryHasUserappgroupRelationResponseBodyResultContentData> getData() {
            return this.data;
        }

        public QueryHasUserappgroupRelationResponseBodyResultContent setTopErrorCode(QueryHasUserappgroupRelationResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public QueryHasUserappgroupRelationResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public QueryHasUserappgroupRelationResponseBodyResultContent setTopErrorReason(QueryHasUserappgroupRelationResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public QueryHasUserappgroupRelationResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
