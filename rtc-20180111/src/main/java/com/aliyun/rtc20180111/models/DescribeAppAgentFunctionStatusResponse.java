// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeAppAgentFunctionStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAppAgentFunctionStatusResponseBody body;

    public static DescribeAppAgentFunctionStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppAgentFunctionStatusResponse self = new DescribeAppAgentFunctionStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAppAgentFunctionStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAppAgentFunctionStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAppAgentFunctionStatusResponse setBody(DescribeAppAgentFunctionStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAppAgentFunctionStatusResponseBody getBody() {
        return this.body;
    }

}
