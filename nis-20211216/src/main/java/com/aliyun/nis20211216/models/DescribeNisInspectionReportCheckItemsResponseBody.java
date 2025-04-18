// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class DescribeNisInspectionReportCheckItemsResponseBody extends TeaModel {
    @NameInMap("CheckItemList")
    public java.util.List<DescribeNisInspectionReportCheckItemsResponseBodyCheckItemList> checkItemList;

    /**
     * <strong>example:</strong>
     * <p>nir-ffd1af****196d0</p>
     */
    @NameInMap("InspectionReportId")
    public String inspectionReportId;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>hKrS+MVXkuOgztXnvdml194Cz/lMNdmr+DEh0th6dVlNEo/F148UPCh2itDku7Qj</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>D5E98683-355B-5867-8D3D-A24755F6895B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeNisInspectionReportCheckItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNisInspectionReportCheckItemsResponseBody self = new DescribeNisInspectionReportCheckItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNisInspectionReportCheckItemsResponseBody setCheckItemList(java.util.List<DescribeNisInspectionReportCheckItemsResponseBodyCheckItemList> checkItemList) {
        this.checkItemList = checkItemList;
        return this;
    }
    public java.util.List<DescribeNisInspectionReportCheckItemsResponseBodyCheckItemList> getCheckItemList() {
        return this.checkItemList;
    }

    public DescribeNisInspectionReportCheckItemsResponseBody setInspectionReportId(String inspectionReportId) {
        this.inspectionReportId = inspectionReportId;
        return this;
    }
    public String getInspectionReportId() {
        return this.inspectionReportId;
    }

    public DescribeNisInspectionReportCheckItemsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeNisInspectionReportCheckItemsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeNisInspectionReportCheckItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNisInspectionReportCheckItemsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeNisInspectionReportCheckItemsResponseBodyCheckItemListCheckResultList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Count")
        public Integer count;

        @NameInMap("RiskLevel")
        public String riskLevel;

        public static DescribeNisInspectionReportCheckItemsResponseBodyCheckItemListCheckResultList build(java.util.Map<String, ?> map) throws Exception {
            DescribeNisInspectionReportCheckItemsResponseBodyCheckItemListCheckResultList self = new DescribeNisInspectionReportCheckItemsResponseBodyCheckItemListCheckResultList();
            return TeaModel.build(map, self);
        }

        public DescribeNisInspectionReportCheckItemsResponseBodyCheckItemListCheckResultList setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeNisInspectionReportCheckItemsResponseBodyCheckItemListCheckResultList setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

    }

    public static class DescribeNisInspectionReportCheckItemsResponseBodyCheckItemListRecommendationList extends TeaModel {
        @NameInMap("Abnormality")
        public String abnormality;

        @NameInMap("Metadata")
        public String metadata;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("ReasonCode")
        public String reasonCode;

        /**
         * <strong>example:</strong>
         * <p>nat_snat_cross_az_warn</p>
         */
        @NameInMap("RecommendationCode")
        public String recommendationCode;

        @NameInMap("RiskLevel")
        public String riskLevel;

        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("SuggestionCode")
        public String suggestionCode;

        public static DescribeNisInspectionReportCheckItemsResponseBodyCheckItemListRecommendationList build(java.util.Map<String, ?> map) throws Exception {
            DescribeNisInspectionReportCheckItemsResponseBodyCheckItemListRecommendationList self = new DescribeNisInspectionReportCheckItemsResponseBodyCheckItemListRecommendationList();
            return TeaModel.build(map, self);
        }

        public DescribeNisInspectionReportCheckItemsResponseBodyCheckItemListRecommendationList setAbnormality(String abnormality) {
            this.abnormality = abnormality;
            return this;
        }
        public String getAbnormality() {
            return this.abnormality;
        }

        public DescribeNisInspectionReportCheckItemsResponseBodyCheckItemListRecommendationList setMetadata(String metadata) {
            this.metadata = metadata;
            return this;
        }
        public String getMetadata() {
            return this.metadata;
        }

        public DescribeNisInspectionReportCheckItemsResponseBodyCheckItemListRecommendationList setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeNisInspectionReportCheckItemsResponseBodyCheckItemListRecommendationList setReasonCode(String reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }
        public String getReasonCode() {
            return this.reasonCode;
        }

        public DescribeNisInspectionReportCheckItemsResponseBodyCheckItemListRecommendationList setRecommendationCode(String recommendationCode) {
            this.recommendationCode = recommendationCode;
            return this;
        }
        public String getRecommendationCode() {
            return this.recommendationCode;
        }

        public DescribeNisInspectionReportCheckItemsResponseBodyCheckItemListRecommendationList setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public DescribeNisInspectionReportCheckItemsResponseBodyCheckItemListRecommendationList setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public DescribeNisInspectionReportCheckItemsResponseBodyCheckItemListRecommendationList setSuggestionCode(String suggestionCode) {
            this.suggestionCode = suggestionCode;
            return this;
        }
        public String getSuggestionCode() {
            return this.suggestionCode;
        }

    }

    public static class DescribeNisInspectionReportCheckItemsResponseBodyCheckItemList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>stability</p>
         */
        @NameInMap("CategoryCode")
        public String categoryCode;

        /**
         * <strong>example:</strong>
         * <p>item_nat_water_level_check</p>
         */
        @NameInMap("CheckItemCode")
        public String checkItemCode;

        @NameInMap("CheckItemName")
        public String checkItemName;

        @NameInMap("CheckResultList")
        public java.util.List<DescribeNisInspectionReportCheckItemsResponseBodyCheckItemListCheckResultList> checkResultList;

        @NameInMap("Description")
        public String description;

        @NameInMap("RecommendationList")
        public java.util.List<DescribeNisInspectionReportCheckItemsResponseBodyCheckItemListRecommendationList> recommendationList;

        /**
         * <strong>example:</strong>
         * <p>NAT</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        public static DescribeNisInspectionReportCheckItemsResponseBodyCheckItemList build(java.util.Map<String, ?> map) throws Exception {
            DescribeNisInspectionReportCheckItemsResponseBodyCheckItemList self = new DescribeNisInspectionReportCheckItemsResponseBodyCheckItemList();
            return TeaModel.build(map, self);
        }

        public DescribeNisInspectionReportCheckItemsResponseBodyCheckItemList setCategoryCode(String categoryCode) {
            this.categoryCode = categoryCode;
            return this;
        }
        public String getCategoryCode() {
            return this.categoryCode;
        }

        public DescribeNisInspectionReportCheckItemsResponseBodyCheckItemList setCheckItemCode(String checkItemCode) {
            this.checkItemCode = checkItemCode;
            return this;
        }
        public String getCheckItemCode() {
            return this.checkItemCode;
        }

        public DescribeNisInspectionReportCheckItemsResponseBodyCheckItemList setCheckItemName(String checkItemName) {
            this.checkItemName = checkItemName;
            return this;
        }
        public String getCheckItemName() {
            return this.checkItemName;
        }

        public DescribeNisInspectionReportCheckItemsResponseBodyCheckItemList setCheckResultList(java.util.List<DescribeNisInspectionReportCheckItemsResponseBodyCheckItemListCheckResultList> checkResultList) {
            this.checkResultList = checkResultList;
            return this;
        }
        public java.util.List<DescribeNisInspectionReportCheckItemsResponseBodyCheckItemListCheckResultList> getCheckResultList() {
            return this.checkResultList;
        }

        public DescribeNisInspectionReportCheckItemsResponseBodyCheckItemList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeNisInspectionReportCheckItemsResponseBodyCheckItemList setRecommendationList(java.util.List<DescribeNisInspectionReportCheckItemsResponseBodyCheckItemListRecommendationList> recommendationList) {
            this.recommendationList = recommendationList;
            return this;
        }
        public java.util.List<DescribeNisInspectionReportCheckItemsResponseBodyCheckItemListRecommendationList> getRecommendationList() {
            return this.recommendationList;
        }

        public DescribeNisInspectionReportCheckItemsResponseBodyCheckItemList setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
