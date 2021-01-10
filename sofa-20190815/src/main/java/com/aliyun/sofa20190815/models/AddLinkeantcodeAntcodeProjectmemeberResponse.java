// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeantcodeAntcodeProjectmemeberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddLinkeantcodeAntcodeProjectmemeberResponseBody body;

    public static AddLinkeantcodeAntcodeProjectmemeberResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeantcodeAntcodeProjectmemeberResponse self = new AddLinkeantcodeAntcodeProjectmemeberResponse();
        return TeaModel.build(map, self);
    }

    public AddLinkeantcodeAntcodeProjectmemeberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLinkeantcodeAntcodeProjectmemeberResponse setBody(AddLinkeantcodeAntcodeProjectmemeberResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLinkeantcodeAntcodeProjectmemeberResponseBody getBody() {
        return this.body;
    }

}
