// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTenantTagsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTenantTagsResponseBody body;

    public static DescribeTenantTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTenantTagsResponse self = new DescribeTenantTagsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTenantTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTenantTagsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTenantTagsResponse setBody(DescribeTenantTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTenantTagsResponseBody getBody() {
        return this.body;
    }

}
