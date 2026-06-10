// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class DeleteAlertStrategyResponseBody extends TeaModel {
    /**
     * <p>Status code  </p>
     * <ul>
     * <li>If <code>code == Success</code>, authorization succeeded.  </li>
     * <li>Other status codes indicate authorization failed. When authorization fails, check the <code>message</code> field for detailed error message.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Returned data.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;uid&quot;: &quot;1808078950770264&quot;,
     *     &quot;name&quot;: &quot;test&quot;,
     *     &quot;strategy&quot;: {
     *       &quot;items&quot;: [
     *         &quot;节点CPU使用率检测&quot;
     *       ],
     *       &quot;clusters&quot;: [
     *         &quot;1&quot;
     *       ]
     *     },
     *     &quot;enabled&quot;: false,
     *     &quot;id&quot;: 1,
     *     &quot;created_at&quot;: 1753170771,
     *     &quot;updated_at&quot;: 1753170811
     *   }</p>
     */
    @NameInMap("data")
    public Object data;

    /**
     * <p>Error message  </p>
     * <ul>
     * <li>If <code>code == Success</code>, this field is empty.  </li>
     * <li>Otherwise, this field contains the request error message.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
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

    public static DeleteAlertStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlertStrategyResponseBody self = new DeleteAlertStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAlertStrategyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteAlertStrategyResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public DeleteAlertStrategyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteAlertStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
