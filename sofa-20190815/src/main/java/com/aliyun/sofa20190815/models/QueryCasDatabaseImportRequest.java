// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryCasDatabaseImportRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("IaasType")
    public String iaasType;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("Workspace")
    public String workspace;

    public static QueryCasDatabaseImportRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCasDatabaseImportRequest self = new QueryCasDatabaseImportRequest();
        return TeaModel.build(map, self);
    }

    public QueryCasDatabaseImportRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryCasDatabaseImportRequest setIaasType(String iaasType) {
        this.iaasType = iaasType;
        return this;
    }
    public String getIaasType() {
        return this.iaasType;
    }

    public QueryCasDatabaseImportRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryCasDatabaseImportRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
