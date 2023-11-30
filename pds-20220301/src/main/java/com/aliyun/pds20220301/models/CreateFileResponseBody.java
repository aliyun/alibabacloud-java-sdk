// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class CreateFileResponseBody extends TeaModel {
    /**
     * <p>The domain ID.</p>
     */
    @NameInMap("domain_id")
    public String domainId;

    /**
     * <p>The drive ID.</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    /**
     * <p>Indicates whether the file exists.</p>
     */
    @NameInMap("exist")
    public Boolean exist;

    /**
     * <p>The file ID.</p>
     */
    @NameInMap("file_id")
    public String fileId;

    /**
     * <p>The file name.</p>
     */
    @NameInMap("file_name")
    public String fileName;

    /**
     * <p>The ID of the parent directory.</p>
     */
    @NameInMap("parent_file_id")
    public String parentFileId;

    /**
     * <p>The information about the file parts.</p>
     */
    @NameInMap("part_info_list")
    public java.util.List<UploadPartInfo> partInfoList;

    /**
     * <p>Indicates whether the file is instantly uploaded.</p>
     */
    @NameInMap("rapid_upload")
    public Boolean rapidUpload;

    /**
     * <p>The state of the file.</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The type of the file.</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>The ID of the upload task.</p>
     */
    @NameInMap("upload_id")
    public String uploadId;

    public static CreateFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFileResponseBody self = new CreateFileResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFileResponseBody setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public CreateFileResponseBody setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public CreateFileResponseBody setExist(Boolean exist) {
        this.exist = exist;
        return this;
    }
    public Boolean getExist() {
        return this.exist;
    }

    public CreateFileResponseBody setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public CreateFileResponseBody setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public CreateFileResponseBody setParentFileId(String parentFileId) {
        this.parentFileId = parentFileId;
        return this;
    }
    public String getParentFileId() {
        return this.parentFileId;
    }

    public CreateFileResponseBody setPartInfoList(java.util.List<UploadPartInfo> partInfoList) {
        this.partInfoList = partInfoList;
        return this;
    }
    public java.util.List<UploadPartInfo> getPartInfoList() {
        return this.partInfoList;
    }

    public CreateFileResponseBody setRapidUpload(Boolean rapidUpload) {
        this.rapidUpload = rapidUpload;
        return this;
    }
    public Boolean getRapidUpload() {
        return this.rapidUpload;
    }

    public CreateFileResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateFileResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateFileResponseBody setUploadId(String uploadId) {
        this.uploadId = uploadId;
        return this;
    }
    public String getUploadId() {
        return this.uploadId;
    }

}
