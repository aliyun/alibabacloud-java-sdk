// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasConfigSyncstatusfortenantResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public QueryHasConfigSyncstatusfortenantResponseBodyResultContent resultContent;

    public static QueryHasConfigSyncstatusfortenantResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHasConfigSyncstatusfortenantResponseBody self = new QueryHasConfigSyncstatusfortenantResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHasConfigSyncstatusfortenantResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHasConfigSyncstatusfortenantResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHasConfigSyncstatusfortenantResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryHasConfigSyncstatusfortenantResponseBody setResultContent(QueryHasConfigSyncstatusfortenantResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryHasConfigSyncstatusfortenantResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class QueryHasConfigSyncstatusfortenantResponseBodyResultContentData extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("UtcModified")
        public String utcModified;

        @NameInMap("SyncType")
        public String syncType;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("LastSuccess")
        public String lastSuccess;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("SyncStatus")
        public String syncStatus;

        @NameInMap("SyncIp")
        public String syncIp;

        @NameInMap("ErrorMsg")
        public String errorMsg;

        public static QueryHasConfigSyncstatusfortenantResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryHasConfigSyncstatusfortenantResponseBodyResultContentData self = new QueryHasConfigSyncstatusfortenantResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryHasConfigSyncstatusfortenantResponseBodyResultContentData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryHasConfigSyncstatusfortenantResponseBodyResultContentData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryHasConfigSyncstatusfortenantResponseBodyResultContentData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public QueryHasConfigSyncstatusfortenantResponseBodyResultContentData setSyncType(String syncType) {
            this.syncType = syncType;
            return this;
        }
        public String getSyncType() {
            return this.syncType;
        }

        public QueryHasConfigSyncstatusfortenantResponseBodyResultContentData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryHasConfigSyncstatusfortenantResponseBodyResultContentData setLastSuccess(String lastSuccess) {
            this.lastSuccess = lastSuccess;
            return this;
        }
        public String getLastSuccess() {
            return this.lastSuccess;
        }

        public QueryHasConfigSyncstatusfortenantResponseBodyResultContentData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public QueryHasConfigSyncstatusfortenantResponseBodyResultContentData setSyncStatus(String syncStatus) {
            this.syncStatus = syncStatus;
            return this;
        }
        public String getSyncStatus() {
            return this.syncStatus;
        }

        public QueryHasConfigSyncstatusfortenantResponseBodyResultContentData setSyncIp(String syncIp) {
            this.syncIp = syncIp;
            return this;
        }
        public String getSyncIp() {
            return this.syncIp;
        }

        public QueryHasConfigSyncstatusfortenantResponseBodyResultContentData setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

    }

    public static class QueryHasConfigSyncstatusfortenantResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static QueryHasConfigSyncstatusfortenantResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            QueryHasConfigSyncstatusfortenantResponseBodyResultContentTopErrorCode self = new QueryHasConfigSyncstatusfortenantResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public QueryHasConfigSyncstatusfortenantResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public QueryHasConfigSyncstatusfortenantResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public QueryHasConfigSyncstatusfortenantResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryHasConfigSyncstatusfortenantResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public QueryHasConfigSyncstatusfortenantResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryHasConfigSyncstatusfortenantResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public QueryHasConfigSyncstatusfortenantResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasConfigSyncstatusfortenantResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryHasConfigSyncstatusfortenantResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static QueryHasConfigSyncstatusfortenantResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            QueryHasConfigSyncstatusfortenantResponseBodyResultContentTopErrorReason self = new QueryHasConfigSyncstatusfortenantResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public QueryHasConfigSyncstatusfortenantResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasConfigSyncstatusfortenantResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class QueryHasConfigSyncstatusfortenantResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public QueryHasConfigSyncstatusfortenantResponseBodyResultContentData data;

        @NameInMap("TopErrorCode")
        public QueryHasConfigSyncstatusfortenantResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public QueryHasConfigSyncstatusfortenantResponseBodyResultContentTopErrorReason topErrorReason;

        public static QueryHasConfigSyncstatusfortenantResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryHasConfigSyncstatusfortenantResponseBodyResultContent self = new QueryHasConfigSyncstatusfortenantResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryHasConfigSyncstatusfortenantResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasConfigSyncstatusfortenantResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryHasConfigSyncstatusfortenantResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryHasConfigSyncstatusfortenantResponseBodyResultContent setData(QueryHasConfigSyncstatusfortenantResponseBodyResultContentData data) {
            this.data = data;
            return this;
        }
        public QueryHasConfigSyncstatusfortenantResponseBodyResultContentData getData() {
            return this.data;
        }

        public QueryHasConfigSyncstatusfortenantResponseBodyResultContent setTopErrorCode(QueryHasConfigSyncstatusfortenantResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public QueryHasConfigSyncstatusfortenantResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public QueryHasConfigSyncstatusfortenantResponseBodyResultContent setTopErrorReason(QueryHasConfigSyncstatusfortenantResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public QueryHasConfigSyncstatusfortenantResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
