// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class DescribeNisInspectionReportCheckItemsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>stability</p>
     */
    @NameInMap("CategoryCode")
    public String categoryCode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>nir-ffd1af****196d0</p>
     */
    @NameInMap("InspectionReportId")
    public String inspectionReportId;

    /**
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>hKrS+MVXkuOgztXnvdml16/uO3mvCyHxSjzdhx9VRUC+8umDTIV2Wg9TTOUrR7ve</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("ResourceType")
    public java.util.List<String> resourceType;

    @NameInMap("RiskLevel")
    public java.util.List<String> riskLevel;

    public static DescribeNisInspectionReportCheckItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNisInspectionReportCheckItemsRequest self = new DescribeNisInspectionReportCheckItemsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNisInspectionReportCheckItemsRequest setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
        return this;
    }
    public String getCategoryCode() {
        return this.categoryCode;
    }

    public DescribeNisInspectionReportCheckItemsRequest setInspectionReportId(String inspectionReportId) {
        this.inspectionReportId = inspectionReportId;
        return this;
    }
    public String getInspectionReportId() {
        return this.inspectionReportId;
    }

    public DescribeNisInspectionReportCheckItemsRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public DescribeNisInspectionReportCheckItemsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeNisInspectionReportCheckItemsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeNisInspectionReportCheckItemsRequest setResourceType(java.util.List<String> resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public java.util.List<String> getResourceType() {
        return this.resourceType;
    }

    public DescribeNisInspectionReportCheckItemsRequest setRiskLevel(java.util.List<String> riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }
    public java.util.List<String> getRiskLevel() {
        return this.riskLevel;
    }

}
