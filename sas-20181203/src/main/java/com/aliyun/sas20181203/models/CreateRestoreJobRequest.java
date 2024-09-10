// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateRestoreJobRequest extends TeaModel {
    /**
     * <p>The directory in which the files included in the restoration task are located. This parameter is specified when you create the anti-ransomware policy. The value is a directory that requires protection.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;root&quot;]</p>
     */
    @NameInMap("Includes")
    public String includes;

    /**
     * <p>The hash value of the snapshot.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeSnapshots~~">DescribeSnapshots</a> operation to obtain the value of this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d4b399edaad94b038e8f91873f19e3eae010ca30798fc36db3a164dd343f****</p>
     */
    @NameInMap("SnapshotHash")
    public String snapshotHash;

    /**
     * <p>The ID of the snapshot that you want to use for restoration.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeSnapshots~~">DescribeSnapshots</a> operation to obtain the value of this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>s-00023dhaatxp18mh****</p>
     */
    @NameInMap("SnapshotId")
    public String snapshotId;

    /**
     * <p>The version of the backup data.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeSnapshots~~">DescribeSnapshots</a> operation to obtain the value of this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>165570544****</p>
     */
    @NameInMap("SnapshotVersion")
    public String snapshotVersion;

    /**
     * <p>The type of the data source. Valid values:</p>
     * <ul>
     * <li><strong>ECS_FILE</strong>: backup snapshots for Elastic Compute Service (ECS) files</li>
     * <li><strong>File</strong>: backup snapshots for on-premises servers</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ECS_FILE</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The path to which you want to restore data.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/root/testfls</p>
     */
    @NameInMap("Target")
    public String target;

    /**
     * <p>The UUID of the server whose data you want to restore.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>inet-ecs-4e876cb0-09f7-43b8-82ef-4bc7a93769b5</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    /**
     * <p>The ID of the backup vault that is used in the restoration task.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeSnapshots~~">DescribeSnapshots</a> operation to obtain the value of this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>v-0002n12wokck2q0x****</p>
     */
    @NameInMap("VaultId")
    public String vaultId;

    public static CreateRestoreJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRestoreJobRequest self = new CreateRestoreJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateRestoreJobRequest setIncludes(String includes) {
        this.includes = includes;
        return this;
    }
    public String getIncludes() {
        return this.includes;
    }

    public CreateRestoreJobRequest setSnapshotHash(String snapshotHash) {
        this.snapshotHash = snapshotHash;
        return this;
    }
    public String getSnapshotHash() {
        return this.snapshotHash;
    }

    public CreateRestoreJobRequest setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    public String getSnapshotId() {
        return this.snapshotId;
    }

    public CreateRestoreJobRequest setSnapshotVersion(String snapshotVersion) {
        this.snapshotVersion = snapshotVersion;
        return this;
    }
    public String getSnapshotVersion() {
        return this.snapshotVersion;
    }

    public CreateRestoreJobRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public CreateRestoreJobRequest setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

    public CreateRestoreJobRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public CreateRestoreJobRequest setVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }
    public String getVaultId() {
        return this.vaultId;
    }

}
