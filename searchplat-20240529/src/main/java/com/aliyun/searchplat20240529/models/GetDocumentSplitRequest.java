// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class GetDocumentSplitRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("document")
    public GetDocumentSplitRequestDocument document;

    @NameInMap("strategy")
    public GetDocumentSplitRequestStrategy strategy;

    public static GetDocumentSplitRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDocumentSplitRequest self = new GetDocumentSplitRequest();
        return TeaModel.build(map, self);
    }

    public GetDocumentSplitRequest setDocument(GetDocumentSplitRequestDocument document) {
        this.document = document;
        return this;
    }
    public GetDocumentSplitRequestDocument getDocument() {
        return this.document;
    }

    public GetDocumentSplitRequest setStrategy(GetDocumentSplitRequestStrategy strategy) {
        this.strategy = strategy;
        return this;
    }
    public GetDocumentSplitRequestStrategy getStrategy() {
        return this.strategy;
    }

    public static class GetDocumentSplitRequestDocument extends TeaModel {
        @NameInMap("content")
        public String content;

        @NameInMap("content_encoding")
        public String contentEncoding;

        @NameInMap("content_type")
        public String contentType;

        public static GetDocumentSplitRequestDocument build(java.util.Map<String, ?> map) throws Exception {
            GetDocumentSplitRequestDocument self = new GetDocumentSplitRequestDocument();
            return TeaModel.build(map, self);
        }

        public GetDocumentSplitRequestDocument setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetDocumentSplitRequestDocument setContentEncoding(String contentEncoding) {
            this.contentEncoding = contentEncoding;
            return this;
        }
        public String getContentEncoding() {
            return this.contentEncoding;
        }

        public GetDocumentSplitRequestDocument setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

    }

    public static class GetDocumentSplitRequestStrategy extends TeaModel {
        @NameInMap("compute_type")
        public String computeType;

        @NameInMap("max_chunk_size")
        public Long maxChunkSize;

        @NameInMap("need_sentence")
        public Boolean needSentence;

        public static GetDocumentSplitRequestStrategy build(java.util.Map<String, ?> map) throws Exception {
            GetDocumentSplitRequestStrategy self = new GetDocumentSplitRequestStrategy();
            return TeaModel.build(map, self);
        }

        public GetDocumentSplitRequestStrategy setComputeType(String computeType) {
            this.computeType = computeType;
            return this;
        }
        public String getComputeType() {
            return this.computeType;
        }

        public GetDocumentSplitRequestStrategy setMaxChunkSize(Long maxChunkSize) {
            this.maxChunkSize = maxChunkSize;
            return this;
        }
        public Long getMaxChunkSize() {
            return this.maxChunkSize;
        }

        public GetDocumentSplitRequestStrategy setNeedSentence(Boolean needSentence) {
            this.needSentence = needSentence;
            return this;
        }
        public Boolean getNeedSentence() {
            return this.needSentence;
        }

    }

}
