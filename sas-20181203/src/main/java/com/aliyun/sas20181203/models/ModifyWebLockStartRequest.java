// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyWebLockStartRequest extends TeaModel {
    // The prevention mode. Valid values:
    // 
    // *   **block**: Interception Mode
    // *   **audit**: Alert Mode
    @NameInMap("DefenceMode")
    public String defenceMode;

    // The directory for which you want to enable web tamper proofing. Separate multiple directories with commas (,).
    @NameInMap("Dir")
    public String dir;

    // The directory for which you want to disable web tamper proofing.
    // 
    // >  If you set **Mode** to **blacklist**, you must specify this parameter.
    @NameInMap("ExclusiveDir")
    public String exclusiveDir;

    // The file for which you want to disable web tamper proofing.
    // 
    // >  If you set **Mode** to **blacklist**, you must specify this parameter.
    @NameInMap("ExclusiveFile")
    public String exclusiveFile;

    // The type of file for which you want to disable web tamper proofing. Separate multiple types with semicolons (;). Valid values:
    // 
    // *   php
    // *   jsp
    // *   asp
    // *   aspx
    // *   js
    // *   cgi
    // *   html
    // *   htm
    // *   xml
    // *   shtml
    // *   shtm
    // *   jpg
    // *   gif
    // *   png
    // 
    // >  If you set **Mode** to **blacklist**, you must specify this parameter.
    @NameInMap("ExclusiveFileType")
    public String exclusiveFileType;

    // The type of file for which you want to enable web tamper proofing. Separate multiple types with semicolons (;). Valid values:
    // 
    // *   php
    // *   jsp
    // *   asp
    // *   aspx
    // *   js
    // *   cgi
    // *   html
    // *   htm
    // *   xml
    // *   shtml
    // *   shtm
    // *   jpg
    // *   gif
    // *   png
    // 
    // >  If you set **Mode** to **whitelist**, you must specify this parameter.
    @NameInMap("InclusiveFileType")
    public String inclusiveFileType;

    // The local path to the backup files of the protected directory.\
    // The directory format of a Linux server is different from that of a Windows server. You must enter the directory in the required format based on your operating system. Examples of directory formats:
    // 
    // *   Linux server: /usr/local/aegis/bak
    // *   Windows server: C:\Program Files (x86)\Alibaba\Aegis\bak
    @NameInMap("LocalBackupDir")
    public String localBackupDir;

    // The protection mode of web tamper proofing. Valid values:
    // 
    // *   **whitelist**: In this mode, web tamper proofing is enabled for the specified directories and file types.
    // *   **blacklist**: In this mode, web tamper proofing is enabled for the unspecified sub-directories, file types, and files in the protected directories.
    @NameInMap("Mode")
    public String mode;

    // The UUID of the server for which you want to enable web tamper proofing.
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
