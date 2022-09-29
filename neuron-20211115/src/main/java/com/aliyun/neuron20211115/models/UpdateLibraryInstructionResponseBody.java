// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class UpdateLibraryInstructionResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public LibraryInstruction result;

    public static UpdateLibraryInstructionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLibraryInstructionResponseBody self = new UpdateLibraryInstructionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLibraryInstructionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateLibraryInstructionResponseBody setResult(LibraryInstruction result) {
        this.result = result;
        return this;
    }
    public LibraryInstruction getResult() {
        return this.result;
    }

}
