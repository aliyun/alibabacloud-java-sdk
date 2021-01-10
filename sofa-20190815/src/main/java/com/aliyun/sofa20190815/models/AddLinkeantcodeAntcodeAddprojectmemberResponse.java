// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeantcodeAntcodeAddprojectmemberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddLinkeantcodeAntcodeAddprojectmemberResponseBody body;

    public static AddLinkeantcodeAntcodeAddprojectmemberResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeantcodeAntcodeAddprojectmemberResponse self = new AddLinkeantcodeAntcodeAddprojectmemberResponse();
        return TeaModel.build(map, self);
    }

    public AddLinkeantcodeAntcodeAddprojectmemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLinkeantcodeAntcodeAddprojectmemberResponse setBody(AddLinkeantcodeAntcodeAddprojectmemberResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLinkeantcodeAntcodeAddprojectmemberResponseBody getBody() {
        return this.body;
    }

}
