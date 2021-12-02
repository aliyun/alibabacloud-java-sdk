// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteFullNatEntryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DeleteFullNatEntryResponse setBody(DeleteFullNatEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFullNatEntryResponseBody getBody() {
        return this.body;
    }

}
