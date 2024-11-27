// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class AttachDatabaseAccountsToUserGroupRequest extends TeaModel {
    /**
     * <p>An array that consists of the database objects.</p>
     * <blockquote>
     * <p> You can specify up to 10 databases and 10 database accounts. The database accounts are not required. If you do not specify a database account, the user group is authorized to manage only the databases.</p>
     * </blockquote>
     */
    @NameInMap("Databases")
    public java.util.List<AttachDatabaseAccountsToUserGroupRequestDatabases> databases;

    /**
     * <p>The bastion host ID.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the bastion host ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-zvp282aly06</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID of the bastion host.</p>
     * <blockquote>
     * <p> For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
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
        /**
         * <p>An array that consists of database account IDs.</p>
         */
        @NameInMap("DatabaseAccountIds")
        public java.util.List<String> databaseAccountIds;

        /**
         * <p>The ID of the database that you want to authorize the user group to manage.</p>
         * 
         * <strong>example:</strong>
         * <p>58</p>
         */
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
