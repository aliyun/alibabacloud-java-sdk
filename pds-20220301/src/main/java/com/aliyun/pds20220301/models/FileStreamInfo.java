// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class FileStreamInfo extends TeaModel {
    @NameInMap("content_hash")
    public String contentHash;

    @NameInMap("content_hash_name")
    public String contentHashName;

    @NameInMap("content_md5")
    public String contentMd5;

    @NameInMap("part_info_list")
    public UploadPartInfo partInfoList;

    @NameInMap("pre_hash")
    public String preHash;

    @NameInMap("proof_code")
    public String proofCode;

    @NameInMap("proof_version")
    public String proofVersion;

    @NameInMap("size")
    public Long size;

    public static FileStreamInfo build(java.util.Map<String, ?> map) throws Exception {
        FileStreamInfo self = new FileStreamInfo();
        return TeaModel.build(map, self);
    }

    public FileStreamInfo setContentHash(String contentHash) {
        this.contentHash = contentHash;
        return this;
    }
    public String getContentHash() {
        return this.contentHash;
    }

    public FileStreamInfo setContentHashName(String contentHashName) {
        this.contentHashName = contentHashName;
        return this;
    }
    public String getContentHashName() {
        return this.contentHashName;
    }

    public FileStreamInfo setContentMd5(String contentMd5) {
        this.contentMd5 = contentMd5;
        return this;
    }
    public String getContentMd5() {
        return this.contentMd5;
    }

    public FileStreamInfo setPartInfoList(UploadPartInfo partInfoList) {
        this.partInfoList = partInfoList;
        return this;
    }
    public UploadPartInfo getPartInfoList() {
        return this.partInfoList;
    }

    public FileStreamInfo setPreHash(String preHash) {
        this.preHash = preHash;
        return this;
    }
    public String getPreHash() {
        return this.preHash;
    }

    public FileStreamInfo setProofCode(String proofCode) {
        this.proofCode = proofCode;
        return this;
    }
    public String getProofCode() {
        return this.proofCode;
    }

    public FileStreamInfo setProofVersion(String proofVersion) {
        this.proofVersion = proofVersion;
        return this;
    }
    public String getProofVersion() {
        return this.proofVersion;
    }

    public FileStreamInfo setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

}
