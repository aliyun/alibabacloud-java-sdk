// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20191023.models;

import com.aliyun.tea.*;

public class SetAlertCenterResourceByConsoleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetAlertCenterResourceByConsoleResponseBody body;

    public static SetAlertCenterResourceByConsoleResponse build(java.util.Map<String, ?> map) throws Exception {
        SetAlertCenterResourceByConsoleResponse self = new SetAlertCenterResourceByConsoleResponse();
        return TeaModel.build(map, self);
    }

    public SetAlertCenterResourceByConsoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetAlertCenterResourceByConsoleResponse setBody(SetAlertCenterResourceByConsoleResponseBody body) {
        this.body = body;
        return this;
    }
    public SetAlertCenterResourceByConsoleResponseBody getBody() {
        return this.body;
    }

}
