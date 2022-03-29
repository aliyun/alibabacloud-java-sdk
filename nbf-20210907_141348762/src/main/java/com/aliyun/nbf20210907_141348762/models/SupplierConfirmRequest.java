// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210907_141348762.models;

import com.aliyun.tea.*;

public class SupplierConfirmRequest extends TeaModel {
    @NameInMap("gatewayUid")
    public Long gatewayUid;

    @NameInMap("items")
    public java.util.List<SupplierConfirmRequestItems> items;

    @NameInMap("purchaseOrderNo")
    public String purchaseOrderNo;

    public static SupplierConfirmRequest build(java.util.Map<String, ?> map) throws Exception {
        SupplierConfirmRequest self = new SupplierConfirmRequest();
        return TeaModel.build(map, self);
    }

    public SupplierConfirmRequest setGatewayUid(Long gatewayUid) {
        this.gatewayUid = gatewayUid;
        return this;
    }
    public Long getGatewayUid() {
        return this.gatewayUid;
    }

    public SupplierConfirmRequest setItems(java.util.List<SupplierConfirmRequestItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<SupplierConfirmRequestItems> getItems() {
        return this.items;
    }

    public SupplierConfirmRequest setPurchaseOrderNo(String purchaseOrderNo) {
        this.purchaseOrderNo = purchaseOrderNo;
        return this;
    }
    public String getPurchaseOrderNo() {
        return this.purchaseOrderNo;
    }

    public static class SupplierConfirmRequestItems extends TeaModel {
        @NameInMap("confirmQuantity")
        public Float confirmQuantity;

        @NameInMap("orderLineId")
        public Long orderLineId;

        @NameInMap("planQuantity")
        public Float planQuantity;

        @NameInMap("productId")
        public Long productId;

        public static SupplierConfirmRequestItems build(java.util.Map<String, ?> map) throws Exception {
            SupplierConfirmRequestItems self = new SupplierConfirmRequestItems();
            return TeaModel.build(map, self);
        }

        public SupplierConfirmRequestItems setConfirmQuantity(Float confirmQuantity) {
            this.confirmQuantity = confirmQuantity;
            return this;
        }
        public Float getConfirmQuantity() {
            return this.confirmQuantity;
        }

        public SupplierConfirmRequestItems setOrderLineId(Long orderLineId) {
            this.orderLineId = orderLineId;
            return this;
        }
        public Long getOrderLineId() {
            return this.orderLineId;
        }

        public SupplierConfirmRequestItems setPlanQuantity(Float planQuantity) {
            this.planQuantity = planQuantity;
            return this;
        }
        public Float getPlanQuantity() {
            return this.planQuantity;
        }

        public SupplierConfirmRequestItems setProductId(Long productId) {
            this.productId = productId;
            return this;
        }
        public Long getProductId() {
            return this.productId;
        }

    }

}
