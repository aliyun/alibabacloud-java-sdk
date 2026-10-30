// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class CheckAgentConfigSupportedResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * <ul>
     * <li>If the value is <code>Success</code>, the authorization is successful.</li>
     * <li>Other status codes indicate that the authorization failed. If the authorization failed, check the <code>message</code> field for the detailed fault message.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success  Fail</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("data")
    public java.util.List<CheckAgentConfigSupportedResponseBodyData> data;

    /**
     * <p>The error message.</p>
     * <ul>
     * <li>If the value of <code>code</code> is <code>Success</code>, this field is empty.</li>
     * <li>Otherwise, this field contains the error message of the request.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>server error</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2D693121-C925-5154-8DF6-C09A8B369822</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The total number of returned results.</p>
     * 
     * <strong>example:</strong>
     * <p>42</p>
     */
    @NameInMap("total")
    public Long total;

    public static CheckAgentConfigSupportedResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckAgentConfigSupportedResponseBody self = new CheckAgentConfigSupportedResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckAgentConfigSupportedResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CheckAgentConfigSupportedResponseBody setData(java.util.List<CheckAgentConfigSupportedResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<CheckAgentConfigSupportedResponseBodyData> getData() {
        return this.data;
    }

    public CheckAgentConfigSupportedResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CheckAgentConfigSupportedResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckAgentConfigSupportedResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class CheckAgentConfigSupportedResponseBodyData extends TeaModel {
        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>a36a284e-fc8a-4c8a-abad-03d441e6ebcf</p>
         */
        @NameInMap("cluster")
        public String cluster;

        /**
         * <p>The ECS instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-wz9d00ut2ska3mlyhn6j</p>
         */
        @NameInMap("instance")
        public String instance;

        /**
         * <p>The reason why the instance is not supported for management. This field is not empty when the success field is false.</p>
         * 
         * <strong>example:</strong>
         * <p>instance not found in ecs</p>
         */
        @NameInMap("reason")
        public String reason;

        public static CheckAgentConfigSupportedResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CheckAgentConfigSupportedResponseBodyData self = new CheckAgentConfigSupportedResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CheckAgentConfigSupportedResponseBodyData setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }
        public String getCluster() {
            return this.cluster;
        }

        public CheckAgentConfigSupportedResponseBodyData setInstance(String instance) {
            this.instance = instance;
            return this;
        }
        public String getInstance() {
            return this.instance;
        }

        public CheckAgentConfigSupportedResponseBodyData setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

    }

}
