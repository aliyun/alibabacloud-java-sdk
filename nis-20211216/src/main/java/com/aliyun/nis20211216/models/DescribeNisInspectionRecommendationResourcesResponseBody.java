// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class DescribeNisInspectionRecommendationResourcesResponseBody extends TeaModel {
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
     * <p>qt0DqY2lXxwBt9/ROQoS/7J9p90D1vF2vFbwzb/1oSWr3AxcM6/KpObZ7Z1PZdcV</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>A7F0D6EC-E19E-58AC-AC9F-08036763960F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceList")
    public java.util.List<DescribeNisInspectionRecommendationResourcesResponseBodyResourceList> resourceList;

    /**
     * <strong>example:</strong>
     * <p>192</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeNisInspectionRecommendationResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNisInspectionRecommendationResourcesResponseBody self = new DescribeNisInspectionRecommendationResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNisInspectionRecommendationResourcesResponseBody setInspectionReportId(String inspectionReportId) {
        this.inspectionReportId = inspectionReportId;
        return this;
    }
    public String getInspectionReportId() {
        return this.inspectionReportId;
    }

    public DescribeNisInspectionRecommendationResourcesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeNisInspectionRecommendationResourcesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeNisInspectionRecommendationResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNisInspectionRecommendationResourcesResponseBody setResourceList(java.util.List<DescribeNisInspectionRecommendationResourcesResponseBodyResourceList> resourceList) {
        this.resourceList = resourceList;
        return this;
    }
    public java.util.List<DescribeNisInspectionRecommendationResourcesResponseBodyResourceList> getResourceList() {
        return this.resourceList;
    }

    public DescribeNisInspectionRecommendationResourcesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeNisInspectionRecommendationResourcesResponseBodyResourceList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{ResourceId: &quot;ngw-p0wn04hi4****q2us6q7q&quot;}</p>
         */
        @NameInMap("AnalysisData")
        public String analysisData;

        /**
         * <strong>example:</strong>
         * <p>ngw-p0wn04hi4****q2us6q7q</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceName")
        public String resourceName;

        public static DescribeNisInspectionRecommendationResourcesResponseBodyResourceList build(java.util.Map<String, ?> map) throws Exception {
            DescribeNisInspectionRecommendationResourcesResponseBodyResourceList self = new DescribeNisInspectionRecommendationResourcesResponseBodyResourceList();
            return TeaModel.build(map, self);
        }

        public DescribeNisInspectionRecommendationResourcesResponseBodyResourceList setAnalysisData(String analysisData) {
            this.analysisData = analysisData;
            return this;
        }
        public String getAnalysisData() {
            return this.analysisData;
        }

        public DescribeNisInspectionRecommendationResourcesResponseBodyResourceList setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeNisInspectionRecommendationResourcesResponseBodyResourceList setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

    }

}
