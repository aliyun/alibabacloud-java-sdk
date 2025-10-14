// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ResetAccountPasswordRestrictResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResetAccountPasswordRestrictResponseBody body;

    public static ResetAccountPasswordRestrictResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetAccountPasswordRestrictResponse self = new ResetAccountPasswordRestrictResponse();
        return TeaModel.build(map, self);
    }

    public ResetAccountPasswordRestrictResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetAccountPasswordRestrictResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetAccountPasswordRestrictResponse setBody(ResetAccountPasswordRestrictResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetAccountPasswordRestrictResponseBody getBody() {
        return this.body;
    }

}
