// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class GetAdvancedMonitorStateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetAdvancedMonitorStateResponseBody body;

    public static GetAdvancedMonitorStateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAdvancedMonitorStateResponse self = new GetAdvancedMonitorStateResponse();
        return TeaModel.build(map, self);
    }

    public GetAdvancedMonitorStateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAdvancedMonitorStateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAdvancedMonitorStateResponse setBody(GetAdvancedMonitorStateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAdvancedMonitorStateResponseBody getBody() {
        return this.body;
    }

}
