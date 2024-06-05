// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class UploadPartInfo extends TeaModel {
    @NameInMap("etag")
    public String etag;

    @NameInMap("internal_upload_url")
    public String internalUploadUrl;

    @NameInMap("parallel_sha1_ctx")
    public UploadPartInfoParallelSha1Ctx parallelSha1Ctx;

    @NameInMap("parallel_sha256_ctx")
    public UploadPartInfoParallelSha256Ctx parallelSha256Ctx;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("part_number")
    public Integer partNumber;

    @NameInMap("part_size")
    public Long partSize;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("upload_url")
    public String uploadUrl;

    public static UploadPartInfo build(java.util.Map<String, ?> map) throws Exception {
        UploadPartInfo self = new UploadPartInfo();
        return TeaModel.build(map, self);
    }

    public UploadPartInfo setEtag(String etag) {
        this.etag = etag;
        return this;
    }
    public String getEtag() {
        return this.etag;
    }

    public UploadPartInfo setInternalUploadUrl(String internalUploadUrl) {
        this.internalUploadUrl = internalUploadUrl;
        return this;
    }
    public String getInternalUploadUrl() {
        return this.internalUploadUrl;
    }

    public UploadPartInfo setParallelSha1Ctx(UploadPartInfoParallelSha1Ctx parallelSha1Ctx) {
        this.parallelSha1Ctx = parallelSha1Ctx;
        return this;
    }
    public UploadPartInfoParallelSha1Ctx getParallelSha1Ctx() {
        return this.parallelSha1Ctx;
    }

    public UploadPartInfo setParallelSha256Ctx(UploadPartInfoParallelSha256Ctx parallelSha256Ctx) {
        this.parallelSha256Ctx = parallelSha256Ctx;
        return this;
    }
    public UploadPartInfoParallelSha256Ctx getParallelSha256Ctx() {
        return this.parallelSha256Ctx;
    }

    public UploadPartInfo setPartNumber(Integer partNumber) {
        this.partNumber = partNumber;
        return this;
    }
    public Integer getPartNumber() {
        return this.partNumber;
    }

    public UploadPartInfo setPartSize(Long partSize) {
        this.partSize = partSize;
        return this;
    }
    public Long getPartSize() {
        return this.partSize;
    }

    public UploadPartInfo setUploadUrl(String uploadUrl) {
        this.uploadUrl = uploadUrl;
        return this;
    }
    public String getUploadUrl() {
        return this.uploadUrl;
    }

    public static class UploadPartInfoParallelSha1Ctx extends TeaModel {
        @NameInMap("h")
        public java.util.List<Long> h;

        @NameInMap("part_offset")
        public Long partOffset;

        public static UploadPartInfoParallelSha1Ctx build(java.util.Map<String, ?> map) throws Exception {
            UploadPartInfoParallelSha1Ctx self = new UploadPartInfoParallelSha1Ctx();
            return TeaModel.build(map, self);
        }

        public UploadPartInfoParallelSha1Ctx setH(java.util.List<Long> h) {
            this.h = h;
            return this;
        }
        public java.util.List<Long> getH() {
            return this.h;
        }

        public UploadPartInfoParallelSha1Ctx setPartOffset(Long partOffset) {
            this.partOffset = partOffset;
            return this;
        }
        public Long getPartOffset() {
            return this.partOffset;
        }

    }

    public static class UploadPartInfoParallelSha256Ctx extends TeaModel {
        @NameInMap("h")
        public java.util.List<Long> h;

        @NameInMap("part_offset")
        public Long partOffset;

        public static UploadPartInfoParallelSha256Ctx build(java.util.Map<String, ?> map) throws Exception {
            UploadPartInfoParallelSha256Ctx self = new UploadPartInfoParallelSha256Ctx();
            return TeaModel.build(map, self);
        }

        public UploadPartInfoParallelSha256Ctx setH(java.util.List<Long> h) {
            this.h = h;
            return this;
        }
        public java.util.List<Long> getH() {
            return this.h;
        }

        public UploadPartInfoParallelSha256Ctx setPartOffset(Long partOffset) {
            this.partOffset = partOffset;
            return this;
        }
        public Long getPartOffset() {
            return this.partOffset;
        }

    }

}
