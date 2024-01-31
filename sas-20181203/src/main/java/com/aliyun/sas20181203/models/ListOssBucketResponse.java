// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListOssBucketResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListOssBucketResponseBody body;

    public static ListOssBucketResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOssBucketResponse self = new ListOssBucketResponse();
        return TeaModel.build(map, self);
    }

    public ListOssBucketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOssBucketResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOssBucketResponse setBody(ListOssBucketResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOssBucketResponseBody getBody() {
        return this.body;
    }

}
