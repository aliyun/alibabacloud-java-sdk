// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasInspectMissionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public GetHasInspectMissionResponseBodyResultContent resultContent;

    public static GetHasInspectMissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHasInspectMissionResponseBody self = new GetHasInspectMissionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHasInspectMissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHasInspectMissionResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetHasInspectMissionResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetHasInspectMissionResponseBody setResultContent(GetHasInspectMissionResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public GetHasInspectMissionResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class GetHasInspectMissionResponseBodyResultContentData extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("UtcModified")
        public String utcModified;

        @NameInMap("Name")
        public String name;

        @NameInMap("Description")
        public String description;

        @NameInMap("MissionType")
        public String missionType;

        @NameInMap("MissionMark")
        public String missionMark;

        @NameInMap("ExecutableStatus")
        public String executableStatus;

        @NameInMap("CurrentExecFlag")
        public Long currentExecFlag;

        @NameInMap("DeleteStatus")
        public Long deleteStatus;

        @NameInMap("DeleteAt")
        public String deleteAt;

        @NameInMap("LastExecTime")
        public String lastExecTime;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("TenantId")
        public String tenantId;

        public static GetHasInspectMissionResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            GetHasInspectMissionResponseBodyResultContentData self = new GetHasInspectMissionResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public GetHasInspectMissionResponseBodyResultContentData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetHasInspectMissionResponseBodyResultContentData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public GetHasInspectMissionResponseBodyResultContentData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public GetHasInspectMissionResponseBodyResultContentData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetHasInspectMissionResponseBodyResultContentData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetHasInspectMissionResponseBodyResultContentData setMissionType(String missionType) {
            this.missionType = missionType;
            return this;
        }
        public String getMissionType() {
            return this.missionType;
        }

        public GetHasInspectMissionResponseBodyResultContentData setMissionMark(String missionMark) {
            this.missionMark = missionMark;
            return this;
        }
        public String getMissionMark() {
            return this.missionMark;
        }

        public GetHasInspectMissionResponseBodyResultContentData setExecutableStatus(String executableStatus) {
            this.executableStatus = executableStatus;
            return this;
        }
        public String getExecutableStatus() {
            return this.executableStatus;
        }

        public GetHasInspectMissionResponseBodyResultContentData setCurrentExecFlag(Long currentExecFlag) {
            this.currentExecFlag = currentExecFlag;
            return this;
        }
        public Long getCurrentExecFlag() {
            return this.currentExecFlag;
        }

        public GetHasInspectMissionResponseBodyResultContentData setDeleteStatus(Long deleteStatus) {
            this.deleteStatus = deleteStatus;
            return this;
        }
        public Long getDeleteStatus() {
            return this.deleteStatus;
        }

        public GetHasInspectMissionResponseBodyResultContentData setDeleteAt(String deleteAt) {
            this.deleteAt = deleteAt;
            return this;
        }
        public String getDeleteAt() {
            return this.deleteAt;
        }

        public GetHasInspectMissionResponseBodyResultContentData setLastExecTime(String lastExecTime) {
            this.lastExecTime = lastExecTime;
            return this;
        }
        public String getLastExecTime() {
            return this.lastExecTime;
        }

        public GetHasInspectMissionResponseBodyResultContentData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetHasInspectMissionResponseBodyResultContentData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

    public static class GetHasInspectMissionResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static GetHasInspectMissionResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            GetHasInspectMissionResponseBodyResultContentTopErrorCode self = new GetHasInspectMissionResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public GetHasInspectMissionResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public GetHasInspectMissionResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public GetHasInspectMissionResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public GetHasInspectMissionResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public GetHasInspectMissionResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public GetHasInspectMissionResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public GetHasInspectMissionResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetHasInspectMissionResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetHasInspectMissionResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static GetHasInspectMissionResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            GetHasInspectMissionResponseBodyResultContentTopErrorReason self = new GetHasInspectMissionResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public GetHasInspectMissionResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetHasInspectMissionResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class GetHasInspectMissionResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public GetHasInspectMissionResponseBodyResultContentData data;

        @NameInMap("TopErrorCode")
        public GetHasInspectMissionResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public GetHasInspectMissionResponseBodyResultContentTopErrorReason topErrorReason;

        public static GetHasInspectMissionResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            GetHasInspectMissionResponseBodyResultContent self = new GetHasInspectMissionResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public GetHasInspectMissionResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetHasInspectMissionResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetHasInspectMissionResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public GetHasInspectMissionResponseBodyResultContent setData(GetHasInspectMissionResponseBodyResultContentData data) {
            this.data = data;
            return this;
        }
        public GetHasInspectMissionResponseBodyResultContentData getData() {
            return this.data;
        }

        public GetHasInspectMissionResponseBodyResultContent setTopErrorCode(GetHasInspectMissionResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public GetHasInspectMissionResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public GetHasInspectMissionResponseBodyResultContent setTopErrorReason(GetHasInspectMissionResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public GetHasInspectMissionResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
