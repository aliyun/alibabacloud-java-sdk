// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListUploadedPartsResponseBody extends TeaModel {
    /**
     * <p>The file ID.</p>
     */
    @NameInMap("file_id")
    public String fileId;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If next_marker is empty, no next page exists.</p>
     */
    @NameInMap("next_part_number_marker")
    public String nextPartNumberMarker;

    /**
     * <p>Indicates whether the parallel upload feature is enabled.</p>
     */
    @NameInMap("parallel_upload")
    public Boolean parallelUpload;

    /**
     * <p>The ID of the upload task.</p>
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
