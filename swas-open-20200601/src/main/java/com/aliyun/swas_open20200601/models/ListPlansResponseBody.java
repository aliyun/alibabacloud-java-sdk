// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ListPlansResponseBody extends TeaModel {
    @NameInMap("Plans")
    public java.util.List<ListPlansResponseBodyPlans> plans;

    @NameInMap("RequestId")
    public String requestId;

    public static ListPlansResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPlansResponseBody self = new ListPlansResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPlansResponseBody setPlans(java.util.List<ListPlansResponseBodyPlans> plans) {
        this.plans = plans;
        return this;
    }
    public java.util.List<ListPlansResponseBodyPlans> getPlans() {
        return this.plans;
    }

    public ListPlansResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPlansResponseBodyPlans extends TeaModel {
        @NameInMap("Core")
        public Integer core;

        @NameInMap("Bandwidth")
        public Integer bandwidth;

        @NameInMap("DiskSize")
        public Integer diskSize;

        @NameInMap("Flow")
        public Integer flow;

        @NameInMap("Memory")
        public Integer memory;

        @NameInMap("PlanId")
        public String planId;

        public static ListPlansResponseBodyPlans build(java.util.Map<String, ?> map) throws Exception {
            ListPlansResponseBodyPlans self = new ListPlansResponseBodyPlans();
            return TeaModel.build(map, self);
        }

        public ListPlansResponseBodyPlans setCore(Integer core) {
            this.core = core;
            return this;
        }
        public Integer getCore() {
            return this.core;
        }

        public ListPlansResponseBodyPlans setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public ListPlansResponseBodyPlans setDiskSize(Integer diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        public Integer getDiskSize() {
            return this.diskSize;
        }

        public ListPlansResponseBodyPlans setFlow(Integer flow) {
            this.flow = flow;
            return this;
        }
        public Integer getFlow() {
            return this.flow;
        }

        public ListPlansResponseBodyPlans setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public ListPlansResponseBodyPlans setPlanId(String planId) {
            this.planId = planId;
            return this;
        }
        public String getPlanId() {
            return this.planId;
        }

    }

}
