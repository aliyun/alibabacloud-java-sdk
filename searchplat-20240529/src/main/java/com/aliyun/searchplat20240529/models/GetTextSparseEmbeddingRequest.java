// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class GetTextSparseEmbeddingRequest extends TeaModel {
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

    @NameInMap("return_token")
    public Boolean returnToken;

    public static GetTextSparseEmbeddingRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTextSparseEmbeddingRequest self = new GetTextSparseEmbeddingRequest();
        return TeaModel.build(map, self);
    }

    public GetTextSparseEmbeddingRequest setInput(java.util.List<String> input) {
        this.input = input;
        return this;
    }
    public java.util.List<String> getInput() {
        return this.input;
    }

    public GetTextSparseEmbeddingRequest setInputType(String inputType) {
        this.inputType = inputType;
        return this;
    }
    public String getInputType() {
        return this.inputType;
    }

    public GetTextSparseEmbeddingRequest setReturnToken(Boolean returnToken) {
        this.returnToken = returnToken;
        return this;
    }
    public Boolean getReturnToken() {
        return this.returnToken;
    }

}
