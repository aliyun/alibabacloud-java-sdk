// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodTranscodeDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeVodTranscodeDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVodTranscodeDataResponse setBody(DescribeVodTranscodeDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodTranscodeDataResponseBody getBody() {
        return this.body;
    }

}
