// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodVerifyContentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeVodVerifyContentResponseBody body;

    public static DescribeVodVerifyContentResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodVerifyContentResponse self = new DescribeVodVerifyContentResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVodVerifyContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVodVerifyContentResponse setBody(DescribeVodVerifyContentResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodVerifyContentResponseBody getBody() {
        return this.body;
    }

}
