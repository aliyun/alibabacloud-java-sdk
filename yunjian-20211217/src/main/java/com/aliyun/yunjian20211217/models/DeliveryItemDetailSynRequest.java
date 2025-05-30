// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yunjian20211217.models;

import com.aliyun.tea.*;

public class DeliveryItemDetailSynRequest extends TeaModel {
    @NameInMap("channel")
    public String channel;

    @NameInMap("deliveryItemDetailDTOS")
    public java.util.List<DeliveryItemDetailSynRequestDeliveryItemDetailDTOS> deliveryItemDetailDTOS;

    @NameInMap("deliveryItemId")
    public String deliveryItemId;

    @NameInMap("deliveryPlanId")
    public String deliveryPlanId;

    public static DeliveryItemDetailSynRequest build(java.util.Map<String, ?> map) throws Exception {
        DeliveryItemDetailSynRequest self = new DeliveryItemDetailSynRequest();
        return TeaModel.build(map, self);
    }

    public DeliveryItemDetailSynRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public DeliveryItemDetailSynRequest setDeliveryItemDetailDTOS(java.util.List<DeliveryItemDetailSynRequestDeliveryItemDetailDTOS> deliveryItemDetailDTOS) {
        this.deliveryItemDetailDTOS = deliveryItemDetailDTOS;
        return this;
    }
    public java.util.List<DeliveryItemDetailSynRequestDeliveryItemDetailDTOS> getDeliveryItemDetailDTOS() {
        return this.deliveryItemDetailDTOS;
    }

    public DeliveryItemDetailSynRequest setDeliveryItemId(String deliveryItemId) {
        this.deliveryItemId = deliveryItemId;
        return this;
    }
    public String getDeliveryItemId() {
        return this.deliveryItemId;
    }

    public DeliveryItemDetailSynRequest setDeliveryPlanId(String deliveryPlanId) {
        this.deliveryPlanId = deliveryPlanId;
        return this;
    }
    public String getDeliveryPlanId() {
        return this.deliveryPlanId;
    }

    public static class DeliveryItemDetailSynRequestDeliveryItemDetailDTOS extends TeaModel {
        @NameInMap("actualSupplyTime")
        public String actualSupplyTime;

        @NameInMap("amount")
        public Long amount;

        @NameInMap("comment")
        public String comment;

        @NameInMap("deliveredAmount")
        public Long deliveredAmount;

        @NameInMap("deliveryItemId")
        public String deliveryItemId;

        @NameInMap("deliveryPlanId")
        public String deliveryPlanId;

        @NameInMap("lastSupplyTime")
        public String lastSupplyTime;

        @NameInMap("status")
        public String status;

        @NameInMap("subDemandSupplyPerformerName")
        public String subDemandSupplyPerformerName;

        @NameInMap("subDemandSupplyPerformerUid")
        public String subDemandSupplyPerformerUid;

        @NameInMap("subDemandSupplyPmName")
        public String subDemandSupplyPmName;

        @NameInMap("subDemandSupplyPmUid")
        public String subDemandSupplyPmUid;

        @NameInMap("subOrderId")
        public Long subOrderId;

        @NameInMap("supplyStatus")
        public String supplyStatus;

        @NameInMap("totalOrderId")
        public Long totalOrderId;

        public static DeliveryItemDetailSynRequestDeliveryItemDetailDTOS build(java.util.Map<String, ?> map) throws Exception {
            DeliveryItemDetailSynRequestDeliveryItemDetailDTOS self = new DeliveryItemDetailSynRequestDeliveryItemDetailDTOS();
            return TeaModel.build(map, self);
        }

        public DeliveryItemDetailSynRequestDeliveryItemDetailDTOS setActualSupplyTime(String actualSupplyTime) {
            this.actualSupplyTime = actualSupplyTime;
            return this;
        }
        public String getActualSupplyTime() {
            return this.actualSupplyTime;
        }

        public DeliveryItemDetailSynRequestDeliveryItemDetailDTOS setAmount(Long amount) {
            this.amount = amount;
            return this;
        }
        public Long getAmount() {
            return this.amount;
        }

        public DeliveryItemDetailSynRequestDeliveryItemDetailDTOS setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public DeliveryItemDetailSynRequestDeliveryItemDetailDTOS setDeliveredAmount(Long deliveredAmount) {
            this.deliveredAmount = deliveredAmount;
            return this;
        }
        public Long getDeliveredAmount() {
            return this.deliveredAmount;
        }

        public DeliveryItemDetailSynRequestDeliveryItemDetailDTOS setDeliveryItemId(String deliveryItemId) {
            this.deliveryItemId = deliveryItemId;
            return this;
        }
        public String getDeliveryItemId() {
            return this.deliveryItemId;
        }

        public DeliveryItemDetailSynRequestDeliveryItemDetailDTOS setDeliveryPlanId(String deliveryPlanId) {
            this.deliveryPlanId = deliveryPlanId;
            return this;
        }
        public String getDeliveryPlanId() {
            return this.deliveryPlanId;
        }

        public DeliveryItemDetailSynRequestDeliveryItemDetailDTOS setLastSupplyTime(String lastSupplyTime) {
            this.lastSupplyTime = lastSupplyTime;
            return this;
        }
        public String getLastSupplyTime() {
            return this.lastSupplyTime;
        }

        public DeliveryItemDetailSynRequestDeliveryItemDetailDTOS setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DeliveryItemDetailSynRequestDeliveryItemDetailDTOS setSubDemandSupplyPerformerName(String subDemandSupplyPerformerName) {
            this.subDemandSupplyPerformerName = subDemandSupplyPerformerName;
            return this;
        }
        public String getSubDemandSupplyPerformerName() {
            return this.subDemandSupplyPerformerName;
        }

        public DeliveryItemDetailSynRequestDeliveryItemDetailDTOS setSubDemandSupplyPerformerUid(String subDemandSupplyPerformerUid) {
            this.subDemandSupplyPerformerUid = subDemandSupplyPerformerUid;
            return this;
        }
        public String getSubDemandSupplyPerformerUid() {
            return this.subDemandSupplyPerformerUid;
        }

        public DeliveryItemDetailSynRequestDeliveryItemDetailDTOS setSubDemandSupplyPmName(String subDemandSupplyPmName) {
            this.subDemandSupplyPmName = subDemandSupplyPmName;
            return this;
        }
        public String getSubDemandSupplyPmName() {
            return this.subDemandSupplyPmName;
        }

        public DeliveryItemDetailSynRequestDeliveryItemDetailDTOS setSubDemandSupplyPmUid(String subDemandSupplyPmUid) {
            this.subDemandSupplyPmUid = subDemandSupplyPmUid;
            return this;
        }
        public String getSubDemandSupplyPmUid() {
            return this.subDemandSupplyPmUid;
        }

        public DeliveryItemDetailSynRequestDeliveryItemDetailDTOS setSubOrderId(Long subOrderId) {
            this.subOrderId = subOrderId;
            return this;
        }
        public Long getSubOrderId() {
            return this.subOrderId;
        }

        public DeliveryItemDetailSynRequestDeliveryItemDetailDTOS setSupplyStatus(String supplyStatus) {
            this.supplyStatus = supplyStatus;
            return this;
        }
        public String getSupplyStatus() {
            return this.supplyStatus;
        }

        public DeliveryItemDetailSynRequestDeliveryItemDetailDTOS setTotalOrderId(Long totalOrderId) {
            this.totalOrderId = totalOrderId;
            return this;
        }
        public Long getTotalOrderId() {
            return this.totalOrderId;
        }

    }

}
