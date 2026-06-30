// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarClawAgentToolsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePolarClawAgentToolsResponseBody body;

    public static DescribePolarClawAgentToolsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarClawAgentToolsResponse self = new DescribePolarClawAgentToolsResponse();
        return TeaModel.build(map, self);
    }

    public DescribePolarClawAgentToolsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePolarClawAgentToolsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePolarClawAgentToolsResponse setBody(DescribePolarClawAgentToolsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePolarClawAgentToolsResponseBody getBody() {
        return this.body;
    }

}
