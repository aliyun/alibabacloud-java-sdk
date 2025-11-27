// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paicopilot20250731.models;

import com.aliyun.tea.*;

public class SearchInfoResponseBody extends TeaModel {
    @NameInMap("KnowledgeBaseSearchResults")
    public java.util.List<SearchInfoResponseBodyKnowledgeBaseSearchResults> knowledgeBaseSearchResults;

    /**
     * <strong>example:</strong>
     * <p>44553E9A-******-37ADC33FE2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("WebSearchResults")
    public java.util.List<SearchInfoResponseBodyWebSearchResults> webSearchResults;

    public static SearchInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchInfoResponseBody self = new SearchInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchInfoResponseBody setKnowledgeBaseSearchResults(java.util.List<SearchInfoResponseBodyKnowledgeBaseSearchResults> knowledgeBaseSearchResults) {
        this.knowledgeBaseSearchResults = knowledgeBaseSearchResults;
        return this;
    }
    public java.util.List<SearchInfoResponseBodyKnowledgeBaseSearchResults> getKnowledgeBaseSearchResults() {
        return this.knowledgeBaseSearchResults;
    }

    public SearchInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchInfoResponseBody setWebSearchResults(java.util.List<SearchInfoResponseBodyWebSearchResults> webSearchResults) {
        this.webSearchResults = webSearchResults;
        return this;
    }
    public java.util.List<SearchInfoResponseBodyWebSearchResults> getWebSearchResults() {
        return this.webSearchResults;
    }

    public static class SearchInfoResponseBodyKnowledgeBaseSearchResults extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Index")
        public String index;

        /**
         * <strong>example:</strong>
         * <p>DSW is ****** in pai.</p>
         */
        @NameInMap("ResultContent")
        public String resultContent;

        /**
         * <strong>example:</strong>
         * <p>0.6215165367</p>
         */
        @NameInMap("Score")
        public Double score;

        public static SearchInfoResponseBodyKnowledgeBaseSearchResults build(java.util.Map<String, ?> map) throws Exception {
            SearchInfoResponseBodyKnowledgeBaseSearchResults self = new SearchInfoResponseBodyKnowledgeBaseSearchResults();
            return TeaModel.build(map, self);
        }

        public SearchInfoResponseBodyKnowledgeBaseSearchResults setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public SearchInfoResponseBodyKnowledgeBaseSearchResults setResultContent(String resultContent) {
            this.resultContent = resultContent;
            return this;
        }
        public String getResultContent() {
            return this.resultContent;
        }

        public SearchInfoResponseBodyKnowledgeBaseSearchResults setScore(Double score) {
            this.score = score;
            return this;
        }
        public Double getScore() {
            return this.score;
        }

    }

    public static class SearchInfoResponseBodyWebSearchResults extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Index")
        public String index;

        /**
         * <strong>example:</strong>
         * <p>Qwen3-Coder*****is good</p>
         */
        @NameInMap("ResultContent")
        public String resultContent;

        /**
         * <strong>example:</strong>
         * <p>0.5215170567</p>
         */
        @NameInMap("Score")
        public Double score;

        /**
         * <strong>example:</strong>
         * <p><a href="https://help.aliyun.com/zh/pai/use-cases/dsw-use-qwen3-coder-to-assist-in-code-development">https://help.aliyun.com/zh/pai/use-cases/dsw-use-qwen3-coder-to-assist-in-code-development</a></p>
         */
        @NameInMap("SourceLink")
        public String sourceLink;

        public static SearchInfoResponseBodyWebSearchResults build(java.util.Map<String, ?> map) throws Exception {
            SearchInfoResponseBodyWebSearchResults self = new SearchInfoResponseBodyWebSearchResults();
            return TeaModel.build(map, self);
        }

        public SearchInfoResponseBodyWebSearchResults setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public SearchInfoResponseBodyWebSearchResults setResultContent(String resultContent) {
            this.resultContent = resultContent;
            return this;
        }
        public String getResultContent() {
            return this.resultContent;
        }

        public SearchInfoResponseBodyWebSearchResults setScore(Double score) {
            this.score = score;
            return this;
        }
        public Double getScore() {
            return this.score;
        }

        public SearchInfoResponseBodyWebSearchResults setSourceLink(String sourceLink) {
            this.sourceLink = sourceLink;
            return this;
        }
        public String getSourceLink() {
            return this.sourceLink;
        }

    }

}
