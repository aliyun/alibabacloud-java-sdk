// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class ListScriptProfileTemplatesResponseBody extends TeaModel {
    /**
     * <p>返回码</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>返回数据</p>
     */
    @NameInMap("Data")
    public java.util.List<ListScriptProfileTemplatesResponseBodyData> data;

    /**
     * <p>HTTP状态码</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>错误信息</p>
     * 
     * <strong>example:</strong>
     * <p>Instance does not exist. Instance=ob-9876543210.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>错误信息中的变量值列表</p>
     */
    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <p>请求ID</p>
     * 
     * <strong>example:</strong>
     * <p>019FDAC7-13C5-1B64-A853-999DF105B9EF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>是否调用成功</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

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

    public ListScriptProfileTemplatesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListScriptProfileTemplatesResponseBodyData extends TeaModel {
        /**
         * <p>创建时间，毫秒级时间戳</p>
         * 
         * <strong>example:</strong>
         * <p>1735660800000</p>
         */
        @NameInMap("CreatedTime")
        public Long createdTime;

        /**
         * <p>描述</p>
         * 
         * <strong>example:</strong>
         * <p>作为调研专员，对服务总体满意度、服务亮点、改进建议、服务效率、员工态度、再次选择意愿进行依次询问，并采集信息。</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>标签定义</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;name\&quot;:\&quot;总体满意度\&quot;,\&quot;description\&quot;:\&quot;收集对服务的整体满意度的评价信息\&quot;,\&quot;candidateValues\&quot;:[\&quot;非常满意\&quot;,\&quot;满意\&quot;,\&quot;一般\&quot;,\&quot;不满意\&quot;,\&quot;非常不满意\&quot;]},{\&quot;name\&quot;:\&quot;服务亮点\&quot;,\&quot;description\&quot;:\&quot;客户对于服务亮点或者满意的地方的描述\&quot;,\&quot;candidateValues\&quot;:[]},{\&quot;name\&quot;:\&quot;改进建议\&quot;,\&quot;description\&quot;:\&quot;客户对于改进意见的描述\&quot;,\&quot;candidateValues\&quot;:[]},{\&quot;name\&quot;:\&quot;服务效率\&quot;,\&quot;description\&quot;:\&quot;客户对于服务响应速度和服务完成的时效性的反馈\&quot;,\&quot;candidateValues\&quot;:[]},{\&quot;name\&quot;:\&quot;员工态度\&quot;,\&quot;description\&quot;:\&quot;客户对于对于服务人员的专业度和态度的评价\&quot;,\&quot;candidateValues\&quot;:[]},{\&quot;name\&quot;:\&quot;再次选择意愿\&quot;,\&quot;description\&quot;:\&quot;客户是否愿意再次选择\&quot;,\&quot;candidateValues\&quot;:[\&quot;是\&quot;,\&quot;否\&quot;]}]</p>
         */
        @NameInMap("Labels")
        public String labels;

        /**
         * <p>名称</p>
         * 
         * <strong>example:</strong>
         * <p>服务满意度调研</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>schema定义</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;name\&quot;:\&quot;李明\&quot;,\&quot;gender\&quot;:\&quot;男\&quot;}</p>
         */
        @NameInMap("Schema")
        public String schema;

        /**
         * <p>模板ID</p>
         * 
         * <strong>example:</strong>
         * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b04</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>更新时间，毫秒级时间戳</p>
         * 
         * <strong>example:</strong>
         * <p>1735660800000</p>
         */
        @NameInMap("UpdatedTime")
        public Long updatedTime;

        /**
         * <p>变量定义</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;name\&quot;:\&quot;name\&quot;,\&quot;description\&quot;:\&quot;客户姓名\&quot;},{\&quot;name\&quot;:\&quot;gender\&quot;,\&quot;description\&quot;:\&quot;客户性别\&quot;}]</p>
         */
        @NameInMap("Variables")
        public String variables;

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

        public ListScriptProfileTemplatesResponseBodyData setLabels(String labels) {
            this.labels = labels;
            return this;
        }
        public String getLabels() {
            return this.labels;
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

        public ListScriptProfileTemplatesResponseBodyData setVariables(String variables) {
            this.variables = variables;
            return this;
        }
        public String getVariables() {
            return this.variables;
        }

    }

}
