// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class UpdateAlertEnabledResponseBody extends TeaModel {
    /**
     * <p>Status code  </p>
     * <ul>
     * <li>If <code>code == Success</code>, authorization succeeded.  </li>
     * <li>Other status codes indicate authorization failed. When authorization fails, view the <code>message</code> field to obtain detailed error message.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Returned data</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;uid&quot;: &quot;1808078950770264&quot;,
     *     &quot;name&quot;: &quot;test-name&quot;,
     *     &quot;strategy&quot;: {
     *       &quot;items&quot;: [
     *         &quot;节点CPU使用率检测&quot;
     *       ],
     *       &quot;clusters&quot;: [
     *         &quot;cluster1&quot;
     *       ]
     *     },
     *     &quot;enabled&quot;: true,
     *     &quot;id&quot;: 1,
     *     &quot;created_at&quot;: 1753172727,
     *     &quot;updated_at&quot;: 1753172727
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

    public static UpdateAlertEnabledResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlertEnabledResponseBody self = new UpdateAlertEnabledResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAlertEnabledResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateAlertEnabledResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public UpdateAlertEnabledResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateAlertEnabledResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
