// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyWebLockStartRequest extends TeaModel {
    /**
     * <p>The prevention mode. Valid values:</p>
     * <ul>
     * <li><strong>block</strong>: Interception Mode</li>
     * <li><strong>audit</strong>: Alert Mode</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>block</p>
     */
    @NameInMap("DefenceMode")
    public String defenceMode;

    /**
     * <p>The directory for which you want to enable web tamper proofing. Separate multiple directories with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/home/admin/tomcat</p>
     */
    @NameInMap("Dir")
    public String dir;

    /**
     * <p>The directory for which you want to disable web tamper proofing.</p>
     * <blockquote>
     * <p>If you set <strong>Mode</strong> to <strong>blacklist</strong>, you must specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>/home/admin/java</p>
     */
    @NameInMap("ExclusiveDir")
    public String exclusiveDir;

    /**
     * <p>The file for which you want to disable web tamper proofing.</p>
     * <blockquote>
     * <p>If you set <strong>Mode</strong> to <strong>blacklist</strong>, you must specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>/home/admin/tomcat/localhost.log</p>
     */
    @NameInMap("ExclusiveFile")
    public String exclusiveFile;

    /**
     * <p>The type of the file for which you want to disable web tamper proofing. Separate multiple types with semicolons (;). Valid values:</p>
     * <ul>
     * <li>php</li>
     * <li>jsp</li>
     * <li>asp</li>
     * <li>aspx</li>
     * <li>js</li>
     * <li>cgi</li>
     * <li>html</li>
     * <li>htm</li>
     * <li>xml</li>
     * <li>shtml</li>
     * <li>shtm</li>
     * <li>jpg</li>
     * <li>gif</li>
     * <li>png</li>
     * </ul>
     * <blockquote>
     * <p>If you set <strong>Mode</strong> to <strong>blacklist</strong>, you must specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>jpg</p>
     */
    @NameInMap("ExclusiveFileType")
    public String exclusiveFileType;

    /**
     * <p>The type of the file for which you want to enable web tamper proofing. Separate multiple types with semicolons (;). Valid values:</p>
     * <ul>
     * <li>php</li>
     * <li>jsp</li>
     * <li>asp</li>
     * <li>aspx</li>
     * <li>js</li>
     * <li>cgi</li>
     * <li>html</li>
     * <li>htm</li>
     * <li>xml</li>
     * <li>shtml</li>
     * <li>shtm</li>
     * <li>jpg</li>
     * <li>gif</li>
     * <li>png</li>
     * </ul>
     * <blockquote>
     * <p>If you set <strong>Mode</strong> to <strong>whitelist</strong>, you must specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>php</p>
     */
    @NameInMap("InclusiveFileType")
    public String inclusiveFileType;

    /**
     * <p>The local path to the backup files of the protected directory.\
     * The directory format of a Linux server is different from that of a Windows server. You must enter the directory in the required format based on your operating system. Examples:</p>
     * <ul>
     * <li>Linux server: /usr/local/aegis/bak</li>
     * <li>Windows server: C:\Program Files (x86)\Alibaba\Aegis\bak</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/usr/local/backup</p>
     */
    @NameInMap("LocalBackupDir")
    public String localBackupDir;

    /**
     * <p>The protection mode of web tamper proofing. Valid values:</p>
     * <ul>
     * <li><strong>whitelist</strong>: In this mode, web tamper proofing is enabled for the specified directories and file types.</li>
     * <li><strong>blacklist</strong>: In this mode, web tamper proofing is enabled for the unspecified subdirectories, file types, and files in the protected directory.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>whitelist</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>The UUID of the server for which you want to enable web tamper proofing.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>80d2f7d6-31a9-4d7f-8ff4-7ecc42f89ca****</p>
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
