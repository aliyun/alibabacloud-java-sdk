// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateKBSyncLinkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateKBSyncLinkResponseBody body;

    public static CreateKBSyncLinkResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateKBSyncLinkResponse self = new CreateKBSyncLinkResponse();
        return TeaModel.build(map, self);
    }

    public CreateKBSyncLinkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateKBSyncLinkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateKBSyncLinkResponse setBody(CreateKBSyncLinkResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateKBSyncLinkResponseBody getBody() {
        return this.body;
    }

}
