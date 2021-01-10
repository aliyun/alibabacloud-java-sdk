// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodeGroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeantcodeAntcodeGroupsResponseBody body;

    public static DeleteLinkeantcodeAntcodeGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodeGroupsResponse self = new DeleteLinkeantcodeAntcodeGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodeGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeantcodeAntcodeGroupsResponse setBody(DeleteLinkeantcodeAntcodeGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeantcodeAntcodeGroupsResponseBody getBody() {
        return this.body;
    }

}
