// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBody body;

    public static UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse self = new UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponse setBody(UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeantcodeAntcodeUpdatecommitnoteResponseBody getBody() {
        return this.body;
    }

}
