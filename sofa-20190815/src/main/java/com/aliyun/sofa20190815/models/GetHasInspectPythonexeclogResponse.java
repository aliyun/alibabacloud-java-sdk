// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasInspectPythonexeclogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetHasInspectPythonexeclogResponseBody body;

    public static GetHasInspectPythonexeclogResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHasInspectPythonexeclogResponse self = new GetHasInspectPythonexeclogResponse();
        return TeaModel.build(map, self);
    }

    public GetHasInspectPythonexeclogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHasInspectPythonexeclogResponse setBody(GetHasInspectPythonexeclogResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHasInspectPythonexeclogResponseBody getBody() {
        return this.body;
    }

}
