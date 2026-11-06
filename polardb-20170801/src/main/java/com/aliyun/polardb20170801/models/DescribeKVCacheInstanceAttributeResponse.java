// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeKVCacheInstanceAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeKVCacheInstanceAttributeResponseBody body;

    public static DescribeKVCacheInstanceAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeKVCacheInstanceAttributeResponse self = new DescribeKVCacheInstanceAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeKVCacheInstanceAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeKVCacheInstanceAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeKVCacheInstanceAttributeResponse setBody(DescribeKVCacheInstanceAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeKVCacheInstanceAttributeResponseBody getBody() {
        return this.body;
    }

}
