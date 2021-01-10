// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecHasInspectShellplugincopyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecHasInspectShellplugincopyResponseBody body;

    public static ExecHasInspectShellplugincopyResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecHasInspectShellplugincopyResponse self = new ExecHasInspectShellplugincopyResponse();
        return TeaModel.build(map, self);
    }

    public ExecHasInspectShellplugincopyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecHasInspectShellplugincopyResponse setBody(ExecHasInspectShellplugincopyResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecHasInspectShellplugincopyResponseBody getBody() {
        return this.body;
    }

}
