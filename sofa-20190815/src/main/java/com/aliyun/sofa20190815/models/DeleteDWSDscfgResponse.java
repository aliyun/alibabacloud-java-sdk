// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteDWSDscfgResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDWSDscfgResponseBody body;

    public static DeleteDWSDscfgResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDWSDscfgResponse self = new DeleteDWSDscfgResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDWSDscfgResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDWSDscfgResponse setBody(DeleteDWSDscfgResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDWSDscfgResponseBody getBody() {
        return this.body;
    }

}
