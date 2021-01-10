// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryCasDatabaseSchemaRequest extends TeaModel {
    @NameInMap("CharSetsRepeatList")
    public java.util.List<String> charSetsRepeatList;

    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("DatabaseId")
    public String databaseId;

    @NameInMap("IaasIdsRepeatList")
    public java.util.List<String> iaasIdsRepeatList;

    @NameInMap("IdsRepeatList")
    public java.util.List<String> idsRepeatList;

    @NameInMap("Name")
    public String name;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("StatusesRepeatList")
    public java.util.List<String> statusesRepeatList;

    @NameInMap("Workspace")
    public String workspace;

    public static QueryCasDatabaseSchemaRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCasDatabaseSchemaRequest self = new QueryCasDatabaseSchemaRequest();
        return TeaModel.build(map, self);
    }

    public QueryCasDatabaseSchemaRequest setCharSetsRepeatList(java.util.List<String> charSetsRepeatList) {
        this.charSetsRepeatList = charSetsRepeatList;
        return this;
    }
    public java.util.List<String> getCharSetsRepeatList() {
        return this.charSetsRepeatList;
    }

    public QueryCasDatabaseSchemaRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryCasDatabaseSchemaRequest setDatabaseId(String databaseId) {
        this.databaseId = databaseId;
        return this;
    }
    public String getDatabaseId() {
        return this.databaseId;
    }

    public QueryCasDatabaseSchemaRequest setIaasIdsRepeatList(java.util.List<String> iaasIdsRepeatList) {
        this.iaasIdsRepeatList = iaasIdsRepeatList;
        return this;
    }
    public java.util.List<String> getIaasIdsRepeatList() {
        return this.iaasIdsRepeatList;
    }

    public QueryCasDatabaseSchemaRequest setIdsRepeatList(java.util.List<String> idsRepeatList) {
        this.idsRepeatList = idsRepeatList;
        return this;
    }
    public java.util.List<String> getIdsRepeatList() {
        return this.idsRepeatList;
    }

    public QueryCasDatabaseSchemaRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryCasDatabaseSchemaRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryCasDatabaseSchemaRequest setStatusesRepeatList(java.util.List<String> statusesRepeatList) {
        this.statusesRepeatList = statusesRepeatList;
        return this;
    }
    public java.util.List<String> getStatusesRepeatList() {
        return this.statusesRepeatList;
    }

    public QueryCasDatabaseSchemaRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
