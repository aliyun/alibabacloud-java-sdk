// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeantcodeAntcodeGroupsdeletesalabelgivenbyitsnameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLinkeantcodeAntcodeGroupsdeletesalabelgivenbyitsnameResponseBody body;

    public static DeleteLinkeantcodeAntcodeGroupsdeletesalabelgivenbyitsnameResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeantcodeAntcodeGroupsdeletesalabelgivenbyitsnameResponse self = new DeleteLinkeantcodeAntcodeGroupsdeletesalabelgivenbyitsnameResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeantcodeAntcodeGroupsdeletesalabelgivenbyitsnameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLinkeantcodeAntcodeGroupsdeletesalabelgivenbyitsnameResponse setBody(DeleteLinkeantcodeAntcodeGroupsdeletesalabelgivenbyitsnameResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLinkeantcodeAntcodeGroupsdeletesalabelgivenbyitsnameResponseBody getBody() {
        return this.body;
    }

}
