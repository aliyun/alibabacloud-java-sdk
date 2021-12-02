// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AddSourcesToTrafficMirrorSessionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddSourcesToTrafficMirrorSessionResponseBody body;

    public static AddSourcesToTrafficMirrorSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        AddSourcesToTrafficMirrorSessionResponse self = new AddSourcesToTrafficMirrorSessionResponse();
        return TeaModel.build(map, self);
    }

    public AddSourcesToTrafficMirrorSessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddSourcesToTrafficMirrorSessionResponse setBody(AddSourcesToTrafficMirrorSessionResponseBody body) {
        this.body = body;
        return this;
    }
    public AddSourcesToTrafficMirrorSessionResponseBody getBody() {
        return this.body;
    }

}
