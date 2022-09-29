// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class UpdatePdpServiceRequest extends TeaModel {
    @NameInMap("body")
    public PdpServiceUpdateCmd body;

    public static UpdatePdpServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePdpServiceRequest self = new UpdatePdpServiceRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePdpServiceRequest setBody(PdpServiceUpdateCmd body) {
        this.body = body;
        return this;
    }
    public PdpServiceUpdateCmd getBody() {
        return this.body;
    }

}
