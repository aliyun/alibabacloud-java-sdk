// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasDiagnosisShelltaskdetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetHasDiagnosisShelltaskdetailResponseBody body;

    public static GetHasDiagnosisShelltaskdetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHasDiagnosisShelltaskdetailResponse self = new GetHasDiagnosisShelltaskdetailResponse();
        return TeaModel.build(map, self);
    }

    public GetHasDiagnosisShelltaskdetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHasDiagnosisShelltaskdetailResponse setBody(GetHasDiagnosisShelltaskdetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHasDiagnosisShelltaskdetailResponseBody getBody() {
        return this.body;
    }

}
