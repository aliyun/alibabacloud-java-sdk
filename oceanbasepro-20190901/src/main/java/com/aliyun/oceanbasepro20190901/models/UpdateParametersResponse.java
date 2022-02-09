// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class UpdateParametersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateParametersResponseBody body;

    public static UpdateParametersResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateParametersResponse self = new UpdateParametersResponse();
        return TeaModel.build(map, self);
    }

    public UpdateParametersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateParametersResponse setBody(UpdateParametersResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateParametersResponseBody getBody() {
        return this.body;
    }

}
