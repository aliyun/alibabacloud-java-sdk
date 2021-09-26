// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ListSystemAlarmsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSystemAlarmsResponseBody body;

    public static ListSystemAlarmsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSystemAlarmsResponse self = new ListSystemAlarmsResponse();
        return TeaModel.build(map, self);
    }

    public ListSystemAlarmsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSystemAlarmsResponse setBody(ListSystemAlarmsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSystemAlarmsResponseBody getBody() {
        return this.body;
    }

}
