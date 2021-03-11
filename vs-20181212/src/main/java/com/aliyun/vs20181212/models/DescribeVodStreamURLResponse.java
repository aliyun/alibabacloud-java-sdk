// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeVodStreamURLResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeVodStreamURLResponseBody body;

    public static DescribeVodStreamURLResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodStreamURLResponse self = new DescribeVodStreamURLResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVodStreamURLResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVodStreamURLResponse setBody(DescribeVodStreamURLResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodStreamURLResponseBody getBody() {
        return this.body;
    }

}
