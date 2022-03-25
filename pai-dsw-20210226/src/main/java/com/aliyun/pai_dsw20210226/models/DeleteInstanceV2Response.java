// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class DeleteInstanceV2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteInstanceV2ResponseBody body;

    public static DeleteInstanceV2Response build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstanceV2Response self = new DeleteInstanceV2Response();
        return TeaModel.build(map, self);
    }

    public DeleteInstanceV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteInstanceV2Response setBody(DeleteInstanceV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteInstanceV2ResponseBody getBody() {
        return this.body;
    }

}
