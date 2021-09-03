// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class ListDigitalTemplatesResponseBody extends TeaModel {
    // 结果数据
    @NameInMap("Data")
    public ListDigitalTemplatesResponseBodyData data;

    // 错误码
    @NameInMap("ErrorCode")
    public String errorCode;

    // 错误信息描述
    @NameInMap("ErrorDesc")
    public String errorDesc;

    // 接口调用状态
    @NameInMap("Success")
    public Boolean success;

    // traceId
    @NameInMap("TraceId")
    public String traceId;

    @NameInMap("RequestId")
    public String requestId;

    public static ListDigitalTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDigitalTemplatesResponseBody self = new ListDigitalTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDigitalTemplatesResponseBody setData(ListDigitalTemplatesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDigitalTemplatesResponseBodyData getData() {
        return this.data;
    }

    public ListDigitalTemplatesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListDigitalTemplatesResponseBody setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
        return this;
    }
    public String getErrorDesc() {
        return this.errorDesc;
    }

    public ListDigitalTemplatesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListDigitalTemplatesResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public ListDigitalTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDigitalTemplatesResponseBodyDataContent extends TeaModel {
        // 主键
        @NameInMap("Id")
        public String id;

        // 模板名称
        @NameInMap("TemplateName")
        public String templateName;

        // 模板主题
        @NameInMap("TemplateTheme")
        public String templateTheme;

        // 模板编号
        @NameInMap("SmsTemplateCode")
        public String smsTemplateCode;

        // 模板状态
        @NameInMap("TemplateStatus")
        public Long templateStatus;

        // 平台名称
        @NameInMap("PlatformName")
        public String platformName;

        // 平台ID
        @NameInMap("PlatformId")
        public String platformId;

        // 审核信息
        @NameInMap("Reason")
        public String reason;

        // 签名
        @NameInMap("Sign")
        public String sign;

        // 支持运营商
        @NameInMap("SupportProvider")
        public String supportProvider;

        public static ListDigitalTemplatesResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            ListDigitalTemplatesResponseBodyDataContent self = new ListDigitalTemplatesResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public ListDigitalTemplatesResponseBodyDataContent setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListDigitalTemplatesResponseBodyDataContent setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public ListDigitalTemplatesResponseBodyDataContent setTemplateTheme(String templateTheme) {
            this.templateTheme = templateTheme;
            return this;
        }
        public String getTemplateTheme() {
            return this.templateTheme;
        }

        public ListDigitalTemplatesResponseBodyDataContent setSmsTemplateCode(String smsTemplateCode) {
            this.smsTemplateCode = smsTemplateCode;
            return this;
        }
        public String getSmsTemplateCode() {
            return this.smsTemplateCode;
        }

        public ListDigitalTemplatesResponseBodyDataContent setTemplateStatus(Long templateStatus) {
            this.templateStatus = templateStatus;
            return this;
        }
        public Long getTemplateStatus() {
            return this.templateStatus;
        }

        public ListDigitalTemplatesResponseBodyDataContent setPlatformName(String platformName) {
            this.platformName = platformName;
            return this;
        }
        public String getPlatformName() {
            return this.platformName;
        }

        public ListDigitalTemplatesResponseBodyDataContent setPlatformId(String platformId) {
            this.platformId = platformId;
            return this;
        }
        public String getPlatformId() {
            return this.platformId;
        }

        public ListDigitalTemplatesResponseBodyDataContent setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public ListDigitalTemplatesResponseBodyDataContent setSign(String sign) {
            this.sign = sign;
            return this;
        }
        public String getSign() {
            return this.sign;
        }

        public ListDigitalTemplatesResponseBodyDataContent setSupportProvider(String supportProvider) {
            this.supportProvider = supportProvider;
            return this;
        }
        public String getSupportProvider() {
            return this.supportProvider;
        }

    }

    public static class ListDigitalTemplatesResponseBodyData extends TeaModel {
        @NameInMap("Content")
        public java.util.List<ListDigitalTemplatesResponseBodyDataContent> content;

        // 总数量
        @NameInMap("TotalNum")
        public Long totalNum;

        // 页大小
        @NameInMap("PageSize")
        public Long pageSize;

        // 页码
        @NameInMap("PageNum")
        public Long pageNum;

        public static ListDigitalTemplatesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDigitalTemplatesResponseBodyData self = new ListDigitalTemplatesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDigitalTemplatesResponseBodyData setContent(java.util.List<ListDigitalTemplatesResponseBodyDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<ListDigitalTemplatesResponseBodyDataContent> getContent() {
            return this.content;
        }

        public ListDigitalTemplatesResponseBodyData setTotalNum(Long totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Long getTotalNum() {
            return this.totalNum;
        }

        public ListDigitalTemplatesResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListDigitalTemplatesResponseBodyData setPageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Long getPageNum() {
            return this.pageNum;
        }

    }

}
