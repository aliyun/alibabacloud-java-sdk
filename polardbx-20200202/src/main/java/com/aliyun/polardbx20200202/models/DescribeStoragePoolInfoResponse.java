// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeStoragePoolInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeStoragePoolInfoResponseBody body;

    public static DescribeStoragePoolInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeStoragePoolInfoResponse self = new DescribeStoragePoolInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeStoragePoolInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeStoragePoolInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeStoragePoolInfoResponse setBody(DescribeStoragePoolInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeStoragePoolInfoResponseBody getBody() {
        return this.body;
    }

}
