// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpdateAlertResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public Object body;

    public static UpdateAlertResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlertResponse self = new UpdateAlertResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAlertResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAlertResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAlertResponse setBody(Object body) {
        this.body = body;
        return this;
    }
    public Object getBody() {
        return this.body;
    }

}
