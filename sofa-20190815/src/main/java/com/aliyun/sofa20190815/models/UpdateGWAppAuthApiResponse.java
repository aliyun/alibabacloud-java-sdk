// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateGWAppAuthApiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateGWAppAuthApiResponseBody body;

    public static UpdateGWAppAuthApiResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGWAppAuthApiResponse self = new UpdateGWAppAuthApiResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGWAppAuthApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGWAppAuthApiResponse setBody(UpdateGWAppAuthApiResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGWAppAuthApiResponseBody getBody() {
        return this.body;
    }

}
