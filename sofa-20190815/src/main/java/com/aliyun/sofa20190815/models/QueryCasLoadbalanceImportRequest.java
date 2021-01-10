// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryCasLoadbalanceImportRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("Workspace")
    public String workspace;

    @NameInMap("ZoneId")
    public String zoneId;

    public static QueryCasLoadbalanceImportRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCasLoadbalanceImportRequest self = new QueryCasLoadbalanceImportRequest();
        return TeaModel.build(map, self);
    }

    public QueryCasLoadbalanceImportRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryCasLoadbalanceImportRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryCasLoadbalanceImportRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public QueryCasLoadbalanceImportRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
