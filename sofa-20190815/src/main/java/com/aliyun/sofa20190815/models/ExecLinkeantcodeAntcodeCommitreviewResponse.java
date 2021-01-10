// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeantcodeAntcodeCommitreviewResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecLinkeantcodeAntcodeCommitreviewResponseBody body;

    public static ExecLinkeantcodeAntcodeCommitreviewResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeantcodeAntcodeCommitreviewResponse self = new ExecLinkeantcodeAntcodeCommitreviewResponse();
        return TeaModel.build(map, self);
    }

    public ExecLinkeantcodeAntcodeCommitreviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecLinkeantcodeAntcodeCommitreviewResponse setBody(ExecLinkeantcodeAntcodeCommitreviewResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecLinkeantcodeAntcodeCommitreviewResponseBody getBody() {
        return this.body;
    }

}
