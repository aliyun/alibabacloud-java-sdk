// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class ListBucketsResponseBody extends TeaModel {
    @NameInMap("buckets")
    public java.util.List<Bucket> buckets;

    @NameInMap("isTruncated")
    public Boolean isTruncated;

    @NameInMap("marker")
    public String marker;

    @NameInMap("maxKeys")
    public Long maxKeys;

    @NameInMap("nextMarker")
    public String nextMarker;

    @NameInMap("owner")
    public Owner owner;

    @NameInMap("prefix")
    public String prefix;

    public static ListBucketsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBucketsResponseBody self = new ListBucketsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBucketsResponseBody setBuckets(java.util.List<Bucket> buckets) {
        this.buckets = buckets;
        return this;
    }
    public java.util.List<Bucket> getBuckets() {
        return this.buckets;
    }

    public ListBucketsResponseBody setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    public ListBucketsResponseBody setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public ListBucketsResponseBody setMaxKeys(Long maxKeys) {
        this.maxKeys = maxKeys;
        return this;
    }
    public Long getMaxKeys() {
        return this.maxKeys;
    }

    public ListBucketsResponseBody setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
    public String getNextMarker() {
        return this.nextMarker;
    }

    public ListBucketsResponseBody setOwner(Owner owner) {
        this.owner = owner;
        return this;
    }
    public Owner getOwner() {
        return this.owner;
    }

    public ListBucketsResponseBody setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    public String getPrefix() {
        return this.prefix;
    }

}
