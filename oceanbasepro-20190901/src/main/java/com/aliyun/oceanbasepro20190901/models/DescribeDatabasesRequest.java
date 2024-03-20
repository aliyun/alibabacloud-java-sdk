// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeDatabasesRequest extends TeaModel {
    /**
     * <p>The name of the database.    </p>
     * <p>You cannot use reserved keywords, such as test and mysql.</p>
     */
    @NameInMap("DatabaseName")
    public String databaseName;

    /**
     * <p>The ID of the cluster.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The number of the page returned.  </p>
     * <p>- Start value: 1   </p>
     * <p>- Default value: 1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of rows returned on each page.  </p>
     * <p>- Maximum value: 100.  </p>
     * <p>- Default value: 10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The search keyword.</p>
     */
    @NameInMap("SearchKey")
    public String searchKey;

    /**
     * <p>The ID of the tenant.</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    /**
     * <p>Specifies whether to return the information about tables in the database.</p>
     * <p>Default value: false. </p>
     * <p>> The operation may time out if the database contains a large number of tables.</p>
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

    public DescribeDatabasesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
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
