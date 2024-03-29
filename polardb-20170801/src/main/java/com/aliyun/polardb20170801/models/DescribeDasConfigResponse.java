// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDasConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDasConfigResponseBody body;

    public static DescribeDasConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDasConfigResponse self = new DescribeDasConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDasConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDasConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDasConfigResponse setBody(DescribeDasConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDasConfigResponseBody getBody() {
        return this.body;
    }

}
