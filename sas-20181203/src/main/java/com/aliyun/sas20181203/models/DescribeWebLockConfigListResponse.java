// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeWebLockConfigListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeWebLockConfigListResponseBody body;

    public static DescribeWebLockConfigListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebLockConfigListResponse self = new DescribeWebLockConfigListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWebLockConfigListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWebLockConfigListResponse setBody(DescribeWebLockConfigListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWebLockConfigListResponseBody getBody() {
        return this.body;
    }

}
