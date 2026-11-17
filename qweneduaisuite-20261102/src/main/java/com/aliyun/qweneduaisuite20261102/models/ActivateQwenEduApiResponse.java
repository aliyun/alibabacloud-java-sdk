// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qweneduaisuite20261102.models;

import com.aliyun.tea.*;

public class ActivateQwenEduApiResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ActivateQwenEduApiResponseBody body;

    public static ActivateQwenEduApiResponse build(java.util.Map<String, ?> map) throws Exception {
        ActivateQwenEduApiResponse self = new ActivateQwenEduApiResponse();
        return TeaModel.build(map, self);
    }

    public ActivateQwenEduApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ActivateQwenEduApiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ActivateQwenEduApiResponse setBody(ActivateQwenEduApiResponseBody body) {
        this.body = body;
        return this;
    }
    public ActivateQwenEduApiResponseBody getBody() {
        return this.body;
    }

}
