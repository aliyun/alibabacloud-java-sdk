// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodTagResourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeVodTagResourcesResponseBody body;

    public static DescribeVodTagResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodTagResourcesResponse self = new DescribeVodTagResourcesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVodTagResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVodTagResourcesResponse setBody(DescribeVodTagResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodTagResourcesResponseBody getBody() {
        return this.body;
    }

}
