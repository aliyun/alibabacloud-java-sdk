// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class StopPublishStreamResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Message")
    public Long message;

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
