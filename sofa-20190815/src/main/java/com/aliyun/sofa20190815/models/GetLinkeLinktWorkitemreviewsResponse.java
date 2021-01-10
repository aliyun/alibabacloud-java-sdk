// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeLinktWorkitemreviewsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeLinktWorkitemreviewsResponseBody body;

    public static GetLinkeLinktWorkitemreviewsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeLinktWorkitemreviewsResponse self = new GetLinkeLinktWorkitemreviewsResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeLinktWorkitemreviewsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeLinktWorkitemreviewsResponse setBody(GetLinkeLinktWorkitemreviewsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeLinktWorkitemreviewsResponseBody getBody() {
        return this.body;
    }

}
