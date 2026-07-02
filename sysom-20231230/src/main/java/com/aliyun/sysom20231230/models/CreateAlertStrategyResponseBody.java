// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class CreateAlertStrategyResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * <ul>
     * <li>If <code>code == Success</code>, the request is successful.</li>
     * <li>Other status codes indicate a failed request. If the request fails, check the <code>message</code> field for detailed error information.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response data.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *             &quot;uid&quot;: &quot;uid-1&quot;,
     *             &quot;name&quot;: &quot;test-name&quot;,
     *             &quot;strategy&quot;: {
     *                 &quot;clusters&quot;: [&quot;test-cluster-1&quot;,&quot;test-cluster-2&quot;],
     *                 &quot;items&quot;: [&quot;test-item1&quot;,&quot;test-item2&quot;]
     *             },
     *             &quot;enabled&quot;: True,</p>
     * <pre><code>    }
     * </code></pre>
     */
    @NameInMap("data")
    public Object data;

    /**
     * <p>The error message.</p>
     * <ul>
     * <li>If <code>code == Success</code>, this field is empty.</li>
     * <li>Otherwise, this field contains the error information of the request.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>创建策略失败</p>
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

    public static CreateAlertStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAlertStrategyResponseBody self = new CreateAlertStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAlertStrategyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateAlertStrategyResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public CreateAlertStrategyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateAlertStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
