// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class AttachDatabaseAccountsToUserRequest extends TeaModel {
    @NameInMap("Databases")
    public java.util.List<AttachDatabaseAccountsToUserRequestDatabases> databases;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("UserId")
    public String userId;

    public static AttachDatabaseAccountsToUserRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachDatabaseAccountsToUserRequest self = new AttachDatabaseAccountsToUserRequest();
        return TeaModel.build(map, self);
    }

    public AttachDatabaseAccountsToUserRequest setDatabases(java.util.List<AttachDatabaseAccountsToUserRequestDatabases> databases) {
        this.databases = databases;
        return this;
    }
    public java.util.List<AttachDatabaseAccountsToUserRequestDatabases> getDatabases() {
        return this.databases;
    }

    public AttachDatabaseAccountsToUserRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AttachDatabaseAccountsToUserRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AttachDatabaseAccountsToUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public static class AttachDatabaseAccountsToUserRequestDatabases extends TeaModel {
        @NameInMap("DatabaseAccountIds")
        public java.util.List<String> databaseAccountIds;

        @NameInMap("DatabaseId")
        public String databaseId;

        public static AttachDatabaseAccountsToUserRequestDatabases build(java.util.Map<String, ?> map) throws Exception {
            AttachDatabaseAccountsToUserRequestDatabases self = new AttachDatabaseAccountsToUserRequestDatabases();
            return TeaModel.build(map, self);
        }

        public AttachDatabaseAccountsToUserRequestDatabases setDatabaseAccountIds(java.util.List<String> databaseAccountIds) {
            this.databaseAccountIds = databaseAccountIds;
            return this;
        }
        public java.util.List<String> getDatabaseAccountIds() {
            return this.databaseAccountIds;
        }

        public AttachDatabaseAccountsToUserRequestDatabases setDatabaseId(String databaseId) {
            this.databaseId = databaseId;
            return this;
        }
        public String getDatabaseId() {
            return this.databaseId;
        }

    }

}
