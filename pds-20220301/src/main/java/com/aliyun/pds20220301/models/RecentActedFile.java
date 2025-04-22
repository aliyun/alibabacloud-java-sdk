// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class RecentActedFile extends TeaModel {
    @NameInMap("action_list")
    public java.util.List<String> actionList;

    /**
     * <strong>example:</strong>
     * <p>doc</p>
     */
    @NameInMap("category")
    public String category;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("deleted")
    public Boolean deleted;

    /**
     * <strong>example:</strong>
     * <p>50d6f2aaa16525c7d053998e48fac265962f585f</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("drive_is_handover")
    public Boolean driveIsHandover;

    /**
     * <strong>example:</strong>
     * <p>group drive</p>
     */
    @NameInMap("drive_name")
    public String driveName;

    /**
     * <strong>example:</strong>
     * <p>50d6f2aaa16525c7d053998e48fac265962f585f</p>
     */
    @NameInMap("drive_owner_id")
    public String driveOwnerId;

    /**
     * <strong>example:</strong>
     * <p>group</p>
     */
    @NameInMap("drive_owner_type")
    public String driveOwnerType;

    /**
     * <strong>example:</strong>
     * <p>50d6f2aaa16525c7d053998e48fac265962f585f</p>
     */
    @NameInMap("file_id")
    public String fileId;

    /**
     * <strong>example:</strong>
     * <p>a.jpg</p>
     */
    @NameInMap("file_name")
    public String fileName;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("size")
    public Long size;

    /**
     * <strong>example:</strong>
     * <p><a href="https://xxx.jpg">https://xxx.jpg</a></p>
     */
    @NameInMap("thumbnail")
    public String thumbnail;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("trashed")
    public Boolean trashed;

    public static RecentActedFile build(java.util.Map<String, ?> map) throws Exception {
        RecentActedFile self = new RecentActedFile();
        return TeaModel.build(map, self);
    }

    public RecentActedFile setActionList(java.util.List<String> actionList) {
        this.actionList = actionList;
        return this;
    }
    public java.util.List<String> getActionList() {
        return this.actionList;
    }

    public RecentActedFile setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public RecentActedFile setDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }
    public Boolean getDeleted() {
        return this.deleted;
    }

    public RecentActedFile setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public RecentActedFile setDriveIsHandover(Boolean driveIsHandover) {
        this.driveIsHandover = driveIsHandover;
        return this;
    }
    public Boolean getDriveIsHandover() {
        return this.driveIsHandover;
    }

    public RecentActedFile setDriveName(String driveName) {
        this.driveName = driveName;
        return this;
    }
    public String getDriveName() {
        return this.driveName;
    }

    public RecentActedFile setDriveOwnerId(String driveOwnerId) {
        this.driveOwnerId = driveOwnerId;
        return this;
    }
    public String getDriveOwnerId() {
        return this.driveOwnerId;
    }

    public RecentActedFile setDriveOwnerType(String driveOwnerType) {
        this.driveOwnerType = driveOwnerType;
        return this;
    }
    public String getDriveOwnerType() {
        return this.driveOwnerType;
    }

    public RecentActedFile setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public RecentActedFile setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public RecentActedFile setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public RecentActedFile setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }
    public String getThumbnail() {
        return this.thumbnail;
    }

    public RecentActedFile setTrashed(Boolean trashed) {
        this.trashed = trashed;
        return this;
    }
    public Boolean getTrashed() {
        return this.trashed;
    }

}
