// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class GetSingleConnDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetSingleConnDataResponseBody body;

    public static GetSingleConnDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSingleConnDataResponse self = new GetSingleConnDataResponse();
        return TeaModel.build(map, self);
    }

    public GetSingleConnDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSingleConnDataResponse setBody(GetSingleConnDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSingleConnDataResponseBody getBody() {
        return this.body;
    }

}
