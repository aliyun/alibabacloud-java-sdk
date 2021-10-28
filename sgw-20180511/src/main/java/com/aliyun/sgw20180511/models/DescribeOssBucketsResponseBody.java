// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeOssBucketsResponseBody extends TeaModel {
    @NameInMap("Buckets")
    public DescribeOssBucketsResponseBodyBuckets buckets;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeOssBucketsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssBucketsResponseBody self = new DescribeOssBucketsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOssBucketsResponseBody setBuckets(DescribeOssBucketsResponseBodyBuckets buckets) {
        this.buckets = buckets;
        return this;
    }
    public DescribeOssBucketsResponseBodyBuckets getBuckets() {
        return this.buckets;
    }

    public DescribeOssBucketsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeOssBucketsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeOssBucketsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOssBucketsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeOssBucketsResponseBodyBucketsBucket extends TeaModel {
        @NameInMap("Name")
        public String name;

        public static DescribeOssBucketsResponseBodyBucketsBucket build(java.util.Map<String, ?> map) throws Exception {
            DescribeOssBucketsResponseBodyBucketsBucket self = new DescribeOssBucketsResponseBodyBucketsBucket();
            return TeaModel.build(map, self);
        }

        public DescribeOssBucketsResponseBodyBucketsBucket setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeOssBucketsResponseBodyBuckets extends TeaModel {
        @NameInMap("Bucket")
        public java.util.List<DescribeOssBucketsResponseBodyBucketsBucket> bucket;

        public static DescribeOssBucketsResponseBodyBuckets build(java.util.Map<String, ?> map) throws Exception {
            DescribeOssBucketsResponseBodyBuckets self = new DescribeOssBucketsResponseBodyBuckets();
            return TeaModel.build(map, self);
        }

        public DescribeOssBucketsResponseBodyBuckets setBucket(java.util.List<DescribeOssBucketsResponseBodyBucketsBucket> bucket) {
            this.bucket = bucket;
            return this;
        }
        public java.util.List<DescribeOssBucketsResponseBodyBucketsBucket> getBucket() {
            return this.bucket;
        }

    }

}
