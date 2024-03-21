// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class GetOrderConfirmUrlRequest extends TeaModel {
    @NameInMap("Items")
    public java.util.List<GetOrderConfirmUrlRequestItems> items;

    @NameInMap("OutTraceCode")
    public String outTraceCode;

    @NameInMap("OutTraceType")
    public String outTraceType;

    public static GetOrderConfirmUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOrderConfirmUrlRequest self = new GetOrderConfirmUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetOrderConfirmUrlRequest setItems(java.util.List<GetOrderConfirmUrlRequestItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<GetOrderConfirmUrlRequestItems> getItems() {
        return this.items;
    }

    public GetOrderConfirmUrlRequest setOutTraceCode(String outTraceCode) {
        this.outTraceCode = outTraceCode;
        return this;
    }
    public String getOutTraceCode() {
        return this.outTraceCode;
    }

    public GetOrderConfirmUrlRequest setOutTraceType(String outTraceType) {
        this.outTraceType = outTraceType;
        return this;
    }
    public String getOutTraceType() {
        return this.outTraceType;
    }

    public static class GetOrderConfirmUrlRequestItems extends TeaModel {
        @NameInMap("ItemCode")
        public String itemCode;

        @NameInMap("Quantity")
        public Long quantity;

        public static GetOrderConfirmUrlRequestItems build(java.util.Map<String, ?> map) throws Exception {
            GetOrderConfirmUrlRequestItems self = new GetOrderConfirmUrlRequestItems();
            return TeaModel.build(map, self);
        }

        public GetOrderConfirmUrlRequestItems setItemCode(String itemCode) {
            this.itemCode = itemCode;
            return this;
        }
        public String getItemCode() {
            return this.itemCode;
        }

        public GetOrderConfirmUrlRequestItems setQuantity(Long quantity) {
            this.quantity = quantity;
            return this;
        }
        public Long getQuantity() {
            return this.quantity;
        }

    }

}
