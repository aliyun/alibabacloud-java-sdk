// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewayCachesResponseBody extends TeaModel {
    @NameInMap("Caches")
    public DescribeGatewayCachesResponseBodyCaches caches;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeGatewayCachesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayCachesResponseBody self = new DescribeGatewayCachesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayCachesResponseBody setCaches(DescribeGatewayCachesResponseBodyCaches caches) {
        this.caches = caches;
        return this;
    }
    public DescribeGatewayCachesResponseBodyCaches getCaches() {
        return this.caches;
    }

    public DescribeGatewayCachesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeGatewayCachesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeGatewayCachesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGatewayCachesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeGatewayCachesResponseBodyCachesCache extends TeaModel {
        @NameInMap("BuyURL")
        public String buyURL;

        @NameInMap("CacheId")
        public String cacheId;

        @NameInMap("CacheType")
        public String cacheType;

        @NameInMap("ExpireStatus")
        public Integer expireStatus;

        @NameInMap("ExpiredTime")
        public Long expiredTime;

        /**
         * <p>IOPS。</p>
         */
        @NameInMap("Iops")
        public Long iops;

        @NameInMap("IsDirectExpand")
        public String isDirectExpand;

        @NameInMap("IsNoPartition")
        public Boolean isNoPartition;

        @NameInMap("IsUsed")
        public Boolean isUsed;

        @NameInMap("LocalFilePath")
        public String localFilePath;

        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        @NameInMap("RenewURL")
        public String renewURL;

        @NameInMap("SizeInGB")
        public Long sizeInGB;

        @NameInMap("SubscriptionInstanceId")
        public String subscriptionInstanceId;

        public static DescribeGatewayCachesResponseBodyCachesCache build(java.util.Map<String, ?> map) throws Exception {
            DescribeGatewayCachesResponseBodyCachesCache self = new DescribeGatewayCachesResponseBodyCachesCache();
            return TeaModel.build(map, self);
        }

        public DescribeGatewayCachesResponseBodyCachesCache setBuyURL(String buyURL) {
            this.buyURL = buyURL;
            return this;
        }
        public String getBuyURL() {
            return this.buyURL;
        }

        public DescribeGatewayCachesResponseBodyCachesCache setCacheId(String cacheId) {
            this.cacheId = cacheId;
            return this;
        }
        public String getCacheId() {
            return this.cacheId;
        }

        public DescribeGatewayCachesResponseBodyCachesCache setCacheType(String cacheType) {
            this.cacheType = cacheType;
            return this;
        }
        public String getCacheType() {
            return this.cacheType;
        }

        public DescribeGatewayCachesResponseBodyCachesCache setExpireStatus(Integer expireStatus) {
            this.expireStatus = expireStatus;
            return this;
        }
        public Integer getExpireStatus() {
            return this.expireStatus;
        }

        public DescribeGatewayCachesResponseBodyCachesCache setExpiredTime(Long expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public Long getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeGatewayCachesResponseBodyCachesCache setIops(Long iops) {
            this.iops = iops;
            return this;
        }
        public Long getIops() {
            return this.iops;
        }

        public DescribeGatewayCachesResponseBodyCachesCache setIsDirectExpand(String isDirectExpand) {
            this.isDirectExpand = isDirectExpand;
            return this;
        }
        public String getIsDirectExpand() {
            return this.isDirectExpand;
        }

        public DescribeGatewayCachesResponseBodyCachesCache setIsNoPartition(Boolean isNoPartition) {
            this.isNoPartition = isNoPartition;
            return this;
        }
        public Boolean getIsNoPartition() {
            return this.isNoPartition;
        }

        public DescribeGatewayCachesResponseBodyCachesCache setIsUsed(Boolean isUsed) {
            this.isUsed = isUsed;
            return this;
        }
        public Boolean getIsUsed() {
            return this.isUsed;
        }

        public DescribeGatewayCachesResponseBodyCachesCache setLocalFilePath(String localFilePath) {
            this.localFilePath = localFilePath;
            return this;
        }
        public String getLocalFilePath() {
            return this.localFilePath;
        }

        public DescribeGatewayCachesResponseBodyCachesCache setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public DescribeGatewayCachesResponseBodyCachesCache setRenewURL(String renewURL) {
            this.renewURL = renewURL;
            return this;
        }
        public String getRenewURL() {
            return this.renewURL;
        }

        public DescribeGatewayCachesResponseBodyCachesCache setSizeInGB(Long sizeInGB) {
            this.sizeInGB = sizeInGB;
            return this;
        }
        public Long getSizeInGB() {
            return this.sizeInGB;
        }

        public DescribeGatewayCachesResponseBodyCachesCache setSubscriptionInstanceId(String subscriptionInstanceId) {
            this.subscriptionInstanceId = subscriptionInstanceId;
            return this;
        }
        public String getSubscriptionInstanceId() {
            return this.subscriptionInstanceId;
        }

    }

    public static class DescribeGatewayCachesResponseBodyCaches extends TeaModel {
        @NameInMap("Cache")
        public java.util.List<DescribeGatewayCachesResponseBodyCachesCache> cache;

        public static DescribeGatewayCachesResponseBodyCaches build(java.util.Map<String, ?> map) throws Exception {
            DescribeGatewayCachesResponseBodyCaches self = new DescribeGatewayCachesResponseBodyCaches();
            return TeaModel.build(map, self);
        }

        public DescribeGatewayCachesResponseBodyCaches setCache(java.util.List<DescribeGatewayCachesResponseBodyCachesCache> cache) {
            this.cache = cache;
            return this;
        }
        public java.util.List<DescribeGatewayCachesResponseBodyCachesCache> getCache() {
            return this.cache;
        }

    }

}
