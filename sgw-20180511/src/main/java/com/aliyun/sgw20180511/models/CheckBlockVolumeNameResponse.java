// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class CheckBlockVolumeNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckBlockVolumeNameResponseBody body;

    public static CheckBlockVolumeNameResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckBlockVolumeNameResponse self = new CheckBlockVolumeNameResponse();
        return TeaModel.build(map, self);
    }

    public CheckBlockVolumeNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckBlockVolumeNameResponse setBody(CheckBlockVolumeNameResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckBlockVolumeNameResponseBody getBody() {
        return this.body;
    }

}
