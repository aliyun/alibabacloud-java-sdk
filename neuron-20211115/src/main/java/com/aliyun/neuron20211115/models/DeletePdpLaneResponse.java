// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class DeletePdpLaneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PdpCommonResult body;

    public static DeletePdpLaneResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePdpLaneResponse self = new DeletePdpLaneResponse();
        return TeaModel.build(map, self);
    }

    public DeletePdpLaneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePdpLaneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePdpLaneResponse setBody(PdpCommonResult body) {
        this.body = body;
        return this;
    }
    public PdpCommonResult getBody() {
        return this.body;
    }

}
