// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeantcodeAntcodeRepositoryfilesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListLinkeantcodeAntcodeRepositoryfilesResponseBody body;

    public static ListLinkeantcodeAntcodeRepositoryfilesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeantcodeAntcodeRepositoryfilesResponse self = new ListLinkeantcodeAntcodeRepositoryfilesResponse();
        return TeaModel.build(map, self);
    }

    public ListLinkeantcodeAntcodeRepositoryfilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLinkeantcodeAntcodeRepositoryfilesResponse setBody(ListLinkeantcodeAntcodeRepositoryfilesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLinkeantcodeAntcodeRepositoryfilesResponseBody getBody() {
        return this.body;
    }

}
