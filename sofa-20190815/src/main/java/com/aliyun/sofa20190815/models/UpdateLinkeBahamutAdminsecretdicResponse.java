// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutAdminsecretdicResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeBahamutAdminsecretdicResponseBody body;

    public static UpdateLinkeBahamutAdminsecretdicResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutAdminsecretdicResponse self = new UpdateLinkeBahamutAdminsecretdicResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutAdminsecretdicResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeBahamutAdminsecretdicResponse setBody(UpdateLinkeBahamutAdminsecretdicResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeBahamutAdminsecretdicResponseBody getBody() {
        return this.body;
    }

}
