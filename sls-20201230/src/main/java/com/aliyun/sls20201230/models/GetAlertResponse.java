// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetAlertResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public Alert body;

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

    public GetAlertResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAlertResponse setBody(Alert body) {
        this.body = body;
        return this;
    }
    public Alert getBody() {
        return this.body;
    }

}
