// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasConfigsSwitchesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetHasConfigsSwitchesResponseBody body;

    public static GetHasConfigsSwitchesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHasConfigsSwitchesResponse self = new GetHasConfigsSwitchesResponse();
        return TeaModel.build(map, self);
    }

    public GetHasConfigsSwitchesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHasConfigsSwitchesResponse setBody(GetHasConfigsSwitchesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHasConfigsSwitchesResponseBody getBody() {
        return this.body;
    }

}
