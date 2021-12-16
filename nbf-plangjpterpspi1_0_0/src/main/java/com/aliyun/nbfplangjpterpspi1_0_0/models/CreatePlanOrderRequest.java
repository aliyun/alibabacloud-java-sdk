// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbfplangjpterpspi1_0_0.models;

import com.aliyun.tea.*;

public class CreatePlanOrderRequest extends TeaModel {
    @NameInMap("areaCode")
    public Integer areaCode;

    @NameInMap("inboundDeadline")
    public String inboundDeadline;

    @NameInMap("items")
    public java.util.List<CreatePlanOrderRequestItems> items;

    @NameInMap("outerErpCode")
    public String outerErpCode;

    @NameInMap("outerOrderCode")
    public String outerOrderCode;

    @NameInMap("remark")
    public String remark;

    @NameInMap("supplierId")
    public Long supplierId;

    @NameInMap("toStoreCode")
    public String toStoreCode;

    @NameInMap("transportType")
    public Integer transportType;

    public static CreatePlanOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePlanOrderRequest self = new CreatePlanOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreatePlanOrderRequest setAreaCode(Integer areaCode) {
        this.areaCode = areaCode;
        return this;
    }
    public Integer getAreaCode() {
        return this.areaCode;
    }

    public CreatePlanOrderRequest setInboundDeadline(String inboundDeadline) {
        this.inboundDeadline = inboundDeadline;
        return this;
    }
    public String getInboundDeadline() {
        return this.inboundDeadline;
    }

    public CreatePlanOrderRequest setItems(java.util.List<CreatePlanOrderRequestItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<CreatePlanOrderRequestItems> getItems() {
        return this.items;
    }

    public CreatePlanOrderRequest setOuterErpCode(String outerErpCode) {
        this.outerErpCode = outerErpCode;
        return this;
    }
    public String getOuterErpCode() {
        return this.outerErpCode;
    }

    public CreatePlanOrderRequest setOuterOrderCode(String outerOrderCode) {
        this.outerOrderCode = outerOrderCode;
        return this;
    }
    public String getOuterOrderCode() {
        return this.outerOrderCode;
    }

    public CreatePlanOrderRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreatePlanOrderRequest setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
        return this;
    }
    public Long getSupplierId() {
        return this.supplierId;
    }

    public CreatePlanOrderRequest setToStoreCode(String toStoreCode) {
        this.toStoreCode = toStoreCode;
        return this;
    }
    public String getToStoreCode() {
        return this.toStoreCode;
    }

    public CreatePlanOrderRequest setTransportType(Integer transportType) {
        this.transportType = transportType;
        return this;
    }
    public Integer getTransportType() {
        return this.transportType;
    }

    public static class CreatePlanOrderRequestItems extends TeaModel {
        @NameInMap("confirmQuantity")
        public Long confirmQuantity;

        @NameInMap("outerOrderItemCode")
        public String outerOrderItemCode;

        @NameInMap("scItemId")
        public Long scItemId;

        public static CreatePlanOrderRequestItems build(java.util.Map<String, ?> map) throws Exception {
            CreatePlanOrderRequestItems self = new CreatePlanOrderRequestItems();
            return TeaModel.build(map, self);
        }

        public CreatePlanOrderRequestItems setConfirmQuantity(Long confirmQuantity) {
            this.confirmQuantity = confirmQuantity;
            return this;
        }
        public Long getConfirmQuantity() {
            return this.confirmQuantity;
        }

        public CreatePlanOrderRequestItems setOuterOrderItemCode(String outerOrderItemCode) {
            this.outerOrderItemCode = outerOrderItemCode;
            return this;
        }
        public String getOuterOrderItemCode() {
            return this.outerOrderItemCode;
        }

        public CreatePlanOrderRequestItems setScItemId(Long scItemId) {
            this.scItemId = scItemId;
            return this;
        }
        public Long getScItemId() {
            return this.scItemId;
        }

    }

}
