// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class BindPolarClawAgentResponseBody extends TeaModel {
    /**
     * <p>The agent ID.</p>
     * 
     * <strong>example:</strong>
     * <p>work</p>
     */
    @NameInMap("AgentId")
    public String agentId;

    /**
     * <p>The application ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-********************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>Details of the newly created binding.</p>
     */
    @NameInMap("Binding")
    public BindPolarClawAgentResponseBodyBinding binding;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>A message that indicates the request result.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2281C6C9-CBAB-1AFD-8400-670750CF6025_2212</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of global bindings after the operation.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalBindings")
    public Integer totalBindings;

    public static BindPolarClawAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindPolarClawAgentResponseBody self = new BindPolarClawAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public BindPolarClawAgentResponseBody setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public BindPolarClawAgentResponseBody setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public BindPolarClawAgentResponseBody setBinding(BindPolarClawAgentResponseBodyBinding binding) {
        this.binding = binding;
        return this;
    }
    public BindPolarClawAgentResponseBodyBinding getBinding() {
        return this.binding;
    }

    public BindPolarClawAgentResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public BindPolarClawAgentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BindPolarClawAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BindPolarClawAgentResponseBody setTotalBindings(Integer totalBindings) {
        this.totalBindings = totalBindings;
        return this;
    }
    public Integer getTotalBindings() {
        return this.totalBindings;
    }

    public static class BindPolarClawAgentResponseBodyBinding extends TeaModel {
        /**
         * <p>The account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The agent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>work</p>
         */
        @NameInMap("AgentId")
        public String agentId;

        /**
         * <p>The channel ID.</p>
         * 
         * <strong>example:</strong>
         * <p>feishu</p>
         */
        @NameInMap("Channel")
        public String channel;

        public static BindPolarClawAgentResponseBodyBinding build(java.util.Map<String, ?> map) throws Exception {
            BindPolarClawAgentResponseBodyBinding self = new BindPolarClawAgentResponseBodyBinding();
            return TeaModel.build(map, self);
        }

        public BindPolarClawAgentResponseBodyBinding setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public BindPolarClawAgentResponseBodyBinding setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public BindPolarClawAgentResponseBodyBinding setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

    }

}
