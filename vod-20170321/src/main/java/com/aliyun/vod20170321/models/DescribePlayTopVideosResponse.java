// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribePlayTopVideosResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePlayTopVideosResponseBody body;

    public static DescribePlayTopVideosResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePlayTopVideosResponse self = new DescribePlayTopVideosResponse();
        return TeaModel.build(map, self);
    }

    public DescribePlayTopVideosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePlayTopVideosResponse setBody(DescribePlayTopVideosResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePlayTopVideosResponseBody getBody() {
        return this.body;
    }

}
