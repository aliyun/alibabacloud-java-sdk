// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ots20160620.models;

import com.aliyun.tea.*;

public class OpenOtsServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OpenOtsServiceResponseBody body;

    public static OpenOtsServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenOtsServiceResponse self = new OpenOtsServiceResponse();
        return TeaModel.build(map, self);
    }

    public OpenOtsServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenOtsServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenOtsServiceResponse setBody(OpenOtsServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenOtsServiceResponseBody getBody() {
        return this.body;
    }

}
