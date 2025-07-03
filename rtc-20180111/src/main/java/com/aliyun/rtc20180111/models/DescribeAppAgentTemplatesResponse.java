// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeAppAgentTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAppAgentTemplatesResponseBody body;

    public static DescribeAppAgentTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppAgentTemplatesResponse self = new DescribeAppAgentTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAppAgentTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAppAgentTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAppAgentTemplatesResponse setBody(DescribeAppAgentTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAppAgentTemplatesResponseBody getBody() {
        return this.body;
    }

}
