// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeSharesBucketInfoForExpressSyncResponseBody extends TeaModel {
    @NameInMap("BucketInfos")
    public DescribeSharesBucketInfoForExpressSyncResponseBodyBucketInfos bucketInfos;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeSharesBucketInfoForExpressSyncResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSharesBucketInfoForExpressSyncResponseBody self = new DescribeSharesBucketInfoForExpressSyncResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSharesBucketInfoForExpressSyncResponseBody setBucketInfos(DescribeSharesBucketInfoForExpressSyncResponseBodyBucketInfos bucketInfos) {
        this.bucketInfos = bucketInfos;
        return this;
    }
    public DescribeSharesBucketInfoForExpressSyncResponseBodyBucketInfos getBucketInfos() {
        return this.bucketInfos;
    }

    public DescribeSharesBucketInfoForExpressSyncResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeSharesBucketInfoForExpressSyncResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSharesBucketInfoForExpressSyncResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSharesBucketInfoForExpressSyncResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeSharesBucketInfoForExpressSyncResponseBodyBucketInfosBucketInfo extends TeaModel {
        @NameInMap("BucketName")
        public String bucketName;

        @NameInMap("BucketPrefix")
        public String bucketPrefix;

        @NameInMap("BucketRegion")
        public String bucketRegion;

        public static DescribeSharesBucketInfoForExpressSyncResponseBodyBucketInfosBucketInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeSharesBucketInfoForExpressSyncResponseBodyBucketInfosBucketInfo self = new DescribeSharesBucketInfoForExpressSyncResponseBodyBucketInfosBucketInfo();
            return TeaModel.build(map, self);
        }

        public DescribeSharesBucketInfoForExpressSyncResponseBodyBucketInfosBucketInfo setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public DescribeSharesBucketInfoForExpressSyncResponseBodyBucketInfosBucketInfo setBucketPrefix(String bucketPrefix) {
            this.bucketPrefix = bucketPrefix;
            return this;
        }
        public String getBucketPrefix() {
            return this.bucketPrefix;
        }

        public DescribeSharesBucketInfoForExpressSyncResponseBodyBucketInfosBucketInfo setBucketRegion(String bucketRegion) {
            this.bucketRegion = bucketRegion;
            return this;
        }
        public String getBucketRegion() {
            return this.bucketRegion;
        }

    }

    public static class DescribeSharesBucketInfoForExpressSyncResponseBodyBucketInfos extends TeaModel {
        @NameInMap("BucketInfo")
        public java.util.List<DescribeSharesBucketInfoForExpressSyncResponseBodyBucketInfosBucketInfo> bucketInfo;

        public static DescribeSharesBucketInfoForExpressSyncResponseBodyBucketInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeSharesBucketInfoForExpressSyncResponseBodyBucketInfos self = new DescribeSharesBucketInfoForExpressSyncResponseBodyBucketInfos();
            return TeaModel.build(map, self);
        }

        public DescribeSharesBucketInfoForExpressSyncResponseBodyBucketInfos setBucketInfo(java.util.List<DescribeSharesBucketInfoForExpressSyncResponseBodyBucketInfosBucketInfo> bucketInfo) {
            this.bucketInfo = bucketInfo;
            return this;
        }
        public java.util.List<DescribeSharesBucketInfoForExpressSyncResponseBodyBucketInfosBucketInfo> getBucketInfo() {
            return this.bucketInfo;
        }

    }

}
