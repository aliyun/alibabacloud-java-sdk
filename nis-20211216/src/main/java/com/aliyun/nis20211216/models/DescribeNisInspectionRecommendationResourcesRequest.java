// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class DescribeNisInspectionRecommendationResourcesRequest extends TeaModel {
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

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>nat_snat_cross_az_warn</p>
     */
    @NameInMap("RecommendationCode")
    public String recommendationCode;

    public static DescribeNisInspectionRecommendationResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNisInspectionRecommendationResourcesRequest self = new DescribeNisInspectionRecommendationResourcesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNisInspectionRecommendationResourcesRequest setInspectionReportId(String inspectionReportId) {
        this.inspectionReportId = inspectionReportId;
        return this;
    }
    public String getInspectionReportId() {
        return this.inspectionReportId;
    }

    public DescribeNisInspectionRecommendationResourcesRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public DescribeNisInspectionRecommendationResourcesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeNisInspectionRecommendationResourcesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeNisInspectionRecommendationResourcesRequest setRecommendationCode(String recommendationCode) {
        this.recommendationCode = recommendationCode;
        return this;
    }
    public String getRecommendationCode() {
        return this.recommendationCode;
    }

}
