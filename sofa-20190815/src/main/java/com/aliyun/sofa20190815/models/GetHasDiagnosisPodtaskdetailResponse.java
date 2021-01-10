// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasDiagnosisPodtaskdetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetHasDiagnosisPodtaskdetailResponseBody body;

    public static GetHasDiagnosisPodtaskdetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHasDiagnosisPodtaskdetailResponse self = new GetHasDiagnosisPodtaskdetailResponse();
        return TeaModel.build(map, self);
    }

    public GetHasDiagnosisPodtaskdetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHasDiagnosisPodtaskdetailResponse setBody(GetHasDiagnosisPodtaskdetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHasDiagnosisPodtaskdetailResponseBody getBody() {
        return this.body;
    }

}
