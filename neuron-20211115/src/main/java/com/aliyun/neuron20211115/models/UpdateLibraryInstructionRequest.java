// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class UpdateLibraryInstructionRequest extends TeaModel {
    @NameInMap("body")
    public LibraryInstruction body;

    public static UpdateLibraryInstructionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLibraryInstructionRequest self = new UpdateLibraryInstructionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLibraryInstructionRequest setBody(LibraryInstruction body) {
        this.body = body;
        return this;
    }
    public LibraryInstruction getBody() {
        return this.body;
    }

}
