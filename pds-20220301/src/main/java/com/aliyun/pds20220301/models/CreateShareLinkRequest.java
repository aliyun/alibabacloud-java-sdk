// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class CreateShareLinkRequest extends TeaModel {
    @NameInMap("description")
    public String description;

    @NameInMap("disable_download")
    public Boolean disableDownload;

    @NameInMap("disable_preview")
    public Boolean disablePreview;

    @NameInMap("disable_save")
    public Boolean disableSave;

    @NameInMap("download_limit")
    public Long downloadLimit;

    @NameInMap("drive_id")
    public String driveId;

    @NameInMap("expiration")
    public String expiration;

    @NameInMap("file_id_list")
    public java.util.List<String> fileIdList;

    @NameInMap("office_editable")
    public Boolean officeEditable;

    @NameInMap("preview_limit")
    public Long previewLimit;

    @NameInMap("save_limit")
    public Long saveLimit;

    @NameInMap("share_all_files")
    public Boolean shareAllFiles;

    @NameInMap("share_name")
    public String shareName;

    @NameInMap("share_pwd")
    public String sharePwd;

    @NameInMap("user_id")
    public String userId;

    public static CreateShareLinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateShareLinkRequest self = new CreateShareLinkRequest();
        return TeaModel.build(map, self);
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
