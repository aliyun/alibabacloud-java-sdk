// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class SimpleStreamInfo extends TeaModel {
    @NameInMap("content_hash")
    public String contentHash;

    @NameInMap("content_hash_name")
    public String contentHashName;

    @NameInMap("crc64_hash")
    public String crc64Hash;

    @NameInMap("download_url")
    public String downloadUrl;

    @NameInMap("size")
    public Long size;

    @NameInMap("thumbnail")
    public String thumbnail;

    @NameInMap("url")
    public String url;

    public static SimpleStreamInfo build(java.util.Map<String, ?> map) throws Exception {
        SimpleStreamInfo self = new SimpleStreamInfo();
        return TeaModel.build(map, self);
    }

    public SimpleStreamInfo setContentHash(String contentHash) {
        this.contentHash = contentHash;
        return this;
    }
    public String getContentHash() {
        return this.contentHash;
    }

    public SimpleStreamInfo setContentHashName(String contentHashName) {
        this.contentHashName = contentHashName;
        return this;
    }
    public String getContentHashName() {
        return this.contentHashName;
    }

    public SimpleStreamInfo setCrc64Hash(String crc64Hash) {
        this.crc64Hash = crc64Hash;
        return this;
    }
    public String getCrc64Hash() {
        return this.crc64Hash;
    }

    public SimpleStreamInfo setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public SimpleStreamInfo setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public SimpleStreamInfo setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }
    public String getThumbnail() {
        return this.thumbnail;
    }

    public SimpleStreamInfo setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
