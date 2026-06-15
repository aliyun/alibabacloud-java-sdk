// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ListLabelTablesRequest extends TeaModel {
    /**
     * <p>The IDs of the label tables by which to filter the results.</p>
     */
    @NameInMap("LabelTableIds")
    public java.util.List<String> labelTableIds;

    /**
     * <p>The name of the label table.</p>
     * 
     * <strong>example:</strong>
     * <p>label_table1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The sort order. Valid values:</p>
     * <ul>
     * <li><p><code>Asc</code>: ascending order.</p>
     * </li>
     * <li><p><code>Desc</code>: descending order.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Asc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The Alibaba Cloud account ID of the owner.</p>
     * 
     * <strong>example:</strong>
     * <p>1231432432****</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The page number. Page numbers start from 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The project ID. You can call the <code>ListProjects</code> operation to obtain this ID.</p>
     * 
     * <strong>example:</strong>
     * <p>project1</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>The field by which to sort the results.</p>
     * 
     * <strong>example:</strong>
     * <p>GmtModifiedTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    public static ListLabelTablesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLabelTablesRequest self = new ListLabelTablesRequest();
        return TeaModel.build(map, self);
    }

    public ListLabelTablesRequest setLabelTableIds(java.util.List<String> labelTableIds) {
        this.labelTableIds = labelTableIds;
        return this;
    }
    public java.util.List<String> getLabelTableIds() {
        return this.labelTableIds;
    }

    public ListLabelTablesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListLabelTablesRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListLabelTablesRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public ListLabelTablesRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListLabelTablesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListLabelTablesRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ListLabelTablesRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

}
