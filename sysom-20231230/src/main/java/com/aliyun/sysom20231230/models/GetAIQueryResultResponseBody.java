// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetAIQueryResultResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The returned results. The data volume can be large.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;task_id\&quot;: \&quot;y4ba8uRV\&quot;}</p>
     */
    @NameInMap("data")
    public String data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>分析ID: 56dae746-ef55-4f77-8373-cb3594c41457
     * 机器i-bp164ns76pzirbwv0snt分析失败, 失败原因: Not get GPU trace data for \&quot;56dae746-ef55-4f77-8373-cb3594c41457\&quot; \&quot;[\&quot;93811\&quot;]\&quot;!</p>
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

    public static GetAIQueryResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAIQueryResultResponseBody self = new GetAIQueryResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAIQueryResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAIQueryResultResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetAIQueryResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAIQueryResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
