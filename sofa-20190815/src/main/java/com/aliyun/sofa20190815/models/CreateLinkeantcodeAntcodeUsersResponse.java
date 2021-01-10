// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeUsersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeantcodeAntcodeUsersResponseBody body;

    public static CreateLinkeantcodeAntcodeUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeUsersResponse self = new CreateLinkeantcodeAntcodeUsersResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeantcodeAntcodeUsersResponse setBody(CreateLinkeantcodeAntcodeUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeantcodeAntcodeUsersResponseBody getBody() {
        return this.body;
    }

}
