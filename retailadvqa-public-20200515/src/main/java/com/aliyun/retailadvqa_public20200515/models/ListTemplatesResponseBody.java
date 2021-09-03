// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class ListTemplatesResponseBody extends TeaModel {
    // 结果数据，具体看接口文档
    @NameInMap("Data")
    public ListTemplatesResponseBodyData data;

    // 错误信息描述
    @NameInMap("ErrorDesc")
    public String errorDesc;

    // 错误码
    @NameInMap("ErrorCode")
    public String errorCode;

    // 接口调用是否成功
    @NameInMap("Success")
    public Boolean success;

    // traceId
    @NameInMap("TraceId")
    public String traceId;

    @NameInMap("RequestId")
    public String requestId;

    public static ListTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTemplatesResponseBody self = new ListTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTemplatesResponseBody setData(ListTemplatesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListTemplatesResponseBodyData getData() {
        return this.data;
    }

    public ListTemplatesResponseBody setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
        return this;
    }
    public String getErrorDesc() {
        return this.errorDesc;
    }

    public ListTemplatesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListTemplatesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListTemplatesResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public ListTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListTemplatesResponseBodyDataContent extends TeaModel {
        // 主键
        @NameInMap("Id")
        public String id;

        // 模板类型
        @NameInMap("TemplateType")
        public Long templateType;

        // 模板状态
        @NameInMap("TemplateStatus")
        public Long templateStatus;

        // 模板code
        @NameInMap("SmsTemplateCode")
        public String smsTemplateCode;

        // 模板名称
        @NameInMap("TemplateName")
        public String templateName;

        // 模板内容
        @NameInMap("TemplateContent")
        public String templateContent;

        // 模板前缀
        @NameInMap("SmsContentSuffix")
        public String smsContentSuffix;

        // 平台名称
        @NameInMap("PlatformName")
        public String platformName;

        // 平台ID
        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static ListTemplatesResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            ListTemplatesResponseBodyDataContent self = new ListTemplatesResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public ListTemplatesResponseBodyDataContent setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListTemplatesResponseBodyDataContent setTemplateType(Long templateType) {
            this.templateType = templateType;
            return this;
        }
        public Long getTemplateType() {
            return this.templateType;
        }

        public ListTemplatesResponseBodyDataContent setTemplateStatus(Long templateStatus) {
            this.templateStatus = templateStatus;
            return this;
        }
        public Long getTemplateStatus() {
            return this.templateStatus;
        }

        public ListTemplatesResponseBodyDataContent setSmsTemplateCode(String smsTemplateCode) {
            this.smsTemplateCode = smsTemplateCode;
            return this;
        }
        public String getSmsTemplateCode() {
            return this.smsTemplateCode;
        }

        public ListTemplatesResponseBodyDataContent setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public ListTemplatesResponseBodyDataContent setTemplateContent(String templateContent) {
            this.templateContent = templateContent;
            return this;
        }
        public String getTemplateContent() {
            return this.templateContent;
        }

        public ListTemplatesResponseBodyDataContent setSmsContentSuffix(String smsContentSuffix) {
            this.smsContentSuffix = smsContentSuffix;
            return this;
        }
        public String getSmsContentSuffix() {
            return this.smsContentSuffix;
        }

        public ListTemplatesResponseBodyDataContent setPlatformName(String platformName) {
            this.platformName = platformName;
            return this;
        }
        public String getPlatformName() {
            return this.platformName;
        }

        public ListTemplatesResponseBodyDataContent setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

    public static class ListTemplatesResponseBodyData extends TeaModel {
        @NameInMap("Content")
        public java.util.List<ListTemplatesResponseBodyDataContent> content;

        // 总条数
        @NameInMap("TotalNum")
        public Long totalNum;

        // 页大小
        @NameInMap("PageSize")
        public Long pageSize;

        // 页码
        @NameInMap("PageNum")
        public Long pageNum;

        public static ListTemplatesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTemplatesResponseBodyData self = new ListTemplatesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTemplatesResponseBodyData setContent(java.util.List<ListTemplatesResponseBodyDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<ListTemplatesResponseBodyDataContent> getContent() {
            return this.content;
        }

        public ListTemplatesResponseBodyData setTotalNum(Long totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Long getTotalNum() {
            return this.totalNum;
        }

        public ListTemplatesResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListTemplatesResponseBodyData setPageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Long getPageNum() {
            return this.pageNum;
        }

    }

}
