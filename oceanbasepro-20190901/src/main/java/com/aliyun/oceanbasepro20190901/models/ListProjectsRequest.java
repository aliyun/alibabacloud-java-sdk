// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ListProjectsRequest extends TeaModel {
    @NameInMap("LabelIds")
    public java.util.List<String> labelIds;

    @NameInMap("NeedRelatedInfo")
    public Boolean needRelatedInfo;

    /**
     * <strong>example:</strong>
     * <p>descend</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>np_4w****</p>
     */
    @NameInMap("SearchKey")
    public String searchKey;

    @NameInMap("SinkEndpointTypes")
    public java.util.List<String> sinkEndpointTypes;

    /**
     * <strong>example:</strong>
     * <p>gmtCreate</p>
     */
    @NameInMap("SortField")
    public String sortField;

    @NameInMap("SourceEndpointTypes")
    public java.util.List<String> sourceEndpointTypes;

    @NameInMap("Status")
    public java.util.List<String> status;

    /**
     * <strong>example:</strong>
     * <p>MIGRATION</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("VisibleSubProject")
    public Boolean visibleSubProject;

    public static ListProjectsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProjectsRequest self = new ListProjectsRequest();
        return TeaModel.build(map, self);
    }

    public ListProjectsRequest setLabelIds(java.util.List<String> labelIds) {
        this.labelIds = labelIds;
        return this;
    }
    public java.util.List<String> getLabelIds() {
        return this.labelIds;
    }

    public ListProjectsRequest setNeedRelatedInfo(Boolean needRelatedInfo) {
        this.needRelatedInfo = needRelatedInfo;
        return this;
    }
    public Boolean getNeedRelatedInfo() {
        return this.needRelatedInfo;
    }

    public ListProjectsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListProjectsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListProjectsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListProjectsRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public ListProjectsRequest setSinkEndpointTypes(java.util.List<String> sinkEndpointTypes) {
        this.sinkEndpointTypes = sinkEndpointTypes;
        return this;
    }
    public java.util.List<String> getSinkEndpointTypes() {
        return this.sinkEndpointTypes;
    }

    public ListProjectsRequest setSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }
    public String getSortField() {
        return this.sortField;
    }

    public ListProjectsRequest setSourceEndpointTypes(java.util.List<String> sourceEndpointTypes) {
        this.sourceEndpointTypes = sourceEndpointTypes;
        return this;
    }
    public java.util.List<String> getSourceEndpointTypes() {
        return this.sourceEndpointTypes;
    }

    public ListProjectsRequest setStatus(java.util.List<String> status) {
        this.status = status;
        return this;
    }
    public java.util.List<String> getStatus() {
        return this.status;
    }

    public ListProjectsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ListProjectsRequest setVisibleSubProject(Boolean visibleSubProject) {
        this.visibleSubProject = visibleSubProject;
        return this;
    }
    public Boolean getVisibleSubProject() {
        return this.visibleSubProject;
    }

}
