// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasInspectPythonpluginfullcodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetHasInspectPythonpluginfullcodeResponseBody body;

    public static GetHasInspectPythonpluginfullcodeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHasInspectPythonpluginfullcodeResponse self = new GetHasInspectPythonpluginfullcodeResponse();
        return TeaModel.build(map, self);
    }

    public GetHasInspectPythonpluginfullcodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHasInspectPythonpluginfullcodeResponse setBody(GetHasInspectPythonpluginfullcodeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHasInspectPythonpluginfullcodeResponseBody getBody() {
        return this.body;
    }

}
