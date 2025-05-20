// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.notifications20241225.models;

import com.aliyun.tea.*;

public class ReadMessageNewTotalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReadMessageNewTotalResponseBody body;

    public static ReadMessageNewTotalResponse build(java.util.Map<String, ?> map) throws Exception {
        ReadMessageNewTotalResponse self = new ReadMessageNewTotalResponse();
        return TeaModel.build(map, self);
    }

    public ReadMessageNewTotalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReadMessageNewTotalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReadMessageNewTotalResponse setBody(ReadMessageNewTotalResponseBody body) {
        this.body = body;
        return this;
    }
    public ReadMessageNewTotalResponseBody getBody() {
        return this.body;
    }

}
