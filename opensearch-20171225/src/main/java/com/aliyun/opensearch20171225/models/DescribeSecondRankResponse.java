// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DescribeSecondRankResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSecondRankResponseBody body;

    public static DescribeSecondRankResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecondRankResponse self = new DescribeSecondRankResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSecondRankResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSecondRankResponse setBody(DescribeSecondRankResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSecondRankResponseBody getBody() {
        return this.body;
    }

}
