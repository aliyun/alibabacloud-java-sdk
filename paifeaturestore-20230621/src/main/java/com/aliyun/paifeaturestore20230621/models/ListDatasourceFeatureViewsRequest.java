// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ListDatasourceFeatureViewsRequest extends TeaModel {
    /**
     * <p>Return all data (no paging).</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("All")
    public Boolean all;

    /**
     * <p>End time for query read/write volume. Format: yyyy-mm-dd.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-03-19</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>Fuzzy filter for feature view names.</p>
     * 
     * <strong>example:</strong>
     * <p>fv</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Sort order.</p>
     * 
     * <strong>example:</strong>
     * <p>Desc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>Page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Page size.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Project ID. Get this ID using the ListProjects API.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>Filter by project name.</p>
     * 
     * <strong>example:</strong>
     * <p>fs_project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>Show storage usage. Default is true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ShowStorageUsage")
    public Boolean showStorageUsage;

    /**
     * <p>Sort by.</p>
     * 
     * <strong>example:</strong>
     * <p>GmtCreateTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>Start time for query read/write volume. Format: yyyy-mm-dd.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-03-14</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    /**
     * <p>Feature view type.</p>
     * <ul>
     * <li><p>Batch - offline feature</p>
     * </li>
     * <li><p>Stream - real-time feature</p>
     * </li>
     * <li><p>Sequence - sequence feature</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Stream</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>Show detailed information. If set to false, do not show UsageStatistics for each view; show only the total. Default is true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Verbose")
    public Boolean verbose;

    public static ListDatasourceFeatureViewsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDatasourceFeatureViewsRequest self = new ListDatasourceFeatureViewsRequest();
        return TeaModel.build(map, self);
    }

    public ListDatasourceFeatureViewsRequest setAll(Boolean all) {
        this.all = all;
        return this;
    }
    public Boolean getAll() {
        return this.all;
    }

    public ListDatasourceFeatureViewsRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public ListDatasourceFeatureViewsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListDatasourceFeatureViewsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListDatasourceFeatureViewsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDatasourceFeatureViewsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDatasourceFeatureViewsRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ListDatasourceFeatureViewsRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public ListDatasourceFeatureViewsRequest setShowStorageUsage(Boolean showStorageUsage) {
        this.showStorageUsage = showStorageUsage;
        return this;
    }
    public Boolean getShowStorageUsage() {
        return this.showStorageUsage;
    }

    public ListDatasourceFeatureViewsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListDatasourceFeatureViewsRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public ListDatasourceFeatureViewsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ListDatasourceFeatureViewsRequest setVerbose(Boolean verbose) {
        this.verbose = verbose;
        return this;
    }
    public Boolean getVerbose() {
        return this.verbose;
    }

}
