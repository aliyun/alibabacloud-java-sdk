// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasDiagnosisPythonexeclogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetHasDiagnosisPythonexeclogResponseBody body;

    public static GetHasDiagnosisPythonexeclogResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHasDiagnosisPythonexeclogResponse self = new GetHasDiagnosisPythonexeclogResponse();
        return TeaModel.build(map, self);
    }

    public GetHasDiagnosisPythonexeclogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHasDiagnosisPythonexeclogResponse setBody(GetHasDiagnosisPythonexeclogResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHasDiagnosisPythonexeclogResponseBody getBody() {
        return this.body;
    }

}
