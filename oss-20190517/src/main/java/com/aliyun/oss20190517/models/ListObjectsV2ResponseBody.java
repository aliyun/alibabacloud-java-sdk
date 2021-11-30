// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class ListObjectsV2ResponseBody extends TeaModel {
    // Objects whose names contain the same string that ranges from the prefix to the next occurrence of the delimiter are grouped as a single result element
    @NameInMap("CommonPrefixes")
    public java.util.List<CommonPrefix> commonPrefixes;

    // The container that stores the versions of objects except for delete markers
    @NameInMap("Contents")
    public java.util.List<ObjectSummary> contents;

    @NameInMap("ContinuationToken")
    public String continuationToken;

    @NameInMap("Delimiter")
    public String delimiter;

    @NameInMap("EncodingType")
    public String encodingType;

    // Indicates whether the returned results are truncated
    @NameInMap("IsTruncated")
    public Boolean isTruncated;

    @NameInMap("KeyCount")
    public Integer keyCount;

    // The maximum number of returned objects in the response
    @NameInMap("MaxKeys")
    public Integer maxKeys;

    // The bucket name
    @NameInMap("Name")
    public String name;

    @NameInMap("NextContinuationToken")
    public String nextContinuationToken;

    // The prefix that the names of returned objects must contain
    @NameInMap("Prefix")
    public String prefix;

    @NameInMap("StartAfter")
    public String startAfter;

    public static ListObjectsV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListObjectsV2ResponseBody self = new ListObjectsV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public ListObjectsV2ResponseBody setCommonPrefixes(java.util.List<CommonPrefix> commonPrefixes) {
        this.commonPrefixes = commonPrefixes;
        return this;
    }
    public java.util.List<CommonPrefix> getCommonPrefixes() {
        return this.commonPrefixes;
    }

    public ListObjectsV2ResponseBody setContents(java.util.List<ObjectSummary> contents) {
        this.contents = contents;
        return this;
    }
    public java.util.List<ObjectSummary> getContents() {
        return this.contents;
    }

    public ListObjectsV2ResponseBody setContinuationToken(String continuationToken) {
        this.continuationToken = continuationToken;
        return this;
    }
    public String getContinuationToken() {
        return this.continuationToken;
    }

    public ListObjectsV2ResponseBody setDelimiter(String delimiter) {
        this.delimiter = delimiter;
        return this;
    }
    public String getDelimiter() {
        return this.delimiter;
    }

    public ListObjectsV2ResponseBody setEncodingType(String encodingType) {
        this.encodingType = encodingType;
        return this;
    }
    public String getEncodingType() {
        return this.encodingType;
    }

    public ListObjectsV2ResponseBody setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    public ListObjectsV2ResponseBody setKeyCount(Integer keyCount) {
        this.keyCount = keyCount;
        return this;
    }
    public Integer getKeyCount() {
        return this.keyCount;
    }

    public ListObjectsV2ResponseBody setMaxKeys(Integer maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }
    public Integer getMaxKeys() {
        return this.maxKeys;
    }

    public ListObjectsV2ResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListObjectsV2ResponseBody setNextContinuationToken(String nextContinuationToken) {
        this.nextContinuationToken = nextContinuationToken;
        return this;
    }
    public String getNextContinuationToken() {
        return this.nextContinuationToken;
    }

    public ListObjectsV2ResponseBody setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    public String getPrefix() {
        return this.prefix;
    }

    public ListObjectsV2ResponseBody setStartAfter(String startAfter) {
        this.startAfter = startAfter;
        return this;
    }
    public String getStartAfter() {
        return this.startAfter;
    }

}
