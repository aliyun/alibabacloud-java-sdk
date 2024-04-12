// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListDatabasesForUserGroupRequest extends TeaModel {
    @NameInMap("DatabaseAddress")
    public String databaseAddress;

    @NameInMap("DatabaseName")
    public String databaseName;

    @NameInMap("DatabaseType")
    public String databaseType;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("NetworkDomainId")
    public String networkDomainId;

    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("UserGroupId")
    public String userGroupId;

    public static ListDatabasesForUserGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDatabasesForUserGroupRequest self = new ListDatabasesForUserGroupRequest();
        return TeaModel.build(map, self);
    }

    public ListDatabasesForUserGroupRequest setDatabaseAddress(String databaseAddress) {
        this.databaseAddress = databaseAddress;
        return this;
    }
    public String getDatabaseAddress() {
        return this.databaseAddress;
    }

    public ListDatabasesForUserGroupRequest setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }
    public String getDatabaseName() {
        return this.databaseName;
    }

    public ListDatabasesForUserGroupRequest setDatabaseType(String databaseType) {
        this.databaseType = databaseType;
        return this;
    }
    public String getDatabaseType() {
        return this.databaseType;
    }

    public ListDatabasesForUserGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListDatabasesForUserGroupRequest setNetworkDomainId(String networkDomainId) {
        this.networkDomainId = networkDomainId;
        return this;
    }
    public String getNetworkDomainId() {
        return this.networkDomainId;
    }

    public ListDatabasesForUserGroupRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListDatabasesForUserGroupRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListDatabasesForUserGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListDatabasesForUserGroupRequest setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }
    public String getUserGroupId() {
        return this.userGroupId;
    }

}
