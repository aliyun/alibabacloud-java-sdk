// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeantcodeAntcodeUserpasswordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeantcodeAntcodeUserpasswordResponseBody body;

    public static UpdateLinkeantcodeAntcodeUserpasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeantcodeAntcodeUserpasswordResponse self = new UpdateLinkeantcodeAntcodeUserpasswordResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeantcodeAntcodeUserpasswordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeantcodeAntcodeUserpasswordResponse setBody(UpdateLinkeantcodeAntcodeUserpasswordResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeantcodeAntcodeUserpasswordResponseBody getBody() {
        return this.body;
    }

}
