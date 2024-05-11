// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class ListTableMetasRequest extends TeaModel {
    @NameInMap("All")
    public Boolean all;

    @NameInMap("DatasourceType")
    public String datasourceType;

    @NameInMap("Order")
    public String order;

    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("SortBy")
    public String sortBy;

    @NameInMap("TableMetaId")
    public String tableMetaId;

    @NameInMap("TableMetaName")
    public String tableMetaName;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListTableMetasRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTableMetasRequest self = new ListTableMetasRequest();
        return TeaModel.build(map, self);
    }

    public ListTableMetasRequest setAll(Boolean all) {
        this.all = all;
        return this;
    }
    public Boolean getAll() {
        return this.all;
    }

    public ListTableMetasRequest setDatasourceType(String datasourceType) {
        this.datasourceType = datasourceType;
        return this;
    }
    public String getDatasourceType() {
        return this.datasourceType;
    }

    public ListTableMetasRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListTableMetasRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListTableMetasRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListTableMetasRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListTableMetasRequest setTableMetaId(String tableMetaId) {
        this.tableMetaId = tableMetaId;
        return this;
    }
    public String getTableMetaId() {
        return this.tableMetaId;
    }

    public ListTableMetasRequest setTableMetaName(String tableMetaName) {
        this.tableMetaName = tableMetaName;
        return this;
    }
    public String getTableMetaName() {
        return this.tableMetaName;
    }

    public ListTableMetasRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
