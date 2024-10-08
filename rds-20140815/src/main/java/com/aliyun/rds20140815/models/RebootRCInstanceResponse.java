// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RebootRCInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RebootRCInstanceResponseBody body;

    public static RebootRCInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RebootRCInstanceResponse self = new RebootRCInstanceResponse();
        return TeaModel.build(map, self);
    }

    public RebootRCInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RebootRCInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RebootRCInstanceResponse setBody(RebootRCInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public RebootRCInstanceResponseBody getBody() {
        return this.body;
    }

}
