// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class SetDeployPauseTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetDeployPauseTypeResponseBody body;

    public static SetDeployPauseTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDeployPauseTypeResponse self = new SetDeployPauseTypeResponse();
        return TeaModel.build(map, self);
    }

    public SetDeployPauseTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetDeployPauseTypeResponse setBody(SetDeployPauseTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDeployPauseTypeResponseBody getBody() {
        return this.body;
    }

}
