// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeantcodeAntcodeIssueResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeantcodeAntcodeIssueResponseBody body;

    public static UpdateLinkeantcodeAntcodeIssueResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeantcodeAntcodeIssueResponse self = new UpdateLinkeantcodeAntcodeIssueResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeantcodeAntcodeIssueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeantcodeAntcodeIssueResponse setBody(UpdateLinkeantcodeAntcodeIssueResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeantcodeAntcodeIssueResponseBody getBody() {
        return this.body;
    }

}
