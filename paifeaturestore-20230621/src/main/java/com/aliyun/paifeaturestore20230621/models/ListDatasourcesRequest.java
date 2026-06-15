// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ListDatasourcesRequest extends TeaModel {
    /**
     * <p>The name of the data source.</p>
     * 
     * <strong>example:</strong>
     * <p>datasource1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The sort order. Valid values:</p>
     * <ul>
     * <li><p>Asc: ascending order.</p>
     * </li>
     * <li><p>Desc: descending order.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Asc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number. Pages start from 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of data sources per page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The field to sort by.</p>
     * 
     * <strong>example:</strong>
     * <p>GmtModifiedTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The type of the data source. Valid values:</p>
     * <ul>
     * <li><p>Hologres</p>
     * </li>
     * <li><p>Redis</p>
     * </li>
     * <li><p>MaxCompute</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MaxCompute</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The ID of the workspace. Call the <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a> operation to get the workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>234</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListDatasourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDatasourcesRequest self = new ListDatasourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListDatasourcesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListDatasourcesRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListDatasourcesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDatasourcesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDatasourcesRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListDatasourcesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ListDatasourcesRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
