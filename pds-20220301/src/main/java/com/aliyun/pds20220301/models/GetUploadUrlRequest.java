// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class GetUploadUrlRequest extends TeaModel {
    /**
     * <p>The drive ID.</p>
     */
    @NameInMap("drive_id")
    public String driveId;

    /**
     * <p>The file ID.</p>
     */
    @NameInMap("file_id")
    public String fileId;

    /**
     * <p>The information about the file parts.</p>
     */
    @NameInMap("part_info_list")
    public java.util.List<GetUploadUrlRequestPartInfoList> partInfoList;

    /**
     * <p>The share ID.</p>
     */
    @NameInMap("share_id")
    public String shareId;

    /**
     * <p>The ID of the upload task.</p>
     */
    @NameInMap("upload_id")
    public String uploadId;

    public static GetUploadUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUploadUrlRequest self = new GetUploadUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetUploadUrlRequest setDriveId(String driveId) {
        this.driveId = driveId;
        return this;
    }
    public String getDriveId() {
        return this.driveId;
    }

    public GetUploadUrlRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public GetUploadUrlRequest setPartInfoList(java.util.List<GetUploadUrlRequestPartInfoList> partInfoList) {
        this.partInfoList = partInfoList;
        return this;
    }
    public java.util.List<GetUploadUrlRequestPartInfoList> getPartInfoList() {
        return this.partInfoList;
    }

    public GetUploadUrlRequest setShareId(String shareId) {
        this.shareId = shareId;
        return this;
    }
    public String getShareId() {
        return this.shareId;
    }

    public GetUploadUrlRequest setUploadId(String uploadId) {
        this.uploadId = uploadId;
        return this;
    }
    public String getUploadId() {
        return this.uploadId;
    }

    public static class GetUploadUrlRequestPartInfoListParallelSha1Ctx extends TeaModel {
        /**
         * <p>The first to fifth 32-bit variables of the SHA-1 hash value of the file content before the file part. This parameter takes effect only if the parallel upload feature is enabled.</p>
         */
        @NameInMap("h")
        public java.util.List<Long> h;

        /**
         * <p>The size of the file part. Unit: bytes. The value must be a multiple of 64. This parameter takes effect only if the parallel upload feature is enabled.</p>
         */
        @NameInMap("part_offset")
        public Long partOffset;

        public static GetUploadUrlRequestPartInfoListParallelSha1Ctx build(java.util.Map<String, ?> map) throws Exception {
            GetUploadUrlRequestPartInfoListParallelSha1Ctx self = new GetUploadUrlRequestPartInfoListParallelSha1Ctx();
            return TeaModel.build(map, self);
        }

        public GetUploadUrlRequestPartInfoListParallelSha1Ctx setH(java.util.List<Long> h) {
            this.h = h;
            return this;
        }
        public java.util.List<Long> getH() {
            return this.h;
        }

        public GetUploadUrlRequestPartInfoListParallelSha1Ctx setPartOffset(Long partOffset) {
            this.partOffset = partOffset;
            return this;
        }
        public Long getPartOffset() {
            return this.partOffset;
        }

    }

    public static class GetUploadUrlRequestPartInfoList extends TeaModel {
        @NameInMap("content_md5")
        public String contentMd5;

        @NameInMap("content_type")
        public String contentType;

        /**
         * <p>The SHA-1 hash value of the file content before the file part. This parameter takes effect only if the parallel upload feature is enabled.</p>
         */
        @NameInMap("parallel_sha1_ctx")
        public GetUploadUrlRequestPartInfoListParallelSha1Ctx parallelSha1Ctx;

        /**
         * <p>The serial number of a part.</p>
         */
        @NameInMap("part_number")
        public Integer partNumber;

        public static GetUploadUrlRequestPartInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetUploadUrlRequestPartInfoList self = new GetUploadUrlRequestPartInfoList();
            return TeaModel.build(map, self);
        }

        public GetUploadUrlRequestPartInfoList setContentMd5(String contentMd5) {
            this.contentMd5 = contentMd5;
            return this;
        }
        public String getContentMd5() {
            return this.contentMd5;
        }

        public GetUploadUrlRequestPartInfoList setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public GetUploadUrlRequestPartInfoList setParallelSha1Ctx(GetUploadUrlRequestPartInfoListParallelSha1Ctx parallelSha1Ctx) {
            this.parallelSha1Ctx = parallelSha1Ctx;
            return this;
        }
        public GetUploadUrlRequestPartInfoListParallelSha1Ctx getParallelSha1Ctx() {
            return this.parallelSha1Ctx;
        }

        public GetUploadUrlRequestPartInfoList setPartNumber(Integer partNumber) {
            this.partNumber = partNumber;
            return this;
        }
        public Integer getPartNumber() {
            return this.partNumber;
        }

    }

}
