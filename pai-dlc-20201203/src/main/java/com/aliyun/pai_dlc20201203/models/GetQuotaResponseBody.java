// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetQuotaResponseBody extends TeaModel {
    // 资源配额id
    @NameInMap("QuotaId")
    public String quotaId;

    // 资源配额名称
    @NameInMap("QuotaName")
    public String quotaName;

    // 资源配额类型
    @NameInMap("QuotaType")
    public String quotaType;

    // 资源用量
    @NameInMap("UsedQuota")
    public QuotaDetail usedQuota;

    // 资源总量
    @NameInMap("TotalQuota")
    public QuotaDetail totalQuota;

    // 集群id
    @NameInMap("ClusterId")
    public String clusterId;

    // 集群名称
    @NameInMap("ClusterName")
    public String clusterName;

    // 请求id
    @NameInMap("RequestId")
    public String requestId;

    public static GetQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQuotaResponseBody self = new GetQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQuotaResponseBody setQuotaId(String quotaId) {
        this.quotaId = quotaId;
        return this;
    }
    public String getQuotaId() {
        return this.quotaId;
    }

    public GetQuotaResponseBody setQuotaName(String quotaName) {
        this.quotaName = quotaName;
        return this;
    }
    public String getQuotaName() {
        return this.quotaName;
    }

    public GetQuotaResponseBody setQuotaType(String quotaType) {
        this.quotaType = quotaType;
        return this;
    }
    public String getQuotaType() {
        return this.quotaType;
    }

    public GetQuotaResponseBody setUsedQuota(QuotaDetail usedQuota) {
        this.usedQuota = usedQuota;
        return this;
    }
    public QuotaDetail getUsedQuota() {
        return this.usedQuota;
    }

    public GetQuotaResponseBody setTotalQuota(QuotaDetail totalQuota) {
        this.totalQuota = totalQuota;
        return this;
    }
    public QuotaDetail getTotalQuota() {
        return this.totalQuota;
    }

    public GetQuotaResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetQuotaResponseBody setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public GetQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
