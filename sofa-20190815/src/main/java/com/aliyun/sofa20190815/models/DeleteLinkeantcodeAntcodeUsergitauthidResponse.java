// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodeUsergitauthidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeantcodeAntcodeUsergitauthidResponseBody body;

    public static DeleteLinkeantcodeAntcodeUsergitauthidResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodeUsergitauthidResponse self = new DeleteLinkeantcodeAntcodeUsergitauthidResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodeUsergitauthidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeantcodeAntcodeUsergitauthidResponse setBody(DeleteLinkeantcodeAntcodeUsergitauthidResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeantcodeAntcodeUsergitauthidResponseBody getBody() {
        return this.body;
    }

}
