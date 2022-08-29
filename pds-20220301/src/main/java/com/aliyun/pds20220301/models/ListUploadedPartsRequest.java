// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListUploadedPartsRequest extends TeaModel {
    @NameInMap("drive_id")
    public String driveId;

    @NameInMap("file_id")
    public String fileId;

    @NameInMap("limit")
    public Integer limit;

    @NameInMap("part_number_marker")
    public Integer partNumberMarker;

    @NameInMap("share_id")
    public String shareId;

    @NameInMap("upload_id")
    public String uploadId;

    public static ListUploadedPartsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUploadedPartsRequest self = new ListUploadedPartsRequest();
        return TeaModel.build(map, self);
    }

    public ListUploadedPartsRequest setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public ListUploadedPartsRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public ListUploadedPartsRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListUploadedPartsRequest setPartNumberMarker(Integer partNumberMarker) {
        this.partNumberMarker = partNumberMarker;
        return this;
    }
    public Integer getPartNumberMarker() {
        return this.partNumberMarker;
    }

    public ListUploadedPartsRequest setShareId(String shareId) {
        this.shareId = shareId;
        return this;
    }
    public String getShareId() {
        return this.shareId;
    }

    public ListUploadedPartsRequest setUploadId(String uploadId) {
        this.uploadId = uploadId;
        return this;
    }
    public String getUploadId() {
        return this.uploadId;
    }

}
