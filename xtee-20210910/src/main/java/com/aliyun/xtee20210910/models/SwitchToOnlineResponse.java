// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class SwitchToOnlineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SwitchToOnlineResponseBody body;

    public static SwitchToOnlineResponse build(java.util.Map<String, ?> map) throws Exception {
        SwitchToOnlineResponse self = new SwitchToOnlineResponse();
        return TeaModel.build(map, self);
    }

    public SwitchToOnlineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SwitchToOnlineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SwitchToOnlineResponse setBody(SwitchToOnlineResponseBody body) {
        this.body = body;
        return this;
    }
    public SwitchToOnlineResponseBody getBody() {
        return this.body;
    }

}
