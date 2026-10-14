// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class CreateAgentConfigResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * <ul>
     * <li>If <code>code == Success</code>, the authorization is successful.</li>
     * <li>Other status codes indicate that the authorization failed. If the authorization fails, check the <code>message</code> field for the detailed fault message.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public CreateAgentConfigResponseBodyData data;

    /**
     * <p>The error message.</p>
     * <ul>
     * <li>If <code>code == Success</code>, this field is empty.</li>
     * <li>Otherwise, this field contains the error message of the request.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Requests for llm service failed</p>
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

    public static CreateAgentConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentConfigResponseBody self = new CreateAgentConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAgentConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateAgentConfigResponseBody setData(CreateAgentConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateAgentConfigResponseBodyData getData() {
        return this.data;
    }

    public CreateAgentConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateAgentConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateAgentConfigResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the created component configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>4d5ecf02-3d01-11f0-8c90-00163e1029af</p>
         */
        @NameInMap("configId")
        public String configId;

        public static CreateAgentConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateAgentConfigResponseBodyData self = new CreateAgentConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateAgentConfigResponseBodyData setConfigId(String configId) {
            this.configId = configId;
            return this;
        }
        public String getConfigId() {
            return this.configId;
        }

    }

}
