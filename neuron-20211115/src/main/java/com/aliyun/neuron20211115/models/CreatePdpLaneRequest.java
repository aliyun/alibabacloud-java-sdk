// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreatePdpLaneRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public PdpLaneCreateCmd body;

    public static CreatePdpLaneRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePdpLaneRequest self = new CreatePdpLaneRequest();
        return TeaModel.build(map, self);
    }

    public CreatePdpLaneRequest setBody(PdpLaneCreateCmd body) {
        this.body = body;
        return this;
    }
    public PdpLaneCreateCmd getBody() {
        return this.body;
    }

}
