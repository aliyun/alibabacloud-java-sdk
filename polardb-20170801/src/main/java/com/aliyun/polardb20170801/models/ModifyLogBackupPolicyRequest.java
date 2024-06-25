// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyLogBackupPolicyRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/98094.html">DescribeDBClusters</a> operation to query the information of all clusters that are deployed in a specific region, such as the cluster IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-****************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The region in which you want to store cross-region log backups. For information about regions that support the cross-region backup feature, see <a href="https://help.aliyun.com/document_detail/72672.html">Overview</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("LogBackupAnotherRegionRegion")
    public String logBackupAnotherRegionRegion;

    /**
     * <p>The retention period of cross-region log backups. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: The cross-region backup feature is disabled.</li>
     * <li><strong>30 to 7300</strong>: Cross-region log backups are retained for 30 to 7,300 days.</li>
     * <li><strong>-1</strong>: The log backups are permanently retained.</li>
     * </ul>
     * <blockquote>
     * <p> When you create a cluster, the default value of this parameter is <strong>0</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("LogBackupAnotherRegionRetentionPeriod")
    public String logBackupAnotherRegionRetentionPeriod;

    /**
     * <p>The retention period of the log backups. Valid values:</p>
     * <ul>
     * <li>3 to 7300: The log backups are retained for 3 to 7,300 days.</li>
     * <li>\-1: The log backups are permanently retained.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("LogBackupRetentionPeriod")
    public String logBackupRetentionPeriod;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyLogBackupPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyLogBackupPolicyRequest self = new ModifyLogBackupPolicyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyLogBackupPolicyRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyLogBackupPolicyRequest setLogBackupAnotherRegionRegion(String logBackupAnotherRegionRegion) {
        this.logBackupAnotherRegionRegion = logBackupAnotherRegionRegion;
        return this;
    }
    public String getLogBackupAnotherRegionRegion() {
        return this.logBackupAnotherRegionRegion;
    }

    public ModifyLogBackupPolicyRequest setLogBackupAnotherRegionRetentionPeriod(String logBackupAnotherRegionRetentionPeriod) {
        this.logBackupAnotherRegionRetentionPeriod = logBackupAnotherRegionRetentionPeriod;
        return this;
    }
    public String getLogBackupAnotherRegionRetentionPeriod() {
        return this.logBackupAnotherRegionRetentionPeriod;
    }

    public ModifyLogBackupPolicyRequest setLogBackupRetentionPeriod(String logBackupRetentionPeriod) {
        this.logBackupRetentionPeriod = logBackupRetentionPeriod;
        return this;
    }
    public String getLogBackupRetentionPeriod() {
        return this.logBackupRetentionPeriod;
    }

    public ModifyLogBackupPolicyRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyLogBackupPolicyRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyLogBackupPolicyRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyLogBackupPolicyRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
