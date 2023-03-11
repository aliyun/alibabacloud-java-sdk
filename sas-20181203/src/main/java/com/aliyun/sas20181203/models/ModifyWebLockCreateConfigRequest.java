// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyWebLockCreateConfigRequest extends TeaModel {
    /**
     * <p>The prevention mode. Valid values:</p>
     * <br>
     * <p>*   **block**: Interception Mode</p>
     * <p>*   **audit**: Alert Mode</p>
     */
    @NameInMap("DefenceMode")
    public String defenceMode;

    /**
     * <p>The directory that you want to protect.</p>
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
     * <p>The type of file for which you want to disable web tamper proofing. Separate multiple types with semicolons (;). Valid values:</p>
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
     * <p>The file for which you want to enable web tamper proofing.</p>
     * <br>
     * <p>> If you set **Mode** to **whitelist**, you must specify this parameter.</p>
     */
    @NameInMap("InclusiveFile")
    public String inclusiveFile;

    /**
     * <p>The type of file for which you want to enable web tamper proofing. Separate multiple types with semicolons (;). Valid values:</p>
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
     * <p>The language of the content within the request and response. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The local path to the backup files of the protected directory.</p>
     */
    @NameInMap("LocalBackupDir")
    public String localBackupDir;

    /**
     * <p>The protection mode of web tamper proofing. Valid values:</p>
     * <br>
     * <p>*   **whitelist**: In this mode, web tamper proofing is enabled for the specified directories and file types.</p>
     * <p>*   **blacklist**: In this mode, web tamper proofing is enabled for the unspecified sub-directories, file types, and files in the protected directories.</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>The source IP address of the request.</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The UUID of the server for which you want to add a directory to protect.</p>
     * <br>
     * <p>> You can call the [DescribeCloudCenterInstances](~~DescribeCloudCenterInstances~~) operation to query the UUIDs of servers.</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static ModifyWebLockCreateConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebLockCreateConfigRequest self = new ModifyWebLockCreateConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyWebLockCreateConfigRequest setDefenceMode(String defenceMode) {
        this.defenceMode = defenceMode;
        return this;
    }
    public String getDefenceMode() {
        return this.defenceMode;
    }

    public ModifyWebLockCreateConfigRequest setDir(String dir) {
        this.dir = dir;
        return this;
    }
    public String getDir() {
        return this.dir;
    }

    public ModifyWebLockCreateConfigRequest setExclusiveDir(String exclusiveDir) {
        this.exclusiveDir = exclusiveDir;
        return this;
    }
    public String getExclusiveDir() {
        return this.exclusiveDir;
    }

    public ModifyWebLockCreateConfigRequest setExclusiveFile(String exclusiveFile) {
        this.exclusiveFile = exclusiveFile;
        return this;
    }
    public String getExclusiveFile() {
        return this.exclusiveFile;
    }

    public ModifyWebLockCreateConfigRequest setExclusiveFileType(String exclusiveFileType) {
        this.exclusiveFileType = exclusiveFileType;
        return this;
    }
    public String getExclusiveFileType() {
        return this.exclusiveFileType;
    }

    public ModifyWebLockCreateConfigRequest setInclusiveFile(String inclusiveFile) {
        this.inclusiveFile = inclusiveFile;
        return this;
    }
    public String getInclusiveFile() {
        return this.inclusiveFile;
    }

    public ModifyWebLockCreateConfigRequest setInclusiveFileType(String inclusiveFileType) {
        this.inclusiveFileType = inclusiveFileType;
        return this;
    }
    public String getInclusiveFileType() {
        return this.inclusiveFileType;
    }

    public ModifyWebLockCreateConfigRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyWebLockCreateConfigRequest setLocalBackupDir(String localBackupDir) {
        this.localBackupDir = localBackupDir;
        return this;
    }
    public String getLocalBackupDir() {
        return this.localBackupDir;
    }

    public ModifyWebLockCreateConfigRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public ModifyWebLockCreateConfigRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ModifyWebLockCreateConfigRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
