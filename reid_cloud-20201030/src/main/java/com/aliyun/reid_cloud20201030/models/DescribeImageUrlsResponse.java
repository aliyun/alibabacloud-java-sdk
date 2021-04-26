// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201030.models;

import com.aliyun.tea.*;

public class DescribeImageUrlsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeImageUrlsResponseBody body;

    public static DescribeImageUrlsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageUrlsResponse self = new DescribeImageUrlsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImageUrlsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeImageUrlsResponse setBody(DescribeImageUrlsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeImageUrlsResponseBody getBody() {
        return this.body;
    }

}
