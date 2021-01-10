// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLDCUnifiedAccessInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLDCUnifiedAccessInstanceResponseBody body;

    public static DeleteLDCUnifiedAccessInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLDCUnifiedAccessInstanceResponse self = new DeleteLDCUnifiedAccessInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLDCUnifiedAccessInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLDCUnifiedAccessInstanceResponse setBody(DeleteLDCUnifiedAccessInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLDCUnifiedAccessInstanceResponseBody getBody() {
        return this.body;
    }

}
