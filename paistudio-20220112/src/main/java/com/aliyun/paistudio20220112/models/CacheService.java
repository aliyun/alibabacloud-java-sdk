// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class CacheService extends TeaModel {
    @NameInMap("CacheInfos")
    public java.util.List<CacheInfo> cacheInfos;

    @NameInMap("CacheServiceId")
    public String cacheServiceId;

    @NameInMap("CreatedBy")
    public String createdBy;

    @NameInMap("GmtCreated")
    public String gmtCreated;

    @NameInMap("QuotaId")
    public String quotaId;

    @NameInMap("Status")
    public String status;

    @NameInMap("SupportedClientQuotaIds")
    public java.util.List<String> supportedClientQuotaIds;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("UserId")
    public String userId;

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
