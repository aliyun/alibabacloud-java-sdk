// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryCubePerformanceRequest extends TeaModel {
    /**
     * <p>The average duration (minutes).</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CostTimeAvgMin")
    public Integer costTimeAvgMin;

    /**
     * <p>The dataset ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7c7223ae-****-3c744528014b</p>
     */
    @NameInMap("CubeId")
    public String cubeId;

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
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>95296e95-ca89-4c7d-8af9-dedf0ad0****</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static QueryCubePerformanceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCubePerformanceRequest self = new QueryCubePerformanceRequest();
        return TeaModel.build(map, self);
    }

    public QueryCubePerformanceRequest setCostTimeAvgMin(Integer costTimeAvgMin) {
        this.costTimeAvgMin = costTimeAvgMin;
        return this;
    }
    public Integer getCostTimeAvgMin() {
        return this.costTimeAvgMin;
    }

    public QueryCubePerformanceRequest setCubeId(String cubeId) {
        this.cubeId = cubeId;
        return this;
    }
    public String getCubeId() {
        return this.cubeId;
    }

    public QueryCubePerformanceRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryCubePerformanceRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryCubePerformanceRequest setQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }
    public String getQueryType() {
        return this.queryType;
    }

    public QueryCubePerformanceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
