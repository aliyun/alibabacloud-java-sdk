// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreatePbcInstructionResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public PbcInstruction result;

    public static CreatePbcInstructionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePbcInstructionResponseBody self = new CreatePbcInstructionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePbcInstructionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePbcInstructionResponseBody setResult(PbcInstruction result) {
        this.result = result;
        return this;
    }
    public PbcInstruction getResult() {
        return this.result;
    }

}
