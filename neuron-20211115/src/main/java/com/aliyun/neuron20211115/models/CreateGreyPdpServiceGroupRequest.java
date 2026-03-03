// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreateGreyPdpServiceGroupRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public PdpGreyServiceGroupCreateCmd body;

    public static CreateGreyPdpServiceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGreyPdpServiceGroupRequest self = new CreateGreyPdpServiceGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateGreyPdpServiceGroupRequest setBody(PdpGreyServiceGroupCreateCmd body) {
        this.body = body;
        return this;
    }
    public PdpGreyServiceGroupCreateCmd getBody() {
        return this.body;
    }

}
