// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yunjian20211217.models;

import com.aliyun.tea.*;

public class SaveUrgentDemandItemRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>12321312</p>
     */
    @NameInMap("accountId")
    public String accountId;

    /**
     * <strong>example:</strong>
     * <p>111222</p>
     */
    @NameInMap("creator")
    public String creator;

    /**
     * <strong>example:</strong>
     * <p>2021-12-27 00:00:00</p>
     */
    @NameInMap("effectTime")
    public String effectTime;

    /**
     * <strong>example:</strong>
     * <p>111222</p>
     */
    @NameInMap("modifier")
    public String modifier;

    /**
     * <strong>example:</strong>
     * <p>网络类型 vpc（私有网络）/classic（经典网络）</p>
     */
    @NameInMap("networkType")
    public String networkType;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("payDuration")
    public String payDuration;

    /**
     * <strong>example:</strong>
     * <p>购买时长单位(month(月)，week(周)，day(天))</p>
     */
    @NameInMap("payDurationUnit")
    public String payDurationUnit;

    /**
     * <strong>example:</strong>
     * <p>付费类型 prepay(预付费)/postpay（后付费）</p>
     */
    @NameInMap("payType")
    public String payType;

    /**
     * <strong>example:</strong>
     * <p>111222</p>
     */
    @NameInMap("planId")
    public Long planId;

    /**
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("region")
    public String region;

    @NameInMap("urgentDemandEbsRequest")
    public SaveUrgentDemandItemRequestUrgentDemandEbsRequest urgentDemandEbsRequest;

    @NameInMap("urgentDemandEcsRequest")
    public SaveUrgentDemandItemRequestUrgentDemandEcsRequest urgentDemandEcsRequest;

    /**
     * <strong>example:</strong>
     * <p>cn-beijing-a</p>
     */
    @NameInMap("zone")
    public String zone;

    public static SaveUrgentDemandItemRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveUrgentDemandItemRequest self = new SaveUrgentDemandItemRequest();
        return TeaModel.build(map, self);
    }

    public SaveUrgentDemandItemRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public SaveUrgentDemandItemRequest setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public SaveUrgentDemandItemRequest setEffectTime(String effectTime) {
        this.effectTime = effectTime;
        return this;
    }
    public String getEffectTime() {
        return this.effectTime;
    }

    public SaveUrgentDemandItemRequest setModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }
    public String getModifier() {
        return this.modifier;
    }

    public SaveUrgentDemandItemRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public SaveUrgentDemandItemRequest setPayDuration(String payDuration) {
        this.payDuration = payDuration;
        return this;
    }
    public String getPayDuration() {
        return this.payDuration;
    }

    public SaveUrgentDemandItemRequest setPayDurationUnit(String payDurationUnit) {
        this.payDurationUnit = payDurationUnit;
        return this;
    }
    public String getPayDurationUnit() {
        return this.payDurationUnit;
    }

    public SaveUrgentDemandItemRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public SaveUrgentDemandItemRequest setPlanId(Long planId) {
        this.planId = planId;
        return this;
    }
    public Long getPlanId() {
        return this.planId;
    }

    public SaveUrgentDemandItemRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public SaveUrgentDemandItemRequest setUrgentDemandEbsRequest(SaveUrgentDemandItemRequestUrgentDemandEbsRequest urgentDemandEbsRequest) {
        this.urgentDemandEbsRequest = urgentDemandEbsRequest;
        return this;
    }
    public SaveUrgentDemandItemRequestUrgentDemandEbsRequest getUrgentDemandEbsRequest() {
        return this.urgentDemandEbsRequest;
    }

    public SaveUrgentDemandItemRequest setUrgentDemandEcsRequest(SaveUrgentDemandItemRequestUrgentDemandEcsRequest urgentDemandEcsRequest) {
        this.urgentDemandEcsRequest = urgentDemandEcsRequest;
        return this;
    }
    public SaveUrgentDemandItemRequestUrgentDemandEcsRequest getUrgentDemandEcsRequest() {
        return this.urgentDemandEcsRequest;
    }

    public SaveUrgentDemandItemRequest setZone(String zone) {
        this.zone = zone;
        return this;
    }
    public String getZone() {
        return this.zone;
    }

    public static class SaveUrgentDemandItemRequestUrgentDemandEbsRequest extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cloud_essd</p>
         */
        @NameInMap("commodityCode")
        public String commodityCode;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("commodityNum")
        public Long commodityNum;

        /**
         * <strong>example:</strong>
         * <p>yundisk</p>
         */
        @NameInMap("commodityTypeCode")
        public String commodityTypeCode;

        /**
         * <strong>example:</strong>
         * <p>111222</p>
         */
        @NameInMap("itemId")
        public Long itemId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("performanceLevel")
        public Long performanceLevel;

        public static SaveUrgentDemandItemRequestUrgentDemandEbsRequest build(java.util.Map<String, ?> map) throws Exception {
            SaveUrgentDemandItemRequestUrgentDemandEbsRequest self = new SaveUrgentDemandItemRequestUrgentDemandEbsRequest();
            return TeaModel.build(map, self);
        }

        public SaveUrgentDemandItemRequestUrgentDemandEbsRequest setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public SaveUrgentDemandItemRequestUrgentDemandEbsRequest setCommodityNum(Long commodityNum) {
            this.commodityNum = commodityNum;
            return this;
        }
        public Long getCommodityNum() {
            return this.commodityNum;
        }

        public SaveUrgentDemandItemRequestUrgentDemandEbsRequest setCommodityTypeCode(String commodityTypeCode) {
            this.commodityTypeCode = commodityTypeCode;
            return this;
        }
        public String getCommodityTypeCode() {
            return this.commodityTypeCode;
        }

        public SaveUrgentDemandItemRequestUrgentDemandEbsRequest setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public SaveUrgentDemandItemRequestUrgentDemandEbsRequest setPerformanceLevel(Long performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public Long getPerformanceLevel() {
            return this.performanceLevel;
        }

    }

    public static class SaveUrgentDemandItemRequestUrgentDemandEcsRequest extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ecs.sn2ne.6xlarge</p>
         */
        @NameInMap("commodityCode")
        public String commodityCode;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("commodityNum")
        public Long commodityNum;

        /**
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("commodityTypeCode")
        public String commodityTypeCode;

        /**
         * <strong>example:</strong>
         * <p>111222</p>
         */
        @NameInMap("itemId")
        public Long itemId;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("vCpuCount")
        public Long vCpuCount;

        public static SaveUrgentDemandItemRequestUrgentDemandEcsRequest build(java.util.Map<String, ?> map) throws Exception {
            SaveUrgentDemandItemRequestUrgentDemandEcsRequest self = new SaveUrgentDemandItemRequestUrgentDemandEcsRequest();
            return TeaModel.build(map, self);
        }

        public SaveUrgentDemandItemRequestUrgentDemandEcsRequest setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public SaveUrgentDemandItemRequestUrgentDemandEcsRequest setCommodityNum(Long commodityNum) {
            this.commodityNum = commodityNum;
            return this;
        }
        public Long getCommodityNum() {
            return this.commodityNum;
        }

        public SaveUrgentDemandItemRequestUrgentDemandEcsRequest setCommodityTypeCode(String commodityTypeCode) {
            this.commodityTypeCode = commodityTypeCode;
            return this;
        }
        public String getCommodityTypeCode() {
            return this.commodityTypeCode;
        }

        public SaveUrgentDemandItemRequestUrgentDemandEcsRequest setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public SaveUrgentDemandItemRequestUrgentDemandEcsRequest setVCpuCount(Long vCpuCount) {
            this.vCpuCount = vCpuCount;
            return this;
        }
        public Long getVCpuCount() {
            return this.vCpuCount;
        }

    }

}
