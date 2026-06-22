// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyWebLockCreateConfigRequest extends TeaModel {
    /**
     * <p>The defense mode. Valid values:</p>
     * <ul>
     * <li><strong>block</strong>: Block mode.</li>
     * <li><strong>audit</strong>: Alert mode.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>block</p>
     */
    @NameInMap("DefenceMode")
    public String defenceMode;

    /**
     * <p>The protected directory.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/home/admin/tomcat</p>
     */
    @NameInMap("Dir")
    public String dir;

    /**
     * <p>The folder to exclude from web tamper proofing protection.</p>
     * <blockquote>
     * <p>This parameter is required when the Defense mode <strong>Mode</strong> is set to <strong>blacklist</strong> pattern.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>/home/admin/test</p>
     */
    @NameInMap("ExclusiveDir")
    public String exclusiveDir;

    /**
     * <p>The file to exclude from web tamper proofing protection.</p>
     * <blockquote>
     * <p>This parameter is required when the Defense mode <strong>Mode</strong> is set to <strong>blacklist</strong> pattern.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>/home/admin/apache.log</p>
     */
    @NameInMap("ExclusiveFile")
    public String exclusiveFile;

    /**
     * <p>The file types to exclude from web tamper proofing protection. Separate multiple file types with semicolons (;). Valid values:</p>
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
     * <p>This parameter is required when the Defense mode <strong>Mode</strong> is set to <strong>blacklist</strong> pattern.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>jpg</p>
     */
    @NameInMap("ExclusiveFileType")
    public String exclusiveFileType;

    /**
     * <p>The file to protect.</p>
     * <blockquote>
     * <p>This parameter is required when the Defense mode <strong>Mode</strong> is set to <strong>whitelist</strong> pattern.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>/home/admin/test.log</p>
     */
    @NameInMap("InclusiveFile")
    public String inclusiveFile;

    /**
     * <p>The file types to protect with web tamper proofing. Separate multiple file types with semicolons (;). Valid values:</p>
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
     * <p>This parameter is required when the Defense mode <strong>Mode</strong> is set to <strong>whitelist</strong> pattern.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>jpg</p>
     */
    @NameInMap("InclusiveFileType")
    public String inclusiveFileType;

    /**
     * <p>The language type of the request and response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The local backup path used for secure backup of the protected directory.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/usr/local/backup</p>
     */
    @NameInMap("LocalBackupDir")
    public String localBackupDir;

    /**
     * <p>The protection directory mode. Valid values:</p>
     * <ul>
     * <li><strong>whitelist</strong>: whitelist mode. Protects only the specified directories and file types.</li>
     * <li><strong>blacklist</strong>: blacklist mode. Protects all subdirectories, file types, and specified files under the protected directory that are not excluded.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>whitelist</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>The IP address of the access source.</p>
     * 
     * <strong>example:</strong>
     * <p>39.170.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The UUID of the server for which you want to add a protected directory.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to obtain the UUID of the server.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>inet-12345****</p>
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
