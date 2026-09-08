// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class CacheService extends TeaModel {
    /**
     * <p>The list of data source cache information connected to the cache service. Each element corresponds to a data source and its access port.</p>
     */
    @NameInMap("CacheInfos")
    public java.util.List<CacheInfo> cacheInfos;

    /**
     * <p>The cache service ID. This is the unique identifier of the cache service.</p>
     * 
     * <strong>example:</strong>
     * <p>cachea1b2c3d4e5f</p>
     */
    @NameInMap("CacheServiceId")
    public String cacheServiceId;

    /**
     * <p>The ID of the cluster where the cache service resides.</p>
     * 
     * <strong>example:</strong>
     * <p>c1a2b3c4d5e6f7a8b9c0d1e2f3a4b5c6</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The ID of the resource quota that created the cache service.</p>
     * 
     * <strong>example:</strong>
     * <p>quota1a2b3c4d5e6</p>
     */
    @NameInMap("CreatedBy")
    public String createdBy;

    /**
     * <p>The time when the cache service was created, in UTC in ISO 8601 format.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-08-10T03:17:31Z</p>
     */
    @NameInMap("GmtCreated")
    public String gmtCreated;

    /**
     * <p>Indicates whether the service discovery of the cache service uses shard mode.</p>
     */
    @NameInMap("IsSharded")
    public Boolean isSharded;

    /**
     * <p>The type of RDMA network interface controller used by the cache service. This parameter is returned only when SupportRDMA is set to true. Valid values:</p>
     * <ul>
     * <li>eic: EIC network interface controller.</li>
     * <li>mlx: Mellanox network interface controller.</li>
     * </ul>
     * <p>This parameter is empty when RDMA is not enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>eic</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    /**
     * <p>The ID of the resource quota to which the cache service belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>quota1a2b3c4d5e6</p>
     */
    @NameInMap("QuotaId")
    public String quotaId;

    /**
     * <p>The current status of the cache service.</p>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Indicates whether the cache service supports access through RDMA networks.</p>
     */
    @NameInMap("SupportRDMA")
    public String supportRDMA;

    /**
     * <p>The list of client quota IDs that are allowed to access the cache service.</p>
     */
    @NameInMap("SupportedClientQuotaIds")
    public java.util.List<String> supportedClientQuotaIds;

    /**
     * <p>The tenant ID to which the cache service belongs, which is the Alibaba Cloud account ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123456</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    /**
     * <p>The ID of the user who created the cache service.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789012345678</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>The VPC network information of the cache service, including the VPC, vSwitch, and security group configurations.</p>
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
