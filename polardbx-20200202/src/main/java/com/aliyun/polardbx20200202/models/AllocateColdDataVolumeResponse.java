// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class AllocateColdDataVolumeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AllocateColdDataVolumeResponseBody body;

    public static AllocateColdDataVolumeResponse build(java.util.Map<String, ?> map) throws Exception {
        AllocateColdDataVolumeResponse self = new AllocateColdDataVolumeResponse();
        return TeaModel.build(map, self);
    }

    public AllocateColdDataVolumeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AllocateColdDataVolumeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AllocateColdDataVolumeResponse setBody(AllocateColdDataVolumeResponseBody body) {
        this.body = body;
        return this;
    }
    public AllocateColdDataVolumeResponseBody getBody() {
        return this.body;
    }

}
