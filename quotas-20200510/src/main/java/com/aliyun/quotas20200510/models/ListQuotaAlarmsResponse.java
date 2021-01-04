// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class ListQuotaAlarmsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListQuotaAlarmsResponseBody body;

    public static ListQuotaAlarmsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListQuotaAlarmsResponse self = new ListQuotaAlarmsResponse();
        return TeaModel.build(map, self);
    }

    public ListQuotaAlarmsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListQuotaAlarmsResponse setBody(ListQuotaAlarmsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListQuotaAlarmsResponseBody getBody() {
        return this.body;
    }

}
