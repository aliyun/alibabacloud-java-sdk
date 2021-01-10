// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ReopenLinkeantcodeAntcodeProjectreviewtaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReopenLinkeantcodeAntcodeProjectreviewtaskResponseBody body;

    public static ReopenLinkeantcodeAntcodeProjectreviewtaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ReopenLinkeantcodeAntcodeProjectreviewtaskResponse self = new ReopenLinkeantcodeAntcodeProjectreviewtaskResponse();
        return TeaModel.build(map, self);
    }

    public ReopenLinkeantcodeAntcodeProjectreviewtaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReopenLinkeantcodeAntcodeProjectreviewtaskResponse setBody(ReopenLinkeantcodeAntcodeProjectreviewtaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ReopenLinkeantcodeAntcodeProjectreviewtaskResponseBody getBody() {
        return this.body;
    }

}
