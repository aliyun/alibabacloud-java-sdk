// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLDCFederationConfigmapResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLDCFederationConfigmapResponseBody body;

    public static CreateLDCFederationConfigmapResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLDCFederationConfigmapResponse self = new CreateLDCFederationConfigmapResponse();
        return TeaModel.build(map, self);
    }

    public CreateLDCFederationConfigmapResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLDCFederationConfigmapResponse setBody(CreateLDCFederationConfigmapResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLDCFederationConfigmapResponseBody getBody() {
        return this.body;
    }

}
