// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeSubscriptionPriceRequest extends TeaModel {
    @NameInMap("CacheCloudEfficiencySize")
    public Long cacheCloudEfficiencySize;

    @NameInMap("CacheESSDPl1Size")
    public Long cacheESSDPl1Size;

    @NameInMap("CacheSSDSize")
    public Long cacheSSDSize;

    @NameInMap("GatewayClass")
    public String gatewayClass;

    @NameInMap("PeriodQuantity")
    public Integer periodQuantity;

    @NameInMap("PeriodUnit")
    public String periodUnit;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeSubscriptionPriceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSubscriptionPriceRequest self = new DescribeSubscriptionPriceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSubscriptionPriceRequest setCacheCloudEfficiencySize(Long cacheCloudEfficiencySize) {
        this.cacheCloudEfficiencySize = cacheCloudEfficiencySize;
        return this;
    }
    public Long getCacheCloudEfficiencySize() {
        return this.cacheCloudEfficiencySize;
    }

    public DescribeSubscriptionPriceRequest setCacheESSDPl1Size(Long cacheESSDPl1Size) {
        this.cacheESSDPl1Size = cacheESSDPl1Size;
        return this;
    }
    public Long getCacheESSDPl1Size() {
        return this.cacheESSDPl1Size;
    }

    public DescribeSubscriptionPriceRequest setCacheSSDSize(Long cacheSSDSize) {
        this.cacheSSDSize = cacheSSDSize;
        return this;
    }
    public Long getCacheSSDSize() {
        return this.cacheSSDSize;
    }

    public DescribeSubscriptionPriceRequest setGatewayClass(String gatewayClass) {
        this.gatewayClass = gatewayClass;
        return this;
    }
    public String getGatewayClass() {
        return this.gatewayClass;
    }

    public DescribeSubscriptionPriceRequest setPeriodQuantity(Integer periodQuantity) {
        this.periodQuantity = periodQuantity;
        return this;
    }
    public Integer getPeriodQuantity() {
        return this.periodQuantity;
    }

    public DescribeSubscriptionPriceRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public DescribeSubscriptionPriceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSubscriptionPriceRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
