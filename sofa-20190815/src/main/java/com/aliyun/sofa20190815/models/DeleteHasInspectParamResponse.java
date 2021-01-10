// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteHasInspectParamResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteHasInspectParamResponseBody body;

    public static DeleteHasInspectParamResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHasInspectParamResponse self = new DeleteHasInspectParamResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHasInspectParamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHasInspectParamResponse setBody(DeleteHasInspectParamResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHasInspectParamResponseBody getBody() {
        return this.body;
    }

}
