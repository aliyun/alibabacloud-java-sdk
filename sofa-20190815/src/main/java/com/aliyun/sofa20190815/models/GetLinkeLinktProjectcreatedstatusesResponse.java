// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeLinktProjectcreatedstatusesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeLinktProjectcreatedstatusesResponseBody body;

    public static GetLinkeLinktProjectcreatedstatusesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeLinktProjectcreatedstatusesResponse self = new GetLinkeLinktProjectcreatedstatusesResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeLinktProjectcreatedstatusesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeLinktProjectcreatedstatusesResponse setBody(GetLinkeLinktProjectcreatedstatusesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeLinktProjectcreatedstatusesResponseBody getBody() {
        return this.body;
    }

}
