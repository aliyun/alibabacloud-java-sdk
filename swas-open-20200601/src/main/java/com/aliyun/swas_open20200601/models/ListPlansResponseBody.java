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
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>20758A-585D-4A41-A9B2-28DA8F4F534F</p>
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

    public static class ListPlansResponseBodyPlansTags extends TeaModel {
        @NameInMap("CnTitle")
        public String cnTitle;

        @NameInMap("Color")
        public String color;

        @NameInMap("EnTitle")
        public String enTitle;

        public static ListPlansResponseBodyPlansTags build(java.util.Map<String, ?> map) throws Exception {
            ListPlansResponseBodyPlansTags self = new ListPlansResponseBodyPlansTags();
            return TeaModel.build(map, self);
        }

        public ListPlansResponseBodyPlansTags setCnTitle(String cnTitle) {
            this.cnTitle = cnTitle;
            return this;
        }
        public String getCnTitle() {
            return this.cnTitle;
        }

        public ListPlansResponseBodyPlansTags setColor(String color) {
            this.color = color;
            return this;
        }
        public String getColor() {
            return this.color;
        }

        public ListPlansResponseBodyPlansTags setEnTitle(String enTitle) {
            this.enTitle = enTitle;
            return this;
        }
        public String getEnTitle() {
            return this.enTitle;
        }

    }

    public static class ListPlansResponseBodyPlans extends TeaModel {
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
         * <blockquote>
         * <p> CNY is for the China site (aliyun.com). USD is for the international site (alibabacloud.com).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>CNY</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <p>The size of the disk. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("DiskSize")
        public Integer diskSize;

        /**
         * <p>The category of the disk. Valid values:</p>
         * <ul>
         * <li>SSD: standard SSDs</li>
         * <li>ESSD: enhanced SSDs</li>
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

        @NameInMap("IspType")
        public String ispType;

        /**
         * <p>The memory size. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Memory")
        public Float memory;

        /**
         * <p>The monthly price of the plan.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("OriginPrice")
        public String originPrice;

        /**
         * <p>The ID of the plan.</p>
         * 
         * <strong>example:</strong>
         * <p>swas.s2.c2m1s40b3t04</p>
         */
        @NameInMap("PlanId")
        public String planId;

        @NameInMap("PlanType")
        public String planType;

        @NameInMap("PublicIpNum")
        public String publicIpNum;

        /**
         * <p>The operating system types supported by the plan.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;Linux&quot;,&quot;Windows&quot;]</p>
         */
        @NameInMap("SupportPlatform")
        public String supportPlatform;

        @NameInMap("Tags")
        public java.util.List<ListPlansResponseBodyPlansTags> tags;

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

        public ListPlansResponseBodyPlans setIspType(String ispType) {
            this.ispType = ispType;
            return this;
        }
        public String getIspType() {
            return this.ispType;
        }

        public ListPlansResponseBodyPlans setMemory(Float memory) {
            this.memory = memory;
            return this;
        }
        public Float getMemory() {
            return this.memory;
        }

        public ListPlansResponseBodyPlans setOriginPrice(String originPrice) {
            this.originPrice = originPrice;
            return this;
        }
        public String getOriginPrice() {
            return this.originPrice;
        }

        public ListPlansResponseBodyPlans setPlanId(String planId) {
            this.planId = planId;
            return this;
        }
        public String getPlanId() {
            return this.planId;
        }

        public ListPlansResponseBodyPlans setPlanType(String planType) {
            this.planType = planType;
            return this;
        }
        public String getPlanType() {
            return this.planType;
        }

        public ListPlansResponseBodyPlans setPublicIpNum(String publicIpNum) {
            this.publicIpNum = publicIpNum;
            return this;
        }
        public String getPublicIpNum() {
            return this.publicIpNum;
        }

        public ListPlansResponseBodyPlans setSupportPlatform(String supportPlatform) {
            this.supportPlatform = supportPlatform;
            return this;
        }
        public String getSupportPlatform() {
            return this.supportPlatform;
        }

        public ListPlansResponseBodyPlans setTags(java.util.List<ListPlansResponseBodyPlansTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListPlansResponseBodyPlansTags> getTags() {
            return this.tags;
        }

    }

}
