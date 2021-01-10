// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateMsDrmAttributesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateMsDrmAttributesResponseBody body;

    public static UpdateMsDrmAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMsDrmAttributesResponse self = new UpdateMsDrmAttributesResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMsDrmAttributesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMsDrmAttributesResponse setBody(UpdateMsDrmAttributesResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMsDrmAttributesResponseBody getBody() {
        return this.body;
    }

}
