// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RebootRCInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RebootRCInstancesResponseBody body;

    public static RebootRCInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        RebootRCInstancesResponse self = new RebootRCInstancesResponse();
        return TeaModel.build(map, self);
    }

    public RebootRCInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RebootRCInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RebootRCInstancesResponse setBody(RebootRCInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public RebootRCInstancesResponseBody getBody() {
        return this.body;
    }

}
