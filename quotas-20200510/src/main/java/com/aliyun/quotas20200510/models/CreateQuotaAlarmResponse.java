// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class CreateQuotaAlarmResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateQuotaAlarmResponseBody body;

    public static CreateQuotaAlarmResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateQuotaAlarmResponse self = new CreateQuotaAlarmResponse();
        return TeaModel.build(map, self);
    }

    public CreateQuotaAlarmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateQuotaAlarmResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateQuotaAlarmResponse setBody(CreateQuotaAlarmResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateQuotaAlarmResponseBody getBody() {
        return this.body;
    }

}
