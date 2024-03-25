// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class ManualTriggerMaskingProcessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ManualTriggerMaskingProcessResponseBody body;

    public static ManualTriggerMaskingProcessResponse build(java.util.Map<String, ?> map) throws Exception {
        ManualTriggerMaskingProcessResponse self = new ManualTriggerMaskingProcessResponse();
        return TeaModel.build(map, self);
    }

    public ManualTriggerMaskingProcessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ManualTriggerMaskingProcessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ManualTriggerMaskingProcessResponse setBody(ManualTriggerMaskingProcessResponseBody body) {
        this.body = body;
        return this;
    }
    public ManualTriggerMaskingProcessResponseBody getBody() {
        return this.body;
    }

}
