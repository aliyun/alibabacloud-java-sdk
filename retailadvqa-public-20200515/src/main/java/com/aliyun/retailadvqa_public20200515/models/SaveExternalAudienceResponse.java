// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class SaveExternalAudienceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveExternalAudienceResponseBody body;

    public static SaveExternalAudienceResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveExternalAudienceResponse self = new SaveExternalAudienceResponse();
        return TeaModel.build(map, self);
    }

    public SaveExternalAudienceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveExternalAudienceResponse setBody(SaveExternalAudienceResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveExternalAudienceResponseBody getBody() {
        return this.body;
    }

}
