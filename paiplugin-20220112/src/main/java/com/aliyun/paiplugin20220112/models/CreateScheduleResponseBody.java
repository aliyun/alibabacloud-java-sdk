// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class CreateScheduleResponseBody extends TeaModel {
    // 返回数据
    @NameInMap("Data")
    public CreateScheduleResponseBodyData data;

    // 错误码。
    @NameInMap("ErrorCode")
    public Integer errorCode;

    // 错误信息。
    @NameInMap("ErrorMessage")
    public String errorMessage;

    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    public static CreateScheduleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateScheduleResponseBody self = new CreateScheduleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateScheduleResponseBody setData(CreateScheduleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateScheduleResponseBodyData getData() {
        return this.data;
    }

    public CreateScheduleResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public CreateScheduleResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateScheduleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateScheduleResponseBodyData extends TeaModel {
        // 创建时间 (UTC+8)
        @NameInMap("CreatedTime")
        public String createdTime;

        // 终止时间（UTC+8），精确到分钟。
        @NameInMap("EndTime")
        public Integer endTime;

        // 执行时间 (UTC+8)，为空立即执行。
        @NameInMap("ExecuteTime")
        public String executeTime;

        // 人群Id。
        @NameInMap("GroupId")
        public String groupId;

        // Id
        @NameInMap("Id")
        public String id;

        // 发送计划名称。
        @NameInMap("Name")
        public String name;

        // 重复周期，按重复周期与重复周期单位执行。
        @NameInMap("RepeatCycle")
        public Integer repeatCycle;

        // 重复周期单位，若指定执行时间，则重复周期生效。
        // - 0: 从不（默认）
        // - 1: 小时
        // - 2: 天
        // - 3: 周
        // - 4: 月
        @NameInMap("RepeatCycleUnit")
        public Integer repeatCycleUnit;

        // 重复次数。
        // - -1: 不设终止时间
        // - 0: 不重复
        // - N: 重复N次后终止
        @NameInMap("RepeatTimes")
        public Integer repeatTimes;

        // 签名。
        @NameInMap("SignName")
        public String signName;

        // 签名Id，或指定签名。
        @NameInMap("SignatureId")
        public String signatureId;

        // 状态
        // - 0: 检查中
        // - 1: 检查成功
        // - 2: 检查失败
        // - 3: 发送中
        // - 4: 发送成功
        // - 5: 发送失败
        @NameInMap("Status")
        public Integer status;

        // 模板Code。
        @NameInMap("TemplateCode")
        public String templateCode;

        // 模板Id，或指定模板Code。
        @NameInMap("TemplateId")
        public String templateId;

        // 更新时间 (UTC+8)
        @NameInMap("UpdatedTime")
        public String updatedTime;

        public static CreateScheduleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateScheduleResponseBodyData self = new CreateScheduleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateScheduleResponseBodyData setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public CreateScheduleResponseBodyData setEndTime(Integer endTime) {
            this.endTime = endTime;
            return this;
        }
        public Integer getEndTime() {
            return this.endTime;
        }

        public CreateScheduleResponseBodyData setExecuteTime(String executeTime) {
            this.executeTime = executeTime;
            return this;
        }
        public String getExecuteTime() {
            return this.executeTime;
        }

        public CreateScheduleResponseBodyData setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public CreateScheduleResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateScheduleResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateScheduleResponseBodyData setRepeatCycle(Integer repeatCycle) {
            this.repeatCycle = repeatCycle;
            return this;
        }
        public Integer getRepeatCycle() {
            return this.repeatCycle;
        }

        public CreateScheduleResponseBodyData setRepeatCycleUnit(Integer repeatCycleUnit) {
            this.repeatCycleUnit = repeatCycleUnit;
            return this;
        }
        public Integer getRepeatCycleUnit() {
            return this.repeatCycleUnit;
        }

        public CreateScheduleResponseBodyData setRepeatTimes(Integer repeatTimes) {
            this.repeatTimes = repeatTimes;
            return this;
        }
        public Integer getRepeatTimes() {
            return this.repeatTimes;
        }

        public CreateScheduleResponseBodyData setSignName(String signName) {
            this.signName = signName;
            return this;
        }
        public String getSignName() {
            return this.signName;
        }

        public CreateScheduleResponseBodyData setSignatureId(String signatureId) {
            this.signatureId = signatureId;
            return this;
        }
        public String getSignatureId() {
            return this.signatureId;
        }

        public CreateScheduleResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public CreateScheduleResponseBodyData setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

        public CreateScheduleResponseBodyData setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public CreateScheduleResponseBodyData setUpdatedTime(String updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public String getUpdatedTime() {
            return this.updatedTime;
        }

    }

}
