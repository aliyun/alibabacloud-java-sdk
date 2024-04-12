// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DetachDatabaseAccountsFromUserGroupRequest extends TeaModel {
    @NameInMap("Databases")
    public java.util.List<DetachDatabaseAccountsFromUserGroupRequestDatabases> databases;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("UserGroupId")
    public String userGroupId;

    public static DetachDatabaseAccountsFromUserGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachDatabaseAccountsFromUserGroupRequest self = new DetachDatabaseAccountsFromUserGroupRequest();
        return TeaModel.build(map, self);
    }

    public DetachDatabaseAccountsFromUserGroupRequest setDatabases(java.util.List<DetachDatabaseAccountsFromUserGroupRequestDatabases> databases) {
        this.databases = databases;
        return this;
    }
    public java.util.List<DetachDatabaseAccountsFromUserGroupRequestDatabases> getDatabases() {
        return this.databases;
    }

    public DetachDatabaseAccountsFromUserGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DetachDatabaseAccountsFromUserGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DetachDatabaseAccountsFromUserGroupRequest setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }
    public String getUserGroupId() {
        return this.userGroupId;
    }

    public static class DetachDatabaseAccountsFromUserGroupRequestDatabases extends TeaModel {
        @NameInMap("DatabaseAccountIds")
        public java.util.List<String> databaseAccountIds;

        @NameInMap("DatabaseId")
        public String databaseId;

        public static DetachDatabaseAccountsFromUserGroupRequestDatabases build(java.util.Map<String, ?> map) throws Exception {
            DetachDatabaseAccountsFromUserGroupRequestDatabases self = new DetachDatabaseAccountsFromUserGroupRequestDatabases();
            return TeaModel.build(map, self);
        }

        public DetachDatabaseAccountsFromUserGroupRequestDatabases setDatabaseAccountIds(java.util.List<String> databaseAccountIds) {
            this.databaseAccountIds = databaseAccountIds;
            return this;
        }
        public java.util.List<String> getDatabaseAccountIds() {
            return this.databaseAccountIds;
        }

        public DetachDatabaseAccountsFromUserGroupRequestDatabases setDatabaseId(String databaseId) {
            this.databaseId = databaseId;
            return this;
        }
        public String getDatabaseId() {
            return this.databaseId;
        }

    }

}
