// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribePipelineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePipelineResponseBody body;

    public static DescribePipelineResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePipelineResponse self = new DescribePipelineResponse();
        return TeaModel.build(map, self);
    }

    public DescribePipelineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePipelineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePipelineResponse setBody(DescribePipelineResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePipelineResponseBody getBody() {
        return this.body;
    }

}
