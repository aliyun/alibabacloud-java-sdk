// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class QuotaTopo extends TeaModel {
    @NameInMap("Depth")
    public String depth;

    @NameInMap("ParentQuotaId")
    public String parentQuotaId;

    @NameInMap("QuotaDetails")
    public QuotaDetails quotaDetails;

    @NameInMap("QuotaId")
    public String quotaId;

    @NameInMap("QuotaName")
    public String quotaName;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("WorkloadDetails")
    public WorkloadDetails workloadDetails;

    public static QuotaTopo build(java.util.Map<String, ?> map) throws Exception {
        QuotaTopo self = new QuotaTopo();
        return TeaModel.build(map, self);
    }

    public QuotaTopo setDepth(String depth) {
        this.depth = depth;
        return this;
    }
    public String getDepth() {
        return this.depth;
    }

    public QuotaTopo setParentQuotaId(String parentQuotaId) {
        this.parentQuotaId = parentQuotaId;
        return this;
    }
    public String getParentQuotaId() {
        return this.parentQuotaId;
    }

    public QuotaTopo setQuotaDetails(QuotaDetails quotaDetails) {
        this.quotaDetails = quotaDetails;
        return this;
    }
    public QuotaDetails getQuotaDetails() {
        return this.quotaDetails;
    }

    public QuotaTopo setQuotaId(String quotaId) {
        this.quotaId = quotaId;
        return this;
    }
    public String getQuotaId() {
        return this.quotaId;
    }

    public QuotaTopo setQuotaName(String quotaName) {
        this.quotaName = quotaName;
        return this;
    }
    public String getQuotaName() {
        return this.quotaName;
    }

    public QuotaTopo setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public QuotaTopo setWorkloadDetails(WorkloadDetails workloadDetails) {
        this.workloadDetails = workloadDetails;
        return this;
    }
    public WorkloadDetails getWorkloadDetails() {
        return this.workloadDetails;
    }

}
