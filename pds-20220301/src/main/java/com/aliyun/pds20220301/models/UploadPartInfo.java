// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class UploadPartInfo extends TeaModel {
    /**
     * <p>This parameter is discontinued.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;0CC175B9C0F1B6A831C399E269772661&quot;</p>
     */
    @NameInMap("etag")
    public String etag;

    /**
     * <p>The internal upload URL that is used for internal access over a virtual private cloud (VPC). If the intelligent domain name feature is enabled, this parameter is not required. This parameter is returned in the upload_url parameter based on the request. If you want to use this parameter, contact Photo and Drive Service (PDS) technical support.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://data-vpc.aliyunpds.com/xxx/xxx?Expires=xxx&OSSAccessKeyId=xxx&Signature=xxx&partNumber=1&uploadId=0CC175B9C0F1B6A831C399E269772661">https://data-vpc.aliyunpds.com/xxx/xxx?Expires=xxx&amp;OSSAccessKeyId=xxx&amp;Signature=xxx&amp;partNumber=1&amp;uploadId=0CC175B9C0F1B6A831C399E269772661</a></p>
     */
    @NameInMap("internal_upload_url")
    public String internalUploadUrl;

    /**
     * <p>The Secure Hash Algorithm 1 (SHA-1) context of the previous part. This parameter takes effect only if the parallel upload feature is enabled.</p>
     */
    @NameInMap("parallel_sha1_ctx")
    public UploadPartInfoParallelSha1Ctx parallelSha1Ctx;

    /**
     * <p>The SHA-256 context of the previous part.</p>
     */
    @NameInMap("parallel_sha256_ctx")
    public UploadPartInfoParallelSha256Ctx parallelSha256Ctx;

    /**
     * <p>The serial number of the file part.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("part_number")
    public Integer partNumber;

    /**
     * <p>This parameter is discontinued.</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("part_size")
    public Long partSize;

    /**
     * <p>The upload URL. By default, the validity period of the URL is 15 minutes. If the URL expires, you must call the GetUploadUrl operation to obtain another URL. If the intelligent domain name feature is enabled, the internal_upload_url value is returned within the parameter based on the request.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://data.aliyunpds.com/xxx/xxx?Expires=xxx&OSSAccessKeyId=xxx&Signature=xxx&partNumber=1&uploadId=0CC175B9C0F1B6A831C399E269772661">https://data.aliyunpds.com/xxx/xxx?Expires=xxx&amp;OSSAccessKeyId=xxx&amp;Signature=xxx&amp;partNumber=1&amp;uploadId=0CC175B9C0F1B6A831C399E269772661</a></p>
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
        /**
         * <p>The first to fifth 32-bit variables in the SHA-1 context of the previous part. This parameter takes effect only if the parallel upload feature is enabled.</p>
         */
        @NameInMap("h")
        public java.util.List<Long> h;

        /**
         * <p>The total size of all the previous parts. Unit: bytes. The value must be a multiple of 64. This parameter takes effect only if the parallel upload feature is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>10240</p>
         */
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
        /**
         * <p>The first to eighth 32-bit variables in the SHA-256 context of the previous part.</p>
         */
        @NameInMap("h")
        public java.util.List<Long> h;

        /**
         * <p>The total size of all the previous parts. Unit: bytes. The value must be a multiple of 64.</p>
         */
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
