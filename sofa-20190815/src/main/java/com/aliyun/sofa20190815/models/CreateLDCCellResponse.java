// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLDCCellResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLDCCellResponseBody body;

    public static CreateLDCCellResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLDCCellResponse self = new CreateLDCCellResponse();
        return TeaModel.build(map, self);
    }

    public CreateLDCCellResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLDCCellResponse setBody(CreateLDCCellResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLDCCellResponseBody getBody() {
        return this.body;
    }

}
