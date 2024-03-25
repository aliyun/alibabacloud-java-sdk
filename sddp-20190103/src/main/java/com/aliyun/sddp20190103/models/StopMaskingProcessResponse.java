// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class StopMaskingProcessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopMaskingProcessResponseBody body;

    public static StopMaskingProcessResponse build(java.util.Map<String, ?> map) throws Exception {
        StopMaskingProcessResponse self = new StopMaskingProcessResponse();
        return TeaModel.build(map, self);
    }

    public StopMaskingProcessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopMaskingProcessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopMaskingProcessResponse setBody(StopMaskingProcessResponseBody body) {
        this.body = body;
        return this;
    }
    public StopMaskingProcessResponseBody getBody() {
        return this.body;
    }

}
