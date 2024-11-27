// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class AttachDatabaseAccountsToUserRequest extends TeaModel {
    /**
     * <p>An array that consists of database objects.</p>
     * <blockquote>
     * <p> You can specify up to 10 databases and 10 database accounts. The database accounts are not required. If you do not specify a database account, the user is authorized to manage only the databases.</p>
     * </blockquote>
     */
    @NameInMap("Databases")
    public java.util.List<AttachDatabaseAccountsToUserRequestDatabases> databases;

    /**
     * <p>The ID of the bastion host whose user you want to grant permissions.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the ID of the bastion host.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-wwo36qbv601</p>
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
     * <p>The ID of the user to be authorized.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/204522.html">ListUsers</a> operation to query the user ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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
        /**
         * <p>An array that consists of database account IDs.</p>
         */
        @NameInMap("DatabaseAccountIds")
        public java.util.List<String> databaseAccountIds;

        /**
         * <p>The ID of the database that you want to authorize the user to manage.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
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
