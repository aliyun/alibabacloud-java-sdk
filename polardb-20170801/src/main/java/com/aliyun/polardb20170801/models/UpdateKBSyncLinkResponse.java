// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class UpdateKBSyncLinkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateKBSyncLinkResponseBody body;

    public static UpdateKBSyncLinkResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateKBSyncLinkResponse self = new UpdateKBSyncLinkResponse();
        return TeaModel.build(map, self);
    }

    public UpdateKBSyncLinkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateKBSyncLinkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateKBSyncLinkResponse setBody(UpdateKBSyncLinkResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateKBSyncLinkResponseBody getBody() {
        return this.body;
    }

}
