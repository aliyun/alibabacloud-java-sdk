// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class AttachRCDiskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AttachRCDiskResponseBody body;

    public static AttachRCDiskResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachRCDiskResponse self = new AttachRCDiskResponse();
        return TeaModel.build(map, self);
    }

    public AttachRCDiskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachRCDiskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachRCDiskResponse setBody(AttachRCDiskResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachRCDiskResponseBody getBody() {
        return this.body;
    }

}
