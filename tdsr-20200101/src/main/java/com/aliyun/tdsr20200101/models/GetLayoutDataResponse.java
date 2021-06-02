// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetLayoutDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLayoutDataResponseBody body;

    public static GetLayoutDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLayoutDataResponse self = new GetLayoutDataResponse();
        return TeaModel.build(map, self);
    }

    public GetLayoutDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLayoutDataResponse setBody(GetLayoutDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLayoutDataResponseBody getBody() {
        return this.body;
    }

}
