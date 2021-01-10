// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeantcodeAntcodeNamespacememberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeantcodeAntcodeNamespacememberResponseBody body;

    public static UpdateLinkeantcodeAntcodeNamespacememberResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeantcodeAntcodeNamespacememberResponse self = new UpdateLinkeantcodeAntcodeNamespacememberResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeantcodeAntcodeNamespacememberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeantcodeAntcodeNamespacememberResponse setBody(UpdateLinkeantcodeAntcodeNamespacememberResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeantcodeAntcodeNamespacememberResponseBody getBody() {
        return this.body;
    }

}
