// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLDCCellResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLDCCellResponseBody body;

    public static UpdateLDCCellResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLDCCellResponse self = new UpdateLDCCellResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLDCCellResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLDCCellResponse setBody(UpdateLDCCellResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLDCCellResponseBody getBody() {
        return this.body;
    }

}
