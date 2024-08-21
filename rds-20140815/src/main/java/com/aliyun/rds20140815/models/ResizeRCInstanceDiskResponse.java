// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ResizeRCInstanceDiskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResizeRCInstanceDiskResponseBody body;

    public static ResizeRCInstanceDiskResponse build(java.util.Map<String, ?> map) throws Exception {
        ResizeRCInstanceDiskResponse self = new ResizeRCInstanceDiskResponse();
        return TeaModel.build(map, self);
    }

    public ResizeRCInstanceDiskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResizeRCInstanceDiskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResizeRCInstanceDiskResponse setBody(ResizeRCInstanceDiskResponseBody body) {
        this.body = body;
        return this;
    }
    public ResizeRCInstanceDiskResponseBody getBody() {
        return this.body;
    }

}
