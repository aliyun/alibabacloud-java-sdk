// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutIterationtemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeBahamutIterationtemplateResponseBody body;

    public static UpdateLinkeBahamutIterationtemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutIterationtemplateResponse self = new UpdateLinkeBahamutIterationtemplateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutIterationtemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeBahamutIterationtemplateResponse setBody(UpdateLinkeBahamutIterationtemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeBahamutIterationtemplateResponseBody getBody() {
        return this.body;
    }

}
