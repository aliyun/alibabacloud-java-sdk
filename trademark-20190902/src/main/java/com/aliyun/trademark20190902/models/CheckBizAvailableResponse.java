// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class CheckBizAvailableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckBizAvailableResponseBody body;

    public static CheckBizAvailableResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckBizAvailableResponse self = new CheckBizAvailableResponse();
        return TeaModel.build(map, self);
    }

    public CheckBizAvailableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckBizAvailableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckBizAvailableResponse setBody(CheckBizAvailableResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckBizAvailableResponseBody getBody() {
        return this.body;
    }

}
