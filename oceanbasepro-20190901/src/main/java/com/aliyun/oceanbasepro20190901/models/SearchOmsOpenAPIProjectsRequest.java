// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class SearchOmsOpenAPIProjectsRequest extends TeaModel {
    @NameInMap("DestDbTypes")
    public java.util.List<String> destDbTypes;

    @NameInMap("LabelIds")
    public java.util.List<String> labelIds;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SearchKey")
    public String searchKey;

    @NameInMap("SourceDbTypes")
    public java.util.List<String> sourceDbTypes;

    @NameInMap("StatusList")
    public java.util.List<String> statusList;

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
