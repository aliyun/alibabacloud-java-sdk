// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutIterationsupdateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeBahamutIterationsupdateResponseBody body;

    public static UpdateLinkeBahamutIterationsupdateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutIterationsupdateResponse self = new UpdateLinkeBahamutIterationsupdateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutIterationsupdateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeBahamutIterationsupdateResponse setBody(UpdateLinkeBahamutIterationsupdateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeBahamutIterationsupdateResponseBody getBody() {
        return this.body;
    }

}
