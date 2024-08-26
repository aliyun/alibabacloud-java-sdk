// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class DescribeNisInspectionReportCheckItemsShrinkRequest extends TeaModel {
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
    public String resourceTypeShrink;

    @NameInMap("RiskLevel")
    public String riskLevelShrink;

    public static DescribeNisInspectionReportCheckItemsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNisInspectionReportCheckItemsShrinkRequest self = new DescribeNisInspectionReportCheckItemsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNisInspectionReportCheckItemsShrinkRequest setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
        return this;
    }
    public String getCategoryCode() {
        return this.categoryCode;
    }

    public DescribeNisInspectionReportCheckItemsShrinkRequest setInspectionReportId(String inspectionReportId) {
        this.inspectionReportId = inspectionReportId;
        return this;
    }
    public String getInspectionReportId() {
        return this.inspectionReportId;
    }

    public DescribeNisInspectionReportCheckItemsShrinkRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public DescribeNisInspectionReportCheckItemsShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeNisInspectionReportCheckItemsShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeNisInspectionReportCheckItemsShrinkRequest setResourceTypeShrink(String resourceTypeShrink) {
        this.resourceTypeShrink = resourceTypeShrink;
        return this;
    }
    public String getResourceTypeShrink() {
        return this.resourceTypeShrink;
    }

    public DescribeNisInspectionReportCheckItemsShrinkRequest setRiskLevelShrink(String riskLevelShrink) {
        this.riskLevelShrink = riskLevelShrink;
        return this;
    }
    public String getRiskLevelShrink() {
        return this.riskLevelShrink;
    }

}
