// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeantcodeAntcodeGroupsidservicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLinkeantcodeAntcodeGroupsidservicesResponseBody body;

    public static CreateLinkeantcodeAntcodeGroupsidservicesResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeantcodeAntcodeGroupsidservicesResponse self = new CreateLinkeantcodeAntcodeGroupsidservicesResponse();
        return TeaModel.build(map, self);
    }

    public CreateLinkeantcodeAntcodeGroupsidservicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLinkeantcodeAntcodeGroupsidservicesResponse setBody(CreateLinkeantcodeAntcodeGroupsidservicesResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLinkeantcodeAntcodeGroupsidservicesResponseBody getBody() {
        return this.body;
    }

}
