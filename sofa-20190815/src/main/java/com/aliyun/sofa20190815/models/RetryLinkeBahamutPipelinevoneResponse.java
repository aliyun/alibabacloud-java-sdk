// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RetryLinkeBahamutPipelinevoneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RetryLinkeBahamutPipelinevoneResponseBody body;

    public static RetryLinkeBahamutPipelinevoneResponse build(java.util.Map<String, ?> map) throws Exception {
        RetryLinkeBahamutPipelinevoneResponse self = new RetryLinkeBahamutPipelinevoneResponse();
        return TeaModel.build(map, self);
    }

    public RetryLinkeBahamutPipelinevoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetryLinkeBahamutPipelinevoneResponse setBody(RetryLinkeBahamutPipelinevoneResponseBody body) {
        this.body = body;
        return this;
    }
    public RetryLinkeBahamutPipelinevoneResponseBody getBody() {
        return this.body;
    }

}
