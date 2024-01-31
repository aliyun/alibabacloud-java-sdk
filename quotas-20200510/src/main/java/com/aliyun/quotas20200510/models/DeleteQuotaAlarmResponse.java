// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class DeleteQuotaAlarmResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteQuotaAlarmResponseBody body;

    public static DeleteQuotaAlarmResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteQuotaAlarmResponse self = new DeleteQuotaAlarmResponse();
        return TeaModel.build(map, self);
    }

    public DeleteQuotaAlarmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteQuotaAlarmResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteQuotaAlarmResponse setBody(DeleteQuotaAlarmResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteQuotaAlarmResponseBody getBody() {
        return this.body;
    }

}
