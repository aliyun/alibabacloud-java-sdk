// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateAlarmEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAlarmEventResponseBody body;

    public static UpdateAlarmEventResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlarmEventResponse self = new UpdateAlarmEventResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAlarmEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAlarmEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAlarmEventResponse setBody(UpdateAlarmEventResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAlarmEventResponseBody getBody() {
        return this.body;
    }

}
