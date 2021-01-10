// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecHasInspectPythonplugincopyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecHasInspectPythonplugincopyResponseBody body;

    public static ExecHasInspectPythonplugincopyResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecHasInspectPythonplugincopyResponse self = new ExecHasInspectPythonplugincopyResponse();
        return TeaModel.build(map, self);
    }

    public ExecHasInspectPythonplugincopyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecHasInspectPythonplugincopyResponse setBody(ExecHasInspectPythonplugincopyResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecHasInspectPythonplugincopyResponseBody getBody() {
        return this.body;
    }

}
