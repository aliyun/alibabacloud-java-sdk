// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ExecLinkeBahamutCompleteunitswheniterationcompletedResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExecLinkeBahamutCompleteunitswheniterationcompletedResponseBody body;

    public static ExecLinkeBahamutCompleteunitswheniterationcompletedResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecLinkeBahamutCompleteunitswheniterationcompletedResponse self = new ExecLinkeBahamutCompleteunitswheniterationcompletedResponse();
        return TeaModel.build(map, self);
    }

    public ExecLinkeBahamutCompleteunitswheniterationcompletedResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecLinkeBahamutCompleteunitswheniterationcompletedResponse setBody(ExecLinkeBahamutCompleteunitswheniterationcompletedResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecLinkeBahamutCompleteunitswheniterationcompletedResponseBody getBody() {
        return this.body;
    }

}
