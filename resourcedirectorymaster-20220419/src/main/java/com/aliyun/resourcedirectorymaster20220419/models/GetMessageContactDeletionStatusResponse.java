// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class GetMessageContactDeletionStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMessageContactDeletionStatusResponseBody body;

    public static GetMessageContactDeletionStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMessageContactDeletionStatusResponse self = new GetMessageContactDeletionStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetMessageContactDeletionStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMessageContactDeletionStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMessageContactDeletionStatusResponse setBody(GetMessageContactDeletionStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMessageContactDeletionStatusResponseBody getBody() {
        return this.body;
    }

}
