// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ListUserBackupFilesRequest extends TeaModel {
    /**
     * <p>The ID of the full backup file.</p>
     */
    @NameInMap("BackupId")
    public String backupId;

    /**
     * <p>The description of the full backup file.</p>
     * <br>
     * <p>> The system implements a fuzzy match based on the value of this parameter.</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The URL from which you can download the full backup file that is stored as an object in an Object Storage Service (OSS) bucket. For more information about how to obtain the URL, see [Obtain the access URL after you upload objects](~~39607~~).</p>
     */
    @NameInMap("OssUrl")
    public String ossUrl;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region. You can call the [DescribeRegions](~~26243~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group. You can call the [DescribeDBInstanceAttribute](~~610394~~) operation to obtain the ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The status of the full backup file. Valid values:</p>
     * <br>
     * <p>*   **Importing**: The full backup file is being imported.</p>
     * <p>*   **Failed**: The full backup file fails to be imported.</p>
     * <p>*   **CheckSucccess**: The full backup file passes the check.</p>
     * <p>*   **BackupSuccess**: The full backup file is imported.</p>
     * <p>*   **Deleted**: The full backup file is deleted.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The tag that is added to the full backup file.</p>
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
