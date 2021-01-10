// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeBahamutAppcustomciexecuteonceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecLinkeBahamutAppcustomciexecuteonceResponseBody body;

    public static ExecLinkeBahamutAppcustomciexecuteonceResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeBahamutAppcustomciexecuteonceResponse self = new ExecLinkeBahamutAppcustomciexecuteonceResponse();
        return TeaModel.build(map, self);
    }

    public ExecLinkeBahamutAppcustomciexecuteonceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecLinkeBahamutAppcustomciexecuteonceResponse setBody(ExecLinkeBahamutAppcustomciexecuteonceResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecLinkeBahamutAppcustomciexecuteonceResponseBody getBody() {
        return this.body;
    }

}
