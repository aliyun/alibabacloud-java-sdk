// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class ValidateVirtualClusterNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ValidateVirtualClusterNameResponseBody body;

    public static ValidateVirtualClusterNameResponse build(java.util.Map<String, ?> map) throws Exception {
        ValidateVirtualClusterNameResponse self = new ValidateVirtualClusterNameResponse();
        return TeaModel.build(map, self);
    }

    public ValidateVirtualClusterNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ValidateVirtualClusterNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ValidateVirtualClusterNameResponse setBody(ValidateVirtualClusterNameResponseBody body) {
        this.body = body;
        return this;
    }
    public ValidateVirtualClusterNameResponseBody getBody() {
        return this.body;
    }

}
