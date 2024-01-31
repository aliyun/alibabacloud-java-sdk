// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListClusterInterceptionConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListClusterInterceptionConfigResponseBody body;

    public static ListClusterInterceptionConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClusterInterceptionConfigResponse self = new ListClusterInterceptionConfigResponse();
        return TeaModel.build(map, self);
    }

    public ListClusterInterceptionConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClusterInterceptionConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListClusterInterceptionConfigResponse setBody(ListClusterInterceptionConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClusterInterceptionConfigResponseBody getBody() {
        return this.body;
    }

}
