// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class Quota extends TeaModel {
    // 集群id
    @NameInMap("ClusterId")
    public String clusterId;

    // 集群名称
    @NameInMap("ClusterName")
    public String clusterName;

    // 是否是独占Quota组
    @NameInMap("IsExclusiveQuota")
    public Boolean isExclusiveQuota;

    // 资源配额id
    @NameInMap("QuotaId")
    public String quotaId;

    // 资源配额名称
    @NameInMap("QuotaName")
    public String quotaName;

    // 资源配额类型
    @NameInMap("QuotaType")
    public String quotaType;

    // 资源总量
    @NameInMap("TotalQuota")
    public QuotaDetail totalQuota;

    // 资源用量
    @NameInMap("UsedQuota")
    public QuotaDetail usedQuota;

    public static Quota build(java.util.Map<String, ?> map) throws Exception {
        Quota self = new Quota();
        return TeaModel.build(map, self);
    }

    public Quota setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public Quota setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public Quota setIsExclusiveQuota(Boolean isExclusiveQuota) {
        this.isExclusiveQuota = isExclusiveQuota;
        return this;
    }
    public Boolean getIsExclusiveQuota() {
        return this.isExclusiveQuota;
    }

    public Quota setQuotaId(String quotaId) {
        this.quotaId = quotaId;
        return this;
    }
    public String getQuotaId() {
        return this.quotaId;
    }

    public Quota setQuotaName(String quotaName) {
        this.quotaName = quotaName;
        return this;
    }
    public String getQuotaName() {
        return this.quotaName;
    }

    public Quota setQuotaType(String quotaType) {
        this.quotaType = quotaType;
        return this;
    }
    public String getQuotaType() {
        return this.quotaType;
    }

    public Quota setTotalQuota(QuotaDetail totalQuota) {
        this.totalQuota = totalQuota;
        return this;
    }
    public QuotaDetail getTotalQuota() {
        return this.totalQuota;
    }

    public Quota setUsedQuota(QuotaDetail usedQuota) {
        this.usedQuota = usedQuota;
        return this;
    }
    public QuotaDetail getUsedQuota() {
        return this.usedQuota;
    }

}
