// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodAIDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeVodAIDataResponseBody body;

    public static DescribeVodAIDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodAIDataResponse self = new DescribeVodAIDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVodAIDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVodAIDataResponse setBody(DescribeVodAIDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodAIDataResponseBody getBody() {
        return this.body;
    }

}
