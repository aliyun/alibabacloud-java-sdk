// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodRefreshTasksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeVodRefreshTasksResponseBody body;

    public static DescribeVodRefreshTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodRefreshTasksResponse self = new DescribeVodRefreshTasksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVodRefreshTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVodRefreshTasksResponse setBody(DescribeVodRefreshTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodRefreshTasksResponseBody getBody() {
        return this.body;
    }

}
