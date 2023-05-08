// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.premiumpics20200505.models;

import com.aliyun.tea.*;

public class DescribeDownloadImageInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDownloadImageInfoResponseBody body;

    public static DescribeDownloadImageInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDownloadImageInfoResponse self = new DescribeDownloadImageInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDownloadImageInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDownloadImageInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDownloadImageInfoResponse setBody(DescribeDownloadImageInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDownloadImageInfoResponseBody getBody() {
        return this.body;
    }

}
