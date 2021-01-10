// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeBahamutAdminsecretdicResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeBahamutAdminsecretdicResponseBody body;

    public static DeleteLinkeBahamutAdminsecretdicResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeBahamutAdminsecretdicResponse self = new DeleteLinkeBahamutAdminsecretdicResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeBahamutAdminsecretdicResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeBahamutAdminsecretdicResponse setBody(DeleteLinkeBahamutAdminsecretdicResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeBahamutAdminsecretdicResponseBody getBody() {
        return this.body;
    }

}
