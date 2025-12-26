// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pailangstudio20240710.models;

import com.aliyun.tea.*;

public class Snapshot extends TeaModel {
    @NameInMap("Accessibility")
    public String accessibility;

    @NameInMap("CreationType")
    public String creationType;

    @NameInMap("Creator")
    public String creator;

    @NameInMap("Description")
    public String description;

    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    @NameInMap("SnapshotId")
    public String snapshotId;

    @NameInMap("SnapshotName")
    public String snapshotName;

    @NameInMap("SnapshotResourceId")
    public String snapshotResourceId;

    @NameInMap("SnapshotResourceType")
    public String snapshotResourceType;

    @NameInMap("SnapshotStoragePath")
    public String snapshotStoragePath;

    @NameInMap("SnapshotUrl")
    public String snapshotUrl;

    @NameInMap("WorkDir")
    public String workDir;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static Snapshot build(java.util.Map<String, ?> map) throws Exception {
        Snapshot self = new Snapshot();
        return TeaModel.build(map, self);
    }

    public Snapshot setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public Snapshot setCreationType(String creationType) {
        this.creationType = creationType;
        return this;
    }
    public String getCreationType() {
        return this.creationType;
    }

    public Snapshot setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public Snapshot setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Snapshot setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public Snapshot setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public Snapshot setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    public String getSnapshotId() {
        return this.snapshotId;
    }

    public Snapshot setSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
        return this;
    }
    public String getSnapshotName() {
        return this.snapshotName;
    }

    public Snapshot setSnapshotResourceId(String snapshotResourceId) {
        this.snapshotResourceId = snapshotResourceId;
        return this;
    }
    public String getSnapshotResourceId() {
        return this.snapshotResourceId;
    }

    public Snapshot setSnapshotResourceType(String snapshotResourceType) {
        this.snapshotResourceType = snapshotResourceType;
        return this;
    }
    public String getSnapshotResourceType() {
        return this.snapshotResourceType;
    }

    public Snapshot setSnapshotStoragePath(String snapshotStoragePath) {
        this.snapshotStoragePath = snapshotStoragePath;
        return this;
    }
    public String getSnapshotStoragePath() {
        return this.snapshotStoragePath;
    }

    public Snapshot setSnapshotUrl(String snapshotUrl) {
        this.snapshotUrl = snapshotUrl;
        return this;
    }
    public String getSnapshotUrl() {
        return this.snapshotUrl;
    }

    public Snapshot setWorkDir(String workDir) {
        this.workDir = workDir;
        return this;
    }
    public String getWorkDir() {
        return this.workDir;
    }

    public Snapshot setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
