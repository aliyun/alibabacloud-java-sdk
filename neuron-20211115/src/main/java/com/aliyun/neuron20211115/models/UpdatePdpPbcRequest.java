// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class UpdatePdpPbcRequest extends TeaModel {
    @NameInMap("body")
    public PdpPbcUpdateCmd body;

    public static UpdatePdpPbcRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePdpPbcRequest self = new UpdatePdpPbcRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePdpPbcRequest setBody(PdpPbcUpdateCmd body) {
        this.body = body;
        return this;
    }
    public PdpPbcUpdateCmd getBody() {
        return this.body;
    }

}
