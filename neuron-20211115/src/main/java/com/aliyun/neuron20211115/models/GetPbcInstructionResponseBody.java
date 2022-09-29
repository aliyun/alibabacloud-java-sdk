// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class GetPbcInstructionResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public PbcInstruction result;

    public static GetPbcInstructionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPbcInstructionResponseBody self = new GetPbcInstructionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPbcInstructionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPbcInstructionResponseBody setResult(PbcInstruction result) {
        this.result = result;
        return this;
    }
    public PbcInstruction getResult() {
        return this.result;
    }

}
