// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetAccessDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAccessDataResponseBody body;

    public static GetAccessDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAccessDataResponse self = new GetAccessDataResponse();
        return TeaModel.build(map, self);
    }

    public GetAccessDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAccessDataResponse setBody(GetAccessDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAccessDataResponseBody getBody() {
        return this.body;
    }

}
