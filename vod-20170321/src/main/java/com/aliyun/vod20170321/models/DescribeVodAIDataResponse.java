// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodAIDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeVodAIDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVodAIDataResponse setBody(DescribeVodAIDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodAIDataResponseBody getBody() {
        return this.body;
    }

}
