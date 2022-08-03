// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class ListObjectVersionsRequest extends TeaModel {
    @NameInMap("delimiter")
    public String delimiter;

    @NameInMap("encoding-type")
    public String encodingType;

    @NameInMap("key-marker")
    public String keyMarker;

    @NameInMap("max-keys")
    public Long maxKeys;

    @NameInMap("prefix")
    public String prefix;

    @NameInMap("version-id-marker")
    public String versionIdMarker;

    public static ListObjectVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListObjectVersionsRequest self = new ListObjectVersionsRequest();
        return TeaModel.build(map, self);
    }

    public ListObjectVersionsRequest setDelimiter(String delimiter) {
        this.delimiter = delimiter;
        return this;
    }
    public String getDelimiter() {
        return this.delimiter;
    }

    public ListObjectVersionsRequest setEncodingType(String encodingType) {
        this.encodingType = encodingType;
        return this;
    }
    public String getEncodingType() {
        return this.encodingType;
    }

    public ListObjectVersionsRequest setKeyMarker(String keyMarker) {
        this.keyMarker = keyMarker;
        return this;
    }
    public String getKeyMarker() {
        return this.keyMarker;
    }

    public ListObjectVersionsRequest setMaxKeys(Long maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }
    public Long getMaxKeys() {
        return this.maxKeys;
    }

    public ListObjectVersionsRequest setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    public String getPrefix() {
        return this.prefix;
    }

    public ListObjectVersionsRequest setVersionIdMarker(String versionIdMarker) {
        this.versionIdMarker = versionIdMarker;
        return this;
    }
    public String getVersionIdMarker() {
        return this.versionIdMarker;
    }

}
