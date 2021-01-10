// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLDCCellResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLDCCellResponseBody body;

    public static DeleteLDCCellResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLDCCellResponse self = new DeleteLDCCellResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLDCCellResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLDCCellResponse setBody(DeleteLDCCellResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLDCCellResponseBody getBody() {
        return this.body;
    }

}
