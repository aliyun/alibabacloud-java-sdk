// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSecureSuggestionResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Suggestions")
    public java.util.List<DescribeSecureSuggestionResponseBodySuggestions> suggestions;

    public static DescribeSecureSuggestionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecureSuggestionResponseBody self = new DescribeSecureSuggestionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSecureSuggestionResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
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

    public static class DescribeSecureSuggestionResponseBodySuggestionsDetail extends TeaModel {
        @NameInMap("Title")
        public String title;

        @NameInMap("Description")
        public String description;

        @NameInMap("SubType")
        public String subType;

        public static DescribeSecureSuggestionResponseBodySuggestionsDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecureSuggestionResponseBodySuggestionsDetail self = new DescribeSecureSuggestionResponseBodySuggestionsDetail();
            return TeaModel.build(map, self);
        }

        public DescribeSecureSuggestionResponseBodySuggestionsDetail setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
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

    }

    public static class DescribeSecureSuggestionResponseBodySuggestions extends TeaModel {
        @NameInMap("Points")
        public Integer points;

        @NameInMap("SuggestType")
        public String suggestType;

        @NameInMap("Detail")
        public java.util.List<DescribeSecureSuggestionResponseBodySuggestionsDetail> detail;

        public static DescribeSecureSuggestionResponseBodySuggestions build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecureSuggestionResponseBodySuggestions self = new DescribeSecureSuggestionResponseBodySuggestions();
            return TeaModel.build(map, self);
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

        public DescribeSecureSuggestionResponseBodySuggestions setDetail(java.util.List<DescribeSecureSuggestionResponseBodySuggestionsDetail> detail) {
            this.detail = detail;
            return this;
        }
        public java.util.List<DescribeSecureSuggestionResponseBodySuggestionsDetail> getDetail() {
            return this.detail;
        }

    }

}
