// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class StartPublishStreamResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Message")
    public Long message;

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
