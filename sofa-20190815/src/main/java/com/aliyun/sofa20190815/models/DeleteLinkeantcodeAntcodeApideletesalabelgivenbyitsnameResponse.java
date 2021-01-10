// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodeApideletesalabelgivenbyitsnameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeantcodeAntcodeApideletesalabelgivenbyitsnameResponseBody body;

    public static DeleteLinkeantcodeAntcodeApideletesalabelgivenbyitsnameResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodeApideletesalabelgivenbyitsnameResponse self = new DeleteLinkeantcodeAntcodeApideletesalabelgivenbyitsnameResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodeApideletesalabelgivenbyitsnameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeantcodeAntcodeApideletesalabelgivenbyitsnameResponse setBody(DeleteLinkeantcodeAntcodeApideletesalabelgivenbyitsnameResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeantcodeAntcodeApideletesalabelgivenbyitsnameResponseBody getBody() {
        return this.body;
    }

}
