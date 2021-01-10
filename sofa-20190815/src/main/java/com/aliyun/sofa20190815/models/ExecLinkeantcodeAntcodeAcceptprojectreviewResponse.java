// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeantcodeAntcodeAcceptprojectreviewResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecLinkeantcodeAntcodeAcceptprojectreviewResponseBody body;

    public static ExecLinkeantcodeAntcodeAcceptprojectreviewResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeantcodeAntcodeAcceptprojectreviewResponse self = new ExecLinkeantcodeAntcodeAcceptprojectreviewResponse();
        return TeaModel.build(map, self);
    }

    public ExecLinkeantcodeAntcodeAcceptprojectreviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecLinkeantcodeAntcodeAcceptprojectreviewResponse setBody(ExecLinkeantcodeAntcodeAcceptprojectreviewResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecLinkeantcodeAntcodeAcceptprojectreviewResponseBody getBody() {
        return this.body;
    }

}
