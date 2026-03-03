// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class DeletePdpLaneInletServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PdpCommonResult body;

    public static DeletePdpLaneInletServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePdpLaneInletServiceResponse self = new DeletePdpLaneInletServiceResponse();
        return TeaModel.build(map, self);
    }

    public DeletePdpLaneInletServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePdpLaneInletServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePdpLaneInletServiceResponse setBody(PdpCommonResult body) {
        this.body = body;
        return this;
    }
    public PdpCommonResult getBody() {
        return this.body;
    }

}
