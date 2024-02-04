// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class CheckLoaFillResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckLoaFillResponseBody body;

    public static CheckLoaFillResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckLoaFillResponse self = new CheckLoaFillResponse();
        return TeaModel.build(map, self);
    }

    public CheckLoaFillResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckLoaFillResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckLoaFillResponse setBody(CheckLoaFillResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckLoaFillResponseBody getBody() {
        return this.body;
    }

}
