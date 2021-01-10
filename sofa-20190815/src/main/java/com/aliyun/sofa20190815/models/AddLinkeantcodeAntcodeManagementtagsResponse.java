// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeantcodeAntcodeManagementtagsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddLinkeantcodeAntcodeManagementtagsResponseBody body;

    public static AddLinkeantcodeAntcodeManagementtagsResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeantcodeAntcodeManagementtagsResponse self = new AddLinkeantcodeAntcodeManagementtagsResponse();
        return TeaModel.build(map, self);
    }

    public AddLinkeantcodeAntcodeManagementtagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLinkeantcodeAntcodeManagementtagsResponse setBody(AddLinkeantcodeAntcodeManagementtagsResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLinkeantcodeAntcodeManagementtagsResponseBody getBody() {
        return this.body;
    }

}
