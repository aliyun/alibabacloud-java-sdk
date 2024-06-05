// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class CreateShareLinkRequest extends TeaModel {
    @NameInMap("creatable")
    public Boolean creatable;

    @NameInMap("creatable_file_id_list")
    public java.util.List<String> creatableFileIdList;

    /**
     * <p>The description of the share. The description must be 0 to 1,024 characters in length.</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Specifies whether to disable the download feature.</p>
     */
    @NameInMap("disable_download")
    public Boolean disableDownload;

    /**
     * <p>Specifies whether to disable the preview feature.</p>
     */
    @NameInMap("disable_preview")
    public Boolean disablePreview;

    /**
     * <p>Specifies whether to disable the dump feature.</p>
     */
    @NameInMap("disable_save")
    public Boolean disableSave;

    /**
     * <p>The limit on the number of times that the shared files can be downloaded. The value of this parameter must be equal to or greater than 0. A value of 0 indicates no limit.</p>
     */
    @NameInMap("download_limit")
    public Long downloadLimit;

    /**
     * <p>The drive ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    /**
     * <p>The time when the share URL expires. The value of this parameter follows the RFC 3339 standard. Example: "2020-06-28T11:33:00.000+08:00". If expiration is set to "", the share URL never expires.</p>
     */
    @NameInMap("expiration")
    public String expiration;

    /**
     * <p>The IDs of the files to share in the parent path. The number of files in the parent path ranges from 1 to 100. If share_all_files is set to true, this parameter does not take effect. Otherwise, you must specify this parameter.``</p>
     */
    @NameInMap("file_id_list")
    public java.util.List<String> fileIdList;

    /**
     * <p>The limit on the number of times that the shared files can be previewed. The value of this parameter must be equal to or greater than 0. A value of 0 indicates no limit.</p>
     */
    @NameInMap("preview_limit")
    public Long previewLimit;

    /**
     * <p>The limit on the number of times that the shared files can be dumped. The value of this parameter must be equal to or greater than 0. A value of 0 indicates no limit.</p>
     */
    @NameInMap("save_limit")
    public Long saveLimit;

    /**
     * <p>Specifies whether to share all files in the drive.</p>
     */
    @NameInMap("share_all_files")
    public Boolean shareAllFiles;

    /**
     * <p>The name of the share. If you leave this parameter empty, the file name that corresponds to the first ID in the file ID list is used. The name must be 0 to 128 characters in length.</p>
     */
    @NameInMap("share_name")
    public String shareName;

    /**
     * <p>The access code. An access code must be 0 to 64 bytes in length. If you do not specify this parameter or leave this parameter empty, the files can be accessed without an access code. In this case, you do not need to specify the share_pwd parameter when you call an operation to query the share URL. The access code can contain only visible ASCII characters.</p>
     */
    @NameInMap("share_pwd")
    public String sharePwd;

    /**
     * <p>The user ID.</p>
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

    public CreateShareLinkRequest setPreviewLimit(Long previewLimit) {
        this.previewLimit = previewLimit;
        return this;
    }
    public Long getPreviewLimit() {
        return this.previewLimit;
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
