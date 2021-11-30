// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class ListObjectsV2Request extends TeaModel {
    @NameInMap("continuation-token")
    public String continuationToken;

    // The character used to group objects by name
    @NameInMap("delimiter")
    public String delimiter;

    // The encoding type of the object name in the response
    @NameInMap("encoding-type")
    public String encodingType;

    @NameInMap("fetch-owner")
    public Boolean fetchOwner;

    // The maximum number of objects to return
    @NameInMap("max-keys")
    public Long maxKeys;

    // The prefix that the returned object names must contain
    @NameInMap("prefix")
    public String prefix;

    @NameInMap("start-after")
    public String startAfter;

    public static ListObjectsV2Request build(java.util.Map<String, ?> map) throws Exception {
        ListObjectsV2Request self = new ListObjectsV2Request();
        return TeaModel.build(map, self);
    }

    public ListObjectsV2Request setContinuationToken(String continuationToken) {
        this.continuationToken = continuationToken;
        return this;
    }
    public String getContinuationToken() {
        return this.continuationToken;
    }

    public ListObjectsV2Request setDelimiter(String delimiter) {
        this.delimiter = delimiter;
        return this;
    }
    public String getDelimiter() {
        return this.delimiter;
    }

    public ListObjectsV2Request setEncodingType(String encodingType) {
        this.encodingType = encodingType;
        return this;
    }
    public String getEncodingType() {
        return this.encodingType;
    }

    public ListObjectsV2Request setFetchOwner(Boolean fetchOwner) {
        this.fetchOwner = fetchOwner;
        return this;
    }
    public Boolean getFetchOwner() {
        return this.fetchOwner;
    }

    public ListObjectsV2Request setMaxKeys(Long maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }
    public Long getMaxKeys() {
        return this.maxKeys;
    }

    public ListObjectsV2Request setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    public String getPrefix() {
        return this.prefix;
    }

    public ListObjectsV2Request setStartAfter(String startAfter) {
        this.startAfter = startAfter;
        return this;
    }
    public String getStartAfter() {
        return this.startAfter;
    }

}
