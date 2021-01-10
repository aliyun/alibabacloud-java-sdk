// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeantcodeAntcodeRecoverytaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeantcodeAntcodeRecoverytaskResponseBody body;

    public static UpdateLinkeantcodeAntcodeRecoverytaskResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeantcodeAntcodeRecoverytaskResponse self = new UpdateLinkeantcodeAntcodeRecoverytaskResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeantcodeAntcodeRecoverytaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeantcodeAntcodeRecoverytaskResponse setBody(UpdateLinkeantcodeAntcodeRecoverytaskResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeantcodeAntcodeRecoverytaskResponseBody getBody() {
        return this.body;
    }

}
