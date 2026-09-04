// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.notifications20241225.models;

import com.aliyun.tea.*;

public class ReadWebhookContactSendTemplateListResponseBody extends TeaModel {
    /**
     * <p>The business status code.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Data")
    public java.util.List<ReadWebhookContactSendTemplateListResponseBodyData> data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>2xx</p>
     */
    @NameInMap("HttpCode")
    public Integer httpCode;

    /**
     * <p>The business message.</p>
     * 
     * <strong>example:</strong>
     * <p>Succeeded</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A5F62766-1C2F-1F56-A39D-63E3D30F0633</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ReadWebhookContactSendTemplateListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReadWebhookContactSendTemplateListResponseBody self = new ReadWebhookContactSendTemplateListResponseBody();
        return TeaModel.build(map, self);
    }

    public ReadWebhookContactSendTemplateListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ReadWebhookContactSendTemplateListResponseBody setData(java.util.List<ReadWebhookContactSendTemplateListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ReadWebhookContactSendTemplateListResponseBodyData> getData() {
        return this.data;
    }

    public ReadWebhookContactSendTemplateListResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public ReadWebhookContactSendTemplateListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ReadWebhookContactSendTemplateListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReadWebhookContactSendTemplateListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ReadWebhookContactSendTemplateListResponseBodyData extends TeaModel {
        /**
         * <p>The template code.</p>
         * 
         * <strong>example:</strong>
         * <p>lark</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The template.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("Template")
        public Object template;

        public static ReadWebhookContactSendTemplateListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ReadWebhookContactSendTemplateListResponseBodyData self = new ReadWebhookContactSendTemplateListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ReadWebhookContactSendTemplateListResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ReadWebhookContactSendTemplateListResponseBodyData setTemplate(Object template) {
            this.template = template;
            return this;
        }
        public Object getTemplate() {
            return this.template;
        }

    }

}
