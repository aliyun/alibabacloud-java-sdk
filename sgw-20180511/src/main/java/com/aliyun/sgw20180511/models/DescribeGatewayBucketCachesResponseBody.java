// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewayBucketCachesResponseBody extends TeaModel {
    @NameInMap("BucketCaches")
    public DescribeGatewayBucketCachesResponseBodyBucketCaches bucketCaches;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeGatewayBucketCachesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayBucketCachesResponseBody self = new DescribeGatewayBucketCachesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayBucketCachesResponseBody setBucketCaches(DescribeGatewayBucketCachesResponseBodyBucketCaches bucketCaches) {
        this.bucketCaches = bucketCaches;
        return this;
    }
    public DescribeGatewayBucketCachesResponseBodyBucketCaches getBucketCaches() {
        return this.bucketCaches;
    }

    public DescribeGatewayBucketCachesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeGatewayBucketCachesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeGatewayBucketCachesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeGatewayBucketCachesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeGatewayBucketCachesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGatewayBucketCachesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeGatewayBucketCachesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeGatewayBucketCachesResponseBodyBucketCachesBucketCache extends TeaModel {
        @NameInMap("BucketName")
        public String bucketName;

        @NameInMap("CacheMode")
        public String cacheMode;

        @NameInMap("CacheStats")
        public String cacheStats;

        @NameInMap("Category")
        public String category;

        @NameInMap("GatewayId")
        public String gatewayId;

        @NameInMap("GatewayName")
        public String gatewayName;

        @NameInMap("Location")
        public String location;

        @NameInMap("MountPoint")
        public String mountPoint;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ShareName")
        public String shareName;

        @NameInMap("Type")
        public String type;

        @NameInMap("VpcCidr")
        public String vpcCidr;

        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeGatewayBucketCachesResponseBodyBucketCachesBucketCache build(java.util.Map<String, ?> map) throws Exception {
            DescribeGatewayBucketCachesResponseBodyBucketCachesBucketCache self = new DescribeGatewayBucketCachesResponseBodyBucketCachesBucketCache();
            return TeaModel.build(map, self);
        }

        public DescribeGatewayBucketCachesResponseBodyBucketCachesBucketCache setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public DescribeGatewayBucketCachesResponseBodyBucketCachesBucketCache setCacheMode(String cacheMode) {
            this.cacheMode = cacheMode;
            return this;
        }
        public String getCacheMode() {
            return this.cacheMode;
        }

        public DescribeGatewayBucketCachesResponseBodyBucketCachesBucketCache setCacheStats(String cacheStats) {
            this.cacheStats = cacheStats;
            return this;
        }
        public String getCacheStats() {
            return this.cacheStats;
        }

        public DescribeGatewayBucketCachesResponseBodyBucketCachesBucketCache setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeGatewayBucketCachesResponseBodyBucketCachesBucketCache setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public DescribeGatewayBucketCachesResponseBodyBucketCachesBucketCache setGatewayName(String gatewayName) {
            this.gatewayName = gatewayName;
            return this;
        }
        public String getGatewayName() {
            return this.gatewayName;
        }

        public DescribeGatewayBucketCachesResponseBodyBucketCachesBucketCache setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public DescribeGatewayBucketCachesResponseBodyBucketCachesBucketCache setMountPoint(String mountPoint) {
            this.mountPoint = mountPoint;
            return this;
        }
        public String getMountPoint() {
            return this.mountPoint;
        }

        public DescribeGatewayBucketCachesResponseBodyBucketCachesBucketCache setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeGatewayBucketCachesResponseBodyBucketCachesBucketCache setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeGatewayBucketCachesResponseBodyBucketCachesBucketCache setShareName(String shareName) {
            this.shareName = shareName;
            return this;
        }
        public String getShareName() {
            return this.shareName;
        }

        public DescribeGatewayBucketCachesResponseBodyBucketCachesBucketCache setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeGatewayBucketCachesResponseBodyBucketCachesBucketCache setVpcCidr(String vpcCidr) {
            this.vpcCidr = vpcCidr;
            return this;
        }
        public String getVpcCidr() {
            return this.vpcCidr;
        }

        public DescribeGatewayBucketCachesResponseBodyBucketCachesBucketCache setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class DescribeGatewayBucketCachesResponseBodyBucketCaches extends TeaModel {
        @NameInMap("BucketCache")
        public java.util.List<DescribeGatewayBucketCachesResponseBodyBucketCachesBucketCache> bucketCache;

        public static DescribeGatewayBucketCachesResponseBodyBucketCaches build(java.util.Map<String, ?> map) throws Exception {
            DescribeGatewayBucketCachesResponseBodyBucketCaches self = new DescribeGatewayBucketCachesResponseBodyBucketCaches();
            return TeaModel.build(map, self);
        }

        public DescribeGatewayBucketCachesResponseBodyBucketCaches setBucketCache(java.util.List<DescribeGatewayBucketCachesResponseBodyBucketCachesBucketCache> bucketCache) {
            this.bucketCache = bucketCache;
            return this;
        }
        public java.util.List<DescribeGatewayBucketCachesResponseBodyBucketCachesBucketCache> getBucketCache() {
            return this.bucketCache;
        }

    }

}
