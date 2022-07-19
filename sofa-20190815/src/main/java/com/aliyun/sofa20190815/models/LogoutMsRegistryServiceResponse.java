// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class LogoutMsRegistryServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public LogoutMsRegistryServiceResponseBody body;

    public static LogoutMsRegistryServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        LogoutMsRegistryServiceResponse self = new LogoutMsRegistryServiceResponse();
        return TeaModel.build(map, self);
    }

    public LogoutMsRegistryServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LogoutMsRegistryServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public LogoutMsRegistryServiceResponse setBody(LogoutMsRegistryServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public LogoutMsRegistryServiceResponseBody getBody() {
        return this.body;
    }

}
