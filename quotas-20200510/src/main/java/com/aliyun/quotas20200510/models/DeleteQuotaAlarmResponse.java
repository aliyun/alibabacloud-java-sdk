// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class DeleteQuotaAlarmResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DeleteQuotaAlarmResponse setBody(DeleteQuotaAlarmResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteQuotaAlarmResponseBody getBody() {
        return this.body;
    }

}
