// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class GetAllowIPResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAllowIPResponseBody body;

    public static GetAllowIPResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAllowIPResponse self = new GetAllowIPResponse();
        return TeaModel.build(map, self);
    }

    public GetAllowIPResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAllowIPResponse setBody(GetAllowIPResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAllowIPResponseBody getBody() {
        return this.body;
    }

}
