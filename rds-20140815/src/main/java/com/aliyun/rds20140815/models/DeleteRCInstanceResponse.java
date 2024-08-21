// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteRCInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRCInstanceResponseBody body;

    public static DeleteRCInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRCInstanceResponse self = new DeleteRCInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRCInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRCInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRCInstanceResponse setBody(DeleteRCInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRCInstanceResponseBody getBody() {
        return this.body;
    }

}
