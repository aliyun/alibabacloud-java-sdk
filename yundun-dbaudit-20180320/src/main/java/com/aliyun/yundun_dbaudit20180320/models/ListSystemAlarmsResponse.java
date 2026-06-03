// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ListSystemAlarmsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ListSystemAlarmsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSystemAlarmsResponse setBody(ListSystemAlarmsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSystemAlarmsResponseBody getBody() {
        return this.body;
    }

}
