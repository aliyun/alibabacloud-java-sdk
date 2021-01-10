// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateAKSConfigmapResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAKSConfigmapResponseBody body;

    public static CreateAKSConfigmapResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAKSConfigmapResponse self = new CreateAKSConfigmapResponse();
        return TeaModel.build(map, self);
    }

    public CreateAKSConfigmapResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAKSConfigmapResponse setBody(CreateAKSConfigmapResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAKSConfigmapResponseBody getBody() {
        return this.body;
    }

}
