// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasConfigSyncstatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public GetHasConfigSyncstatusResponseBodyResultContent resultContent;

    public static GetHasConfigSyncstatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHasConfigSyncstatusResponseBody self = new GetHasConfigSyncstatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHasConfigSyncstatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHasConfigSyncstatusResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetHasConfigSyncstatusResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetHasConfigSyncstatusResponseBody setResultContent(GetHasConfigSyncstatusResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public GetHasConfigSyncstatusResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class GetHasConfigSyncstatusResponseBodyResultContentData extends TeaModel {
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

        public static GetHasConfigSyncstatusResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            GetHasConfigSyncstatusResponseBodyResultContentData self = new GetHasConfigSyncstatusResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public GetHasConfigSyncstatusResponseBodyResultContentData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetHasConfigSyncstatusResponseBodyResultContentData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public GetHasConfigSyncstatusResponseBodyResultContentData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public GetHasConfigSyncstatusResponseBodyResultContentData setSyncType(String syncType) {
            this.syncType = syncType;
            return this;
        }
        public String getSyncType() {
            return this.syncType;
        }

        public GetHasConfigSyncstatusResponseBodyResultContentData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetHasConfigSyncstatusResponseBodyResultContentData setLastSuccess(String lastSuccess) {
            this.lastSuccess = lastSuccess;
            return this;
        }
        public String getLastSuccess() {
            return this.lastSuccess;
        }

        public GetHasConfigSyncstatusResponseBodyResultContentData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetHasConfigSyncstatusResponseBodyResultContentData setSyncStatus(String syncStatus) {
            this.syncStatus = syncStatus;
            return this;
        }
        public String getSyncStatus() {
            return this.syncStatus;
        }

        public GetHasConfigSyncstatusResponseBodyResultContentData setSyncIp(String syncIp) {
            this.syncIp = syncIp;
            return this;
        }
        public String getSyncIp() {
            return this.syncIp;
        }

        public GetHasConfigSyncstatusResponseBodyResultContentData setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

    }

    public static class GetHasConfigSyncstatusResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static GetHasConfigSyncstatusResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            GetHasConfigSyncstatusResponseBodyResultContentTopErrorCode self = new GetHasConfigSyncstatusResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public GetHasConfigSyncstatusResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public GetHasConfigSyncstatusResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public GetHasConfigSyncstatusResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public GetHasConfigSyncstatusResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public GetHasConfigSyncstatusResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public GetHasConfigSyncstatusResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public GetHasConfigSyncstatusResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetHasConfigSyncstatusResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetHasConfigSyncstatusResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static GetHasConfigSyncstatusResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            GetHasConfigSyncstatusResponseBodyResultContentTopErrorReason self = new GetHasConfigSyncstatusResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public GetHasConfigSyncstatusResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetHasConfigSyncstatusResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class GetHasConfigSyncstatusResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public GetHasConfigSyncstatusResponseBodyResultContentData data;

        @NameInMap("TopErrorCode")
        public GetHasConfigSyncstatusResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public GetHasConfigSyncstatusResponseBodyResultContentTopErrorReason topErrorReason;

        public static GetHasConfigSyncstatusResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            GetHasConfigSyncstatusResponseBodyResultContent self = new GetHasConfigSyncstatusResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public GetHasConfigSyncstatusResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetHasConfigSyncstatusResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetHasConfigSyncstatusResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public GetHasConfigSyncstatusResponseBodyResultContent setData(GetHasConfigSyncstatusResponseBodyResultContentData data) {
            this.data = data;
            return this;
        }
        public GetHasConfigSyncstatusResponseBodyResultContentData getData() {
            return this.data;
        }

        public GetHasConfigSyncstatusResponseBodyResultContent setTopErrorCode(GetHasConfigSyncstatusResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public GetHasConfigSyncstatusResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public GetHasConfigSyncstatusResponseBodyResultContent setTopErrorReason(GetHasConfigSyncstatusResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public GetHasConfigSyncstatusResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
