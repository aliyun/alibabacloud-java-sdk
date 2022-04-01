// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class CreateClusterScriptResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StringResponse body;

    public static CreateClusterScriptResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterScriptResponse self = new CreateClusterScriptResponse();
        return TeaModel.build(map, self);
    }

    public CreateClusterScriptResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateClusterScriptResponse setBody(StringResponse body) {
        this.body = body;
        return this;
    }
    public StringResponse getBody() {
        return this.body;
    }

}
