// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecHasInspectJavaplugincopyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecHasInspectJavaplugincopyResponseBody body;

    public static ExecHasInspectJavaplugincopyResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecHasInspectJavaplugincopyResponse self = new ExecHasInspectJavaplugincopyResponse();
        return TeaModel.build(map, self);
    }

    public ExecHasInspectJavaplugincopyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecHasInspectJavaplugincopyResponse setBody(ExecHasInspectJavaplugincopyResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecHasInspectJavaplugincopyResponseBody getBody() {
        return this.body;
    }

}
