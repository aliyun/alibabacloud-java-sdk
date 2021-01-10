// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeantcodeAntcodeProjectexistinglabelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeantcodeAntcodeProjectexistinglabelResponseBody body;

    public static UpdateLinkeantcodeAntcodeProjectexistinglabelResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeantcodeAntcodeProjectexistinglabelResponse self = new UpdateLinkeantcodeAntcodeProjectexistinglabelResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeantcodeAntcodeProjectexistinglabelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeantcodeAntcodeProjectexistinglabelResponse setBody(UpdateLinkeantcodeAntcodeProjectexistinglabelResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeantcodeAntcodeProjectexistinglabelResponseBody getBody() {
        return this.body;
    }

}
