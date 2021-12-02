// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateFullNatEntryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateFullNatEntryResponseBody body;

    public static CreateFullNatEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFullNatEntryResponse self = new CreateFullNatEntryResponse();
        return TeaModel.build(map, self);
    }

    public CreateFullNatEntryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFullNatEntryResponse setBody(CreateFullNatEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFullNatEntryResponseBody getBody() {
        return this.body;
    }

}
