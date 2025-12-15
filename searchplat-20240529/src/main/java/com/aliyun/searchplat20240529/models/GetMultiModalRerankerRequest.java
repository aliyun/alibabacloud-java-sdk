// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class GetMultiModalRerankerRequest extends TeaModel {
    @NameInMap("docs")
    public java.util.List<GetMultiModalRerankerRequestDocs> docs;

    @NameInMap("options")
    public java.util.Map<String, ?> options;

    @NameInMap("query")
    public GetMultiModalRerankerRequestQuery query;

    public static GetMultiModalRerankerRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMultiModalRerankerRequest self = new GetMultiModalRerankerRequest();
        return TeaModel.build(map, self);
    }

    public GetMultiModalRerankerRequest setDocs(java.util.List<GetMultiModalRerankerRequestDocs> docs) {
        this.docs = docs;
        return this;
    }
    public java.util.List<GetMultiModalRerankerRequestDocs> getDocs() {
        return this.docs;
    }

    public GetMultiModalRerankerRequest setOptions(java.util.Map<String, ?> options) {
        this.options = options;
        return this;
    }
    public java.util.Map<String, ?> getOptions() {
        return this.options;
    }

    public GetMultiModalRerankerRequest setQuery(GetMultiModalRerankerRequestQuery query) {
        this.query = query;
        return this;
    }
    public GetMultiModalRerankerRequestQuery getQuery() {
        return this.query;
    }

    public static class GetMultiModalRerankerRequestDocs extends TeaModel {
        @NameInMap("image")
        public String image;

        @NameInMap("text")
        public String text;

        public static GetMultiModalRerankerRequestDocs build(java.util.Map<String, ?> map) throws Exception {
            GetMultiModalRerankerRequestDocs self = new GetMultiModalRerankerRequestDocs();
            return TeaModel.build(map, self);
        }

        public GetMultiModalRerankerRequestDocs setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public GetMultiModalRerankerRequestDocs setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class GetMultiModalRerankerRequestQuery extends TeaModel {
        @NameInMap("image")
        public String image;

        @NameInMap("text")
        public String text;

        public static GetMultiModalRerankerRequestQuery build(java.util.Map<String, ?> map) throws Exception {
            GetMultiModalRerankerRequestQuery self = new GetMultiModalRerankerRequestQuery();
            return TeaModel.build(map, self);
        }

        public GetMultiModalRerankerRequestQuery setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public GetMultiModalRerankerRequestQuery setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

}
