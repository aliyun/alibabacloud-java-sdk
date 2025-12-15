// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class GetMultiModalEmbeddingRequest extends TeaModel {
    @NameInMap("input")
    public java.util.List<GetMultiModalEmbeddingRequestInput> input;

    @NameInMap("options")
    public java.util.Map<String, ?> options;

    public static GetMultiModalEmbeddingRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMultiModalEmbeddingRequest self = new GetMultiModalEmbeddingRequest();
        return TeaModel.build(map, self);
    }

    public GetMultiModalEmbeddingRequest setInput(java.util.List<GetMultiModalEmbeddingRequestInput> input) {
        this.input = input;
        return this;
    }
    public java.util.List<GetMultiModalEmbeddingRequestInput> getInput() {
        return this.input;
    }

    public GetMultiModalEmbeddingRequest setOptions(java.util.Map<String, ?> options) {
        this.options = options;
        return this;
    }
    public java.util.Map<String, ?> getOptions() {
        return this.options;
    }

    public static class GetMultiModalEmbeddingRequestInput extends TeaModel {
        @NameInMap("image")
        public String image;

        @NameInMap("text")
        public String text;

        public static GetMultiModalEmbeddingRequestInput build(java.util.Map<String, ?> map) throws Exception {
            GetMultiModalEmbeddingRequestInput self = new GetMultiModalEmbeddingRequestInput();
            return TeaModel.build(map, self);
        }

        public GetMultiModalEmbeddingRequestInput setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public GetMultiModalEmbeddingRequestInput setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

}
