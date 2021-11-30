// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class ListObjectVersionsResponseBody extends TeaModel {
    // Objects whose names contain the same string that ranges from the prefix to the next occurrence of the delimiter are grouped as a single result element
    @NameInMap("CommonPrefixes")
    public java.util.List<CommonPrefix> commonPrefixes;

    // The container that stores delete markers
    @NameInMap("DeleteMarker")
    public java.util.List<DeleteMarkerEntry> deleteMarkers;

    @NameInMap("EncodingType")
    public String encodingType;

    // Indicates whether the returned results are truncated
    @NameInMap("IsTruncated")
    public Boolean isTruncated;

    // Indicates the object from which the operation starts
    @NameInMap("KeyMarker")
    public String keyMarker;

    // The maximum number of returned objects in the response
    @NameInMap("MaxKeys")
    public Long maxKeys;

    // The bucket name
    @NameInMap("Name")
    public String name;

    // The prefix that the names of returned objects must contain
    @NameInMap("Prefix")
    public String prefix;

    // The container that stores the versions of objects except for delete markers
    @NameInMap("Version")
    public java.util.List<ObjectVersion> versions;

    // This parameter is returned with KeyMarker together to indicate the version from which the operation starts
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
