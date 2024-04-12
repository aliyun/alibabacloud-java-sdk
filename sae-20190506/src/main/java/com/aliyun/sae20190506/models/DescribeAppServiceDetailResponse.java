// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeAppServiceDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAppServiceDetailResponseBody body;

    public static DescribeAppServiceDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppServiceDetailResponse self = new DescribeAppServiceDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAppServiceDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAppServiceDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAppServiceDetailResponse setBody(DescribeAppServiceDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAppServiceDetailResponseBody getBody() {
        return this.body;
    }

}
