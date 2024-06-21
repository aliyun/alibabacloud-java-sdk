// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class GetTextEmbeddingRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("input")
    public java.util.List<String> input;

    /**
     * <strong>example:</strong>
     * <p>document</p>
     */
    @NameInMap("input_type")
    public String inputType;

    public static GetTextEmbeddingRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTextEmbeddingRequest self = new GetTextEmbeddingRequest();
        return TeaModel.build(map, self);
    }

    public GetTextEmbeddingRequest setInput(java.util.List<String> input) {
        this.input = input;
        return this;
    }
    public java.util.List<String> getInput() {
        return this.input;
    }

    public GetTextEmbeddingRequest setInputType(String inputType) {
        this.inputType = inputType;
        return this;
    }
    public String getInputType() {
        return this.inputType;
    }

}
