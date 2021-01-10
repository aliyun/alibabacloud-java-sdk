// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeBahamutEnvinmultienvResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecLinkeBahamutEnvinmultienvResponseBody body;

    public static ExecLinkeBahamutEnvinmultienvResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeBahamutEnvinmultienvResponse self = new ExecLinkeBahamutEnvinmultienvResponse();
        return TeaModel.build(map, self);
    }

    public ExecLinkeBahamutEnvinmultienvResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecLinkeBahamutEnvinmultienvResponse setBody(ExecLinkeBahamutEnvinmultienvResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecLinkeBahamutEnvinmultienvResponseBody getBody() {
        return this.body;
    }

}
