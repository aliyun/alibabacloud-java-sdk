// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeantcodeAntcodeAddreviewssubscriptionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddLinkeantcodeAntcodeAddreviewssubscriptionsResponseBody body;

    public static AddLinkeantcodeAntcodeAddreviewssubscriptionsResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeantcodeAntcodeAddreviewssubscriptionsResponse self = new AddLinkeantcodeAntcodeAddreviewssubscriptionsResponse();
        return TeaModel.build(map, self);
    }

    public AddLinkeantcodeAntcodeAddreviewssubscriptionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLinkeantcodeAntcodeAddreviewssubscriptionsResponse setBody(AddLinkeantcodeAntcodeAddreviewssubscriptionsResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLinkeantcodeAntcodeAddreviewssubscriptionsResponseBody getBody() {
        return this.body;
    }

}
