// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutPipelinetemplateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeBahamutPipelinetemplateResponseBody body;

    public static UpdateLinkeBahamutPipelinetemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutPipelinetemplateResponse self = new UpdateLinkeBahamutPipelinetemplateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutPipelinetemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeBahamutPipelinetemplateResponse setBody(UpdateLinkeBahamutPipelinetemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeBahamutPipelinetemplateResponseBody getBody() {
        return this.body;
    }

}
