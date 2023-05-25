// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeDatabasesRequest extends TeaModel {
    /**
     * <p>It is an Alibaba Cloud asset management and configuration tool, with which you can manage multiple Alibaba Cloud products and services by using commands. It is easy to use and a good helper in migration to cloud.</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    /**
     * <p>The return result of the request.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Alibaba Cloud provides SDKs in different languages to help you quickly integrate Alibaba Cloud products and services by using APIs. We recommend that you use an SDK to call APIs. In this way, you do not need to sign for verification.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The information about the database tables.</p>
     */
    @NameInMap("SearchKey")
    public String searchKey;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    /**
     * <p>The role of the account.    </p>
     * <p>In MySQL mode, a role is a database-level role. Valid values:  </p>
     * <p>- ReadWrite: a role that has the read and write privileges, namely ALL PRIVILEGES.  </p>
     * <p>- ReadOnly: a role that has only the read-only privilege SELECT.   </p>
     * <p>- DDL: a role that has the DDL privileges such as CREATE, DROP, ALTER, SHOW VIEW, and CREATE VIEW.   </p>
     * <p>- DML: a role that has the DML privileges such as SELECT, INSERT, UPDATE, DELETE, and SHOW VIEW.</p>
     */
    @NameInMap("WithTables")
    public Boolean withTables;

    public static DescribeDatabasesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDatabasesRequest self = new DescribeDatabasesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDatabasesRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public DescribeDatabasesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDatabasesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDatabasesRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public DescribeDatabasesRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public DescribeDatabasesRequest setWithTables(Boolean withTables) {
        this.withTables = withTables;
        return this;
    }
    public Boolean getWithTables() {
        return this.withTables;
    }

}
