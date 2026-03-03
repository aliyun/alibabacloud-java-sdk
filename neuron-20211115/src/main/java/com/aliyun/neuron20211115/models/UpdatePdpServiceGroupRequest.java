// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class UpdatePdpServiceGroupRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public PdpServiceGroupUpdateCmd body;

    public static UpdatePdpServiceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePdpServiceGroupRequest self = new UpdatePdpServiceGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePdpServiceGroupRequest setBody(PdpServiceGroupUpdateCmd body) {
        this.body = body;
        return this;
    }
    public PdpServiceGroupUpdateCmd getBody() {
        return this.body;
    }

}
