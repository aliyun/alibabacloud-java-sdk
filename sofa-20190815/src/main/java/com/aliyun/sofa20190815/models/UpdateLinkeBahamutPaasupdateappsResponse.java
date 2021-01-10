// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutPaasupdateappsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeBahamutPaasupdateappsResponseBody body;

    public static UpdateLinkeBahamutPaasupdateappsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutPaasupdateappsResponse self = new UpdateLinkeBahamutPaasupdateappsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutPaasupdateappsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeBahamutPaasupdateappsResponse setBody(UpdateLinkeBahamutPaasupdateappsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeBahamutPaasupdateappsResponseBody getBody() {
        return this.body;
    }

}
