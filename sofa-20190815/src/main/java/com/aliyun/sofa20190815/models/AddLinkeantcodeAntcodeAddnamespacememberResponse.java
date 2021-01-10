// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeantcodeAntcodeAddnamespacememberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddLinkeantcodeAntcodeAddnamespacememberResponseBody body;

    public static AddLinkeantcodeAntcodeAddnamespacememberResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeantcodeAntcodeAddnamespacememberResponse self = new AddLinkeantcodeAntcodeAddnamespacememberResponse();
        return TeaModel.build(map, self);
    }

    public AddLinkeantcodeAntcodeAddnamespacememberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLinkeantcodeAntcodeAddnamespacememberResponse setBody(AddLinkeantcodeAntcodeAddnamespacememberResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLinkeantcodeAntcodeAddnamespacememberResponseBody getBody() {
        return this.body;
    }

}
