// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtrace20190808.models;

import com.aliyun.tea.*;

public class OpenXtraceServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public OpenXtraceServiceResponseBody body;

    public static OpenXtraceServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenXtraceServiceResponse self = new OpenXtraceServiceResponse();
        return TeaModel.build(map, self);
    }

    public OpenXtraceServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenXtraceServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenXtraceServiceResponse setBody(OpenXtraceServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenXtraceServiceResponseBody getBody() {
        return this.body;
    }

}
