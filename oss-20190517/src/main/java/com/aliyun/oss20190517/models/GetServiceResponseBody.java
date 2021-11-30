// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class GetServiceResponseBody extends TeaModel {
    @NameInMap("Buckets")
    public GetServiceResponseBodyBuckets buckets;

    @NameInMap("Owner")
    public Owner owner;

    public static GetServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceResponseBody self = new GetServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceResponseBody setBuckets(GetServiceResponseBodyBuckets buckets) {
        this.buckets = buckets;
        return this;
    }
    public GetServiceResponseBodyBuckets getBuckets() {
        return this.buckets;
    }

    public GetServiceResponseBody setOwner(Owner owner) {
        this.owner = owner;
        return this;
    }
    public Owner getOwner() {
        return this.owner;
    }

    public static class GetServiceResponseBodyBuckets extends TeaModel {
        @NameInMap("Bucket")
        public java.util.List<Bucket> buckets;

        public static GetServiceResponseBodyBuckets build(java.util.Map<String, ?> map) throws Exception {
            GetServiceResponseBodyBuckets self = new GetServiceResponseBodyBuckets();
            return TeaModel.build(map, self);
        }

        public GetServiceResponseBodyBuckets setBuckets(java.util.List<Bucket> buckets) {
            this.buckets = buckets;
            return this;
        }
        public java.util.List<Bucket> getBuckets() {
            return this.buckets;
        }

    }

}
