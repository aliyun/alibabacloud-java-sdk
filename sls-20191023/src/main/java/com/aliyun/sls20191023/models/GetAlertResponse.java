// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20191023.models;

import com.aliyun.tea.*;

public class GetAlertResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAlertResponseBody body;

    public static GetAlertResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAlertResponse self = new GetAlertResponse();
        return TeaModel.build(map, self);
    }

    public GetAlertResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAlertResponse setBody(GetAlertResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAlertResponseBody getBody() {
        return this.body;
    }

}
