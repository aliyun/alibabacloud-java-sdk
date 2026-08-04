// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class CacheService extends TeaModel {
    /**
     * <p>Information about each cache node in the service.</p>
     */
    @NameInMap("CacheInfos")
    public java.util.List<CacheInfo> cacheInfos;

    /**
     * <p>The unique identifier of the CacheService.</p>
     */
    @NameInMap("CacheServiceId")
    public String cacheServiceId;

    /**
     * <p>The ID of the PAI cluster where the CacheService is deployed.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The user or entity that created the resource.</p>
     */
    @NameInMap("CreatedBy")
    public String createdBy;

    /**
     * <p>The time (in UTC, ISO 8601 format) when the CacheService was created.</p>
     */
    @NameInMap("GmtCreated")
    public String gmtCreated;

    /**
     * <p>Indicates whether the CacheService is sharded across multiple nodes.</p>
     */
    @NameInMap("IsSharded")
    public Boolean isSharded;

    /**
     * <p>The network type of the CacheService. For example, <code>VPC</code>.</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    /**
     * <p>The ID of the resource quota associated with the CacheService.</p>
     */
    @NameInMap("QuotaId")
    public String quotaId;

    /**
     * <p>The current status of the CacheService. For example: <code>Creating</code>, <code>Available</code>, or <code>Deleting</code>.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Indicates whether the CacheService supports RDMA.</p>
     */
    @NameInMap("SupportRDMA")
    public String supportRDMA;

    /**
     * <p>A list of quota IDs for clients that can connect to this CacheService.</p>
     */
    @NameInMap("SupportedClientQuotaIds")
    public java.util.List<String> supportedClientQuotaIds;

    /**
     * <p>The ID of the tenant that owns the CacheService.</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    /**
     * <p>The ID of the user associated with the CacheService.</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>The configuration of the user\&quot;s VPC where the CacheService is deployed.</p>
     */
    @NameInMap("UserVpc")
    public UserVpc userVpc;

    public static CacheService build(java.util.Map<String, ?> map) throws Exception {
        CacheService self = new CacheService();
        return TeaModel.build(map, self);
    }

    public CacheService setCacheInfos(java.util.List<CacheInfo> cacheInfos) {
        this.cacheInfos = cacheInfos;
        return this;
    }
    public java.util.List<CacheInfo> getCacheInfos() {
        return this.cacheInfos;
    }

    public CacheService setCacheServiceId(String cacheServiceId) {
        this.cacheServiceId = cacheServiceId;
        return this;
    }
    public String getCacheServiceId() {
        return this.cacheServiceId;
    }

    public CacheService setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CacheService setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    public String getCreatedBy() {
        return this.createdBy;
    }

    public CacheService setGmtCreated(String gmtCreated) {
        this.gmtCreated = gmtCreated;
        return this;
    }
    public String getGmtCreated() {
        return this.gmtCreated;
    }

    public CacheService setIsSharded(Boolean isSharded) {
        this.isSharded = isSharded;
        return this;
    }
    public Boolean getIsSharded() {
        return this.isSharded;
    }

    public CacheService setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public CacheService setQuotaId(String quotaId) {
        this.quotaId = quotaId;
        return this;
    }
    public String getQuotaId() {
        return this.quotaId;
    }

    public CacheService setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CacheService setSupportRDMA(String supportRDMA) {
        this.supportRDMA = supportRDMA;
        return this;
    }
    public String getSupportRDMA() {
        return this.supportRDMA;
    }

    public CacheService setSupportedClientQuotaIds(java.util.List<String> supportedClientQuotaIds) {
        this.supportedClientQuotaIds = supportedClientQuotaIds;
        return this;
    }
    public java.util.List<String> getSupportedClientQuotaIds() {
        return this.supportedClientQuotaIds;
    }

    public CacheService setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CacheService setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public CacheService setUserVpc(UserVpc userVpc) {
        this.userVpc = userVpc;
        return this;
    }
    public UserVpc getUserVpc() {
        return this.userVpc;
    }

}
