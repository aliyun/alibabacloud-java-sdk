// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20210325.models;

import com.aliyun.tea.*;

public class CreateScheduleResponseBody extends TeaModel {
    // 返回数据
    @NameInMap("Data")
    public CreateScheduleResponseBodyData data;

    // 错误码
    @NameInMap("ErrorCode")
    public Integer errorCode;

    // 错误信息
    @NameInMap("ErrorMessage")
    public String errorMessage;

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

    public static class CreateScheduleResponseBodyData extends TeaModel {
        // 创建时间 (UTC+8)
        @NameInMap("CreatedTime")
        public String createdTime;

        // ID
        @NameInMap("ID")
        public String ID;

        // 发送计划名称
        @NameInMap("Name")
        public String name;

        // 发布时间 (UTC+8)
        @NameInMap("SendTime")
        public String sendTime;

        // 签名ID
        @NameInMap("SignatureID")
        public String signatureID;

        // 状态
        // - 0: 检查中
        // - 1: 检查成功
        // - 2: 检查失败
        // - 3: 发送中
        // - 4: 发送成功
        // - 5: 发送失败
        @NameInMap("Status")
        public Integer status;

        // 模板ID
        @NameInMap("TemplateID")
        public String templateID;

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

        public CreateScheduleResponseBodyData setID(String ID) {
            this.ID = ID;
            return this;
        }
        public String getID() {
            return this.ID;
        }

        public CreateScheduleResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateScheduleResponseBodyData setSendTime(String sendTime) {
            this.sendTime = sendTime;
            return this;
        }
        public String getSendTime() {
            return this.sendTime;
        }

        public CreateScheduleResponseBodyData setSignatureID(String signatureID) {
            this.signatureID = signatureID;
            return this;
        }
        public String getSignatureID() {
            return this.signatureID;
        }

        public CreateScheduleResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public CreateScheduleResponseBodyData setTemplateID(String templateID) {
            this.templateID = templateID;
            return this;
        }
        public String getTemplateID() {
            return this.templateID;
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
