// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20191023.models;

import com.aliyun.tea.*;

public class SetAlertCenterResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetAlertCenterResourceResponseBody body;

    public static SetAlertCenterResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        SetAlertCenterResourceResponse self = new SetAlertCenterResourceResponse();
        return TeaModel.build(map, self);
    }

    public SetAlertCenterResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetAlertCenterResourceResponse setBody(SetAlertCenterResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public SetAlertCenterResourceResponseBody getBody() {
        return this.body;
    }

}
