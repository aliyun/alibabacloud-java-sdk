// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodUserTagsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeVodUserTagsResponseBody body;

    public static DescribeVodUserTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodUserTagsResponse self = new DescribeVodUserTagsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVodUserTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVodUserTagsResponse setBody(DescribeVodUserTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodUserTagsResponseBody getBody() {
        return this.body;
    }

}
