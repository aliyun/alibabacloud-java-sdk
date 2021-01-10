// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateTSTriggerInstanceLimitRateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateTSTriggerInstanceLimitRateResponseBody body;

    public static UpdateTSTriggerInstanceLimitRateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTSTriggerInstanceLimitRateResponse self = new UpdateTSTriggerInstanceLimitRateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTSTriggerInstanceLimitRateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTSTriggerInstanceLimitRateResponse setBody(UpdateTSTriggerInstanceLimitRateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTSTriggerInstanceLimitRateResponseBody getBody() {
        return this.body;
    }

}
