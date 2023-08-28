// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class GetUploadUrlRequest extends TeaModel {
    @NameInMap("drive_id")
    public String driveId;

    @NameInMap("file_id")
    public String fileId;

    @NameInMap("part_info_list")
    public java.util.List<GetUploadUrlRequestPartInfoList> partInfoList;

    @NameInMap("share_id")
    public String shareId;

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
        @NameInMap("h")
        public java.util.List<Long> h;

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

        @NameInMap("parallel_sha1_ctx")
        public GetUploadUrlRequestPartInfoListParallelSha1Ctx parallelSha1Ctx;

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
