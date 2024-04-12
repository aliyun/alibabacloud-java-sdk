// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListDatabaseAccountsRequest extends TeaModel {
    @NameInMap("DatabaseAccountName")
    public String databaseAccountName;

    @NameInMap("DatabaseId")
    public String databaseId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("RegionId")
    public String regionId;

    public static ListDatabaseAccountsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDatabaseAccountsRequest self = new ListDatabaseAccountsRequest();
        return TeaModel.build(map, self);
    }

    public ListDatabaseAccountsRequest setDatabaseAccountName(String databaseAccountName) {
        this.databaseAccountName = databaseAccountName;
        return this;
    }
    public String getDatabaseAccountName() {
        return this.databaseAccountName;
    }

    public ListDatabaseAccountsRequest setDatabaseId(String databaseId) {
        this.databaseId = databaseId;
        return this;
    }
    public String getDatabaseId() {
        return this.databaseId;
    }

    public ListDatabaseAccountsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListDatabaseAccountsRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListDatabaseAccountsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListDatabaseAccountsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
