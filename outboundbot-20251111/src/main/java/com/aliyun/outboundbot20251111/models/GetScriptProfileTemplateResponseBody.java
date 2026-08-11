// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class GetScriptProfileTemplateResponseBody extends TeaModel {
    /**
     * <p>The return code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("Data")
    public GetScriptProfileTemplateResponseBodyData data;

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
     * <p>Instance does not exist. Instance=392db13c-8901-4a25-b566-91d0d8114cec</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The list of variable values in the error message.</p>
     */
    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FDAC7-13C5-1B64-A853-999DF105B9EF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetScriptProfileTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetScriptProfileTemplateResponseBody self = new GetScriptProfileTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetScriptProfileTemplateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetScriptProfileTemplateResponseBody setData(GetScriptProfileTemplateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetScriptProfileTemplateResponseBodyData getData() {
        return this.data;
    }

    public GetScriptProfileTemplateResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetScriptProfileTemplateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetScriptProfileTemplateResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public GetScriptProfileTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetScriptProfileTemplateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetScriptProfileTemplateResponseBodyData extends TeaModel {
        /**
         * <p>The creation time, in millisecond-level timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1735660800000</p>
         */
        @NameInMap("CreatedTime")
        public Long createdTime;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>As a survey specialist, sequentially ask about overall service satisfaction, service highlights, improvement suggestions, service efficiency, employee attitude, and willingness to choose again, and collect information</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The label definition.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;name\&quot;:\&quot;Overall Satisfaction\&quot;,\&quot;description\&quot;:\&quot;Collect evaluation information on overall satisfaction with the service\&quot;,\&quot;candidateValues\&quot;:[\&quot;Very Satisfied\&quot;,\&quot;Satisfied\&quot;,\&quot;Average\&quot;,\&quot;Dissatisfied\&quot;,\&quot;Very Dissatisfied\&quot;]},{\&quot;name\&quot;:\&quot;Service Highlights\&quot;,\&quot;description\&quot;:\&quot;Customer description of service highlights or satisfactory aspects\&quot;,\&quot;candidateValues\&quot;:[]},{\&quot;name\&quot;:\&quot;Improvement Suggestions\&quot;,\&quot;description\&quot;:\&quot;Customer description of improvement suggestions\&quot;,\&quot;candidateValues\&quot;:[]},{\&quot;name\&quot;:\&quot;Service Efficiency\&quot;,\&quot;description\&quot;:\&quot;Customer feedback on service response speed and timeliness of service completion\&quot;,\&quot;candidateValues\&quot;:[]},{\&quot;name\&quot;:\&quot;Employee Attitude\&quot;,\&quot;description\&quot;:\&quot;Customer evaluation of the professionalism and attitude of service personnel\&quot;,\&quot;candidateValues\&quot;:[]},{\&quot;name\&quot;:\&quot;Willingness to Choose Again\&quot;,\&quot;description\&quot;:\&quot;Whether the customer is willing to choose again\&quot;,\&quot;candidateValues\&quot;:[\&quot;Yes\&quot;,\&quot;No\&quot;]}]</p>
         */
        @NameInMap("Labels")
        public String labels;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>Service Satisfaction Survey</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The template details.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;name\&quot;:\&quot;Li Ming\&quot;,\&quot;gender\&quot;:\&quot;Male\&quot;}</p>
         */
        @NameInMap("Schema")
        public String schema;

        /**
         * <p>The template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b59</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>The update time, in millisecond-level timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1735660800000</p>
         */
        @NameInMap("UpdatedTime")
        public Long updatedTime;

        /**
         * <p>The variable definition.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;name\&quot;:\&quot;name\&quot;,\&quot;description\&quot;:\&quot;Customer name\&quot;},{\&quot;name\&quot;:\&quot;gender\&quot;,\&quot;description\&quot;:\&quot;Customer gender\&quot;}]</p>
         */
        @NameInMap("Variables")
        public String variables;

        public static GetScriptProfileTemplateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetScriptProfileTemplateResponseBodyData self = new GetScriptProfileTemplateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetScriptProfileTemplateResponseBodyData setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public GetScriptProfileTemplateResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetScriptProfileTemplateResponseBodyData setLabels(String labels) {
            this.labels = labels;
            return this;
        }
        public String getLabels() {
            return this.labels;
        }

        public GetScriptProfileTemplateResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetScriptProfileTemplateResponseBodyData setSchema(String schema) {
            this.schema = schema;
            return this;
        }
        public String getSchema() {
            return this.schema;
        }

        public GetScriptProfileTemplateResponseBodyData setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public GetScriptProfileTemplateResponseBodyData setUpdatedTime(Long updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

        public GetScriptProfileTemplateResponseBodyData setVariables(String variables) {
            this.variables = variables;
            return this;
        }
        public String getVariables() {
            return this.variables;
        }

    }

}
