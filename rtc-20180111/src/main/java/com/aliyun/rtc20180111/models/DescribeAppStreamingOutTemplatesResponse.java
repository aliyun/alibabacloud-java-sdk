// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeAppStreamingOutTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAppStreamingOutTemplatesResponseBody body;

    public static DescribeAppStreamingOutTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppStreamingOutTemplatesResponse self = new DescribeAppStreamingOutTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAppStreamingOutTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAppStreamingOutTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAppStreamingOutTemplatesResponse setBody(DescribeAppStreamingOutTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAppStreamingOutTemplatesResponseBody getBody() {
        return this.body;
    }

}
