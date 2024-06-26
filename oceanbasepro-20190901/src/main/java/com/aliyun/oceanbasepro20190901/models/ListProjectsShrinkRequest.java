// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ListProjectsShrinkRequest extends TeaModel {
    @NameInMap("LabelIds")
    public String labelIdsShrink;

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
    public String sinkEndpointTypesShrink;

    /**
     * <strong>example:</strong>
     * <p>gmtCreate</p>
     */
    @NameInMap("SortField")
    public String sortField;

    @NameInMap("SourceEndpointTypes")
    public String sourceEndpointTypesShrink;

    @NameInMap("Status")
    public String statusShrink;

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

    public static ListProjectsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProjectsShrinkRequest self = new ListProjectsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListProjectsShrinkRequest setLabelIdsShrink(String labelIdsShrink) {
        this.labelIdsShrink = labelIdsShrink;
        return this;
    }
    public String getLabelIdsShrink() {
        return this.labelIdsShrink;
    }

    public ListProjectsShrinkRequest setNeedRelatedInfo(Boolean needRelatedInfo) {
        this.needRelatedInfo = needRelatedInfo;
        return this;
    }
    public Boolean getNeedRelatedInfo() {
        return this.needRelatedInfo;
    }

    public ListProjectsShrinkRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListProjectsShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListProjectsShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListProjectsShrinkRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public ListProjectsShrinkRequest setSinkEndpointTypesShrink(String sinkEndpointTypesShrink) {
        this.sinkEndpointTypesShrink = sinkEndpointTypesShrink;
        return this;
    }
    public String getSinkEndpointTypesShrink() {
        return this.sinkEndpointTypesShrink;
    }

    public ListProjectsShrinkRequest setSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }
    public String getSortField() {
        return this.sortField;
    }

    public ListProjectsShrinkRequest setSourceEndpointTypesShrink(String sourceEndpointTypesShrink) {
        this.sourceEndpointTypesShrink = sourceEndpointTypesShrink;
        return this;
    }
    public String getSourceEndpointTypesShrink() {
        return this.sourceEndpointTypesShrink;
    }

    public ListProjectsShrinkRequest setStatusShrink(String statusShrink) {
        this.statusShrink = statusShrink;
        return this;
    }
    public String getStatusShrink() {
        return this.statusShrink;
    }

    public ListProjectsShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ListProjectsShrinkRequest setVisibleSubProject(Boolean visibleSubProject) {
        this.visibleSubProject = visibleSubProject;
        return this;
    }
    public Boolean getVisibleSubProject() {
        return this.visibleSubProject;
    }

}
