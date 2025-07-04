// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RedeployRCInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RedeployRCInstanceResponseBody body;

    public static RedeployRCInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RedeployRCInstanceResponse self = new RedeployRCInstanceResponse();
        return TeaModel.build(map, self);
    }

    public RedeployRCInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RedeployRCInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RedeployRCInstanceResponse setBody(RedeployRCInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public RedeployRCInstanceResponseBody getBody() {
        return this.body;
    }

}
