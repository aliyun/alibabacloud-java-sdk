// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyWebLockUpdateConfigRequest extends TeaModel {
    /**
     * <p>The defense mode. Valid values:</p>
     * <ul>
     * <li><strong>block</strong>: Block.</li>
     * <li><strong>audit</strong>: Alert.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>block</p>
     */
    @NameInMap("DefenceMode")
    public String defenceMode;

    /**
     * <p>The full path of the directory that you want to protect.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/home/admin/tomcat</p>
     */
    @NameInMap("Dir")
    public String dir;

    /**
     * <p>The directory that does not require web tamper-proofing protection (excluded directory).</p>
     * <blockquote>
     * <p>This parameter is required when the protection pattern <strong>Mode</strong> is set to <strong>blacklist</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>/home/admin/test</p>
     */
    @NameInMap("ExclusiveDir")
    public String exclusiveDir;

    /**
     * <p>The file that does not require web tamper-proofing protection (excluded file).</p>
     * <blockquote>
     * <p>This parameter is required when the protection pattern <strong>Mode</strong> is set to <strong>blacklist</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>/home/admin/apache.log</p>
     */
    @NameInMap("ExclusiveFile")
    public String exclusiveFile;

    /**
     * <p>The file types that do not require web tamper-proofing protection (excluded file types). Separate multiple file types with semicolons (;). Valid values:</p>
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
     * <p>This parameter is required when the protection pattern <strong>Mode</strong> is set to <strong>blacklist</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>jpg</p>
     */
    @NameInMap("ExclusiveFileType")
    public String exclusiveFileType;

    /**
     * <p>The ID of the protected directory configuration that you want to modify.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeWebLockConfigList~~">DescribeWebLockConfigList</a> operation to obtain the ID of the protected directory.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>312077</p>
     */
    @NameInMap("Id")
    public Integer id;

    /**
     * <p>The file that requires protection.</p>
     * <blockquote>
     * <p>This parameter is required when the protection pattern <strong>Mode</strong> is set to <strong>whitelist</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>/home/admin/test.log</p>
     */
    @NameInMap("InclusiveFile")
    public String inclusiveFile;

    /**
     * <p>The file types that require web tamper-proofing protection. Separate multiple file types with semicolons (;). Valid values:</p>
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
     * <p>This parameter is required when the protection pattern <strong>Mode</strong> is set to <strong>whitelist</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>jpg</p>
     */
    @NameInMap("InclusiveFileType")
    public String inclusiveFileType;

    /**
     * <p>The language of the request and response. Valid values:</p>
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
     * <p>The local backup path for securely backing up the protected directory.<br>The format of the directory path may differ between Linux servers and Windows servers. Make sure that you enter the correct format. Refer to the following directory formats:</p>
     * <ul>
     * <li>Linux server: /usr/local/aegis/bak</li>
     * <li>Windows server: C:\Program Files (x86)\Alibaba\Aegis\bak.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>/usr/local/backup</p>
     */
    @NameInMap("LocalBackupDir")
    public String localBackupDir;

    /**
     * <p>The protection pattern. Valid values:</p>
     * <ul>
     * <li><strong>whitelist</strong>: whitelist mode. Protects only the specified directories and file types.</li>
     * <li><strong>blacklist</strong>: blacklist mode. Protects all subdirectories, file types, and files under the specified directory except those that are excluded.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>blacklist</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>The IP address of the access source.</p>
     * 
     * <strong>example:</strong>
     * <p>36.112.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The UUID of the server whose protected directory you want to modify.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to obtain the UUID of the server.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4fe8e1cd-3c37-4851-b9de-124da32c****</p>
     */
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
