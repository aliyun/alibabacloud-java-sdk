// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210907_141348762.models;

import com.aliyun.tea.*;

public class YxTestApiRequest extends TeaModel {
    @NameInMap("gatewayUid")
    public Long gatewayUid;

    @NameInMap("items")
    public java.util.List<YxTestApiRequestItems> items;

    @NameInMap("purchaseOrderNo")
    public String purchaseOrderNo;

    public static YxTestApiRequest build(java.util.Map<String, ?> map) throws Exception {
        YxTestApiRequest self = new YxTestApiRequest();
        return TeaModel.build(map, self);
    }

    public YxTestApiRequest setGatewayUid(Long gatewayUid) {
        this.gatewayUid = gatewayUid;
        return this;
    }
    public Long getGatewayUid() {
        return this.gatewayUid;
    }

    public YxTestApiRequest setItems(java.util.List<YxTestApiRequestItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<YxTestApiRequestItems> getItems() {
        return this.items;
    }

    public YxTestApiRequest setPurchaseOrderNo(String purchaseOrderNo) {
        this.purchaseOrderNo = purchaseOrderNo;
        return this;
    }
    public String getPurchaseOrderNo() {
        return this.purchaseOrderNo;
    }

    public static class YxTestApiRequestItems extends TeaModel {
        @NameInMap("confirmQuantity")
        public Float confirmQuantity;

        @NameInMap("orderLineId")
        public Long orderLineId;

        @NameInMap("planQuantity")
        public Float planQuantity;

        @NameInMap("productId")
        public Long productId;

        public static YxTestApiRequestItems build(java.util.Map<String, ?> map) throws Exception {
            YxTestApiRequestItems self = new YxTestApiRequestItems();
            return TeaModel.build(map, self);
        }

        public YxTestApiRequestItems setConfirmQuantity(Float confirmQuantity) {
            this.confirmQuantity = confirmQuantity;
            return this;
        }
        public Float getConfirmQuantity() {
            return this.confirmQuantity;
        }

        public YxTestApiRequestItems setOrderLineId(Long orderLineId) {
            this.orderLineId = orderLineId;
            return this;
        }
        public Long getOrderLineId() {
            return this.orderLineId;
        }

        public YxTestApiRequestItems setPlanQuantity(Float planQuantity) {
            this.planQuantity = planQuantity;
            return this;
        }
        public Float getPlanQuantity() {
            return this.planQuantity;
        }

        public YxTestApiRequestItems setProductId(Long productId) {
            this.productId = productId;
            return this;
        }
        public Long getProductId() {
            return this.productId;
        }

    }

}
