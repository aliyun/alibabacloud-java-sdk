// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ListPolarClawBindingsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    @NameInMap("Bindings")
    public java.util.List<ListPolarClawBindingsResponseBodyBindings> bindings;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>7F2007D3-7E74-4ECB-89A8-BF130D******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListPolarClawBindingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPolarClawBindingsResponseBody self = new ListPolarClawBindingsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPolarClawBindingsResponseBody setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public ListPolarClawBindingsResponseBody setBindings(java.util.List<ListPolarClawBindingsResponseBodyBindings> bindings) {
        this.bindings = bindings;
        return this;
    }
    public java.util.List<ListPolarClawBindingsResponseBodyBindings> getBindings() {
        return this.bindings;
    }

    public ListPolarClawBindingsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListPolarClawBindingsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPolarClawBindingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPolarClawBindingsResponseBodyBindings extends TeaModel {
        /**
         * <p>Agent ID</p>
         * 
         * <strong>example:</strong>
         * <p>work</p>
         */
        @NameInMap("AgentId")
        public String agentId;

        /**
         * <p>Channel ID</p>
         * 
         * <strong>example:</strong>
         * <p>feishu</p>
         */
        @NameInMap("Channel")
        public String channel;

        /**
         * <p>Account ID</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("ChannelAccountId")
        public String channelAccountId;

        public static ListPolarClawBindingsResponseBodyBindings build(java.util.Map<String, ?> map) throws Exception {
            ListPolarClawBindingsResponseBodyBindings self = new ListPolarClawBindingsResponseBodyBindings();
            return TeaModel.build(map, self);
        }

        public ListPolarClawBindingsResponseBodyBindings setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public ListPolarClawBindingsResponseBodyBindings setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public ListPolarClawBindingsResponseBodyBindings setChannelAccountId(String channelAccountId) {
            this.channelAccountId = channelAccountId;
            return this;
        }
        public String getChannelAccountId() {
            return this.channelAccountId;
        }

    }

}
