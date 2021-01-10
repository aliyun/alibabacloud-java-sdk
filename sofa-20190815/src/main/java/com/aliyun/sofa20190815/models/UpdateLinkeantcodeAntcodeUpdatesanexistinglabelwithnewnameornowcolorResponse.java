// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeantcodeAntcodeUpdatesanexistinglabelwithnewnameornowcolorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeantcodeAntcodeUpdatesanexistinglabelwithnewnameornowcolorResponseBody body;

    public static UpdateLinkeantcodeAntcodeUpdatesanexistinglabelwithnewnameornowcolorResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeantcodeAntcodeUpdatesanexistinglabelwithnewnameornowcolorResponse self = new UpdateLinkeantcodeAntcodeUpdatesanexistinglabelwithnewnameornowcolorResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeantcodeAntcodeUpdatesanexistinglabelwithnewnameornowcolorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeantcodeAntcodeUpdatesanexistinglabelwithnewnameornowcolorResponse setBody(UpdateLinkeantcodeAntcodeUpdatesanexistinglabelwithnewnameornowcolorResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeantcodeAntcodeUpdatesanexistinglabelwithnewnameornowcolorResponseBody getBody() {
        return this.body;
    }

}
