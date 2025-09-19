// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class UpdateAlertStrategyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>{
     *             &quot;uid&quot;: &quot;uid-1&quot;,
     *             &quot;name&quot;: &quot;test-name&quot;,
     *             &quot;strategy&quot;: {
     *                 &quot;clusters&quot;: [&quot;test-cluster-1&quot;,&quot;test-cluster-2&quot;],
     *                 &quot;items&quot;: [&quot;test-item1&quot;,&quot;test-item2&quot;]
     *             },
     *             &quot;enabled&quot;: True
     * }</p>
     */
    @NameInMap("data")
    public Object data;

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

    public static UpdateAlertStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlertStrategyResponseBody self = new UpdateAlertStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAlertStrategyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateAlertStrategyResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public UpdateAlertStrategyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateAlertStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
