// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeUsergitoperateauthResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeantcodeAntcodeUsergitoperateauthResponseBody body;

    public static CreateLinkeantcodeAntcodeUsergitoperateauthResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeUsergitoperateauthResponse self = new CreateLinkeantcodeAntcodeUsergitoperateauthResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeUsergitoperateauthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeantcodeAntcodeUsergitoperateauthResponse setBody(CreateLinkeantcodeAntcodeUsergitoperateauthResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeantcodeAntcodeUsergitoperateauthResponseBody getBody() {
        return this.body;
    }

}
