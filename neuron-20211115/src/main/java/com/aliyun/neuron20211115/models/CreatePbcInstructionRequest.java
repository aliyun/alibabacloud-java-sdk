// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreatePbcInstructionRequest extends TeaModel {
    @NameInMap("body")
    public PbcInstruction body;

    public static CreatePbcInstructionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePbcInstructionRequest self = new CreatePbcInstructionRequest();
        return TeaModel.build(map, self);
    }

    public CreatePbcInstructionRequest setBody(PbcInstruction body) {
        this.body = body;
        return this;
    }
    public PbcInstruction getBody() {
        return this.body;
    }

}
