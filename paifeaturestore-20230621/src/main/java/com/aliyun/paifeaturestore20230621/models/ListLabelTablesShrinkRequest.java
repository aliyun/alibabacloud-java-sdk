// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ListLabelTablesShrinkRequest extends TeaModel {
    /**
     * <p>The IDs of the label tables by which to filter the results.</p>
     */
    @NameInMap("LabelTableIds")
    public String labelTableIdsShrink;

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

    public static ListLabelTablesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLabelTablesShrinkRequest self = new ListLabelTablesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListLabelTablesShrinkRequest setLabelTableIdsShrink(String labelTableIdsShrink) {
        this.labelTableIdsShrink = labelTableIdsShrink;
        return this;
    }
    public String getLabelTableIdsShrink() {
        return this.labelTableIdsShrink;
    }

    public ListLabelTablesShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListLabelTablesShrinkRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListLabelTablesShrinkRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public ListLabelTablesShrinkRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListLabelTablesShrinkRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListLabelTablesShrinkRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ListLabelTablesShrinkRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

}
