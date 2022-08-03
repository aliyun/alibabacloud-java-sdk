// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20161111.models;

import com.aliyun.tea.*;

public class DeleteResourceGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteResourceGroupResponseBody body;

    public static DeleteResourceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourceGroupResponse self = new DeleteResourceGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteResourceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteResourceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteResourceGroupResponse setBody(DeleteResourceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteResourceGroupResponseBody getBody() {
        return this.body;
    }

}
