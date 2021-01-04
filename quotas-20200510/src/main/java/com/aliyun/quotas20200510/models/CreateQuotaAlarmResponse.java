// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class CreateQuotaAlarmResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateQuotaAlarmResponse setBody(CreateQuotaAlarmResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateQuotaAlarmResponseBody getBody() {
        return this.body;
    }

}
