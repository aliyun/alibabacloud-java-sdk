// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DetachDatabaseAccountsFromUserGroupRequest extends TeaModel {
    /**
     * <p>The information about the database.</p>
     */
    @NameInMap("Databases")
    public java.util.List<DetachDatabaseAccountsFromUserGroupRequestDatabases> databases;

    /**
     * <p>The bastion host ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the bastion host ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-7mz2v120f0y</p>
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
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the user group from which you want to revoke permissions on databases and database accounts.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/204509.html">ListUserGroups</a> operation to query the ID of the user group.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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
        /**
         * <p>An array that consists of database account IDs.</p>
         */
        @NameInMap("DatabaseAccountIds")
        public java.util.List<String> databaseAccountIds;

        /**
         * <p>The ID of the database on which the permissions are to be revoked.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
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
