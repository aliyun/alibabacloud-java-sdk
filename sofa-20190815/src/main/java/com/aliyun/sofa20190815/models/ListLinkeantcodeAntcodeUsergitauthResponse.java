// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeantcodeAntcodeUsergitauthResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListLinkeantcodeAntcodeUsergitauthResponseBody body;

    public static ListLinkeantcodeAntcodeUsergitauthResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeantcodeAntcodeUsergitauthResponse self = new ListLinkeantcodeAntcodeUsergitauthResponse();
        return TeaModel.build(map, self);
    }

    public ListLinkeantcodeAntcodeUsergitauthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLinkeantcodeAntcodeUsergitauthResponse setBody(ListLinkeantcodeAntcodeUsergitauthResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLinkeantcodeAntcodeUsergitauthResponseBody getBody() {
        return this.body;
    }

}
