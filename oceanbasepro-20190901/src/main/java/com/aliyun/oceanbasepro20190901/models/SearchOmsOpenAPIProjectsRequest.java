// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class SearchOmsOpenAPIProjectsRequest extends TeaModel {
    /**
     * <p>The types of destination data sources.</p>
     */
    @NameInMap("DestDbTypes")
    public java.util.List<String> destDbTypes;

    /**
     * <p>The list of labels.</p>
     */
    @NameInMap("LabelIds")
    public java.util.List<String> labelIds;

    /**
     * <p>The page number, which takes effect in a pagination query.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The page size, which takes effect in a pagination query.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The keyword for fuzzy search. A fuzzy search is performed based on the project ID and name.</p>
     */
    @NameInMap("SearchKey")
    public String searchKey;

    /**
     * <p>The types of source data sources.</p>
     */
    @NameInMap("SourceDbTypes")
    public java.util.List<String> sourceDbTypes;

    /**
     * <p>The list of project statuses.</p>
     */
    @NameInMap("StatusList")
    public java.util.List<String> statusList;

    /**
     * <p>The ID of the migration instance. Generally, if you want to create a project on a public cloud, you must first purchase a migration instance.</p>
     */
    @NameInMap("WorkerGradeId")
    public String workerGradeId;

    public static SearchOmsOpenAPIProjectsRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchOmsOpenAPIProjectsRequest self = new SearchOmsOpenAPIProjectsRequest();
        return TeaModel.build(map, self);
    }

    public SearchOmsOpenAPIProjectsRequest setDestDbTypes(java.util.List<String> destDbTypes) {
        this.destDbTypes = destDbTypes;
        return this;
    }
    public java.util.List<String> getDestDbTypes() {
        return this.destDbTypes;
    }

    public SearchOmsOpenAPIProjectsRequest setLabelIds(java.util.List<String> labelIds) {
        this.labelIds = labelIds;
        return this;
    }
    public java.util.List<String> getLabelIds() {
        return this.labelIds;
    }

    public SearchOmsOpenAPIProjectsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public SearchOmsOpenAPIProjectsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchOmsOpenAPIProjectsRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public SearchOmsOpenAPIProjectsRequest setSourceDbTypes(java.util.List<String> sourceDbTypes) {
        this.sourceDbTypes = sourceDbTypes;
        return this;
    }
    public java.util.List<String> getSourceDbTypes() {
        return this.sourceDbTypes;
    }

    public SearchOmsOpenAPIProjectsRequest setStatusList(java.util.List<String> statusList) {
        this.statusList = statusList;
        return this;
    }
    public java.util.List<String> getStatusList() {
        return this.statusList;
    }

    public SearchOmsOpenAPIProjectsRequest setWorkerGradeId(String workerGradeId) {
        this.workerGradeId = workerGradeId;
        return this;
    }
    public String getWorkerGradeId() {
        return this.workerGradeId;
    }

}
