// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class ListScriptProfileTemplatesResponseBody extends TeaModel {
    /**
     * <p>The internal error code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The list of scenario templates.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListScriptProfileTemplatesResponseBodyData> data;

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
     * <p>Instance af81a389-91f0-4157-8d82-720edd02b66a
     *  does not exist.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The list of error parameters.</p>
     */
    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <p>The request ID.</p>
     * 
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
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1752829090000</p>
         */
        @NameInMap("CreatedTime")
        public Long createdTime;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>Build professional conversational prompt engineering from a blank document</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The template name.</p>
         * 
         * <strong>example:</strong>
         * <p>General scenario</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The template definition.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;name&quot;: &quot;General&quot;,
         *   &quot;properties&quot;: {
         *     &quot;prompts&quot;: {
         *       &quot;displayName&quot;: &quot;Instruction information&quot;,
         *       &quot;dataType&quot;: &quot;TEXT&quot;,
         *       &quot;name&quot;: &quot;prompts&quot;,
         *       &quot;displayOrder&quot;: 1,
         *       &quot;defaultValue&quot;: &quot;You are a friendly and approachable chat assistant, focusing on natural Chinese conversations. Stay positive and patient, provide helpful responses, and avoid sensitive content. Honestly admit when you do not know the answer to create a relaxed and pleasant communication experience.&quot;,
         *       &quot;attributes&quot;: {
         *         &quot;placeholder&quot;: &quot;You are a friendly and approachable chat assistant, focusing on natural Chinese conversations. Stay positive and patient, provide helpful responses, and avoid sensitive content. Honestly admit when you do not know the answer to create a relaxed and pleasant communication experience.&quot;,
         *         &quot;rows&quot;: 20
         *       },
         *       &quot;editorType&quot;: &quot;MENTIONS_TEXTAREA&quot;,
         *       &quot;maxLength&quot;: 2000,
         *       &quot;required&quot;: true,
         *       &quot;group&quot;: &quot;Business description&quot;
         *     }
         *   }
         * }</p>
         */
        @NameInMap("Schema")
        public String schema;

        /**
         * <p>The template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CCC_PROMPTS_DEFAULT</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>The update time.</p>
         * 
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
