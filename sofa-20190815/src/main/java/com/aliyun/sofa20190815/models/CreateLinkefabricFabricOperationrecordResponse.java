// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkefabricFabricOperationrecordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkefabricFabricOperationrecordResponseBody body;

    public static CreateLinkefabricFabricOperationrecordResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkefabricFabricOperationrecordResponse self = new CreateLinkefabricFabricOperationrecordResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkefabricFabricOperationrecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkefabricFabricOperationrecordResponse setBody(CreateLinkefabricFabricOperationrecordResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkefabricFabricOperationrecordResponseBody getBody() {
        return this.body;
    }

}
