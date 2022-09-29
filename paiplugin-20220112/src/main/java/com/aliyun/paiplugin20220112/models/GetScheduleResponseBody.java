// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class GetScheduleResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetScheduleResponseBodyData data;

    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    public static GetScheduleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetScheduleResponseBody self = new GetScheduleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetScheduleResponseBody setData(GetScheduleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetScheduleResponseBodyData getData() {
        return this.data;
    }

    public GetScheduleResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public GetScheduleResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetScheduleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetScheduleResponseBodyData extends TeaModel {
        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("EndTime")
        public Integer endTime;

        @NameInMap("ExecuteTime")
        public String executeTime;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("History")
        public String history;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("RepeatCycle")
        public Integer repeatCycle;

        @NameInMap("RepeatCycleUnit")
        public Integer repeatCycleUnit;

        @NameInMap("RepeatTimes")
        public Integer repeatTimes;

        @NameInMap("SignName")
        public String signName;

        @NameInMap("SignatureId")
        public String signatureId;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("TemplateCode")
        public String templateCode;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("UpdatedTime")
        public String updatedTime;

        public static GetScheduleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetScheduleResponseBodyData self = new GetScheduleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetScheduleResponseBodyData setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public GetScheduleResponseBodyData setEndTime(Integer endTime) {
            this.endTime = endTime;
            return this;
        }
        public Integer getEndTime() {
            return this.endTime;
        }

        public GetScheduleResponseBodyData setExecuteTime(String executeTime) {
            this.executeTime = executeTime;
            return this;
        }
        public String getExecuteTime() {
            return this.executeTime;
        }

        public GetScheduleResponseBodyData setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public GetScheduleResponseBodyData setHistory(String history) {
            this.history = history;
            return this;
        }
        public String getHistory() {
            return this.history;
        }

        public GetScheduleResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetScheduleResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetScheduleResponseBodyData setRepeatCycle(Integer repeatCycle) {
            this.repeatCycle = repeatCycle;
            return this;
        }
        public Integer getRepeatCycle() {
            return this.repeatCycle;
        }

        public GetScheduleResponseBodyData setRepeatCycleUnit(Integer repeatCycleUnit) {
            this.repeatCycleUnit = repeatCycleUnit;
            return this;
        }
        public Integer getRepeatCycleUnit() {
            return this.repeatCycleUnit;
        }

        public GetScheduleResponseBodyData setRepeatTimes(Integer repeatTimes) {
            this.repeatTimes = repeatTimes;
            return this;
        }
        public Integer getRepeatTimes() {
            return this.repeatTimes;
        }

        public GetScheduleResponseBodyData setSignName(String signName) {
            this.signName = signName;
            return this;
        }
        public String getSignName() {
            return this.signName;
        }

        public GetScheduleResponseBodyData setSignatureId(String signatureId) {
            this.signatureId = signatureId;
            return this;
        }
        public String getSignatureId() {
            return this.signatureId;
        }

        public GetScheduleResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetScheduleResponseBodyData setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

        public GetScheduleResponseBodyData setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public GetScheduleResponseBodyData setUpdatedTime(String updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public String getUpdatedTime() {
            return this.updatedTime;
        }

    }

}
