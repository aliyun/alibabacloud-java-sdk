// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteRCInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRCInstancesResponseBody body;

    public static DeleteRCInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRCInstancesResponse self = new DeleteRCInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRCInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRCInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRCInstancesResponse setBody(DeleteRCInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRCInstancesResponseBody getBody() {
        return this.body;
    }

}
