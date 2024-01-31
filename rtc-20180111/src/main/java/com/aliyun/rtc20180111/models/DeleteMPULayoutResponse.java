// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DeleteMPULayoutResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMPULayoutResponseBody body;

    public static DeleteMPULayoutResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMPULayoutResponse self = new DeleteMPULayoutResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMPULayoutResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMPULayoutResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMPULayoutResponse setBody(DeleteMPULayoutResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMPULayoutResponseBody getBody() {
        return this.body;
    }

}
