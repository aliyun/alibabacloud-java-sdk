// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasInspectShellpluginfullcodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetHasInspectShellpluginfullcodeResponseBody body;

    public static GetHasInspectShellpluginfullcodeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHasInspectShellpluginfullcodeResponse self = new GetHasInspectShellpluginfullcodeResponse();
        return TeaModel.build(map, self);
    }

    public GetHasInspectShellpluginfullcodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHasInspectShellpluginfullcodeResponse setBody(GetHasInspectShellpluginfullcodeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHasInspectShellpluginfullcodeResponseBody getBody() {
        return this.body;
    }

}
