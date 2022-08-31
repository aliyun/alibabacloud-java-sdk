// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnCcQpsInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeScdnCcQpsInfoResponseBody body;

    public static DescribeScdnCcQpsInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnCcQpsInfoResponse self = new DescribeScdnCcQpsInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScdnCcQpsInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScdnCcQpsInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeScdnCcQpsInfoResponse setBody(DescribeScdnCcQpsInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScdnCcQpsInfoResponseBody getBody() {
        return this.body;
    }

}
