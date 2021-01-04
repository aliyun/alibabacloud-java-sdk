// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class GetQuotaAlarmResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetQuotaAlarmResponse setBody(GetQuotaAlarmResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQuotaAlarmResponseBody getBody() {
        return this.body;
    }

}
