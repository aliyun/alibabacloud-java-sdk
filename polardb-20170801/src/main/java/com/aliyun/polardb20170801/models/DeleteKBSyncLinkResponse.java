// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteKBSyncLinkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteKBSyncLinkResponseBody body;

    public static DeleteKBSyncLinkResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteKBSyncLinkResponse self = new DeleteKBSyncLinkResponse();
        return TeaModel.build(map, self);
    }

    public DeleteKBSyncLinkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteKBSyncLinkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteKBSyncLinkResponse setBody(DeleteKBSyncLinkResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteKBSyncLinkResponseBody getBody() {
        return this.body;
    }

}
