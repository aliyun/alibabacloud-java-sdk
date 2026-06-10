// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListFlashSmsTemplatesResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListFlashSmsTemplatesResponseBodyData> data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>EC08CC41-6870-5594-939A-F758F057898F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call succeeded. A value of true indicates a successful call. A value of false indicates a failed call.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListFlashSmsTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFlashSmsTemplatesResponseBody self = new ListFlashSmsTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFlashSmsTemplatesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListFlashSmsTemplatesResponseBody setData(java.util.List<ListFlashSmsTemplatesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListFlashSmsTemplatesResponseBodyData> getData() {
        return this.data;
    }

    public ListFlashSmsTemplatesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListFlashSmsTemplatesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListFlashSmsTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFlashSmsTemplatesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListFlashSmsTemplatesResponseBodyData extends TeaModel {
        /**
         * <p>The content of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>您好，xxx来电。</p>
         */
        @NameInMap("TemplateContent")
        public String templateContent;

        /**
         * <p>The ID of the flash SMS template.</p>
         * 
         * <strong>example:</strong>
         * <p>17*******************01</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>The name of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>模板1</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        public static ListFlashSmsTemplatesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListFlashSmsTemplatesResponseBodyData self = new ListFlashSmsTemplatesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListFlashSmsTemplatesResponseBodyData setTemplateContent(String templateContent) {
            this.templateContent = templateContent;
            return this;
        }
        public String getTemplateContent() {
            return this.templateContent;
        }

        public ListFlashSmsTemplatesResponseBodyData setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public ListFlashSmsTemplatesResponseBodyData setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

    }

}
