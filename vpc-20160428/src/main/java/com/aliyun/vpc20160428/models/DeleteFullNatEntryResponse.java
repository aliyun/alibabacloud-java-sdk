// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteFullNatEntryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteFullNatEntryResponseBody body;

    public static DeleteFullNatEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFullNatEntryResponse self = new DeleteFullNatEntryResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFullNatEntryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFullNatEntryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteFullNatEntryResponse setBody(DeleteFullNatEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFullNatEntryResponseBody getBody() {
        return this.body;
    }

}
