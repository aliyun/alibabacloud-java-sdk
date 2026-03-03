// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class UpdatePdpLaneRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public PdpLaneUpdateCmd body;

    public static UpdatePdpLaneRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePdpLaneRequest self = new UpdatePdpLaneRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePdpLaneRequest setBody(PdpLaneUpdateCmd body) {
        this.body = body;
        return this;
    }
    public PdpLaneUpdateCmd getBody() {
        return this.body;
    }

}
