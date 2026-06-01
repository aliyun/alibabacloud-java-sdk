// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class DeleteRayHistoryServerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRayHistoryServerResponseBody body;

    public static DeleteRayHistoryServerResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRayHistoryServerResponse self = new DeleteRayHistoryServerResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRayHistoryServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRayHistoryServerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRayHistoryServerResponse setBody(DeleteRayHistoryServerResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRayHistoryServerResponseBody getBody() {
        return this.body;
    }

}
