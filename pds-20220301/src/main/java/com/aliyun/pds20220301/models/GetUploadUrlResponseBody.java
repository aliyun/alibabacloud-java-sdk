// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class GetUploadUrlResponseBody extends TeaModel {
    /**
     * <p>The time when the upload task was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-09-11T16:34:36.977Z</p>
     */
    @NameInMap("create_at")
    public String createAt;

    /**
     * <p>The domain ID.</p>
     * 
     * <strong>example:</strong>
     * <p>bj1</p>
     */
    @NameInMap("domain_id")
    public String domainId;

    /**
     * <p>The drive ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    /**
     * <p>The file ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5d5b846942cf94fa72324c14a4bda34e81da635d</p>
     */
    @NameInMap("file_id")
    public String fileId;

    /**
     * <p>The information about the file parts.</p>
     */
    @NameInMap("part_info_list")
    public java.util.List<UploadPartInfo> partInfoList;

    /**
     * <p>The ID of the upload task.</p>
     * 
     * <strong>example:</strong>
     * <p>10166D06127B413BA1EC8ABB1144D111</p>
     */
    @NameInMap("upload_id")
    public String uploadId;

    public static GetUploadUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUploadUrlResponseBody self = new GetUploadUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUploadUrlResponseBody setCreateAt(String createAt) {
        this.createAt = createAt;
        return this;
    }
    public String getCreateAt() {
        return this.createAt;
    }

    public GetUploadUrlResponseBody setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public GetUploadUrlResponseBody setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public GetUploadUrlResponseBody setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public GetUploadUrlResponseBody setPartInfoList(java.util.List<UploadPartInfo> partInfoList) {
        this.partInfoList = partInfoList;
        return this;
    }
    public java.util.List<UploadPartInfo> getPartInfoList() {
        return this.partInfoList;
    }

    public GetUploadUrlResponseBody setUploadId(String uploadId) {
        this.uploadId = uploadId;
        return this;
    }
    public String getUploadId() {
        return this.uploadId;
    }

}
