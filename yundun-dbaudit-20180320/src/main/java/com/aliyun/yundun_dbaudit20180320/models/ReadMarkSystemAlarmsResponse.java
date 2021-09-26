// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ReadMarkSystemAlarmsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReadMarkSystemAlarmsResponseBody body;

    public static ReadMarkSystemAlarmsResponse build(java.util.Map<String, ?> map) throws Exception {
        ReadMarkSystemAlarmsResponse self = new ReadMarkSystemAlarmsResponse();
        return TeaModel.build(map, self);
    }

    public ReadMarkSystemAlarmsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReadMarkSystemAlarmsResponse setBody(ReadMarkSystemAlarmsResponseBody body) {
        this.body = body;
        return this;
    }
    public ReadMarkSystemAlarmsResponseBody getBody() {
        return this.body;
    }

}
