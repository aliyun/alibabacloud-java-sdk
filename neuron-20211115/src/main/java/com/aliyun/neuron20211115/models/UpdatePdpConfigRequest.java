// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class UpdatePdpConfigRequest extends TeaModel {
    @NameInMap("body")
    public PdpConfigUpdateCmd body;

    public static UpdatePdpConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePdpConfigRequest self = new UpdatePdpConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePdpConfigRequest setBody(PdpConfigUpdateCmd body) {
        this.body = body;
        return this;
    }
    public PdpConfigUpdateCmd getBody() {
        return this.body;
    }

}
