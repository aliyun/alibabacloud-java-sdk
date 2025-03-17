// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryComponentPerformanceRequest extends TeaModel {
    /**
     * <p>The average duration (minutes).</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CostTimeAvgMin")
    public Integer costTimeAvgMin;

    /**
     * <p>The current page number of the workspace member list:</p>
     * <ul>
     * <li>Pages start from page 1.</li>
     * <li>Default value: 1.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of rows per page in a paged query.</p>
     * <ul>
     * <li>Default value: 10.</li>
     * <li>Maximum value: 1,000.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The query type. Valid values:</p>
     * <ul>
     * <li><strong>lastDay</strong>: Yesterday</li>
     * <li><strong>sevenDays</strong>: Within seven days</li>
     * <li><strong>thirtyDays</strong>: Within 30 days</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sevenDays</p>
     */
    @NameInMap("QueryType")
    public String queryType;

    /**
     * <p>The ID of the work. The works here include BI portal, dashboards, spreadsheets, and self-service access.</p>
     * 
     * <strong>example:</strong>
     * <p>6b407e50-e774-406b-9956-da2425c2****</p>
     */
    @NameInMap("ReportId")
    public String reportId;

    /**
     * <p>The resource types.</p>
     * 
     * <strong>example:</strong>
     * <p>report</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>89713491-cb4f-4579-b889-e82c35f1****</p>
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
