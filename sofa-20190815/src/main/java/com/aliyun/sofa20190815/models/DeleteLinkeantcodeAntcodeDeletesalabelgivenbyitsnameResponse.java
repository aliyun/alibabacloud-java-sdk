// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponseBody body;

    public static DeleteLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse self = new DeleteLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponse setBody(DeleteLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeantcodeAntcodeDeletesalabelgivenbyitsnameResponseBody getBody() {
        return this.body;
    }

}
