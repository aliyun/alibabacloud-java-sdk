// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class ListBucketsResponseBody extends TeaModel {
    @NameInMap("Buckets")
    public ListBucketsResponseBodyBuckets buckets;

    @NameInMap("Owner")
    public Owner owner;

    public static ListBucketsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBucketsResponseBody self = new ListBucketsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBucketsResponseBody setBuckets(ListBucketsResponseBodyBuckets buckets) {
        this.buckets = buckets;
        return this;
    }
    public ListBucketsResponseBodyBuckets getBuckets() {
        return this.buckets;
    }

    public ListBucketsResponseBody setOwner(Owner owner) {
        this.owner = owner;
        return this;
    }
    public Owner getOwner() {
        return this.owner;
    }

    public static class ListBucketsResponseBodyBuckets extends TeaModel {
        @NameInMap("Bucket")
        public java.util.List<Bucket> buckets;

        public static ListBucketsResponseBodyBuckets build(java.util.Map<String, ?> map) throws Exception {
            ListBucketsResponseBodyBuckets self = new ListBucketsResponseBodyBuckets();
            return TeaModel.build(map, self);
        }

        public ListBucketsResponseBodyBuckets setBuckets(java.util.List<Bucket> buckets) {
            this.buckets = buckets;
            return this;
        }
        public java.util.List<Bucket> getBuckets() {
            return this.buckets;
        }

    }

}
