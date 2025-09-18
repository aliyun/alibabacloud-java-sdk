// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class DescribeMmAppResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMmAppResponseBody body;

    public static DescribeMmAppResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMmAppResponse self = new DescribeMmAppResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMmAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMmAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMmAppResponse setBody(DescribeMmAppResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMmAppResponseBody getBody() {
        return this.body;
    }

}
