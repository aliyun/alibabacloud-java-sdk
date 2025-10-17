// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CheckDBNameZonalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckDBNameZonalResponseBody body;

    public static CheckDBNameZonalResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckDBNameZonalResponse self = new CheckDBNameZonalResponse();
        return TeaModel.build(map, self);
    }

    public CheckDBNameZonalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckDBNameZonalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckDBNameZonalResponse setBody(CheckDBNameZonalResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckDBNameZonalResponseBody getBody() {
        return this.body;
    }

}
