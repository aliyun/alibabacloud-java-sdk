// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateTSTopologyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateTSTopologyResponseBody body;

    public static CreateTSTopologyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTSTopologyResponse self = new CreateTSTopologyResponse();
        return TeaModel.build(map, self);
    }

    public CreateTSTopologyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTSTopologyResponse setBody(CreateTSTopologyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTSTopologyResponseBody getBody() {
        return this.body;
    }

}
