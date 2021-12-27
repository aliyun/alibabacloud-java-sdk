// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20191023.models;

import com.aliyun.tea.*;

public class GetAlertHistoriesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAlertHistoriesResponseBody body;

    public static GetAlertHistoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAlertHistoriesResponse self = new GetAlertHistoriesResponse();
        return TeaModel.build(map, self);
    }

    public GetAlertHistoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAlertHistoriesResponse setBody(GetAlertHistoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAlertHistoriesResponseBody getBody() {
        return this.body;
    }

}
