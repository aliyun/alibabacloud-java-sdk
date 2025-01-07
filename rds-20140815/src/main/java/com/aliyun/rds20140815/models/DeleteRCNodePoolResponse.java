// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteRCNodePoolResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRCNodePoolResponseBody body;

    public static DeleteRCNodePoolResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRCNodePoolResponse self = new DeleteRCNodePoolResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRCNodePoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRCNodePoolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRCNodePoolResponse setBody(DeleteRCNodePoolResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRCNodePoolResponseBody getBody() {
        return this.body;
    }

}
