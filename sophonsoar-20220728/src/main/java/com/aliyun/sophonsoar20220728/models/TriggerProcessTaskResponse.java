// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class TriggerProcessTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TriggerProcessTaskResponseBody body;

    public static TriggerProcessTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        TriggerProcessTaskResponse self = new TriggerProcessTaskResponse();
        return TeaModel.build(map, self);
    }

    public TriggerProcessTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TriggerProcessTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TriggerProcessTaskResponse setBody(TriggerProcessTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public TriggerProcessTaskResponseBody getBody() {
        return this.body;
    }

}
