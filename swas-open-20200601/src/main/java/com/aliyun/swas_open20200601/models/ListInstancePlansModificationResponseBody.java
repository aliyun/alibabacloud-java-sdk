// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ListInstancePlansModificationResponseBody extends TeaModel {
    /**
     * <p>The operating system types supported by the plan.</p>
     */
    @NameInMap("Plans")
    public java.util.List<ListInstancePlansModificationResponseBodyPlans> plans;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>20758A-585D-4A41-A9B2-28DA8F4F****</p>
     */
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
        /**
         * <p>The peak bandwidth. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <p>The number of vCPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Core")
        public Integer core;

        /**
         * <p>The unit of the plan price. Valid values:</p>
         * <ul>
         * <li>CNY</li>
         * <li>USD</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <p>The disk size of the simple application server. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("DiskSize")
        public Integer diskSize;

        /**
         * <p>The category of the disk. Valid values:</p>
         * <ul>
         * <li>SSD: standard SSD</li>
         * <li>ESSD: enhanced SSD</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ESSD</p>
         */
        @NameInMap("DiskType")
        public String diskType;

        /**
         * <p>The monthly data transfer quota. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>400</p>
         */
        @NameInMap("Flow")
        public Integer flow;

        /**
         * <p>The memory size. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Memory")
        public Integer memory;

        /**
         * <p>The price of the plan.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("OriginPrice")
        public Double originPrice;

        /**
         * <p>The ID of the plan.</p>
         * 
         * <strong>example:</strong>
         * <p>swas.s2.c2m1s40b3t04</p>
         */
        @NameInMap("PlanId")
        public String planId;

        /**
         * <p>The operating system types supported by the plan.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;Linux&quot;,&quot;Windows&quot;]</p>
         */
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
