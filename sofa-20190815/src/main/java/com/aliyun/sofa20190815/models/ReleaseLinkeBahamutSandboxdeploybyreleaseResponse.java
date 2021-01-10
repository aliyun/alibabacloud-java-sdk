// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ReleaseLinkeBahamutSandboxdeploybyreleaseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReleaseLinkeBahamutSandboxdeploybyreleaseResponseBody body;

    public static ReleaseLinkeBahamutSandboxdeploybyreleaseResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseLinkeBahamutSandboxdeploybyreleaseResponse self = new ReleaseLinkeBahamutSandboxdeploybyreleaseResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseLinkeBahamutSandboxdeploybyreleaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseLinkeBahamutSandboxdeploybyreleaseResponse setBody(ReleaseLinkeBahamutSandboxdeploybyreleaseResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseLinkeBahamutSandboxdeploybyreleaseResponseBody getBody() {
        return this.body;
    }

}
