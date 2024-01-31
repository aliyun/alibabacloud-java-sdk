// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class SetClusterInterceptionConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetClusterInterceptionConfigResponseBody body;

    public static SetClusterInterceptionConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetClusterInterceptionConfigResponse self = new SetClusterInterceptionConfigResponse();
        return TeaModel.build(map, self);
    }

    public SetClusterInterceptionConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetClusterInterceptionConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetClusterInterceptionConfigResponse setBody(SetClusterInterceptionConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SetClusterInterceptionConfigResponseBody getBody() {
        return this.body;
    }

}
