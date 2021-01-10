// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeantcodeAntcodeNewrepositoryfilesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListLinkeantcodeAntcodeNewrepositoryfilesResponseBody body;

    public static ListLinkeantcodeAntcodeNewrepositoryfilesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeantcodeAntcodeNewrepositoryfilesResponse self = new ListLinkeantcodeAntcodeNewrepositoryfilesResponse();
        return TeaModel.build(map, self);
    }

    public ListLinkeantcodeAntcodeNewrepositoryfilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLinkeantcodeAntcodeNewrepositoryfilesResponse setBody(ListLinkeantcodeAntcodeNewrepositoryfilesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLinkeantcodeAntcodeNewrepositoryfilesResponseBody getBody() {
        return this.body;
    }

}
