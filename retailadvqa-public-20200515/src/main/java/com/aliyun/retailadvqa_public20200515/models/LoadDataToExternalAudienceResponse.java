// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class LoadDataToExternalAudienceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public LoadDataToExternalAudienceResponseBody body;

    public static LoadDataToExternalAudienceResponse build(java.util.Map<String, ?> map) throws Exception {
        LoadDataToExternalAudienceResponse self = new LoadDataToExternalAudienceResponse();
        return TeaModel.build(map, self);
    }

    public LoadDataToExternalAudienceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LoadDataToExternalAudienceResponse setBody(LoadDataToExternalAudienceResponseBody body) {
        this.body = body;
        return this;
    }
    public LoadDataToExternalAudienceResponseBody getBody() {
        return this.body;
    }

}
