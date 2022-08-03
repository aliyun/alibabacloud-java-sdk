// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class ListObjectVersionsResponseBody extends TeaModel {
    @NameInMap("CommonPrefixes")
    public java.util.List<CommonPrefix> commonPrefixes;

    @NameInMap("DeleteMarker")
    public java.util.List<DeleteMarkerEntry> deleteMarkers;

    @NameInMap("Delimiter")
    public String delimiter;

    @NameInMap("EncodingType")
    public String encodingType;

    @NameInMap("IsTruncated")
    public Boolean isTruncated;

    @NameInMap("KeyMarker")
    public String keyMarker;

    @NameInMap("MaxKeys")
    public Long maxKeys;

    @NameInMap("Name")
    public String name;

    @NameInMap("NextKeyMarker")
    public String nextKeyMarker;

    @NameInMap("NextVersionIdMarker")
    public String nextVersionIdMarker;

    @NameInMap("Prefix")
    public String prefix;

    @NameInMap("Version")
    public java.util.List<ObjectVersion> versions;

    @NameInMap("VersionIdMarker")
    public String versionIdMarker;

    public static ListObjectVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListObjectVersionsResponseBody self = new ListObjectVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListObjectVersionsResponseBody setCommonPrefixes(java.util.List<CommonPrefix> commonPrefixes) {
        this.commonPrefixes = commonPrefixes;
        return this;
    }
    public java.util.List<CommonPrefix> getCommonPrefixes() {
        return this.commonPrefixes;
    }

    public ListObjectVersionsResponseBody setDeleteMarkers(java.util.List<DeleteMarkerEntry> deleteMarkers) {
        this.deleteMarkers = deleteMarkers;
        return this;
    }
    public java.util.List<DeleteMarkerEntry> getDeleteMarkers() {
        return this.deleteMarkers;
    }

    public ListObjectVersionsResponseBody setDelimiter(String delimiter) {
        this.delimiter = delimiter;
        return this;
    }
    public String getDelimiter() {
        return this.delimiter;
    }

    public ListObjectVersionsResponseBody setEncodingType(String encodingType) {
        this.encodingType = encodingType;
        return this;
    }
    public String getEncodingType() {
        return this.encodingType;
    }

    public ListObjectVersionsResponseBody setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    public ListObjectVersionsResponseBody setKeyMarker(String keyMarker) {
        this.keyMarker = keyMarker;
        return this;
    }
    public String getKeyMarker() {
        return this.keyMarker;
    }

    public ListObjectVersionsResponseBody setMaxKeys(Long maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }
    public Long getMaxKeys() {
        return this.maxKeys;
    }

    public ListObjectVersionsResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListObjectVersionsResponseBody setNextKeyMarker(String nextKeyMarker) {
        this.nextKeyMarker = nextKeyMarker;
        return this;
    }
    public String getNextKeyMarker() {
        return this.nextKeyMarker;
    }

    public ListObjectVersionsResponseBody setNextVersionIdMarker(String nextVersionIdMarker) {
        this.nextVersionIdMarker = nextVersionIdMarker;
        return this;
    }
    public String getNextVersionIdMarker() {
        return this.nextVersionIdMarker;
    }

    public ListObjectVersionsResponseBody setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    public String getPrefix() {
        return this.prefix;
    }

    public ListObjectVersionsResponseBody setVersions(java.util.List<ObjectVersion> versions) {
        this.versions = versions;
        return this;
    }
    public java.util.List<ObjectVersion> getVersions() {
        return this.versions;
    }

    public ListObjectVersionsResponseBody setVersionIdMarker(String versionIdMarker) {
        this.versionIdMarker = versionIdMarker;
        return this;
    }
    public String getVersionIdMarker() {
        return this.versionIdMarker;
    }

}
