// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasRiskInspectdetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetHasRiskInspectdetailResponseBody body;

    public static GetHasRiskInspectdetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHasRiskInspectdetailResponse self = new GetHasRiskInspectdetailResponse();
        return TeaModel.build(map, self);
    }

    public GetHasRiskInspectdetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHasRiskInspectdetailResponse setBody(GetHasRiskInspectdetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHasRiskInspectdetailResponseBody getBody() {
        return this.body;
    }

}
