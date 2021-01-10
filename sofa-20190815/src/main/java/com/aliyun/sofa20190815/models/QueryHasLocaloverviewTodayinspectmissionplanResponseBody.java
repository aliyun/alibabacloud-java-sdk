// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasLocaloverviewTodayinspectmissionplanResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public QueryHasLocaloverviewTodayinspectmissionplanResponseBodyResultContent resultContent;

    public static QueryHasLocaloverviewTodayinspectmissionplanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHasLocaloverviewTodayinspectmissionplanResponseBody self = new QueryHasLocaloverviewTodayinspectmissionplanResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHasLocaloverviewTodayinspectmissionplanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHasLocaloverviewTodayinspectmissionplanResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHasLocaloverviewTodayinspectmissionplanResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryHasLocaloverviewTodayinspectmissionplanResponseBody setResultContent(QueryHasLocaloverviewTodayinspectmissionplanResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryHasLocaloverviewTodayinspectmissionplanResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class QueryHasLocaloverviewTodayinspectmissionplanResponseBodyResultContentData extends TeaModel {
        @NameInMap("Creator")
        public String creator;

        @NameInMap("CurrentExecFlag")
        public Long currentExecFlag;

        @NameInMap("DeleteAt")
        public String deleteAt;

        @NameInMap("DeleteStatus")
        public Long deleteStatus;

        @NameInMap("Description")
        public String description;

        @NameInMap("ExecutableStatus")
        public String executableStatus;

        @NameInMap("Id")
        public String id;

        @NameInMap("IsExecutable")
        public Boolean isExecutable;

        @NameInMap("Name")
        public String name;

        @NameInMap("PlanTime")
        public String planTime;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("UtcModified")
        public String utcModified;

        public static QueryHasLocaloverviewTodayinspectmissionplanResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryHasLocaloverviewTodayinspectmissionplanResponseBodyResultContentData self = new QueryHasLocaloverviewTodayinspectmissionplanResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryHasLocaloverviewTodayinspectmissionplanResponseBodyResultContentData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public QueryHasLocaloverviewTodayinspectmissionplanResponseBodyResultContentData setCurrentExecFlag(Long currentExecFlag) {
            this.currentExecFlag = currentExecFlag;
            return this;
        }
        public Long getCurrentExecFlag() {
            return this.currentExecFlag;
        }

        public QueryHasLocaloverviewTodayinspectmissionplanResponseBodyResultContentData setDeleteAt(String deleteAt) {
            this.deleteAt = deleteAt;
            return this;
        }
        public String getDeleteAt() {
            return this.deleteAt;
        }

        public QueryHasLocaloverviewTodayinspectmissionplanResponseBodyResultContentData setDeleteStatus(Long deleteStatus) {
            this.deleteStatus = deleteStatus;
            return this;
        }
        public Long getDeleteStatus() {
            return this.deleteStatus;
        }

        public QueryHasLocaloverviewTodayinspectmissionplanResponseBodyResultContentData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryHasLocaloverviewTodayinspectmissionplanResponseBodyResultContentData setExecutableStatus(String executableStatus) {
            this.executableStatus = executableStatus;
            return this;
        }
        public String getExecutableStatus() {
            return this.executableStatus;
        }

        public QueryHasLocaloverviewTodayinspectmissionplanResponseBodyResultContentData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryHasLocaloverviewTodayinspectmissionplanResponseBodyResultContentData setIsExecutable(Boolean isExecutable) {
            this.isExecutable = isExecutable;
            return this;
        }
        public Boolean getIsExecutable() {
            return this.isExecutable;
        }

        public QueryHasLocaloverviewTodayinspectmissionplanResponseBodyResultContentData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryHasLocaloverviewTodayinspectmissionplanResponseBodyResultContentData setPlanTime(String planTime) {
            this.planTime = planTime;
            return this;
        }
        public String getPlanTime() {
            return this.planTime;
        }

        public QueryHasLocaloverviewTodayinspectmissionplanResponseBodyResultContentData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public QueryHasLocaloverviewTodayinspectmissionplanResponseBodyResultContentData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryHasLocaloverviewTodayinspectmissionplanResponseBodyResultContentData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

    }

    public static class QueryHasLocaloverviewTodayinspectmissionplanResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static QueryHasLocaloverviewTodayinspectmissionplanResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            QueryHasLocaloverviewTodayinspectmissionplanResponseBodyResultContentTopErrorCode self = new QueryHasLocaloverviewTodayinspectmissionplanResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public QueryHasLocaloverviewTodayinspectmissionplanResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public QueryHasLocaloverviewTodayinspectmissionplanResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public QueryHasLocaloverviewTodayinspectmissionplanResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryHasLocaloverviewTodayinspectmissionplanResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public QueryHasLocaloverviewTodayinspectmissionplanResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryHasLocaloverviewTodayinspectmissionplanResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public QueryHasLocaloverviewTodayinspectmissionplanResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasLocaloverviewTodayinspectmissionplanResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryHasLocaloverviewTodayinspectmissionplanResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static QueryHasLocaloverviewTodayinspectmissionplanResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            QueryHasLocaloverviewTodayinspectmissionplanResponseBodyResultContentTopErrorReason self = new QueryHasLocaloverviewTodayinspectmissionplanResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public QueryHasLocaloverviewTodayinspectmissionplanResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasLocaloverviewTodayinspectmissionplanResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class QueryHasLocaloverviewTodayinspectmissionplanResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public java.util.List<QueryHasLocaloverviewTodayinspectmissionplanResponseBodyResultContentData> data;

        @NameInMap("TopErrorCode")
        public QueryHasLocaloverviewTodayinspectmissionplanResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public QueryHasLocaloverviewTodayinspectmissionplanResponseBodyResultContentTopErrorReason topErrorReason;

        public static QueryHasLocaloverviewTodayinspectmissionplanResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryHasLocaloverviewTodayinspectmissionplanResponseBodyResultContent self = new QueryHasLocaloverviewTodayinspectmissionplanResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryHasLocaloverviewTodayinspectmissionplanResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasLocaloverviewTodayinspectmissionplanResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryHasLocaloverviewTodayinspectmissionplanResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryHasLocaloverviewTodayinspectmissionplanResponseBodyResultContent setData(java.util.List<QueryHasLocaloverviewTodayinspectmissionplanResponseBodyResultContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryHasLocaloverviewTodayinspectmissionplanResponseBodyResultContentData> getData() {
            return this.data;
        }

        public QueryHasLocaloverviewTodayinspectmissionplanResponseBodyResultContent setTopErrorCode(QueryHasLocaloverviewTodayinspectmissionplanResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public QueryHasLocaloverviewTodayinspectmissionplanResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public QueryHasLocaloverviewTodayinspectmissionplanResponseBodyResultContent setTopErrorReason(QueryHasLocaloverviewTodayinspectmissionplanResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public QueryHasLocaloverviewTodayinspectmissionplanResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
