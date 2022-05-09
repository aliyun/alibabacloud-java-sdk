// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class OptimizeRightAngleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public OptimizeRightAngleResponseBody body;

    public static OptimizeRightAngleResponse build(java.util.Map<String, ?> map) throws Exception {
        OptimizeRightAngleResponse self = new OptimizeRightAngleResponse();
        return TeaModel.build(map, self);
    }

    public OptimizeRightAngleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OptimizeRightAngleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OptimizeRightAngleResponse setBody(OptimizeRightAngleResponseBody body) {
        this.body = body;
        return this;
    }
    public OptimizeRightAngleResponseBody getBody() {
        return this.body;
    }

}
