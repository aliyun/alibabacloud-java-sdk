// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponseBody body;

    public static RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponse self = new RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponse();
        return TeaModel.build(map, self);
    }

    public RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponse setBody(RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveLinkeantcodeAntcodeProjectsidreviewssubscriptionssubscriptionidResponseBody getBody() {
        return this.body;
    }

}
