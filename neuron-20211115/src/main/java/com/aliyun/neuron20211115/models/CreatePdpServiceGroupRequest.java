// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreatePdpServiceGroupRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public PdpServiceGroupCreateCmd body;

    public static CreatePdpServiceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePdpServiceGroupRequest self = new CreatePdpServiceGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreatePdpServiceGroupRequest setBody(PdpServiceGroupCreateCmd body) {
        this.body = body;
        return this;
    }
    public PdpServiceGroupCreateCmd getBody() {
        return this.body;
    }

}
