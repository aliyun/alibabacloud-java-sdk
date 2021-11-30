// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class ListObjectVersionsRequest extends TeaModel {
    // The character used to group objects by name
    @NameInMap("delimiter")
    public String delimiter;

    // The encoding type of the object name in the response
    @NameInMap("encoding-type")
    public String encodingType;

    // The name of the object from which the list operation begins
    @NameInMap("key-marker")
    public String keyMarker;

    // The maximum number of objects to return
    @NameInMap("max-keys")
    public Long maxKeys;

    // The prefix that the returned object names must contain
    @NameInMap("prefix")
    public String prefix;

    // The version id of the object from which the list operation begins
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
