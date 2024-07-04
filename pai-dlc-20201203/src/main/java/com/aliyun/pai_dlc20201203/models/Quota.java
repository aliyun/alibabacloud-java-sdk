// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class Quota extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ClusterName")
    public String clusterName;

    @NameInMap("QuotaConfig")
    public QuotaConfig quotaConfig;

    /**
     * <strong>example:</strong>
     * <p>quotamtl37ge7gkvdz</p>
     */
    @NameInMap("QuotaId")
    public String quotaId;

    /**
     * <strong>example:</strong>
     * <p>dlc-quota</p>
     */
    @NameInMap("QuotaName")
    public String quotaName;

    /**
     * <strong>example:</strong>
     * <p>asiquota</p>
     */
    @NameInMap("QuotaType")
    public String quotaType;

    @NameInMap("TotalQuota")
    public QuotaDetail totalQuota;

    @NameInMap("TotalTideQuota")
    public QuotaDetail totalTideQuota;

    @NameInMap("UsedQuota")
    public QuotaDetail usedQuota;

    @NameInMap("UsedTideQuota")
    public QuotaDetail usedTideQuota;

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

    public Quota setQuotaConfig(QuotaConfig quotaConfig) {
        this.quotaConfig = quotaConfig;
        return this;
    }
    public QuotaConfig getQuotaConfig() {
        return this.quotaConfig;
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

    public Quota setTotalTideQuota(QuotaDetail totalTideQuota) {
        this.totalTideQuota = totalTideQuota;
        return this;
    }
    public QuotaDetail getTotalTideQuota() {
        return this.totalTideQuota;
    }

    public Quota setUsedQuota(QuotaDetail usedQuota) {
        this.usedQuota = usedQuota;
        return this;
    }
    public QuotaDetail getUsedQuota() {
        return this.usedQuota;
    }

    public Quota setUsedTideQuota(QuotaDetail usedTideQuota) {
        this.usedTideQuota = usedTideQuota;
        return this;
    }
    public QuotaDetail getUsedTideQuota() {
        return this.usedTideQuota;
    }

}
