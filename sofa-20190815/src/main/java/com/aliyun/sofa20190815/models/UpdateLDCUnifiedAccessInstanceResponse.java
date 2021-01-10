// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLDCUnifiedAccessInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLDCUnifiedAccessInstanceResponseBody body;

    public static UpdateLDCUnifiedAccessInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLDCUnifiedAccessInstanceResponse self = new UpdateLDCUnifiedAccessInstanceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLDCUnifiedAccessInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLDCUnifiedAccessInstanceResponse setBody(UpdateLDCUnifiedAccessInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLDCUnifiedAccessInstanceResponseBody getBody() {
        return this.body;
    }

}
