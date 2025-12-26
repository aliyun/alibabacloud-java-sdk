// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paicopilot20250731.models;

import com.aliyun.tea.*;

public class SearchInfoRequest extends TeaModel {
    @NameInMap("KnowledgeBaseFilters")
    public java.util.List<SearchInfoRequestKnowledgeBaseFilters> knowledgeBaseFilters;

    @NameInMap("WebFilters")
    public java.util.List<SearchInfoRequestWebFilters> webFilters;

    public static SearchInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchInfoRequest self = new SearchInfoRequest();
        return TeaModel.build(map, self);
    }

    public SearchInfoRequest setKnowledgeBaseFilters(java.util.List<SearchInfoRequestKnowledgeBaseFilters> knowledgeBaseFilters) {
        this.knowledgeBaseFilters = knowledgeBaseFilters;
        return this;
    }
    public java.util.List<SearchInfoRequestKnowledgeBaseFilters> getKnowledgeBaseFilters() {
        return this.knowledgeBaseFilters;
    }

    public SearchInfoRequest setWebFilters(java.util.List<SearchInfoRequestWebFilters> webFilters) {
        this.webFilters = webFilters;
        return this;
    }
    public java.util.List<SearchInfoRequestWebFilters> getWebFilters() {
        return this.webFilters;
    }

    public static class SearchInfoRequestKnowledgeBaseFilters extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pai_qa</p>
         */
        @NameInMap("CollectionName")
        public String collectionName;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>what is pai</p>
         */
        @NameInMap("Query")
        public String query;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ResultLimit")
        public Integer resultLimit;

        /**
         * <strong>example:</strong>
         * <p>0.7827883223</p>
         */
        @NameInMap("ScoreThreshold")
        public Double scoreThreshold;

        public static SearchInfoRequestKnowledgeBaseFilters build(java.util.Map<String, ?> map) throws Exception {
            SearchInfoRequestKnowledgeBaseFilters self = new SearchInfoRequestKnowledgeBaseFilters();
            return TeaModel.build(map, self);
        }

        public SearchInfoRequestKnowledgeBaseFilters setCollectionName(String collectionName) {
            this.collectionName = collectionName;
            return this;
        }
        public String getCollectionName() {
            return this.collectionName;
        }

        public SearchInfoRequestKnowledgeBaseFilters setQuery(String query) {
            this.query = query;
            return this;
        }
        public String getQuery() {
            return this.query;
        }

        public SearchInfoRequestKnowledgeBaseFilters setResultLimit(Integer resultLimit) {
            this.resultLimit = resultLimit;
            return this;
        }
        public Integer getResultLimit() {
            return this.resultLimit;
        }

        public SearchInfoRequestKnowledgeBaseFilters setScoreThreshold(Double scoreThreshold) {
            this.scoreThreshold = scoreThreshold;
            return this;
        }
        public Double getScoreThreshold() {
            return this.scoreThreshold;
        }

    }

    public static class SearchInfoRequestWebFilters extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("IncludeSites")
        public java.util.List<String> includeSites;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>what is dsw</p>
         */
        @NameInMap("Query")
        public String query;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ResultLimit")
        public Integer resultLimit;

        /**
         * <strong>example:</strong>
         * <p>0.832883223</p>
         */
        @NameInMap("ScoreThreshold")
        public Double scoreThreshold;

        public static SearchInfoRequestWebFilters build(java.util.Map<String, ?> map) throws Exception {
            SearchInfoRequestWebFilters self = new SearchInfoRequestWebFilters();
            return TeaModel.build(map, self);
        }

        public SearchInfoRequestWebFilters setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public SearchInfoRequestWebFilters setIncludeSites(java.util.List<String> includeSites) {
            this.includeSites = includeSites;
            return this;
        }
        public java.util.List<String> getIncludeSites() {
            return this.includeSites;
        }

        public SearchInfoRequestWebFilters setQuery(String query) {
            this.query = query;
            return this;
        }
        public String getQuery() {
            return this.query;
        }

        public SearchInfoRequestWebFilters setResultLimit(Integer resultLimit) {
            this.resultLimit = resultLimit;
            return this;
        }
        public Integer getResultLimit() {
            return this.resultLimit;
        }

        public SearchInfoRequestWebFilters setScoreThreshold(Double scoreThreshold) {
            this.scoreThreshold = scoreThreshold;
            return this;
        }
        public Double getScoreThreshold() {
            return this.scoreThreshold;
        }

    }

}
