// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeLsifreferencesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeantcodeAntcodeLsifreferencesResponseBody body;

    public static CreateLinkeantcodeAntcodeLsifreferencesResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeLsifreferencesResponse self = new CreateLinkeantcodeAntcodeLsifreferencesResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeLsifreferencesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeantcodeAntcodeLsifreferencesResponse setBody(CreateLinkeantcodeAntcodeLsifreferencesResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeantcodeAntcodeLsifreferencesResponseBody getBody() {
        return this.body;
    }

}
