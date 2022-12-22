// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.saasincubator20221206.models;

import com.aliyun.tea.*;

public class UpdateMeterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateMeterResponseBody body;

    public static UpdateMeterResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMeterResponse self = new UpdateMeterResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMeterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMeterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMeterResponse setBody(UpdateMeterResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMeterResponseBody getBody() {
        return this.body;
    }

}
