// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetOriginLayoutDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetOriginLayoutDataResponseBody body;

    public static GetOriginLayoutDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOriginLayoutDataResponse self = new GetOriginLayoutDataResponse();
        return TeaModel.build(map, self);
    }

    public GetOriginLayoutDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOriginLayoutDataResponse setBody(GetOriginLayoutDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOriginLayoutDataResponseBody getBody() {
        return this.body;
    }

}
