// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class DescribeNisInspectionRecommendationResourcesRequest extends TeaModel {
    /**
     * <p>The ID of the inspection report.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>nir-ffd1af****196d0</p>
     */
    @NameInMap("InspectionReportId")
    public String inspectionReportId;

    /**
     * <p>The language to use.</p>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The maximum number of entries to return on each page. Maximum value: 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to query the next page of results. Set this parameter to the NextToken value returned from the last API call.</p>
     * 
     * <strong>example:</strong>
     * <p>hKrS+MVXkuOgztXnvdml16/uO3mvCyHxSjzdhx9VRUC+8umDTIV2Wg9TTOUrR7ve</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The recommendation code for the abnormal item.</p>
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
