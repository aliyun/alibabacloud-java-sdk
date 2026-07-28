// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class DescribeNisInspectionReportCheckItemsResponseBody extends TeaModel {
    /**
     * <p>The list of check items.</p>
     */
    @NameInMap("CheckItemList")
    public java.util.List<DescribeNisInspectionReportCheckItemsResponseBodyCheckItemList> checkItemList;

    /**
     * <p>The ID of the inspection report.</p>
     * 
     * <strong>example:</strong>
     * <p>nir-ffd1af****196d0</p>
     */
    @NameInMap("InspectionReportId")
    public String inspectionReportId;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.</p>
     * 
     * <strong>example:</strong>
     * <p>hKrS+MVXkuOgztXnvdml194Cz/lMNdmr+DEh0th6dVlNEo/F148UPCh2itDku7Qj</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D5E98683-355B-5867-8D3D-A24755F6895B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
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
         * <p>The number of risks at the specified risk level in the inspection report.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The risk level. Valid values:</p>
         * <ul>
         * <li><p><strong>HighRisk</strong></p>
         * </li>
         * <li><p><strong>MediumRisk</strong></p>
         * </li>
         * <li><p><strong>LowRisk</strong></p>
         * </li>
         * <li><p><strong>NoRisk</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>LowRisk</p>
         */
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
        /**
         * <p>The description of the abnormal item.</p>
         * 
         * <strong>example:</strong>
         * <p>Multiple cross-zone resources share a single NAT gateway.</p>
         */
        @NameInMap("Abnormality")
        public String abnormality;

        /**
         * <p>The metadata of the resource that corresponds to the abnormal item.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Columns&quot;:[{&quot;ColumnType&quot;:&quot;id&quot;,&quot;ColumnTitle&quot;:&quot;Resource ID&quot;,&quot;ColumnValue&quot;:&quot;ResourceId&quot;},{&quot;ColumnType&quot;:&quot;az&quot;,&quot;ColumnTitle&quot;:&quot;NAT Deployment Zone&quot;,&quot;ColumnValue&quot;:&quot;NatAZ&quot;},{&quot;ColumnType&quot;:&quot;array.az&quot;,&quot;ColumnTitle&quot;:&quot;Resource Deployment Zone&quot;,&quot;ColumnValue&quot;:&quot;ForwardsAZs&quot;},{&quot;ColumnType&quot;:&quot;region&quot;,&quot;ColumnTitle&quot;:&quot;Region&quot;,&quot;ColumnValue&quot;:&quot;RegionNo&quot;}]}</p>
         */
        @NameInMap("Metadata")
        public String metadata;

        /**
         * <p>The cause of the abnormality.</p>
         * 
         * <strong>example:</strong>
         * <p>Multiple cross-zone resources share a single NAT gateway.</p>
         */
        @NameInMap("Reason")
        public String reason;

        @NameInMap("ReasonCode")
        public String reasonCode;

        /**
         * <p>The inspection item is abnormal.</p>
         * 
         * <strong>example:</strong>
         * <p>nat_snat_cross_az_warn</p>
         */
        @NameInMap("RecommendationCode")
        public String recommendationCode;

        /**
         * <p>The risk level. Valid values:</p>
         * <ul>
         * <li><p><strong>HighRisk</strong></p>
         * </li>
         * <li><p><strong>MediumRisk</strong></p>
         * </li>
         * <li><p><strong>LowRisk</strong></p>
         * </li>
         * <li><p><strong>NoRisk</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>LowRisk</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        /**
         * <p>The optimization suggestions.</p>
         * 
         * <strong>example:</strong>
         * <p>Deploy NAT gateways in all zones where resources reside.</p>
         */
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
         * <p>The category of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>stability</p>
         */
        @NameInMap("CategoryCode")
        public String categoryCode;

        /**
         * <p>The code of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>item_nat_water_level_check</p>
         */
        @NameInMap("CheckItemCode")
        public String checkItemCode;

        /**
         * <p>The name of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>NAT high-availability deployment check</p>
         */
        @NameInMap("CheckItemName")
        public String checkItemName;

        /**
         * <p>The list of check results that indicates the number of risks at each risk level.</p>
         */
        @NameInMap("CheckResultList")
        public java.util.List<DescribeNisInspectionReportCheckItemsResponseBodyCheckItemListCheckResultList> checkResultList;

        /**
         * <p>The description of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>item_ep_high_availability_check_description</p>
         */
        @NameInMap("DescriptionCode")
        public String descriptionCode;

        /**
         * <p>The list of results for abnormal check items.</p>
         */
        @NameInMap("RecommendationList")
        public java.util.List<DescribeNisInspectionReportCheckItemsResponseBodyCheckItemListRecommendationList> recommendationList;

        /**
         * <p>The resource type associated with the check item.</p>
         * 
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

        public DescribeNisInspectionReportCheckItemsResponseBodyCheckItemList setDescriptionCode(String descriptionCode) {
            this.descriptionCode = descriptionCode;
            return this;
        }
        public String getDescriptionCode() {
            return this.descriptionCode;
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
