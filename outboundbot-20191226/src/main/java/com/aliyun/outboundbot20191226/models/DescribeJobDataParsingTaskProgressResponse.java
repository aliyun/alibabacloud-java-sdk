// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeJobDataParsingTaskProgressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeJobDataParsingTaskProgressResponseBody body;

    public static DescribeJobDataParsingTaskProgressResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeJobDataParsingTaskProgressResponse self = new DescribeJobDataParsingTaskProgressResponse();
        return TeaModel.build(map, self);
    }

    public DescribeJobDataParsingTaskProgressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeJobDataParsingTaskProgressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeJobDataParsingTaskProgressResponse setBody(DescribeJobDataParsingTaskProgressResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeJobDataParsingTaskProgressResponseBody getBody() {
        return this.body;
    }

}
