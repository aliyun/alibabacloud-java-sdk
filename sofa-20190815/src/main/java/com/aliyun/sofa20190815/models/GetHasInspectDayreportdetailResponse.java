// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasInspectDayreportdetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetHasInspectDayreportdetailResponseBody body;

    public static GetHasInspectDayreportdetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHasInspectDayreportdetailResponse self = new GetHasInspectDayreportdetailResponse();
        return TeaModel.build(map, self);
    }

    public GetHasInspectDayreportdetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHasInspectDayreportdetailResponse setBody(GetHasInspectDayreportdetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHasInspectDayreportdetailResponseBody getBody() {
        return this.body;
    }

}
