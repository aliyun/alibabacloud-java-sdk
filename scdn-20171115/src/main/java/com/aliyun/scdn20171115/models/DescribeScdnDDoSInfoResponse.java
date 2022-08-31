// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnDDoSInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeScdnDDoSInfoResponseBody body;

    public static DescribeScdnDDoSInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnDDoSInfoResponse self = new DescribeScdnDDoSInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScdnDDoSInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScdnDDoSInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeScdnDDoSInfoResponse setBody(DescribeScdnDDoSInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScdnDDoSInfoResponseBody getBody() {
        return this.body;
    }

}
