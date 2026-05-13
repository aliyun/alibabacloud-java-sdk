// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeTairSkvDdbTableSchemaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTairSkvDdbTableSchemaResponseBody body;

    public static DescribeTairSkvDdbTableSchemaResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTairSkvDdbTableSchemaResponse self = new DescribeTairSkvDdbTableSchemaResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTairSkvDdbTableSchemaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTairSkvDdbTableSchemaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTairSkvDdbTableSchemaResponse setBody(DescribeTairSkvDdbTableSchemaResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTairSkvDdbTableSchemaResponseBody getBody() {
        return this.body;
    }

}
