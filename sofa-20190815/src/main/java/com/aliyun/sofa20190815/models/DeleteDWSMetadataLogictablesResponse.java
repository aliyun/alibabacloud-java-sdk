// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteDWSMetadataLogictablesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDWSMetadataLogictablesResponseBody body;

    public static DeleteDWSMetadataLogictablesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDWSMetadataLogictablesResponse self = new DeleteDWSMetadataLogictablesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDWSMetadataLogictablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDWSMetadataLogictablesResponse setBody(DeleteDWSMetadataLogictablesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDWSMetadataLogictablesResponseBody getBody() {
        return this.body;
    }

}
