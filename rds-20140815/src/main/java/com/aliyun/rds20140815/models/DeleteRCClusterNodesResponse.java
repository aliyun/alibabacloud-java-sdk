// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteRCClusterNodesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRCClusterNodesResponseBody body;

    public static DeleteRCClusterNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRCClusterNodesResponse self = new DeleteRCClusterNodesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRCClusterNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRCClusterNodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRCClusterNodesResponse setBody(DeleteRCClusterNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRCClusterNodesResponseBody getBody() {
        return this.body;
    }

}
