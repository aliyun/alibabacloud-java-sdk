// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class GetPolarAgentResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>QZ-13661677-80</p>
     */
    @NameInMap("Content")
    public String content;

    @NameInMap("FunctionCall")
    public java.util.List<GetPolarAgentResponseBodyFunctionCall> functionCall;

    /**
     * <strong>example:</strong>
     * <p>polardb</p>
     */
    @NameInMap("Product")
    public String product;

    /**
     * <strong>example:</strong>
     * <p>2548026401648157601743560466154</p>
     */
    @NameInMap("QueryId")
    public String queryId;

    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("ReasoningContent")
    public String reasoningContent;

    /**
     * <strong>example:</strong>
     * <p>34458CD3-33E0-4624-BFEF-840C15******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>40315d708f0806903b08813bf4c9db2e</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    @NameInMap("UiFunctionCall")
    public java.util.List<GetPolarAgentResponseBodyUiFunctionCall> uiFunctionCall;

    public static GetPolarAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPolarAgentResponseBody self = new GetPolarAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPolarAgentResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public GetPolarAgentResponseBody setFunctionCall(java.util.List<GetPolarAgentResponseBodyFunctionCall> functionCall) {
        this.functionCall = functionCall;
        return this;
    }
    public java.util.List<GetPolarAgentResponseBodyFunctionCall> getFunctionCall() {
        return this.functionCall;
    }

    public GetPolarAgentResponseBody setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public GetPolarAgentResponseBody setQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }
    public String getQueryId() {
        return this.queryId;
    }

    public GetPolarAgentResponseBody setReasoningContent(String reasoningContent) {
        this.reasoningContent = reasoningContent;
        return this;
    }
    public String getReasoningContent() {
        return this.reasoningContent;
    }

    public GetPolarAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPolarAgentResponseBody setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public GetPolarAgentResponseBody setUiFunctionCall(java.util.List<GetPolarAgentResponseBodyUiFunctionCall> uiFunctionCall) {
        this.uiFunctionCall = uiFunctionCall;
        return this;
    }
    public java.util.List<GetPolarAgentResponseBodyUiFunctionCall> getUiFunctionCall() {
        return this.uiFunctionCall;
    }

    public static class GetPolarAgentResponseBodyFunctionCall extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>---narguments:n  parameters: []n</p>
         */
        @NameInMap("Arguments")
        public String arguments;

        /**
         * <strong>example:</strong>
         * <p>393</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>rule04</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetPolarAgentResponseBodyFunctionCall build(java.util.Map<String, ?> map) throws Exception {
            GetPolarAgentResponseBodyFunctionCall self = new GetPolarAgentResponseBodyFunctionCall();
            return TeaModel.build(map, self);
        }

        public GetPolarAgentResponseBodyFunctionCall setArguments(String arguments) {
            this.arguments = arguments;
            return this;
        }
        public String getArguments() {
            return this.arguments;
        }

        public GetPolarAgentResponseBodyFunctionCall setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetPolarAgentResponseBodyFunctionCall setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetPolarAgentResponseBodyFunctionCall setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetPolarAgentResponseBodyUiFunctionCall extends TeaModel {
        /**
         * <p>xxx</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("ArgsText")
        public String argsText;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("ToolName")
        public String toolName;

        public static GetPolarAgentResponseBodyUiFunctionCall build(java.util.Map<String, ?> map) throws Exception {
            GetPolarAgentResponseBodyUiFunctionCall self = new GetPolarAgentResponseBodyUiFunctionCall();
            return TeaModel.build(map, self);
        }

        public GetPolarAgentResponseBodyUiFunctionCall setArgsText(String argsText) {
            this.argsText = argsText;
            return this;
        }
        public String getArgsText() {
            return this.argsText;
        }

        public GetPolarAgentResponseBodyUiFunctionCall setToolName(String toolName) {
            this.toolName = toolName;
            return this;
        }
        public String getToolName() {
            return this.toolName;
        }

    }

}
