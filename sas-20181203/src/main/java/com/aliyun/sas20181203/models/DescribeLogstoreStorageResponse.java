// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeLogstoreStorageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLogstoreStorageResponseBody body;

    public static DescribeLogstoreStorageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogstoreStorageResponse self = new DescribeLogstoreStorageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLogstoreStorageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLogstoreStorageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLogstoreStorageResponse setBody(DescribeLogstoreStorageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLogstoreStorageResponseBody getBody() {
        return this.body;
    }

}
