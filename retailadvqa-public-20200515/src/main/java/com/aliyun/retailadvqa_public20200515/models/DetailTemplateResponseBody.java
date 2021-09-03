// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class DetailTemplateResponseBody extends TeaModel {
    // 结果
    @NameInMap("Data")
    public DetailTemplateResponseBodyData data;

    // 错误码
    @NameInMap("ErrorCode")
    public String errorCode;

    // 错误描述
    @NameInMap("ErrorDesc")
    public String errorDesc;

    // 接口调用状态
    @NameInMap("Success")
    public Boolean success;

    // traceId
    @NameInMap("TraceId")
    public String traceId;

    // exStack
    @NameInMap("ExStack")
    public String exStack;

    @NameInMap("RequestId")
    public String requestId;

    public static DetailTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetailTemplateResponseBody self = new DetailTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public DetailTemplateResponseBody setData(DetailTemplateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DetailTemplateResponseBodyData getData() {
        return this.data;
    }

    public DetailTemplateResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DetailTemplateResponseBody setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
        return this;
    }
    public String getErrorDesc() {
        return this.errorDesc;
    }

    public DetailTemplateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DetailTemplateResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public DetailTemplateResponseBody setExStack(String exStack) {
        this.exStack = exStack;
        return this;
    }
    public String getExStack() {
        return this.exStack;
    }

    public DetailTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DetailTemplateResponseBodyData extends TeaModel {
        // 主键
        @NameInMap("Id")
        public String id;

        // 模板状态
        @NameInMap("TemplateStatus")
        public Long templateStatus;

        // 模板类型
        @NameInMap("TemplateType")
        public Long templateType;

        // 模板申请信息
        @NameInMap("Reason")
        public String reason;

        // 模板code
        @NameInMap("SmsTemplateCode")
        public String smsTemplateCode;

        // 模板名称
        @NameInMap("TemplateName")
        public String templateName;

        // 模板内容
        @NameInMap("TemplateContent")
        public String templateContent;

        // 模板内容后缀
        @NameInMap("SmsContentSuffix")
        public String smsContentSuffix;

        // 模板申请说明
        @NameInMap("Remark")
        public String remark;

        // 是否为变量模板
        @NameInMap("IsVariable")
        public Long isVariable;

        // 平台ID
        @NameInMap("PlatformId")
        public String platformId;

        public static DetailTemplateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DetailTemplateResponseBodyData self = new DetailTemplateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DetailTemplateResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DetailTemplateResponseBodyData setTemplateStatus(Long templateStatus) {
            this.templateStatus = templateStatus;
            return this;
        }
        public Long getTemplateStatus() {
            return this.templateStatus;
        }

        public DetailTemplateResponseBodyData setTemplateType(Long templateType) {
            this.templateType = templateType;
            return this;
        }
        public Long getTemplateType() {
            return this.templateType;
        }

        public DetailTemplateResponseBodyData setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DetailTemplateResponseBodyData setSmsTemplateCode(String smsTemplateCode) {
            this.smsTemplateCode = smsTemplateCode;
            return this;
        }
        public String getSmsTemplateCode() {
            return this.smsTemplateCode;
        }

        public DetailTemplateResponseBodyData setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public DetailTemplateResponseBodyData setTemplateContent(String templateContent) {
            this.templateContent = templateContent;
            return this;
        }
        public String getTemplateContent() {
            return this.templateContent;
        }

        public DetailTemplateResponseBodyData setSmsContentSuffix(String smsContentSuffix) {
            this.smsContentSuffix = smsContentSuffix;
            return this;
        }
        public String getSmsContentSuffix() {
            return this.smsContentSuffix;
        }

        public DetailTemplateResponseBodyData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DetailTemplateResponseBodyData setIsVariable(Long isVariable) {
            this.isVariable = isVariable;
            return this;
        }
        public Long getIsVariable() {
            return this.isVariable;
        }

        public DetailTemplateResponseBodyData setPlatformId(String platformId) {
            this.platformId = platformId;
            return this;
        }
        public String getPlatformId() {
            return this.platformId;
        }

    }

}
