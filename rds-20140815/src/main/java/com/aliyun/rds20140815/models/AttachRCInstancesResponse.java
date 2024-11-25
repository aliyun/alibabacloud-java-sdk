// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class AttachRCInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AttachRCInstancesResponseBody body;

    public static AttachRCInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachRCInstancesResponse self = new AttachRCInstancesResponse();
        return TeaModel.build(map, self);
    }

    public AttachRCInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachRCInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachRCInstancesResponse setBody(AttachRCInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachRCInstancesResponseBody getBody() {
        return this.body;
    }

}
