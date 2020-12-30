// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class DescribeGatherStatsResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGatherStatsResultResponseBody body;

    public static DescribeGatherStatsResultResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatherStatsResultResponse self = new DescribeGatherStatsResultResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGatherStatsResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGatherStatsResultResponse setBody(DescribeGatherStatsResultResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGatherStatsResultResponseBody getBody() {
        return this.body;
    }

}
