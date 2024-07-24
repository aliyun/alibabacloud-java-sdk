// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListUploadedPartsRequest extends TeaModel {
    /**
     * <p>The drive ID. This parameter is required if the file is not uploaded by using the share URL of the file.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    /**
     * <p>The file ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>322fb07b975f4b0ae1b543fe8475eee4c19eb2b2</p>
     */
    @NameInMap("file_id")
    public String fileId;

    /**
     * <p>The maximum number of results to return. Valid values: 1 to 100. Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("limit")
    public Integer limit;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of marker. By default, this parameter is left empty.</p>
     * 
     * <strong>example:</strong>
     * <p>NWQ1Yjk4YmI1ZDRlYmU1Y2E0YWE0NmJhYWJmODBhNDQ2NzhlMTRhMg</p>
     */
    @NameInMap("part_number_marker")
    public Integer partNumberMarker;

    /**
     * <p>The share ID. This parameter is required if the file is uploaded by using the share URL of the file.</p>
     * 
     * <strong>example:</strong>
     * <p>7JQX1FswpQ8</p>
     */
    @NameInMap("share_id")
    public String shareId;

    /**
     * <p>The ID of the upload task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>00166D06127B413BA1EC8ABB1144D101</p>
     */
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
