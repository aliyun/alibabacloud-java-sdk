// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ListInstancePlansModificationResponseBody extends TeaModel {
    @NameInMap("Plans")
    public java.util.List<ListInstancePlansModificationResponseBodyPlans> plans;

    @NameInMap("RequestId")
    public String requestId;

    public static ListInstancePlansModificationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstancePlansModificationResponseBody self = new ListInstancePlansModificationResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstancePlansModificationResponseBody setPlans(java.util.List<ListInstancePlansModificationResponseBodyPlans> plans) {
        this.plans = plans;
        return this;
    }
    public java.util.List<ListInstancePlansModificationResponseBodyPlans> getPlans() {
        return this.plans;
    }

    public ListInstancePlansModificationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListInstancePlansModificationResponseBodyPlans extends TeaModel {
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        @NameInMap("Core")
        public Integer core;

        @NameInMap("Currency")
        public String currency;

        @NameInMap("DiskSize")
        public Integer diskSize;

        @NameInMap("DiskType")
        public String diskType;

        @NameInMap("Flow")
        public Integer flow;

        @NameInMap("Memory")
        public Integer memory;

        @NameInMap("OriginPrice")
        public Double originPrice;

        @NameInMap("PlanId")
        public String planId;

        @NameInMap("SupportPlatform")
        public String supportPlatform;

        public static ListInstancePlansModificationResponseBodyPlans build(java.util.Map<String, ?> map) throws Exception {
            ListInstancePlansModificationResponseBodyPlans self = new ListInstancePlansModificationResponseBodyPlans();
            return TeaModel.build(map, self);
        }

        public ListInstancePlansModificationResponseBodyPlans setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public ListInstancePlansModificationResponseBodyPlans setCore(Integer core) {
            this.core = core;
            return this;
        }
        public Integer getCore() {
            return this.core;
        }

        public ListInstancePlansModificationResponseBodyPlans setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public ListInstancePlansModificationResponseBodyPlans setDiskSize(Integer diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        public Integer getDiskSize() {
            return this.diskSize;
        }

        public ListInstancePlansModificationResponseBodyPlans setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public ListInstancePlansModificationResponseBodyPlans setFlow(Integer flow) {
            this.flow = flow;
            return this;
        }
        public Integer getFlow() {
            return this.flow;
        }

        public ListInstancePlansModificationResponseBodyPlans setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public ListInstancePlansModificationResponseBodyPlans setOriginPrice(Double originPrice) {
            this.originPrice = originPrice;
            return this;
        }
        public Double getOriginPrice() {
            return this.originPrice;
        }

        public ListInstancePlansModificationResponseBodyPlans setPlanId(String planId) {
            this.planId = planId;
            return this;
        }
        public String getPlanId() {
            return this.planId;
        }

        public ListInstancePlansModificationResponseBodyPlans setSupportPlatform(String supportPlatform) {
            this.supportPlatform = supportPlatform;
            return this;
        }
        public String getSupportPlatform() {
            return this.supportPlatform;
        }

    }

}
