// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasInspectSinglereportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetHasInspectSinglereportResponseBody body;

    public static GetHasInspectSinglereportResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHasInspectSinglereportResponse self = new GetHasInspectSinglereportResponse();
        return TeaModel.build(map, self);
    }

    public GetHasInspectSinglereportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHasInspectSinglereportResponse setBody(GetHasInspectSinglereportResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHasInspectSinglereportResponseBody getBody() {
        return this.body;
    }

}
