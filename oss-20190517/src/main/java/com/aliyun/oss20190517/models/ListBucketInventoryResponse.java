// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class ListBucketInventoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListBucketInventoryResponseBody body;

    public static ListBucketInventoryResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBucketInventoryResponse self = new ListBucketInventoryResponse();
        return TeaModel.build(map, self);
    }

    public ListBucketInventoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBucketInventoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBucketInventoryResponse setBody(ListBucketInventoryResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBucketInventoryResponseBody getBody() {
        return this.body;
    }

}
