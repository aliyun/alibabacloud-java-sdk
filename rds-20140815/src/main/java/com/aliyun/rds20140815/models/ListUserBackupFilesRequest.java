// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ListUserBackupFilesRequest extends TeaModel {
    /**
     * <p>Queries target user backups by user backup ID.</p>
     * 
     * <strong>example:</strong>
     * <p>b-kwwvr7v8t7of****</p>
     */
    @NameInMap("BackupId")
    public String backupId;

    /**
     * <p>Queries target user backups by comment.</p>
     * <blockquote>
     * <p>You can enter a partial comment of the target user backup for fuzzy match.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>BackupTest</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>Queries target user backups by the OSS download URL of the user backup file. For more information about how to obtain the OSS download URL of a user backup file, see <a href="https://help.aliyun.com/document_detail/39607.html">Obtain the URL of an uploaded object</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>https://<strong><strong>.oss-ap-</strong></strong>.aliyuncs.com/backup_qp.xb</p>
     */
    @NameInMap("OssUrl")
    public String ossUrl;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID. You can call the DescribeRegions operation to query the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID. You can call the DescribeDBInstanceAttribute operation to query the resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmy****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Queries target user backups by the status of the user backup file. Valid values:</p>
     * <ul>
     * <li><strong>Importing</strong>: The backup is being imported.</li>
     * <li><strong>Failed</strong>: The import failed.</li>
     * <li><strong>CheckSuccess</strong>: The verification passed.</li>
     * <li><strong>BackupSuccess</strong>: The import succeeded.</li>
     * <li><strong>Deleted</strong>: The backup is deleted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CheckSuccess</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Queries target user backups by tag.</p>
     * 
     * <strong>example:</strong>
     * <p>key1:value1</p>
     */
    @NameInMap("Tags")
    public String tags;

    public static ListUserBackupFilesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserBackupFilesRequest self = new ListUserBackupFilesRequest();
        return TeaModel.build(map, self);
    }

    public ListUserBackupFilesRequest setBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }
    public String getBackupId() {
        return this.backupId;
    }

    public ListUserBackupFilesRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public ListUserBackupFilesRequest setOssUrl(String ossUrl) {
        this.ossUrl = ossUrl;
        return this;
    }
    public String getOssUrl() {
        return this.ossUrl;
    }

    public ListUserBackupFilesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListUserBackupFilesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListUserBackupFilesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListUserBackupFilesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListUserBackupFilesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListUserBackupFilesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListUserBackupFilesRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

}
