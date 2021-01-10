// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateHasInspectParamResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateHasInspectParamResponseBody body;

    public static UpdateHasInspectParamResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateHasInspectParamResponse self = new UpdateHasInspectParamResponse();
        return TeaModel.build(map, self);
    }

    public UpdateHasInspectParamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateHasInspectParamResponse setBody(UpdateHasInspectParamResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateHasInspectParamResponseBody getBody() {
        return this.body;
    }

}
