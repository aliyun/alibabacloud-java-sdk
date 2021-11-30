// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class GetBucketResponseBody extends TeaModel {
    // Objects whose names contain the same string that ranges from the prefix to the next occurrence of the delimiter are grouped as a single result element
    @NameInMap("CommonPrefixes")
    public java.util.List<CommonPrefix> commonPrefixes;

    // The container that stores the returned object metadata
    @NameInMap("Contents")
    public java.util.List<ObjectSummary> contents;

    // The character used to group objects by name
    @NameInMap("Delimiter")
    public String delimiter;

    // Indicates whether the returned results are truncated
    @NameInMap("IsTruncated")
    public Boolean isTruncated;

    // The name of the object from which the list operation begins
    @NameInMap("Marker")
    public String marker;

    // The maximum number of returned objects in the response
    @NameInMap("MaxKeys")
    public Integer maxKeys;

    // The bucket name
    @NameInMap("Name")
    public String name;

    // The prefix that the names of returned objects contain
    @NameInMap("Prefix")
    public String prefix;

    public static GetBucketResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBucketResponseBody self = new GetBucketResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBucketResponseBody setCommonPrefixes(java.util.List<CommonPrefix> commonPrefixes) {
        this.commonPrefixes = commonPrefixes;
        return this;
    }
    public java.util.List<CommonPrefix> getCommonPrefixes() {
        return this.commonPrefixes;
    }

    public GetBucketResponseBody setContents(java.util.List<ObjectSummary> contents) {
        this.contents = contents;
        return this;
    }
    public java.util.List<ObjectSummary> getContents() {
        return this.contents;
    }

    public GetBucketResponseBody setDelimiter(String delimiter) {
        this.delimiter = delimiter;
        return this;
    }
    public String getDelimiter() {
        return this.delimiter;
    }

    public GetBucketResponseBody setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    public GetBucketResponseBody setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public GetBucketResponseBody setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }
    public Integer getMaxKeys() {
        return this.maxKeys;
    }

    public GetBucketResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetBucketResponseBody setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    public String getPrefix() {
        return this.prefix;
    }

}
