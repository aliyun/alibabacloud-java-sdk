// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class DeletePdpLaneServiceGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PdpCommonResult body;

    public static DeletePdpLaneServiceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePdpLaneServiceGroupResponse self = new DeletePdpLaneServiceGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeletePdpLaneServiceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePdpLaneServiceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePdpLaneServiceGroupResponse setBody(PdpCommonResult body) {
        this.body = body;
        return this;
    }
    public PdpCommonResult getBody() {
        return this.body;
    }

}
