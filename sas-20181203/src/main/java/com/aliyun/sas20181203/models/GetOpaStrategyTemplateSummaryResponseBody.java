// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetOpaStrategyTemplateSummaryResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetOpaStrategyTemplateSummaryResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetOpaStrategyTemplateSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOpaStrategyTemplateSummaryResponseBody self = new GetOpaStrategyTemplateSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOpaStrategyTemplateSummaryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetOpaStrategyTemplateSummaryResponseBody setData(java.util.List<GetOpaStrategyTemplateSummaryResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetOpaStrategyTemplateSummaryResponseBodyData> getData() {
        return this.data;
    }

    public GetOpaStrategyTemplateSummaryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetOpaStrategyTemplateSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOpaStrategyTemplateSummaryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetOpaStrategyTemplateSummaryResponseBodyData extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("Description")
        public String description;

        @NameInMap("TemplateId")
        public Long templateId;

        @NameInMap("TemplateName")
        public String templateName;

        public static GetOpaStrategyTemplateSummaryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOpaStrategyTemplateSummaryResponseBodyData self = new GetOpaStrategyTemplateSummaryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOpaStrategyTemplateSummaryResponseBodyData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public GetOpaStrategyTemplateSummaryResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetOpaStrategyTemplateSummaryResponseBodyData setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

        public GetOpaStrategyTemplateSummaryResponseBodyData setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

    }

}
