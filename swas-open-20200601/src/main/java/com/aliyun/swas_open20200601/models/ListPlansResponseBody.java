// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ListPlansResponseBody extends TeaModel {
    /**
     * <p>Details about the plans.</p>
     */
    @NameInMap("Plans")
    public java.util.List<ListPlansResponseBodyPlans> plans;

    /**
     * <p>The ID of the request.</p>
     */
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
        /**
         * <p>The peak bandwidth. Unit: Mbit/s.</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <p>The number of vCPUs.</p>
         */
        @NameInMap("Core")
        public Integer core;

        /**
         * <p>The unit of the plan price. Valid values:</p>
         * <br>
         * <p>*   CNY</p>
         * <p>*   USD</p>
         * <br>
         * <p>>  CNY is for the China site (aliyun.com). USD is for the international site (alibabacloud.com).</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <p>The size of the disk. Unit: GB.</p>
         */
        @NameInMap("DiskSize")
        public Integer diskSize;

        /**
         * <p>The category of the disk. Valid values:</p>
         * <br>
         * <p>*   SSD: standard SSDs</p>
         * <p>*   ESSD: enhanced SSDs</p>
         */
        @NameInMap("DiskType")
        public String diskType;

        /**
         * <p>The monthly data transfer quota. Unit: GB.</p>
         */
        @NameInMap("Flow")
        public Integer flow;

        /**
         * <p>The memory size. Unit: GB.</p>
         */
        @NameInMap("Memory")
        public Integer memory;

        /**
         * <p>The monthly price of the plan.</p>
         */
        @NameInMap("OriginPrice")
        public Double originPrice;

        /**
         * <p>The ID of the plan.</p>
         */
        @NameInMap("PlanId")
        public String planId;

        /**
         * <p>The operating system types supported by the plan.</p>
         */
        @NameInMap("SupportPlatform")
        public String supportPlatform;

        public static ListPlansResponseBodyPlans build(java.util.Map<String, ?> map) throws Exception {
            ListPlansResponseBodyPlans self = new ListPlansResponseBodyPlans();
            return TeaModel.build(map, self);
        }

        public ListPlansResponseBodyPlans setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public ListPlansResponseBodyPlans setCore(Integer core) {
            this.core = core;
            return this;
        }
        public Integer getCore() {
            return this.core;
        }

        public ListPlansResponseBodyPlans setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public ListPlansResponseBodyPlans setDiskSize(Integer diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        public Integer getDiskSize() {
            return this.diskSize;
        }

        public ListPlansResponseBodyPlans setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
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

        public ListPlansResponseBodyPlans setOriginPrice(Double originPrice) {
            this.originPrice = originPrice;
            return this;
        }
        public Double getOriginPrice() {
            return this.originPrice;
        }

        public ListPlansResponseBodyPlans setPlanId(String planId) {
            this.planId = planId;
            return this;
        }
        public String getPlanId() {
            return this.planId;
        }

        public ListPlansResponseBodyPlans setSupportPlatform(String supportPlatform) {
            this.supportPlatform = supportPlatform;
            return this;
        }
        public String getSupportPlatform() {
            return this.supportPlatform;
        }

    }

}
