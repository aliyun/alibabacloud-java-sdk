// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RetryLinkeBahamutPipelineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RetryLinkeBahamutPipelineResponseBody body;

    public static RetryLinkeBahamutPipelineResponse build(java.util.Map<String, ?> map) throws Exception {
        RetryLinkeBahamutPipelineResponse self = new RetryLinkeBahamutPipelineResponse();
        return TeaModel.build(map, self);
    }

    public RetryLinkeBahamutPipelineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetryLinkeBahamutPipelineResponse setBody(RetryLinkeBahamutPipelineResponseBody body) {
        this.body = body;
        return this;
    }
    public RetryLinkeBahamutPipelineResponseBody getBody() {
        return this.body;
    }

}
