// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class ListScriptProfileTemplatesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListScriptProfileTemplatesResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>Instance af81a389-91f0-4157-8d82-720edd02b66a
     *  does not exist.</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <strong>example:</strong>
     * <p>E6E61E1A-D2DC-5ACF-AED4-A115B6691F98</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListScriptProfileTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListScriptProfileTemplatesResponseBody self = new ListScriptProfileTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListScriptProfileTemplatesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListScriptProfileTemplatesResponseBody setData(java.util.List<ListScriptProfileTemplatesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListScriptProfileTemplatesResponseBodyData> getData() {
        return this.data;
    }

    public ListScriptProfileTemplatesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListScriptProfileTemplatesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListScriptProfileTemplatesResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public ListScriptProfileTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListScriptProfileTemplatesResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1752829090000</p>
         */
        @NameInMap("CreatedTime")
        public Long createdTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("Schema")
        public String schema;

        /**
         * <strong>example:</strong>
         * <p>CCC_PROMPTS_DEFAULT</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <strong>example:</strong>
         * <p>1752829090000</p>
         */
        @NameInMap("UpdatedTime")
        public Long updatedTime;

        public static ListScriptProfileTemplatesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListScriptProfileTemplatesResponseBodyData self = new ListScriptProfileTemplatesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListScriptProfileTemplatesResponseBodyData setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public ListScriptProfileTemplatesResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListScriptProfileTemplatesResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListScriptProfileTemplatesResponseBodyData setSchema(String schema) {
            this.schema = schema;
            return this;
        }
        public String getSchema() {
            return this.schema;
        }

        public ListScriptProfileTemplatesResponseBodyData setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public ListScriptProfileTemplatesResponseBodyData setUpdatedTime(Long updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

    }

}
