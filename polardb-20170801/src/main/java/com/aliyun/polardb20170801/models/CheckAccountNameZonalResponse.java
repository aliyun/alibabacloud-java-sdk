// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CheckAccountNameZonalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckAccountNameZonalResponseBody body;

    public static CheckAccountNameZonalResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckAccountNameZonalResponse self = new CheckAccountNameZonalResponse();
        return TeaModel.build(map, self);
    }

    public CheckAccountNameZonalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckAccountNameZonalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckAccountNameZonalResponse setBody(CheckAccountNameZonalResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckAccountNameZonalResponseBody getBody() {
        return this.body;
    }

}
