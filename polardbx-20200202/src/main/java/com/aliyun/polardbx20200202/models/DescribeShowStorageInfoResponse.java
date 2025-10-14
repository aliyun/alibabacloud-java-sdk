// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeShowStorageInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeShowStorageInfoResponseBody body;

    public static DescribeShowStorageInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeShowStorageInfoResponse self = new DescribeShowStorageInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeShowStorageInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeShowStorageInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeShowStorageInfoResponse setBody(DescribeShowStorageInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeShowStorageInfoResponseBody getBody() {
        return this.body;
    }

}
