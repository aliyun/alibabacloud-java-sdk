// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSecureSuggestionResponseBody extends TeaModel {
    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>An array that consists of the unhandled security risks.</p>
     */
    @NameInMap("Suggestions")
    public java.util.List<DescribeSecureSuggestionResponseBodySuggestions> suggestions;

    /**
     * <p>The total number of unhandled security risks.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeSecureSuggestionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecureSuggestionResponseBody self = new DescribeSecureSuggestionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSecureSuggestionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSecureSuggestionResponseBody setSuggestions(java.util.List<DescribeSecureSuggestionResponseBodySuggestions> suggestions) {
        this.suggestions = suggestions;
        return this;
    }
    public java.util.List<DescribeSecureSuggestionResponseBodySuggestions> getSuggestions() {
        return this.suggestions;
    }

    public DescribeSecureSuggestionResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeSecureSuggestionResponseBodySuggestionsDetail extends TeaModel {
        /**
         * <p>The description of the suggestion.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The subtype of the unhandled security risk.</p>
         */
        @NameInMap("SubType")
        public String subType;

        /**
         * <p>The name of the unhandled risk.</p>
         */
        @NameInMap("Title")
        public String title;

        public static DescribeSecureSuggestionResponseBodySuggestionsDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecureSuggestionResponseBodySuggestionsDetail self = new DescribeSecureSuggestionResponseBodySuggestionsDetail();
            return TeaModel.build(map, self);
        }

        public DescribeSecureSuggestionResponseBodySuggestionsDetail setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeSecureSuggestionResponseBodySuggestionsDetail setSubType(String subType) {
            this.subType = subType;
            return this;
        }
        public String getSubType() {
            return this.subType;
        }

        public DescribeSecureSuggestionResponseBodySuggestionsDetail setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class DescribeSecureSuggestionResponseBodySuggestions extends TeaModel {
        /**
         * <p>An array that consists of the details about the suggestion.</p>
         */
        @NameInMap("Detail")
        public java.util.List<DescribeSecureSuggestionResponseBodySuggestionsDetail> detail;

        /**
         * <p>The penalty point of an item.</p>
         */
        @NameInMap("Points")
        public Integer points;

        /**
         * <p>The type of the unhandled security risk. Valid values:</p>
         * <br>
         * <p>*   **SS_REINFORCE**: missing configuration of key features, such as the antivirus feature</p>
         * <p>*   **SS_ALARM**: unhandled alerts</p>
         * <p>*   **SS_VUL**: unfixed vulnerabilities</p>
         * <p>*   **SS_HC**: baseline risks</p>
         * <p>*   **SS_AK**: AccessKey pair leaks</p>
         * <p>*   **SS_CLOUD_HC**: configuration risks of cloud services</p>
         * <p>*   **OTHER**: others</p>
         */
        @NameInMap("SuggestType")
        public String suggestType;

        public static DescribeSecureSuggestionResponseBodySuggestions build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecureSuggestionResponseBodySuggestions self = new DescribeSecureSuggestionResponseBodySuggestions();
            return TeaModel.build(map, self);
        }

        public DescribeSecureSuggestionResponseBodySuggestions setDetail(java.util.List<DescribeSecureSuggestionResponseBodySuggestionsDetail> detail) {
            this.detail = detail;
            return this;
        }
        public java.util.List<DescribeSecureSuggestionResponseBodySuggestionsDetail> getDetail() {
            return this.detail;
        }

        public DescribeSecureSuggestionResponseBodySuggestions setPoints(Integer points) {
            this.points = points;
            return this;
        }
        public Integer getPoints() {
            return this.points;
        }

        public DescribeSecureSuggestionResponseBodySuggestions setSuggestType(String suggestType) {
            this.suggestType = suggestType;
            return this;
        }
        public String getSuggestType() {
            return this.suggestType;
        }

    }

}
