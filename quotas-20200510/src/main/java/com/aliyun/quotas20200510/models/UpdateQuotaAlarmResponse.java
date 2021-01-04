// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class UpdateQuotaAlarmResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public UpdateQuotaAlarmResponse setBody(UpdateQuotaAlarmResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateQuotaAlarmResponseBody getBody() {
        return this.body;
    }

}
