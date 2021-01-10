// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLDCCellResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLDCCellResponseBody body;

    public static GetLDCCellResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLDCCellResponse self = new GetLDCCellResponse();
        return TeaModel.build(map, self);
    }

    public GetLDCCellResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLDCCellResponse setBody(GetLDCCellResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLDCCellResponseBody getBody() {
        return this.body;
    }

}
