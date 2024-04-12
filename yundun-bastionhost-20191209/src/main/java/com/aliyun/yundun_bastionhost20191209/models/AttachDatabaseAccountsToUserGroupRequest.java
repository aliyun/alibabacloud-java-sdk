// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class AttachDatabaseAccountsToUserGroupRequest extends TeaModel {
    @NameInMap("Databases")
    public java.util.List<AttachDatabaseAccountsToUserGroupRequestDatabases> databases;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("UserGroupId")
    public String userGroupId;

    public static AttachDatabaseAccountsToUserGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachDatabaseAccountsToUserGroupRequest self = new AttachDatabaseAccountsToUserGroupRequest();
        return TeaModel.build(map, self);
    }

    public AttachDatabaseAccountsToUserGroupRequest setDatabases(java.util.List<AttachDatabaseAccountsToUserGroupRequestDatabases> databases) {
        this.databases = databases;
        return this;
    }
    public java.util.List<AttachDatabaseAccountsToUserGroupRequestDatabases> getDatabases() {
        return this.databases;
    }

    public AttachDatabaseAccountsToUserGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AttachDatabaseAccountsToUserGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AttachDatabaseAccountsToUserGroupRequest setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }
    public String getUserGroupId() {
        return this.userGroupId;
    }

    public static class AttachDatabaseAccountsToUserGroupRequestDatabases extends TeaModel {
        @NameInMap("DatabaseAccountIds")
        public java.util.List<String> databaseAccountIds;

        @NameInMap("DatabaseId")
        public String databaseId;

        public static AttachDatabaseAccountsToUserGroupRequestDatabases build(java.util.Map<String, ?> map) throws Exception {
            AttachDatabaseAccountsToUserGroupRequestDatabases self = new AttachDatabaseAccountsToUserGroupRequestDatabases();
            return TeaModel.build(map, self);
        }

        public AttachDatabaseAccountsToUserGroupRequestDatabases setDatabaseAccountIds(java.util.List<String> databaseAccountIds) {
            this.databaseAccountIds = databaseAccountIds;
            return this;
        }
        public java.util.List<String> getDatabaseAccountIds() {
            return this.databaseAccountIds;
        }

        public AttachDatabaseAccountsToUserGroupRequestDatabases setDatabaseId(String databaseId) {
            this.databaseId = databaseId;
            return this;
        }
        public String getDatabaseId() {
            return this.databaseId;
        }

    }

}
