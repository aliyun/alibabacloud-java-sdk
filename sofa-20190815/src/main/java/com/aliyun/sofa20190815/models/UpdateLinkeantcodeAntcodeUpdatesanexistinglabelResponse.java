// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeantcodeAntcodeUpdatesanexistinglabelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeantcodeAntcodeUpdatesanexistinglabelResponseBody body;

    public static UpdateLinkeantcodeAntcodeUpdatesanexistinglabelResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeantcodeAntcodeUpdatesanexistinglabelResponse self = new UpdateLinkeantcodeAntcodeUpdatesanexistinglabelResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeantcodeAntcodeUpdatesanexistinglabelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeantcodeAntcodeUpdatesanexistinglabelResponse setBody(UpdateLinkeantcodeAntcodeUpdatesanexistinglabelResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeantcodeAntcodeUpdatesanexistinglabelResponseBody getBody() {
        return this.body;
    }

}
