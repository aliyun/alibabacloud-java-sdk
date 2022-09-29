// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class UpdatePbcInstructionResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public PbcInstruction result;

    public static UpdatePbcInstructionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdatePbcInstructionResponseBody self = new UpdatePbcInstructionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdatePbcInstructionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdatePbcInstructionResponseBody setResult(PbcInstruction result) {
        this.result = result;
        return this;
    }
    public PbcInstruction getResult() {
        return this.result;
    }

}
