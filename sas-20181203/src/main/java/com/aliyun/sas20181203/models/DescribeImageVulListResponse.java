// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageVulListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeImageVulListResponseBody body;

    public static DescribeImageVulListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageVulListResponse self = new DescribeImageVulListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImageVulListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeImageVulListResponse setBody(DescribeImageVulListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeImageVulListResponseBody getBody() {
        return this.body;
    }

}
