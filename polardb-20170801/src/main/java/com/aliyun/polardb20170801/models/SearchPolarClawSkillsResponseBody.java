// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class SearchPolarClawSkillsResponseBody extends TeaModel {
    /**
     * <p>The application ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-xxx</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>F45FFACC-xxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of search results.</p>
     */
    @NameInMap("Results")
    public java.util.List<SearchPolarClawSkillsResponseBodyResults> results;

    public static SearchPolarClawSkillsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchPolarClawSkillsResponseBody self = new SearchPolarClawSkillsResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchPolarClawSkillsResponseBody setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public SearchPolarClawSkillsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public SearchPolarClawSkillsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SearchPolarClawSkillsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchPolarClawSkillsResponseBody setResults(java.util.List<SearchPolarClawSkillsResponseBodyResults> results) {
        this.results = results;
        return this;
    }
    public java.util.List<SearchPolarClawSkillsResponseBodyResults> getResults() {
        return this.results;
    }

    public static class SearchPolarClawSkillsResponseBodyResults extends TeaModel {
        /**
         * <p>The display name.</p>
         * 
         * <strong>example:</strong>
         * <p>RDS Copilot</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The relevance score.</p>
         * 
         * <strong>example:</strong>
         * <p>0.95</p>
         */
        @NameInMap("Score")
        public Double score;

        /**
         * <p>The skill identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>alibacloud-rds-copilot</p>
         */
        @NameInMap("Slug")
        public String slug;

        /**
         * <p>The brief description.</p>
         * 
         * <strong>example:</strong>
         * <p>A copilot for RDS</p>
         */
        @NameInMap("Summary")
        public String summary;

        /**
         * <p>The UNIX timestamp of the last update, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1716000000</p>
         */
        @NameInMap("UpdatedAt")
        public Long updatedAt;

        /**
         * <p>The latest version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.0</p>
         */
        @NameInMap("Version")
        public String version;

        public static SearchPolarClawSkillsResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            SearchPolarClawSkillsResponseBodyResults self = new SearchPolarClawSkillsResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public SearchPolarClawSkillsResponseBodyResults setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public SearchPolarClawSkillsResponseBodyResults setScore(Double score) {
            this.score = score;
            return this;
        }
        public Double getScore() {
            return this.score;
        }

        public SearchPolarClawSkillsResponseBodyResults setSlug(String slug) {
            this.slug = slug;
            return this;
        }
        public String getSlug() {
            return this.slug;
        }

        public SearchPolarClawSkillsResponseBodyResults setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public SearchPolarClawSkillsResponseBodyResults setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public SearchPolarClawSkillsResponseBodyResults setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
