// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class StopPublishStreamResponseBody extends TeaModel {
    /**
     * <p>The return code.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>The return message.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Message")
    public Long message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StopPublishStreamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopPublishStreamResponseBody self = new StopPublishStreamResponseBody();
        return TeaModel.build(map, self);
    }

    public StopPublishStreamResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public StopPublishStreamResponseBody setMessage(Long message) {
        this.message = message;
        return this;
    }
    public Long getMessage() {
        return this.message;
    }

    public StopPublishStreamResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
