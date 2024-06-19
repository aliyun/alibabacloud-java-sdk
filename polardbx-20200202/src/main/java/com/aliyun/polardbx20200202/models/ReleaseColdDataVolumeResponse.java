// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ReleaseColdDataVolumeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReleaseColdDataVolumeResponseBody body;

    public static ReleaseColdDataVolumeResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseColdDataVolumeResponse self = new ReleaseColdDataVolumeResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseColdDataVolumeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseColdDataVolumeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReleaseColdDataVolumeResponse setBody(ReleaseColdDataVolumeResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseColdDataVolumeResponseBody getBody() {
        return this.body;
    }

}
