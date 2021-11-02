// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyWebLockStartRequest extends TeaModel {
    @NameInMap("DefenceMode")
    public String defenceMode;

    @NameInMap("Dir")
    public String dir;

    @NameInMap("ExclusiveDir")
    public String exclusiveDir;

    @NameInMap("ExclusiveFile")
    public String exclusiveFile;

    @NameInMap("ExclusiveFileType")
    public String exclusiveFileType;

    @NameInMap("InclusiveFileType")
    public String inclusiveFileType;

    @NameInMap("LocalBackupDir")
    public String localBackupDir;

    @NameInMap("Mode")
    public String mode;

    @NameInMap("Uuid")
    public String uuid;

    public static ModifyWebLockStartRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebLockStartRequest self = new ModifyWebLockStartRequest();
        return TeaModel.build(map, self);
    }

    public ModifyWebLockStartRequest setDefenceMode(String defenceMode) {
        this.defenceMode = defenceMode;
        return this;
    }
    public String getDefenceMode() {
        return this.defenceMode;
    }

    public ModifyWebLockStartRequest setDir(String dir) {
        this.dir = dir;
        return this;
    }
    public String getDir() {
        return this.dir;
    }

    public ModifyWebLockStartRequest setExclusiveDir(String exclusiveDir) {
        this.exclusiveDir = exclusiveDir;
        return this;
    }
    public String getExclusiveDir() {
        return this.exclusiveDir;
    }

    public ModifyWebLockStartRequest setExclusiveFile(String exclusiveFile) {
        this.exclusiveFile = exclusiveFile;
        return this;
    }
    public String getExclusiveFile() {
        return this.exclusiveFile;
    }

    public ModifyWebLockStartRequest setExclusiveFileType(String exclusiveFileType) {
        this.exclusiveFileType = exclusiveFileType;
        return this;
    }
    public String getExclusiveFileType() {
        return this.exclusiveFileType;
    }

    public ModifyWebLockStartRequest setInclusiveFileType(String inclusiveFileType) {
        this.inclusiveFileType = inclusiveFileType;
        return this;
    }
    public String getInclusiveFileType() {
        return this.inclusiveFileType;
    }

    public ModifyWebLockStartRequest setLocalBackupDir(String localBackupDir) {
        this.localBackupDir = localBackupDir;
        return this;
    }
    public String getLocalBackupDir() {
        return this.localBackupDir;
    }

    public ModifyWebLockStartRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public ModifyWebLockStartRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
