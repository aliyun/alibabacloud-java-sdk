// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeLinktRelatableworkitemsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeLinktRelatableworkitemsResponseBody body;

    public static GetLinkeLinktRelatableworkitemsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeLinktRelatableworkitemsResponse self = new GetLinkeLinktRelatableworkitemsResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeLinktRelatableworkitemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeLinktRelatableworkitemsResponse setBody(GetLinkeLinktRelatableworkitemsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeLinktRelatableworkitemsResponseBody getBody() {
        return this.body;
    }

}
