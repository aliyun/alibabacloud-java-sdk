// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteRCDiskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRCDiskResponseBody body;

    public static DeleteRCDiskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRCDiskResponse self = new DeleteRCDiskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRCDiskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRCDiskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRCDiskResponse setBody(DeleteRCDiskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRCDiskResponseBody getBody() {
        return this.body;
    }

}
