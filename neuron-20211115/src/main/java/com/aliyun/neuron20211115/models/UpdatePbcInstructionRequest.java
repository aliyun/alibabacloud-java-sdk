// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class UpdatePbcInstructionRequest extends TeaModel {
    @NameInMap("body")
    public PbcInstructionUpdateCmd body;

    public static UpdatePbcInstructionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePbcInstructionRequest self = new UpdatePbcInstructionRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePbcInstructionRequest setBody(PbcInstructionUpdateCmd body) {
        this.body = body;
        return this;
    }
    public PbcInstructionUpdateCmd getBody() {
        return this.body;
    }

}
