// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class GetDownloadUrlResponseBody extends TeaModel {
    /**
     * <p>The download URL of a file that is downloaded by using Alibaba Cloud CDN.</p>
     */
    @NameInMap("cdn_url")
    public String cdnUrl;

    /**
     * <p>The hash value of the file content.</p>
     */
    @NameInMap("content_hash")
    public String contentHash;

    /**
     * <p>The name of the algorithm that is used to calculate the hash value of the file content.</p>
     */
    @NameInMap("content_hash_name")
    public String contentHashName;

    /**
     * <p>The hash value calculated by using 64-bit cyclic redundancy check (CRC-64).</p>
     */
    @NameInMap("crc64_hash")
    public String crc64Hash;

    /**
     * <p>The time when the download URL expires.</p>
     */
    @NameInMap("expiration")
    public String expiration;

    /**
     * <p>The download URL of a file that is downloaded over a virtual private cloud (VPC).</p>
     */
    @NameInMap("internal_url")
    public String internalUrl;

    /**
     * <p>The size of the file. Unit: bytes.</p>
     */
    @NameInMap("size")
    public Long size;

    /**
     * <p>The download URL of a file that is downloaded over the Internet.</p>
     */
    @NameInMap("url")
    public String url;

    public static GetDownloadUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDownloadUrlResponseBody self = new GetDownloadUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDownloadUrlResponseBody setCdnUrl(String cdnUrl) {
        this.cdnUrl = cdnUrl;
        return this;
    }
    public String getCdnUrl() {
        return this.cdnUrl;
    }

    public GetDownloadUrlResponseBody setContentHash(String contentHash) {
        this.contentHash = contentHash;
        return this;
    }
    public String getContentHash() {
        return this.contentHash;
    }

    public GetDownloadUrlResponseBody setContentHashName(String contentHashName) {
        this.contentHashName = contentHashName;
        return this;
    }
    public String getContentHashName() {
        return this.contentHashName;
    }

    public GetDownloadUrlResponseBody setCrc64Hash(String crc64Hash) {
        this.crc64Hash = crc64Hash;
        return this;
    }
    public String getCrc64Hash() {
        return this.crc64Hash;
    }

    public GetDownloadUrlResponseBody setExpiration(String expiration) {
        this.expiration = expiration;
        return this;
    }
    public String getExpiration() {
        return this.expiration;
    }

    public GetDownloadUrlResponseBody setInternalUrl(String internalUrl) {
        this.internalUrl = internalUrl;
        return this;
    }
    public String getInternalUrl() {
        return this.internalUrl;
    }

    public GetDownloadUrlResponseBody setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public GetDownloadUrlResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
