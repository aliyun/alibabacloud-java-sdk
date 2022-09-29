// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreatePdpServiceRequest extends TeaModel {
    @NameInMap("body")
    public PdpService body;

    public static CreatePdpServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePdpServiceRequest self = new CreatePdpServiceRequest();
        return TeaModel.build(map, self);
    }

    public CreatePdpServiceRequest setBody(PdpService body) {
        this.body = body;
        return this;
    }
    public PdpService getBody() {
        return this.body;
    }

}
