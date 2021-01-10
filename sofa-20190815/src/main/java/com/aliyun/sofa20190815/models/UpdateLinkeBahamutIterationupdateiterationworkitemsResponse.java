// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutIterationupdateiterationworkitemsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeBahamutIterationupdateiterationworkitemsResponseBody body;

    public static UpdateLinkeBahamutIterationupdateiterationworkitemsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutIterationupdateiterationworkitemsResponse self = new UpdateLinkeBahamutIterationupdateiterationworkitemsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutIterationupdateiterationworkitemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeBahamutIterationupdateiterationworkitemsResponse setBody(UpdateLinkeBahamutIterationupdateiterationworkitemsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeBahamutIterationupdateiterationworkitemsResponseBody getBody() {
        return this.body;
    }

}
