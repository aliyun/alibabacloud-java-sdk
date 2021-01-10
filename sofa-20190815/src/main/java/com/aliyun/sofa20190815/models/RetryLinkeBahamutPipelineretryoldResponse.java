// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RetryLinkeBahamutPipelineretryoldResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RetryLinkeBahamutPipelineretryoldResponseBody body;

    public static RetryLinkeBahamutPipelineretryoldResponse build(java.util.Map<String, ?> map) throws Exception {
        RetryLinkeBahamutPipelineretryoldResponse self = new RetryLinkeBahamutPipelineretryoldResponse();
        return TeaModel.build(map, self);
    }

    public RetryLinkeBahamutPipelineretryoldResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetryLinkeBahamutPipelineretryoldResponse setBody(RetryLinkeBahamutPipelineretryoldResponseBody body) {
        this.body = body;
        return this;
    }
    public RetryLinkeBahamutPipelineretryoldResponseBody getBody() {
        return this.body;
    }

}
