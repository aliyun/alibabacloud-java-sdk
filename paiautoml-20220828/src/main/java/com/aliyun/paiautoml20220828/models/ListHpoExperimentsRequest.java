// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiautoml20220828.models;

import com.aliyun.tea.*;

public class ListHpoExperimentsRequest extends TeaModel {
    /**
     * <p>The accessibility of the experiments to be listed.</p>
     * 
     * <strong>example:</strong>
     * <p>PRIVATE</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <p>Who created the expriment.</p>
     * 
     * <strong>example:</strong>
     * <p>266977839132045194</p>
     */
    @NameInMap("Creator")
    public String creator;

    /**
     * <p>Return experiment detailed configuration or not.</p>
     * 
     * <strong>example:</strong>
     * <p>True, False</p>
     */
    @NameInMap("IncludeConfigData")
    public String includeConfigData;

    /**
     * <p>The maximum create time of the experiment.</p>
     * 
     * <strong>example:</strong>
     * <p>yyyy-mm-dd hh:mm:ss或着yyyy-mm-dd，比如2023-03-31 10:29:30</p>
     */
    @NameInMap("MaxCreateTime")
    public String maxCreateTime;

    /**
     * <p>The minimum create time of the experiment.</p>
     * 
     * <strong>example:</strong>
     * <p>yyyy-mm-dd hh:mm:ss或着yyyy-mm-dd，比如2023-03-31 10:29:30</p>
     */
    @NameInMap("MinCreateTime")
    public String minCreateTime;

    /**
     * <p>Experiment name filter.</p>
     * 
     * <strong>example:</strong>
     * <p>my_hpo_exp_1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>ASC, DESC.</p>
     * 
     * <strong>example:</strong>
     * <p>ASC, DESC.</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Record number on each page</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The returned experiments to be sorted by this column.</p>
     * 
     * <strong>example:</strong>
     * <p>GmtCreateTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>Experiment status to be listed.</p>
     * 
     * <strong>example:</strong>
     * <p>CREATED, RUNNING, FINISHED, FAILED, EARLY_STOPPED, USER_CANCELED, SYS_CANCELED, WAITING, NO_MORE_TRIAL, UNKNOWN</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The AI workspace ID the experiments belongs to.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListHpoExperimentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHpoExperimentsRequest self = new ListHpoExperimentsRequest();
        return TeaModel.build(map, self);
    }

    public ListHpoExperimentsRequest setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public ListHpoExperimentsRequest setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public ListHpoExperimentsRequest setIncludeConfigData(String includeConfigData) {
        this.includeConfigData = includeConfigData;
        return this;
    }
    public String getIncludeConfigData() {
        return this.includeConfigData;
    }

    public ListHpoExperimentsRequest setMaxCreateTime(String maxCreateTime) {
        this.maxCreateTime = maxCreateTime;
        return this;
    }
    public String getMaxCreateTime() {
        return this.maxCreateTime;
    }

    public ListHpoExperimentsRequest setMinCreateTime(String minCreateTime) {
        this.minCreateTime = minCreateTime;
        return this;
    }
    public String getMinCreateTime() {
        return this.minCreateTime;
    }

    public ListHpoExperimentsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListHpoExperimentsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListHpoExperimentsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListHpoExperimentsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListHpoExperimentsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListHpoExperimentsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListHpoExperimentsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
