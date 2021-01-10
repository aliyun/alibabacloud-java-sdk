// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasInspectScheduleofmissionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultContent")
    public QueryHasInspectScheduleofmissionResponseBodyResultContent resultContent;

    public static QueryHasInspectScheduleofmissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHasInspectScheduleofmissionResponseBody self = new QueryHasInspectScheduleofmissionResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHasInspectScheduleofmissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHasInspectScheduleofmissionResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryHasInspectScheduleofmissionResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryHasInspectScheduleofmissionResponseBody setResultContent(QueryHasInspectScheduleofmissionResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryHasInspectScheduleofmissionResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public static class QueryHasInspectScheduleofmissionResponseBodyResultContentData extends TeaModel {
        @NameInMap("CronExpression")
        public String cronExpression;

        @NameInMap("MissionId")
        public String missionId;

        @NameInMap("CronType")
        public Long cronType;

        @NameInMap("CrontabSwitch")
        public Long crontabSwitch;

        @NameInMap("NextTime")
        public Long nextTime;

        @NameInMap("ExecTime")
        public Long execTime;

        @NameInMap("EffectBeginTime")
        public Long effectBeginTime;

        @NameInMap("EffectEndTime")
        public Long effectEndTime;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("Id")
        public String id;

        @NameInMap("UtcCreate")
        public Long utcCreate;

        @NameInMap("UtcModified")
        public Long utcModified;

        public static QueryHasInspectScheduleofmissionResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryHasInspectScheduleofmissionResponseBodyResultContentData self = new QueryHasInspectScheduleofmissionResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryHasInspectScheduleofmissionResponseBodyResultContentData setCronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }
        public String getCronExpression() {
            return this.cronExpression;
        }

        public QueryHasInspectScheduleofmissionResponseBodyResultContentData setMissionId(String missionId) {
            this.missionId = missionId;
            return this;
        }
        public String getMissionId() {
            return this.missionId;
        }

        public QueryHasInspectScheduleofmissionResponseBodyResultContentData setCronType(Long cronType) {
            this.cronType = cronType;
            return this;
        }
        public Long getCronType() {
            return this.cronType;
        }

        public QueryHasInspectScheduleofmissionResponseBodyResultContentData setCrontabSwitch(Long crontabSwitch) {
            this.crontabSwitch = crontabSwitch;
            return this;
        }
        public Long getCrontabSwitch() {
            return this.crontabSwitch;
        }

        public QueryHasInspectScheduleofmissionResponseBodyResultContentData setNextTime(Long nextTime) {
            this.nextTime = nextTime;
            return this;
        }
        public Long getNextTime() {
            return this.nextTime;
        }

        public QueryHasInspectScheduleofmissionResponseBodyResultContentData setExecTime(Long execTime) {
            this.execTime = execTime;
            return this;
        }
        public Long getExecTime() {
            return this.execTime;
        }

        public QueryHasInspectScheduleofmissionResponseBodyResultContentData setEffectBeginTime(Long effectBeginTime) {
            this.effectBeginTime = effectBeginTime;
            return this;
        }
        public Long getEffectBeginTime() {
            return this.effectBeginTime;
        }

        public QueryHasInspectScheduleofmissionResponseBodyResultContentData setEffectEndTime(Long effectEndTime) {
            this.effectEndTime = effectEndTime;
            return this;
        }
        public Long getEffectEndTime() {
            return this.effectEndTime;
        }

        public QueryHasInspectScheduleofmissionResponseBodyResultContentData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public QueryHasInspectScheduleofmissionResponseBodyResultContentData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public QueryHasInspectScheduleofmissionResponseBodyResultContentData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryHasInspectScheduleofmissionResponseBodyResultContentData setUtcCreate(Long utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public Long getUtcCreate() {
            return this.utcCreate;
        }

        public QueryHasInspectScheduleofmissionResponseBodyResultContentData setUtcModified(Long utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public Long getUtcModified() {
            return this.utcModified;
        }

    }

    public static class QueryHasInspectScheduleofmissionResponseBodyResultContentTopErrorCode extends TeaModel {
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

        public static QueryHasInspectScheduleofmissionResponseBodyResultContentTopErrorCode build(java.util.Map<String, ?> map) throws Exception {
            QueryHasInspectScheduleofmissionResponseBodyResultContentTopErrorCode self = new QueryHasInspectScheduleofmissionResponseBodyResultContentTopErrorCode();
            return TeaModel.build(map, self);
        }

        public QueryHasInspectScheduleofmissionResponseBodyResultContentTopErrorCode setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public QueryHasInspectScheduleofmissionResponseBodyResultContentTopErrorCode setExceptionCodeDescription(String exceptionCodeDescription) {
            this.exceptionCodeDescription = exceptionCodeDescription;
            return this;
        }
        public String getExceptionCodeDescription() {
            return this.exceptionCodeDescription;
        }

        public QueryHasInspectScheduleofmissionResponseBodyResultContentTopErrorCode setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryHasInspectScheduleofmissionResponseBodyResultContentTopErrorCode setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public QueryHasInspectScheduleofmissionResponseBodyResultContentTopErrorCode setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryHasInspectScheduleofmissionResponseBodyResultContentTopErrorCode setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public QueryHasInspectScheduleofmissionResponseBodyResultContentTopErrorCode setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryHasInspectScheduleofmissionResponseBodyResultContentTopErrorCode setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class QueryHasInspectScheduleofmissionResponseBodyResultContentTopErrorReason extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Content")
        public String content;

        public static QueryHasInspectScheduleofmissionResponseBodyResultContentTopErrorReason build(java.util.Map<String, ?> map) throws Exception {
            QueryHasInspectScheduleofmissionResponseBodyResultContentTopErrorReason self = new QueryHasInspectScheduleofmissionResponseBodyResultContentTopErrorReason();
            return TeaModel.build(map, self);
        }

        public QueryHasInspectScheduleofmissionResponseBodyResultContentTopErrorReason setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasInspectScheduleofmissionResponseBodyResultContentTopErrorReason setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class QueryHasInspectScheduleofmissionResponseBodyResultContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public java.util.List<QueryHasInspectScheduleofmissionResponseBodyResultContentData> data;

        @NameInMap("TopErrorCode")
        public QueryHasInspectScheduleofmissionResponseBodyResultContentTopErrorCode topErrorCode;

        @NameInMap("TopErrorReason")
        public QueryHasInspectScheduleofmissionResponseBodyResultContentTopErrorReason topErrorReason;

        public static QueryHasInspectScheduleofmissionResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryHasInspectScheduleofmissionResponseBodyResultContent self = new QueryHasInspectScheduleofmissionResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryHasInspectScheduleofmissionResponseBodyResultContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryHasInspectScheduleofmissionResponseBodyResultContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryHasInspectScheduleofmissionResponseBodyResultContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryHasInspectScheduleofmissionResponseBodyResultContent setData(java.util.List<QueryHasInspectScheduleofmissionResponseBodyResultContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryHasInspectScheduleofmissionResponseBodyResultContentData> getData() {
            return this.data;
        }

        public QueryHasInspectScheduleofmissionResponseBodyResultContent setTopErrorCode(QueryHasInspectScheduleofmissionResponseBodyResultContentTopErrorCode topErrorCode) {
            this.topErrorCode = topErrorCode;
            return this;
        }
        public QueryHasInspectScheduleofmissionResponseBodyResultContentTopErrorCode getTopErrorCode() {
            return this.topErrorCode;
        }

        public QueryHasInspectScheduleofmissionResponseBodyResultContent setTopErrorReason(QueryHasInspectScheduleofmissionResponseBodyResultContentTopErrorReason topErrorReason) {
            this.topErrorReason = topErrorReason;
            return this;
        }
        public QueryHasInspectScheduleofmissionResponseBodyResultContentTopErrorReason getTopErrorReason() {
            return this.topErrorReason;
        }

    }

}
