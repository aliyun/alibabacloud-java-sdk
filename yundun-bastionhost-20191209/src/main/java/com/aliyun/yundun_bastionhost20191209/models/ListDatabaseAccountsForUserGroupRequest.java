// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListDatabaseAccountsForUserGroupRequest extends TeaModel {
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

    @NameInMap("UserGroupId")
    public String userGroupId;

    public static ListDatabaseAccountsForUserGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDatabaseAccountsForUserGroupRequest self = new ListDatabaseAccountsForUserGroupRequest();
        return TeaModel.build(map, self);
    }

    public ListDatabaseAccountsForUserGroupRequest setDatabaseAccountName(String databaseAccountName) {
        this.databaseAccountName = databaseAccountName;
        return this;
    }
    public String getDatabaseAccountName() {
        return this.databaseAccountName;
    }

    public ListDatabaseAccountsForUserGroupRequest setDatabaseId(String databaseId) {
        this.databaseId = databaseId;
        return this;
    }
    public String getDatabaseId() {
        return this.databaseId;
    }

    public ListDatabaseAccountsForUserGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListDatabaseAccountsForUserGroupRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListDatabaseAccountsForUserGroupRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListDatabaseAccountsForUserGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListDatabaseAccountsForUserGroupRequest setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }
    public String getUserGroupId() {
        return this.userGroupId;
    }

}
