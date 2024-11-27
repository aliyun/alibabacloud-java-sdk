// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DetachDatabaseAccountsFromUserRequest extends TeaModel {
    /**
     * <p>The databases.</p>
     */
    @NameInMap("Databases")
    public java.util.List<DetachDatabaseAccountsFromUserRequestDatabases> databases;

    /**
     * <p>The bastion host ID.</p>
     * <blockquote>
     * <p>You can call the DescribeInstances operation to query the bastion host ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-pe335ipfk01</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID of the bastion host.</p>
     * <blockquote>
     * <p>For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the user from whom you want to revoke the permissions on databases and database accounts.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/204522.html">ListUsers</a> operation to query the ID of the user.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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
        /**
         * <p>An array that consists of database account IDs.</p>
         */
        @NameInMap("DatabaseAccountIds")
        public java.util.List<String> databaseAccountIds;

        /**
         * <p>The ID of the database on which you want to revoke permissions.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
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
