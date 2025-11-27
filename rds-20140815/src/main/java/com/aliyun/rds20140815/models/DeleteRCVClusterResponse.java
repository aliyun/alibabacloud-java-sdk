// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteRCVClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRCVClusterResponseBody body;

    public static DeleteRCVClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRCVClusterResponse self = new DeleteRCVClusterResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRCVClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRCVClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRCVClusterResponse setBody(DeleteRCVClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRCVClusterResponseBody getBody() {
        return this.body;
    }

}
