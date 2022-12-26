// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyWebLockUpdateConfigRequest extends TeaModel {
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

    @NameInMap("Id")
    public Integer id;

    @NameInMap("InclusiveFile")
    public String inclusiveFile;

    @NameInMap("InclusiveFileType")
    public String inclusiveFileType;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("LocalBackupDir")
    public String localBackupDir;

    @NameInMap("Mode")
    public String mode;

    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Uuid")
    public String uuid;

    public static ModifyWebLockUpdateConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebLockUpdateConfigRequest self = new ModifyWebLockUpdateConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyWebLockUpdateConfigRequest setDefenceMode(String defenceMode) {
        this.defenceMode = defenceMode;
        return this;
    }
    public String getDefenceMode() {
        return this.defenceMode;
    }

    public ModifyWebLockUpdateConfigRequest setDir(String dir) {
        this.dir = dir;
        return this;
    }
    public String getDir() {
        return this.dir;
    }

    public ModifyWebLockUpdateConfigRequest setExclusiveDir(String exclusiveDir) {
        this.exclusiveDir = exclusiveDir;
        return this;
    }
    public String getExclusiveDir() {
        return this.exclusiveDir;
    }

    public ModifyWebLockUpdateConfigRequest setExclusiveFile(String exclusiveFile) {
        this.exclusiveFile = exclusiveFile;
        return this;
    }
    public String getExclusiveFile() {
        return this.exclusiveFile;
    }

    public ModifyWebLockUpdateConfigRequest setExclusiveFileType(String exclusiveFileType) {
        this.exclusiveFileType = exclusiveFileType;
        return this;
    }
    public String getExclusiveFileType() {
        return this.exclusiveFileType;
    }

    public ModifyWebLockUpdateConfigRequest setId(Integer id) {
        this.id = id;
        return this;
    }
    public Integer getId() {
        return this.id;
    }

    public ModifyWebLockUpdateConfigRequest setInclusiveFile(String inclusiveFile) {
        this.inclusiveFile = inclusiveFile;
        return this;
    }
    public String getInclusiveFile() {
        return this.inclusiveFile;
    }

    public ModifyWebLockUpdateConfigRequest setInclusiveFileType(String inclusiveFileType) {
        this.inclusiveFileType = inclusiveFileType;
        return this;
    }
    public String getInclusiveFileType() {
        return this.inclusiveFileType;
    }

    public ModifyWebLockUpdateConfigRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyWebLockUpdateConfigRequest setLocalBackupDir(String localBackupDir) {
        this.localBackupDir = localBackupDir;
        return this;
    }
    public String getLocalBackupDir() {
        return this.localBackupDir;
    }

    public ModifyWebLockUpdateConfigRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public ModifyWebLockUpdateConfigRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ModifyWebLockUpdateConfigRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
