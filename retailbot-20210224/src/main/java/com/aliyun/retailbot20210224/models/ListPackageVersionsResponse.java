// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class ListPackageVersionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListPackageVersionsResponseBody body;

    public static ListPackageVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPackageVersionsResponse self = new ListPackageVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListPackageVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPackageVersionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPackageVersionsResponse setBody(ListPackageVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPackageVersionsResponseBody getBody() {
        return this.body;
    }

}
