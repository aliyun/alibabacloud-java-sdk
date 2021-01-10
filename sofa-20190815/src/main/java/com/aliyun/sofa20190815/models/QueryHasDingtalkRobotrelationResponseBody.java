// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasDingtalkRobotrelationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public QueryHasDingtalkRobotrelationResponseBodyResultContent resultContent;

    public static QueryHasDingtalkRobotrelationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHasDingtalkRobotrelationResponseBody self = new QueryHasDingtalkRobotrelationResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHasDingtalkRobotrelationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHasDingtalkRobotrelationResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHasDingtalkRobotrelationResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryHasDingtalkRobotrelationResponseBody setResultContent(QueryHasDingtalkRobotrelationResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryHasDingtalkRobotrelationResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class QueryHasDingtalkRobotrelationResponseBodyResultContentData extends TeaModel {
        @NameInMap("RelationType")
        public String relationType;

        @NameInMap("RelationId")
        public String relationId;

        @NameInMap("RobotId")
        public String robotId;

        @NameInMap("SendLevel")
        public String sendLevel;

        @NameInMap("RelationName")
        public String relationName;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("TokenUrl")
        public String tokenUrl;

        @NameInMap("AuthType")
        public String authType;

        @NameInMap("Secret")
        public String secret;

        @NameInMap("Comment")
        public String comment;

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

        public static QueryHasDingtalkRobotrelationResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryHasDingtalkRobotrelationResponseBodyResultContentData self = new QueryHasDingtalkRobotrelationResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryHasDingtalkRobotrelationResponseBodyResultContentData setRelationType(String relationType) {
            this.relationType = relationType;
            return this;
        }
        public String getRelationType() {
            return this.relationType;
        }

        public QueryHasDingtalkRobotrelationResponseBodyResultContentData setRelationId(String relationId) {
            this.relationId = relationId;
            return this;
        }
        public String getRelationId() {
            return this.relationId;
        }

        public QueryHasDingtalkRobotrelationResponseBodyResultContentData setRobotId(String robotId) {
            this.robotId = robotId;
            return this;
        }
        public String getRobotId() {
            return this.robotId;
        }

        public QueryHasDingtalkRobotrelationResponseBodyResultContentData setSendLevel(String sendLevel) {
            this.sendLevel = sendLevel;
            return this;
        }
        public String getSendLevel() {
            return this.sendLevel;
        }

        public QueryHasDingtalkRobotrelationResponseBodyResultContentData setRelationName(String relationName) {
            this.relationName = relationName;
            return this;
        }
        public String getRelationName() {
            return this.relationName;
        }

        public QueryHasDingtalkRobotrelationResponseBodyResultContentData setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public QueryHasDingtalkRobotrelationResponseBodyResultContentData setTokenUrl(String tokenUrl) {
            this.tokenUrl = tokenUrl;
            return this;
        }
        public String getTokenUrl() {
            return this.tokenUrl;
        }

        public QueryHasDingtalkRobotrelationResponseBodyResultContentData setAuthType(String authType) {
            this.authType = authType;
            return this;
        }
        public String getAuthType() {
            return this.authType;
        }

        public QueryHasDingtalkRobotrelationResponseBodyResultContentData setSecret(String secret) {
            this.secret = secret;
            return this;
        }
        public String getSecret() {
            return this.secret;
        }

        public QueryHasDingtalkRobotrelationResponseBodyResultContentData setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public QueryHasDingtalkRobotrelationResponseBodyResultContentData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public QueryHasDingtalkRobotrelationResponseBodyResultContentData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public QueryHasDingtalkRobotrelationResponseBodyResultContentData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryHasDingtalkRobotrelationResponseBodyResultContentData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryHasDingtalkRobotrelationResponseBodyResultContentData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

    }

    public static class QueryHasDingtalkRobotrelationResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static QueryHasDingtalkRobotrelationResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            QueryHasDingtalkRobotrelationResponseBodyResultContentTopErrorCode self = new QueryHasDingtalkRobotrelationResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public QueryHasDingtalkRobotrelationResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public QueryHasDingtalkRobotrelationResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public QueryHasDingtalkRobotrelationResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryHasDingtalkRobotrelationResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public QueryHasDingtalkRobotrelationResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryHasDingtalkRobotrelationResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public QueryHasDingtalkRobotrelationResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasDingtalkRobotrelationResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryHasDingtalkRobotrelationResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static QueryHasDingtalkRobotrelationResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            QueryHasDingtalkRobotrelationResponseBodyResultContentTopErrorReason self = new QueryHasDingtalkRobotrelationResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public QueryHasDingtalkRobotrelationResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasDingtalkRobotrelationResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class QueryHasDingtalkRobotrelationResponseBodyResultContent extends TeaModel {
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
        public java.util.List<QueryHasDingtalkRobotrelationResponseBodyResultContentData> data;

        @NameInMap("TopErrorCode")
        public QueryHasDingtalkRobotrelationResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public QueryHasDingtalkRobotrelationResponseBodyResultContentTopErrorReason topErrorReason;

        public static QueryHasDingtalkRobotrelationResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryHasDingtalkRobotrelationResponseBodyResultContent self = new QueryHasDingtalkRobotrelationResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryHasDingtalkRobotrelationResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasDingtalkRobotrelationResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryHasDingtalkRobotrelationResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryHasDingtalkRobotrelationResponseBodyResultContent setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public QueryHasDingtalkRobotrelationResponseBodyResultContent setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QueryHasDingtalkRobotrelationResponseBodyResultContent setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public QueryHasDingtalkRobotrelationResponseBodyResultContent setData(java.util.List<QueryHasDingtalkRobotrelationResponseBodyResultContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryHasDingtalkRobotrelationResponseBodyResultContentData> getData() {
            return this.data;
        }

        public QueryHasDingtalkRobotrelationResponseBodyResultContent setTopErrorCode(QueryHasDingtalkRobotrelationResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public QueryHasDingtalkRobotrelationResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public QueryHasDingtalkRobotrelationResponseBodyResultContent setTopErrorReason(QueryHasDingtalkRobotrelationResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public QueryHasDingtalkRobotrelationResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
