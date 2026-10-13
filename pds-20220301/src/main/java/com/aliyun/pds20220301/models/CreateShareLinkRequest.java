// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class CreateShareLinkRequest extends TeaModel {
    /**
     * <p>Set to <code>true</code> to allow users to create files in shared folders. Setting this to <code>true</code> also requires specifying <code>creatable_file_id_list</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("creatable")
    public Boolean creatable;

    /**
     * <p>A list of folder IDs where users can upload files.</p>
     */
    @NameInMap("creatable_file_id_list")
    public java.util.List<String> creatableFileIdList;

    /**
     * <p>A description for the share link, 0 to 1,024 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>Lecture collection</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Set to <code>true</code> to prevent users from downloading the shared files.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("disable_download")
    public Boolean disableDownload;

    /**
     * <p>Set to <code>true</code> to prevent users from previewing the shared files.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("disable_preview")
    public Boolean disablePreview;

    /**
     * <p>Set to <code>true</code> to prevent users from saving the shared files to their own drive.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("disable_save")
    public Boolean disableSave;

    /**
     * <p>The maximum number of times users can download the shared files. The value must be 0 or greater. A value of 0 means there is no limit.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("download_limit")
    public Long downloadLimit;

    /**
     * <p>The ID of the drive.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    /**
     * <p>The expiration time for the share link, specified in RFC 3339 format (for example, &quot;2020-06-28T11:33:00.000+08:00&quot;). To create a share link that never expires, set this parameter to an empty string (&quot;&quot;).</p>
     * 
     * <strong>example:</strong>
     * <p>2020-06-28T11:33:00.000+08:00</p>
     */
    @NameInMap("expiration")
    public String expiration;

    /**
     * <p>A list of 1 to 100 file IDs to share. This parameter is required when <code>share_all_files</code> is <code>false</code> and is ignored when it is <code>true</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;520b217f13adf4fc24f2191991b1664ce045b393&quot;]</p>
     */
    @NameInMap("file_id_list")
    public java.util.List<String> fileIdList;

    /**
     * <p>Set to <code>true</code> to allow online editing of the shared documents.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("office_editable")
    public Boolean officeEditable;

    /**
     * <p>The maximum number of times users can preview the shared files. The value must be 0 or greater. A value of 0 means there is no limit.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("preview_limit")
    public Long previewLimit;

    /**
     * <p>If <code>true</code>, users must log in to access the share link.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("require_login")
    public Boolean requireLogin;

    /**
     * <p>The maximum number of times users can save the shared files. The value must be 0 or greater. A value of 0 means there is no limit.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("save_limit")
    public Long saveLimit;

    /**
     * <p>Set to <code>true</code> to share all files in the drive.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("share_all_files")
    public Boolean shareAllFiles;

    /**
     * <p>The share name. The length must be between 0 and 128 characters. If not specified, the system uses the name of the file corresponding to the first ID in <code>file_id_list</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>LectureRoom-1.MP4</p>
     */
    @NameInMap("share_name")
    public String shareName;

    /**
     * <p>The password for the share link. It must be between 0 and 64 printable ASCII characters. If this parameter is not set or is an empty string, the share link does not require a password.</p>
     * 
     * <strong>example:</strong>
     * <p>abcF123x</p>
     */
    @NameInMap("share_pwd")
    public String sharePwd;

    /**
     * <p>The user ID. This parameter is required when authenticating the request with an AccessKey (AK).</p>
     * 
     * <strong>example:</strong>
     * <p>u123</p>
     */
    @NameInMap("user_id")
    public String userId;

    public static CreateShareLinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateShareLinkRequest self = new CreateShareLinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateShareLinkRequest setCreatable(Boolean creatable) {
        this.creatable = creatable;
        return this;
    }
    public Boolean getCreatable() {
        return this.creatable;
    }

    public CreateShareLinkRequest setCreatableFileIdList(java.util.List<String> creatableFileIdList) {
        this.creatableFileIdList = creatableFileIdList;
        return this;
    }
    public java.util.List<String> getCreatableFileIdList() {
        return this.creatableFileIdList;
    }

    public CreateShareLinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateShareLinkRequest setDisableDownload(Boolean disableDownload) {
        this.disableDownload = disableDownload;
        return this;
    }
    public Boolean getDisableDownload() {
        return this.disableDownload;
    }

    public CreateShareLinkRequest setDisablePreview(Boolean disablePreview) {
        this.disablePreview = disablePreview;
        return this;
    }
    public Boolean getDisablePreview() {
        return this.disablePreview;
    }

    public CreateShareLinkRequest setDisableSave(Boolean disableSave) {
        this.disableSave = disableSave;
        return this;
    }
    public Boolean getDisableSave() {
        return this.disableSave;
    }

    public CreateShareLinkRequest setDownloadLimit(Long downloadLimit) {
        this.downloadLimit = downloadLimit;
        return this;
    }
    public Long getDownloadLimit() {
        return this.downloadLimit;
    }

    public CreateShareLinkRequest setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public CreateShareLinkRequest setExpiration(String expiration) {
        this.expiration = expiration;
        return this;
    }
    public String getExpiration() {
        return this.expiration;
    }

    public CreateShareLinkRequest setFileIdList(java.util.List<String> fileIdList) {
        this.fileIdList = fileIdList;
        return this;
    }
    public java.util.List<String> getFileIdList() {
        return this.fileIdList;
    }

    public CreateShareLinkRequest setOfficeEditable(Boolean officeEditable) {
        this.officeEditable = officeEditable;
        return this;
    }
    public Boolean getOfficeEditable() {
        return this.officeEditable;
    }

    public CreateShareLinkRequest setPreviewLimit(Long previewLimit) {
        this.previewLimit = previewLimit;
        return this;
    }
    public Long getPreviewLimit() {
        return this.previewLimit;
    }

    public CreateShareLinkRequest setRequireLogin(Boolean requireLogin) {
        this.requireLogin = requireLogin;
        return this;
    }
    public Boolean getRequireLogin() {
        return this.requireLogin;
    }

    public CreateShareLinkRequest setSaveLimit(Long saveLimit) {
        this.saveLimit = saveLimit;
        return this;
    }
    public Long getSaveLimit() {
        return this.saveLimit;
    }

    public CreateShareLinkRequest setShareAllFiles(Boolean shareAllFiles) {
        this.shareAllFiles = shareAllFiles;
        return this;
    }
    public Boolean getShareAllFiles() {
        return this.shareAllFiles;
    }

    public CreateShareLinkRequest setShareName(String shareName) {
        this.shareName = shareName;
        return this;
    }
    public String getShareName() {
        return this.shareName;
    }

    public CreateShareLinkRequest setSharePwd(String sharePwd) {
        this.sharePwd = sharePwd;
        return this;
    }
    public String getSharePwd() {
        return this.sharePwd;
    }

    public CreateShareLinkRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
