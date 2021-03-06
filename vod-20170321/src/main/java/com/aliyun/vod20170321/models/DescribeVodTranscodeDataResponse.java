// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodTranscodeDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeVodTranscodeDataResponseBody body;

    public static DescribeVodTranscodeDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodTranscodeDataResponse self = new DescribeVodTranscodeDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVodTranscodeDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVodTranscodeDataResponse setBody(DescribeVodTranscodeDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodTranscodeDataResponseBody getBody() {
        return this.body;
    }

}
