// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class StartPublishStreamResponseBody extends TeaModel {
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

    public static StartPublishStreamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartPublishStreamResponseBody self = new StartPublishStreamResponseBody();
        return TeaModel.build(map, self);
    }

    public StartPublishStreamResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public StartPublishStreamResponseBody setMessage(Long message) {
        this.message = message;
        return this;
    }
    public Long getMessage() {
        return this.message;
    }

    public StartPublishStreamResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
