// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDWSConfigResponseBody body;

    public static GetDWSConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDWSConfigResponse self = new GetDWSConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetDWSConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDWSConfigResponse setBody(GetDWSConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDWSConfigResponseBody getBody() {
        return this.body;
    }

}
