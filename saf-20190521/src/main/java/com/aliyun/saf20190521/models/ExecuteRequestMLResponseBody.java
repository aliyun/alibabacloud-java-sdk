// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.saf20190521.models;

import com.aliyun.tea.*;

public class ExecuteRequestMLResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data information, including fields such as tags, score, and extend.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;score&quot;: 80.4, &quot;tags&quot;: &quot;ra0601,rnk0002,rn0312&quot;}</p>
     */
    @NameInMap("Data")
    public java.util.Map<String, ?> data;

    /**
     * <p>The result message.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A5F41DC6-2070-5CE7-8B2D-7A23D882932D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ExecuteRequestMLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteRequestMLResponseBody self = new ExecuteRequestMLResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteRequestMLResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ExecuteRequestMLResponseBody setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    public ExecuteRequestMLResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ExecuteRequestMLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
