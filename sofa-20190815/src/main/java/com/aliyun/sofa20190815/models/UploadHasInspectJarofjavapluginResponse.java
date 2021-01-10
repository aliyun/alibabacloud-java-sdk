// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UploadHasInspectJarofjavapluginResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UploadHasInspectJarofjavapluginResponseBody body;

    public static UploadHasInspectJarofjavapluginResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadHasInspectJarofjavapluginResponse self = new UploadHasInspectJarofjavapluginResponse();
        return TeaModel.build(map, self);
    }

    public UploadHasInspectJarofjavapluginResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadHasInspectJarofjavapluginResponse setBody(UploadHasInspectJarofjavapluginResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadHasInspectJarofjavapluginResponseBody getBody() {
        return this.body;
    }

}
