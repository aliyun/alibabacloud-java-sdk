// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateRestoreJobRequest extends TeaModel {
    @NameInMap("Includes")
    public String includes;

    @NameInMap("SnapshotHash")
    public String snapshotHash;

    @NameInMap("SnapshotId")
    public String snapshotId;

    @NameInMap("SnapshotVersion")
    public String snapshotVersion;

    @NameInMap("SourceType")
    public String sourceType;

    @NameInMap("Target")
    public String target;

    @NameInMap("Uuid")
    public String uuid;

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
