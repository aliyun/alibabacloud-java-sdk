// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smc20190601.models;

import com.aliyun.tea.*;

public class DeleteWorkgroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteWorkgroupResponseBody body;

    public static DeleteWorkgroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkgroupResponse self = new DeleteWorkgroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteWorkgroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteWorkgroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteWorkgroupResponse setBody(DeleteWorkgroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWorkgroupResponseBody getBody() {
        return this.body;
    }

}
