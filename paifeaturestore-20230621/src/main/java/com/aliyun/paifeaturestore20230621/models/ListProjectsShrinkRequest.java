// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ListProjectsShrinkRequest extends TeaModel {
    /**
     * <p>The project name to filter by.</p>
     * 
     * <strong>example:</strong>
     * <p>fs1</p>
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
     * <p>The Alibaba Cloud account ID of the project owner.</p>
     * 
     * <strong>example:</strong>
     * <p>134324352****</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The page number. Starts from 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>An array of project IDs to filter by.</p>
     */
    @NameInMap("ProjectIds")
    public String projectIdsShrink;

    /**
     * <p>The field to sort the results by.</p>
     * 
     * <strong>example:</strong>
     * <p>GmtModifiedTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The ID of the workspace. Call the <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a> operation to get this ID.</p>
     * 
     * <strong>example:</strong>
     * <p>234</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListProjectsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProjectsShrinkRequest self = new ListProjectsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListProjectsShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListProjectsShrinkRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListProjectsShrinkRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
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

    public ListProjectsShrinkRequest setProjectIdsShrink(String projectIdsShrink) {
        this.projectIdsShrink = projectIdsShrink;
        return this;
    }
    public String getProjectIdsShrink() {
        return this.projectIdsShrink;
    }

    public ListProjectsShrinkRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListProjectsShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
