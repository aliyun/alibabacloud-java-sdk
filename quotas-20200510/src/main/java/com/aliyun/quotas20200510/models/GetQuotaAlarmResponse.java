// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class GetQuotaAlarmResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetQuotaAlarmResponseBody body;

    public static GetQuotaAlarmResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQuotaAlarmResponse self = new GetQuotaAlarmResponse();
        return TeaModel.build(map, self);
    }

    public GetQuotaAlarmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQuotaAlarmResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetQuotaAlarmResponse setBody(GetQuotaAlarmResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQuotaAlarmResponseBody getBody() {
        return this.body;
    }

}
