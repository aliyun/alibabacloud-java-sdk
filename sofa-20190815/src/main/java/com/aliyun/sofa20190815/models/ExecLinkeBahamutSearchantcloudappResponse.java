// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeBahamutSearchantcloudappResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecLinkeBahamutSearchantcloudappResponseBody body;

    public static ExecLinkeBahamutSearchantcloudappResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeBahamutSearchantcloudappResponse self = new ExecLinkeBahamutSearchantcloudappResponse();
        return TeaModel.build(map, self);
    }

    public ExecLinkeBahamutSearchantcloudappResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecLinkeBahamutSearchantcloudappResponse setBody(ExecLinkeBahamutSearchantcloudappResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecLinkeBahamutSearchantcloudappResponseBody getBody() {
        return this.body;
    }

}
