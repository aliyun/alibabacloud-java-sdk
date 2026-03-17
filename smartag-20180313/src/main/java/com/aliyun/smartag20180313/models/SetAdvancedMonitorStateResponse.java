// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class SetAdvancedMonitorStateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetAdvancedMonitorStateResponseBody body;

    public static SetAdvancedMonitorStateResponse build(java.util.Map<String, ?> map) throws Exception {
        SetAdvancedMonitorStateResponse self = new SetAdvancedMonitorStateResponse();
        return TeaModel.build(map, self);
    }

    public SetAdvancedMonitorStateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetAdvancedMonitorStateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetAdvancedMonitorStateResponse setBody(SetAdvancedMonitorStateResponseBody body) {
        this.body = body;
        return this;
    }
    public SetAdvancedMonitorStateResponseBody getBody() {
        return this.body;
    }

}
