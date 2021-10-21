// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class ConfirmAdditionalMaterialResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ConfirmAdditionalMaterialResponseBody body;

    public static ConfirmAdditionalMaterialResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfirmAdditionalMaterialResponse self = new ConfirmAdditionalMaterialResponse();
        return TeaModel.build(map, self);
    }

    public ConfirmAdditionalMaterialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfirmAdditionalMaterialResponse setBody(ConfirmAdditionalMaterialResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfirmAdditionalMaterialResponseBody getBody() {
        return this.body;
    }

}
