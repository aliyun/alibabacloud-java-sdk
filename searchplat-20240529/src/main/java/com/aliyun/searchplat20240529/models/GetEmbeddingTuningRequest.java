// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class GetEmbeddingTuningRequest extends TeaModel {
    @NameInMap("input")
    public java.util.List<java.util.List<Float>> input;

    @NameInMap("parameters")
    public java.util.Map<String, ?> parameters;

    public static GetEmbeddingTuningRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEmbeddingTuningRequest self = new GetEmbeddingTuningRequest();
        return TeaModel.build(map, self);
    }

    public GetEmbeddingTuningRequest setInput(java.util.List<java.util.List<Float>> input) {
        this.input = input;
        return this;
    }
    public java.util.List<java.util.List<Float>> getInput() {
        return this.input;
    }

    public GetEmbeddingTuningRequest setParameters(java.util.Map<String, ?> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, ?> getParameters() {
        return this.parameters;
    }

}
