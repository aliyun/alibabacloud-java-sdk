// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryComponentPerformanceRequest extends TeaModel {
    @NameInMap("CostTimeAvgMin")
    public Integer costTimeAvgMin;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("QueryType")
    public String queryType;

    @NameInMap("ReportId")
    public String reportId;

    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static QueryComponentPerformanceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryComponentPerformanceRequest self = new QueryComponentPerformanceRequest();
        return TeaModel.build(map, self);
    }

    public QueryComponentPerformanceRequest setCostTimeAvgMin(Integer costTimeAvgMin) {
        this.costTimeAvgMin = costTimeAvgMin;
        return this;
    }
    public Integer getCostTimeAvgMin() {
        return this.costTimeAvgMin;
    }

    public QueryComponentPerformanceRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryComponentPerformanceRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryComponentPerformanceRequest setQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }
    public String getQueryType() {
        return this.queryType;
    }

    public QueryComponentPerformanceRequest setReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }
    public String getReportId() {
        return this.reportId;
    }

    public QueryComponentPerformanceRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public QueryComponentPerformanceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
