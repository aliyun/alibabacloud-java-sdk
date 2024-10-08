// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class DeleteABTestGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteABTestGroupResponseBody body;

    public static DeleteABTestGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteABTestGroupResponse self = new DeleteABTestGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteABTestGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteABTestGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteABTestGroupResponse setBody(DeleteABTestGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteABTestGroupResponseBody getBody() {
        return this.body;
    }

}
