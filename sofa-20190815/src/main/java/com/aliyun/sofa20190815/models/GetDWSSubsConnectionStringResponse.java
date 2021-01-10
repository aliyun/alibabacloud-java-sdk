// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSSubsConnectionStringResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDWSSubsConnectionStringResponseBody body;

    public static GetDWSSubsConnectionStringResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDWSSubsConnectionStringResponse self = new GetDWSSubsConnectionStringResponse();
        return TeaModel.build(map, self);
    }

    public GetDWSSubsConnectionStringResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDWSSubsConnectionStringResponse setBody(GetDWSSubsConnectionStringResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDWSSubsConnectionStringResponseBody getBody() {
        return this.body;
    }

}
