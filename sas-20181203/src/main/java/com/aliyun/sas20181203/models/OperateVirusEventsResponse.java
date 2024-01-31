// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperateVirusEventsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OperateVirusEventsResponseBody body;

    public static OperateVirusEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateVirusEventsResponse self = new OperateVirusEventsResponse();
        return TeaModel.build(map, self);
    }

    public OperateVirusEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OperateVirusEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OperateVirusEventsResponse setBody(OperateVirusEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public OperateVirusEventsResponseBody getBody() {
        return this.body;
    }

}
