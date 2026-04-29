// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class UpdateMOQuotaAlertThresholdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMOQuotaAlertThresholdResponseBody body;

    public static UpdateMOQuotaAlertThresholdResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMOQuotaAlertThresholdResponse self = new UpdateMOQuotaAlertThresholdResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMOQuotaAlertThresholdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMOQuotaAlertThresholdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMOQuotaAlertThresholdResponse setBody(UpdateMOQuotaAlertThresholdResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMOQuotaAlertThresholdResponseBody getBody() {
        return this.body;
    }

}
