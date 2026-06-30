// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarClawAgentFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePolarClawAgentFileResponseBody body;

    public static DescribePolarClawAgentFileResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarClawAgentFileResponse self = new DescribePolarClawAgentFileResponse();
        return TeaModel.build(map, self);
    }

    public DescribePolarClawAgentFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePolarClawAgentFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePolarClawAgentFileResponse setBody(DescribePolarClawAgentFileResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePolarClawAgentFileResponseBody getBody() {
        return this.body;
    }

}
