// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasInspectShelltaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetHasInspectShelltaskResponseBody body;

    public static GetHasInspectShelltaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHasInspectShelltaskResponse self = new GetHasInspectShelltaskResponse();
        return TeaModel.build(map, self);
    }

    public GetHasInspectShelltaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHasInspectShelltaskResponse setBody(GetHasInspectShelltaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHasInspectShelltaskResponseBody getBody() {
        return this.body;
    }

}
