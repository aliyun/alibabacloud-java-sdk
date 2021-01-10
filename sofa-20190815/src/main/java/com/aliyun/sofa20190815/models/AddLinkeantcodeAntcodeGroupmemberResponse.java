// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeantcodeAntcodeGroupmemberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddLinkeantcodeAntcodeGroupmemberResponseBody body;

    public static AddLinkeantcodeAntcodeGroupmemberResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeantcodeAntcodeGroupmemberResponse self = new AddLinkeantcodeAntcodeGroupmemberResponse();
        return TeaModel.build(map, self);
    }

    public AddLinkeantcodeAntcodeGroupmemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLinkeantcodeAntcodeGroupmemberResponse setBody(AddLinkeantcodeAntcodeGroupmemberResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLinkeantcodeAntcodeGroupmemberResponseBody getBody() {
        return this.body;
    }

}
