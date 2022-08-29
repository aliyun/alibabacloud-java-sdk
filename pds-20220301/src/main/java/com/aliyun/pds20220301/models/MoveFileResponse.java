// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class MoveFileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public MoveFileResponseBody body;

    public static MoveFileResponse build(java.util.Map<String, ?> map) throws Exception {
        MoveFileResponse self = new MoveFileResponse();
        return TeaModel.build(map, self);
    }

    public MoveFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MoveFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MoveFileResponse setBody(MoveFileResponseBody body) {
        this.body = body;
        return this;
    }
    public MoveFileResponseBody getBody() {
        return this.body;
    }

}
