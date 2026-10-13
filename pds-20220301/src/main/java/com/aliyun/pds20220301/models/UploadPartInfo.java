// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class UploadPartInfo extends TeaModel {
    /**
     * <p>This field is deprecated. Do not use it.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;0CC175B9C0F1B6A831C399E269772661&quot;</p>
     */
    @NameInMap("etag")
    public String etag;

    /**
     * <p>The internal upload URL, which is used for access from within a VPC network. After you enable the intelligent data domain feature, this field is no longer used. The value of this parameter is adaptively returned in the upload_url field based on the request. If you need to use this field, contact PDS technical support.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://data-vpc.aliyunpds.com/xxx/xxx?Expires=xxx&OSSAccessKeyId=xxx&Signature=xxx&partNumber=1&uploadId=0CC175B9C0F1B6A831C399E269772661">https://data-vpc.aliyunpds.com/xxx/xxx?Expires=xxx&amp;OSSAccessKeyId=xxx&amp;Signature=xxx&amp;partNumber=1&amp;uploadId=0CC175B9C0F1B6A831C399E269772661</a></p>
     */
    @NameInMap("internal_upload_url")
    public String internalUploadUrl;

    /**
     * <p>The SHA-1 context of the previous part. This field is valid only for parallel upload of multiple parts.</p>
     */
    @NameInMap("parallel_sha1_ctx")
    public UploadPartInfoParallelSha1Ctx parallelSha1Ctx;

    /**
     * <p>The SHA-256 context of the previous part.</p>
     */
    @NameInMap("parallel_sha256_ctx")
    public UploadPartInfoParallelSha256Ctx parallelSha256Ctx;

    /**
     * <p>The part number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("part_number")
    public Integer partNumber;

    /**
     * <p>This field is deprecated. Do not use it.</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("part_size")
    public Long partSize;

    /**
     * <p>The form upload information.</p>
     */
    @NameInMap("upload_form_info")
    public UploadFormInfo uploadFormInfo;

    /**
     * <p>The upload URL. The URL is valid for 15 minutes by default. If the URL expires, you must call the GetUploadUrl operation again to obtain a new one. If you enable the intelligent data domain feature, the value of internal_upload_url is adaptively returned in this field based on the request.</p>
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

    public UploadPartInfo setUploadFormInfo(UploadFormInfo uploadFormInfo) {
        this.uploadFormInfo = uploadFormInfo;
        return this;
    }
    public UploadFormInfo getUploadFormInfo() {
        return this.uploadFormInfo;
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
         * <p>The first five 32-bit variables of the SHA-1 hash of the previous data block. This field is valid only for parallel upload of multiple parts.</p>
         */
        @NameInMap("h")
        public java.util.List<Long> h;

        /**
         * <p>The total length of data up to the previous data block, in bytes. The value must be a multiple of 64. This field is valid only for parallel upload of multiple parts.</p>
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
         * <p>The first eight 32-bit variables of the SHA-256 hash of the previous data block.</p>
         */
        @NameInMap("h")
        public java.util.List<Long> h;

        /**
         * <p>The total length of data up to the previous data block, in bytes. The value must be a multiple of 64.</p>
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
