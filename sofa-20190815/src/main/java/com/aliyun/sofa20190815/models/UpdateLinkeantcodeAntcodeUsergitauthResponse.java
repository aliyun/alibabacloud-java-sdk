// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeantcodeAntcodeUsergitauthResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeantcodeAntcodeUsergitauthResponseBody body;

    public static UpdateLinkeantcodeAntcodeUsergitauthResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeantcodeAntcodeUsergitauthResponse self = new UpdateLinkeantcodeAntcodeUsergitauthResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeantcodeAntcodeUsergitauthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeantcodeAntcodeUsergitauthResponse setBody(UpdateLinkeantcodeAntcodeUsergitauthResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeantcodeAntcodeUsergitauthResponseBody getBody() {
        return this.body;
    }

}
