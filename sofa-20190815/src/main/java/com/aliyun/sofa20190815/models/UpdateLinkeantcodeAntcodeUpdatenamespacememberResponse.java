// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeantcodeAntcodeUpdatenamespacememberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeantcodeAntcodeUpdatenamespacememberResponseBody body;

    public static UpdateLinkeantcodeAntcodeUpdatenamespacememberResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeantcodeAntcodeUpdatenamespacememberResponse self = new UpdateLinkeantcodeAntcodeUpdatenamespacememberResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeantcodeAntcodeUpdatenamespacememberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeantcodeAntcodeUpdatenamespacememberResponse setBody(UpdateLinkeantcodeAntcodeUpdatenamespacememberResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeantcodeAntcodeUpdatenamespacememberResponseBody getBody() {
        return this.body;
    }

}
