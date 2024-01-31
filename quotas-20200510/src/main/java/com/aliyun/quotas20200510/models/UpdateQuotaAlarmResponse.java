// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class UpdateQuotaAlarmResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateQuotaAlarmResponseBody body;

    public static UpdateQuotaAlarmResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateQuotaAlarmResponse self = new UpdateQuotaAlarmResponse();
        return TeaModel.build(map, self);
    }

    public UpdateQuotaAlarmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateQuotaAlarmResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateQuotaAlarmResponse setBody(UpdateQuotaAlarmResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateQuotaAlarmResponseBody getBody() {
        return this.body;
    }

}
