// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyWebLockStartRequest extends TeaModel {
    /**
     * <p>The prevention mode. Valid values:</p>
     * <br>
     * <p>*   **block**: Interception Mode</p>
     * <p>*   **audit**: Alert Mode</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DefenceMode")
    public String defenceMode;

    /**
     * <p>The directory for which you want to enable web tamper proofing. Separate multiple directories with commas (,).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Dir")
    public String dir;

    /**
     * <p>The directory for which you want to disable web tamper proofing.</p>
     * <br>
     * <p>> If you set **Mode** to **blacklist**, you must specify this parameter.</p>
     */
    @NameInMap("ExclusiveDir")
    public String exclusiveDir;

    /**
     * <p>The file for which you want to disable web tamper proofing.</p>
     * <br>
     * <p>> If you set **Mode** to **blacklist**, you must specify this parameter.</p>
     */
    @NameInMap("ExclusiveFile")
    public String exclusiveFile;

    /**
     * <p>The type of the file for which you want to disable web tamper proofing. Separate multiple types with semicolons (;). Valid values:</p>
     * <br>
     * <p>*   php</p>
     * <p>*   jsp</p>
     * <p>*   asp</p>
     * <p>*   aspx</p>
     * <p>*   js</p>
     * <p>*   cgi</p>
     * <p>*   html</p>
     * <p>*   htm</p>
     * <p>*   xml</p>
     * <p>*   shtml</p>
     * <p>*   shtm</p>
     * <p>*   jpg</p>
     * <p>*   gif</p>
     * <p>*   png</p>
     * <br>
     * <p>> If you set **Mode** to **blacklist**, you must specify this parameter.</p>
     */
    @NameInMap("ExclusiveFileType")
    public String exclusiveFileType;

    /**
     * <p>The type of the file for which you want to enable web tamper proofing. Separate multiple types with semicolons (;). Valid values:</p>
     * <br>
     * <p>*   php</p>
     * <p>*   jsp</p>
     * <p>*   asp</p>
     * <p>*   aspx</p>
     * <p>*   js</p>
     * <p>*   cgi</p>
     * <p>*   html</p>
     * <p>*   htm</p>
     * <p>*   xml</p>
     * <p>*   shtml</p>
     * <p>*   shtm</p>
     * <p>*   jpg</p>
     * <p>*   gif</p>
     * <p>*   png</p>
     * <br>
     * <p>> If you set **Mode** to **whitelist**, you must specify this parameter.</p>
     */
    @NameInMap("InclusiveFileType")
    public String inclusiveFileType;

    /**
     * <p>The local path to the backup files of the protected directory.\\</p>
     * <p>The directory format of a Linux server is different from that of a Windows server. You must enter the directory in the required format based on your operating system. Examples:</p>
     * <br>
     * <p>*   Linux server: /usr/local/aegis/bak</p>
     * <p>*   Windows server: C:\\Program Files (x86)\\Alibaba\\Aegis\\bak</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("LocalBackupDir")
    public String localBackupDir;

    /**
     * <p>The protection mode of web tamper proofing. Valid values:</p>
     * <br>
     * <p>*   **whitelist**: In this mode, web tamper proofing is enabled for the specified directories and file types.</p>
     * <p>*   **blacklist**: In this mode, web tamper proofing is enabled for the unspecified subdirectories, file types, and files in the protected directory.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>The UUID of the server for which you want to enable web tamper proofing.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
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
