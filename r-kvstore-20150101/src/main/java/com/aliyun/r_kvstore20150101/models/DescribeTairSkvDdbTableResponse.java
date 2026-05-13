// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeTairSkvDdbTableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTairSkvDdbTableResponseBody body;

    public static DescribeTairSkvDdbTableResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTairSkvDdbTableResponse self = new DescribeTairSkvDdbTableResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTairSkvDdbTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTairSkvDdbTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTairSkvDdbTableResponse setBody(DescribeTairSkvDdbTableResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTairSkvDdbTableResponseBody getBody() {
        return this.body;
    }

}
