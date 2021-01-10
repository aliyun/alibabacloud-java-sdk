// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class SaveConfigDataSetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveConfigDataSetResponseBody body;

    public static SaveConfigDataSetResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveConfigDataSetResponse self = new SaveConfigDataSetResponse();
        return TeaModel.build(map, self);
    }

    public SaveConfigDataSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveConfigDataSetResponse setBody(SaveConfigDataSetResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveConfigDataSetResponseBody getBody() {
        return this.body;
    }

}
