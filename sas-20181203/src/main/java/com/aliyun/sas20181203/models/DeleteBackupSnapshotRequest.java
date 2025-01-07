// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteBackupSnapshotRequest extends TeaModel {
    /**
     * <p>The regions for backup.</p>
     */
    @NameInMap("BackupRegionIdList")
    public java.util.List<String> backupRegionIdList;

    /**
     * <p>The backup snapshots.</p>
     */
    @NameInMap("BackupSnapshotList")
    public java.util.List<DeleteBackupSnapshotRequestBackupSnapshotList> backupSnapshotList;

    /**
     * <p>Specifies whether to retain the latest snapshot. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("RetainLatestSnapshot")
    public Boolean retainLatestSnapshot;

    public static DeleteBackupSnapshotRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBackupSnapshotRequest self = new DeleteBackupSnapshotRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBackupSnapshotRequest setBackupRegionIdList(java.util.List<String> backupRegionIdList) {
        this.backupRegionIdList = backupRegionIdList;
        return this;
    }
    public java.util.List<String> getBackupRegionIdList() {
        return this.backupRegionIdList;
    }

    public DeleteBackupSnapshotRequest setBackupSnapshotList(java.util.List<DeleteBackupSnapshotRequestBackupSnapshotList> backupSnapshotList) {
        this.backupSnapshotList = backupSnapshotList;
        return this;
    }
    public java.util.List<DeleteBackupSnapshotRequestBackupSnapshotList> getBackupSnapshotList() {
        return this.backupSnapshotList;
    }

    public DeleteBackupSnapshotRequest setRetainLatestSnapshot(Boolean retainLatestSnapshot) {
        this.retainLatestSnapshot = retainLatestSnapshot;
        return this;
    }
    public Boolean getRetainLatestSnapshot() {
        return this.retainLatestSnapshot;
    }

    public static class DeleteBackupSnapshotRequestBackupSnapshotList extends TeaModel {
        /**
         * <p>The ID of the Cloud Backup client.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeSnapshots~~">DescribeSnapshots</a> operation to query the ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c-000a4h33w14ka8xagb2s</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <p>The ID of the server.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-j6cj8vyajp1fo4atxkae</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The region in which Security Center is deployed. Valid values:</p>
         * <ul>
         * <li><strong>cn-hangzhou</strong>: China (Hangzhou).</li>
         * <li><strong>ap-southeast-1</strong>: Singapore.</li>
         * <li><strong>cn-beijing</strong>: China (Beijing).</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the snapshot that you want to delete.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeSnapshots~~">DescribeSnapshots</a> operation to query the ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>s-000f9p6r5trm6u4dc1iq</p>
         */
        @NameInMap("SnapshotId")
        public String snapshotId;

        /**
         * <p>The type of the data source. Valid values:</p>
         * <ul>
         * <li><strong>ECS_FILE</strong>: Elastic Compute Service (ECS) files.</li>
         * <li><strong>OSS</strong>: Object Storage Service (OSS) buckets.</li>
         * <li><strong>NAS</strong>: File Storage NAS (NAS) file systems.</li>
         * <li><strong>OTS_TABLE</strong>: Tablestore instances.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS_FILE</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The ID of the backup vault that is used in the restoration task.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeSnapshots~~">DescribeSnapshots</a> operation to query the ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>v-0004vhwcs2pmacfzrzt5</p>
         */
        @NameInMap("VaultId")
        public String vaultId;

        public static DeleteBackupSnapshotRequestBackupSnapshotList build(java.util.Map<String, ?> map) throws Exception {
            DeleteBackupSnapshotRequestBackupSnapshotList self = new DeleteBackupSnapshotRequestBackupSnapshotList();
            return TeaModel.build(map, self);
        }

        public DeleteBackupSnapshotRequestBackupSnapshotList setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public DeleteBackupSnapshotRequestBackupSnapshotList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DeleteBackupSnapshotRequestBackupSnapshotList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DeleteBackupSnapshotRequestBackupSnapshotList setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

        public DeleteBackupSnapshotRequestBackupSnapshotList setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DeleteBackupSnapshotRequestBackupSnapshotList setVaultId(String vaultId) {
            this.vaultId = vaultId;
            return this;
        }
        public String getVaultId() {
            return this.vaultId;
        }

    }

}
