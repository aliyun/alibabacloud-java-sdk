// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DetachDatabaseAccountsFromUserRequest extends TeaModel {
    @NameInMap("Databases")
    public java.util.List<DetachDatabaseAccountsFromUserRequestDatabases> databases;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("UserId")
    public String userId;

    public static DetachDatabaseAccountsFromUserRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachDatabaseAccountsFromUserRequest self = new DetachDatabaseAccountsFromUserRequest();
        return TeaModel.build(map, self);
    }

    public DetachDatabaseAccountsFromUserRequest setDatabases(java.util.List<DetachDatabaseAccountsFromUserRequestDatabases> databases) {
        this.databases = databases;
        return this;
    }
    public java.util.List<DetachDatabaseAccountsFromUserRequestDatabases> getDatabases() {
        return this.databases;
    }

    public DetachDatabaseAccountsFromUserRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DetachDatabaseAccountsFromUserRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DetachDatabaseAccountsFromUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public static class DetachDatabaseAccountsFromUserRequestDatabases extends TeaModel {
        @NameInMap("DatabaseAccountIds")
        public java.util.List<String> databaseAccountIds;

        @NameInMap("DatabaseId")
        public String databaseId;

        public static DetachDatabaseAccountsFromUserRequestDatabases build(java.util.Map<String, ?> map) throws Exception {
            DetachDatabaseAccountsFromUserRequestDatabases self = new DetachDatabaseAccountsFromUserRequestDatabases();
            return TeaModel.build(map, self);
        }

        public DetachDatabaseAccountsFromUserRequestDatabases setDatabaseAccountIds(java.util.List<String> databaseAccountIds) {
            this.databaseAccountIds = databaseAccountIds;
            return this;
        }
        public java.util.List<String> getDatabaseAccountIds() {
            return this.databaseAccountIds;
        }

        public DetachDatabaseAccountsFromUserRequestDatabases setDatabaseId(String databaseId) {
            this.databaseId = databaseId;
            return this;
        }
        public String getDatabaseId() {
            return this.databaseId;
        }

    }

}
