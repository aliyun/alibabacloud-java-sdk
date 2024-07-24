// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class GetDownloadUrlResponseBody extends TeaModel {
    /**
     * <p>The download URL of a file that is downloaded by using Alibaba Cloud CDN.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://data-cdn.aliyunpds.com/hz22%2F5d79219b0aa9a7c995a94a96993ba3205cd91c5a%2F5d79219bf3261a5d38744da0834ed489b677a27a?Expires=xxxOSSAccessKeyId=xxx&Signature=xxx&response-content-disposition=attachment%3Bfilename%3DtBiZAoJPC2c8b13450eda4292b7f5f8010618e078.txt">https://data-cdn.aliyunpds.com/hz22%2F5d79219b0aa9a7c995a94a96993ba3205cd91c5a%2F5d79219bf3261a5d38744da0834ed489b677a27a?Expires=xxxOSSAccessKeyId=xxx&amp;Signature=xxx&amp;response-content-disposition=attachment%3Bfilename%3DtBiZAoJPC2c8b13450eda4292b7f5f8010618e078.txt</a></p>
     */
    @NameInMap("cdn_url")
    public String cdnUrl;

    /**
     * <p>The hash value of the file content.</p>
     * 
     * <strong>example:</strong>
     * <p>EA4942AA8761213890A5C386F88E6464D2C31CA1</p>
     */
    @NameInMap("content_hash")
    public String contentHash;

    /**
     * <p>The name of the algorithm that is used to calculate the hash value of the file content.</p>
     * 
     * <strong>example:</strong>
     * <p>sha1</p>
     */
    @NameInMap("content_hash_name")
    public String contentHashName;

    /**
     * <p>The hash value calculated by using 64-bit cyclic redundancy check (CRC-64).</p>
     * 
     * <strong>example:</strong>
     * <p>5498595269368962671</p>
     */
    @NameInMap("crc64_hash")
    public String crc64Hash;

    /**
     * <p>The time when the download URL expires.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-01-02T15:04:05.999Z07:00</p>
     */
    @NameInMap("expiration")
    public String expiration;

    /**
     * <p>The download URL of a file that is downloaded over a virtual private cloud (VPC).</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://data-vpc.aliyunpds.com/hz22%2F5d79219b0aa9a7c995a94a96993ba3205cd91c5a%2F5d79219bf3261a5d38744da0834ed489b677a27a?Expires=xxxOSSAccessKeyId=xxx&Signature=xxx&response-content-disposition=attachment%3Bfilename%3DtBiZAoJPC2c8b13450eda4292b7f5f8010618e078.txt">https://data-vpc.aliyunpds.com/hz22%2F5d79219b0aa9a7c995a94a96993ba3205cd91c5a%2F5d79219bf3261a5d38744da0834ed489b677a27a?Expires=xxxOSSAccessKeyId=xxx&amp;Signature=xxx&amp;response-content-disposition=attachment%3Bfilename%3DtBiZAoJPC2c8b13450eda4292b7f5f8010618e078.txt</a></p>
     */
    @NameInMap("internal_url")
    public String internalUrl;

    /**
     * <p>The size of the file. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("size")
    public Long size;

    /**
     * <p>The download URL of a file that is downloaded over the Internet.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://data.aliyunpds.com/hz22%2F5d79219b0aa9a7c995a94a96993ba3205cd91c5a%2F5d79219bf3261a5d38744da0834ed489b677a27a?Expires=xxxOSSAccessKeyId=xxx&Signature=xxx&response-content-disposition=attachment%3Bfilename%3DtBiZAoJPC2c8b13450eda4292b7f5f8010618e078.txt">https://data.aliyunpds.com/hz22%2F5d79219b0aa9a7c995a94a96993ba3205cd91c5a%2F5d79219bf3261a5d38744da0834ed489b677a27a?Expires=xxxOSSAccessKeyId=xxx&amp;Signature=xxx&amp;response-content-disposition=attachment%3Bfilename%3DtBiZAoJPC2c8b13450eda4292b7f5f8010618e078.txt</a></p>
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
