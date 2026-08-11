// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class AttachDatabaseAccountsToUserGroupRequest extends TeaModel {
    /**
     * <p>The array of database objects.</p>
     * <blockquote>
     * <p>A maximum of 10 databases and 10 database accounts are supported. You can leave the database accounts unspecified. If no accounts are specified, permissions are granted at the database level.</p>
     * </blockquote>
     */
    @NameInMap("Databases")
    public java.util.List<AttachDatabaseAccountsToUserGroupRequestDatabases> databases;

    /**
     * <p>The instance ID of the bastion host.</p>
     * <blockquote>
     * <p>You can invoke the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-zvp282aly06</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The project ID.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The region ID of the bastion host.</p>
     * <blockquote>
     * <p>For the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the user group to which you want to grant permissions.</p>
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

    public AttachDatabaseAccountsToUserGroupRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
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
         * <p>The array of database account IDs.</p>
         */
        @NameInMap("DatabaseAccountIds")
        public java.util.List<String> databaseAccountIds;

        /**
         * <p>The ID of the database instance to authorize.</p>
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
