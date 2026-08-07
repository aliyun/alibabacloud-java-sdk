// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class ListScriptsByFlowResponseBody extends TeaModel {
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
    public java.util.List<ListScriptsByFlowResponseBodyData> data;

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
     * <p>Instance does not exist. Instance=ob-1234567890</p>
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

    public static ListScriptsByFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListScriptsByFlowResponseBody self = new ListScriptsByFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public ListScriptsByFlowResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListScriptsByFlowResponseBody setData(java.util.List<ListScriptsByFlowResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListScriptsByFlowResponseBodyData> getData() {
        return this.data;
    }

    public ListScriptsByFlowResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListScriptsByFlowResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListScriptsByFlowResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public ListScriptsByFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListScriptsByFlowResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListScriptsByFlowResponseBodyData extends TeaModel {
        /**
         * <p>晓蜜机器人ID</p>
         * 
         * <strong>example:</strong>
         * <p>chatbot-cn-MQuyjjb666</p>
         */
        @NameInMap("ChatbotId")
        public String chatbotId;

        /**
         * <p>名称</p>
         * 
         * <strong>example:</strong>
         * <p>满意度调研</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>场景ID</p>
         * 
         * <strong>example:</strong>
         * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b54</p>
         */
        @NameInMap("ScriptId")
        public String scriptId;

        public static ListScriptsByFlowResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListScriptsByFlowResponseBodyData self = new ListScriptsByFlowResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListScriptsByFlowResponseBodyData setChatbotId(String chatbotId) {
            this.chatbotId = chatbotId;
            return this;
        }
        public String getChatbotId() {
            return this.chatbotId;
        }

        public ListScriptsByFlowResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListScriptsByFlowResponseBodyData setScriptId(String scriptId) {
            this.scriptId = scriptId;
            return this;
        }
        public String getScriptId() {
            return this.scriptId;
        }

    }

}
