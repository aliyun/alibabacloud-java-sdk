// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListUploadedPartsResponseBody extends TeaModel {
    /**
     * <p>The file ID.</p>
     * 
     * <strong>example:</strong>
     * <p>322fb07b975f4b0ae1b543fe8475eee4c19eb2b2</p>
     */
    @NameInMap("file_id")
    public String fileId;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If next_marker is empty, no next page exists.</p>
     * 
     * <strong>example:</strong>
     * <p>NWQ1Yjk4YmI1ZDRlYmU1Y2E0YWE0NmJhYWJmODBhNDQ2NzhlMTRhMg</p>
     */
    @NameInMap("next_part_number_marker")
    public String nextPartNumberMarker;

    /**
     * <p>Indicates whether the parallel upload feature is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("parallel_upload")
    public Boolean parallelUpload;

    /**
     * <p>The ID of the upload task.</p>
     * 
     * <strong>example:</strong>
     * <p>00166D06127B413BA1EC8ABB1144D101</p>
     */
    @NameInMap("upload_id")
    public String uploadId;

    /**
     * <p>The information about the file parts.</p>
     */
    @NameInMap("uploaded_parts")
    public java.util.List<UploadPartInfo> uploadedParts;

    public static ListUploadedPartsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUploadedPartsResponseBody self = new ListUploadedPartsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUploadedPartsResponseBody setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public ListUploadedPartsResponseBody setNextPartNumberMarker(String nextPartNumberMarker) {
        this.nextPartNumberMarker = nextPartNumberMarker;
        return this;
    }
    public String getNextPartNumberMarker() {
        return this.nextPartNumberMarker;
    }

    public ListUploadedPartsResponseBody setParallelUpload(Boolean parallelUpload) {
        this.parallelUpload = parallelUpload;
        return this;
    }
    public Boolean getParallelUpload() {
        return this.parallelUpload;
    }

    public ListUploadedPartsResponseBody setUploadId(String uploadId) {
        this.uploadId = uploadId;
        return this;
    }
    public String getUploadId() {
        return this.uploadId;
    }

    public ListUploadedPartsResponseBody setUploadedParts(java.util.List<UploadPartInfo> uploadedParts) {
        this.uploadedParts = uploadedParts;
        return this;
    }
    public java.util.List<UploadPartInfo> getUploadedParts() {
        return this.uploadedParts;
    }

}
