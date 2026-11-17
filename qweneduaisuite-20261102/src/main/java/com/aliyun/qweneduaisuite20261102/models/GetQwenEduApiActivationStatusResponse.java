// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qweneduaisuite20261102.models;

import com.aliyun.tea.*;

public class GetQwenEduApiActivationStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetQwenEduApiActivationStatusResponseBody body;

    public static GetQwenEduApiActivationStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQwenEduApiActivationStatusResponse self = new GetQwenEduApiActivationStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetQwenEduApiActivationStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQwenEduApiActivationStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetQwenEduApiActivationStatusResponse setBody(GetQwenEduApiActivationStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQwenEduApiActivationStatusResponseBody getBody() {
        return this.body;
    }

}
