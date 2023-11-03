// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCheckSaleResponseBody extends TeaModel {
    @NameInMap("CheckSale")
    public GetCheckSaleResponseBodyCheckSale checkSale;

    @NameInMap("RequestId")
    public String requestId;

    public static GetCheckSaleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCheckSaleResponseBody self = new GetCheckSaleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCheckSaleResponseBody setCheckSale(GetCheckSaleResponseBodyCheckSale checkSale) {
        this.checkSale = checkSale;
        return this;
    }
    public GetCheckSaleResponseBodyCheckSale getCheckSale() {
        return this.checkSale;
    }

    public GetCheckSaleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetCheckSaleResponseBodyCheckSale extends TeaModel {
        @NameInMap("ConsumeCount")
        public Long consumeCount;

        @NameInMap("LoyalUser")
        public Boolean loyalUser;

        @NameInMap("PurchaseCount")
        public Long purchaseCount;

        @NameInMap("SaleUserType")
        public Integer saleUserType;

        public static GetCheckSaleResponseBodyCheckSale build(java.util.Map<String, ?> map) throws Exception {
            GetCheckSaleResponseBodyCheckSale self = new GetCheckSaleResponseBodyCheckSale();
            return TeaModel.build(map, self);
        }

        public GetCheckSaleResponseBodyCheckSale setConsumeCount(Long consumeCount) {
            this.consumeCount = consumeCount;
            return this;
        }
        public Long getConsumeCount() {
            return this.consumeCount;
        }

        public GetCheckSaleResponseBodyCheckSale setLoyalUser(Boolean loyalUser) {
            this.loyalUser = loyalUser;
            return this;
        }
        public Boolean getLoyalUser() {
            return this.loyalUser;
        }

        public GetCheckSaleResponseBodyCheckSale setPurchaseCount(Long purchaseCount) {
            this.purchaseCount = purchaseCount;
            return this;
        }
        public Long getPurchaseCount() {
            return this.purchaseCount;
        }

        public GetCheckSaleResponseBodyCheckSale setSaleUserType(Integer saleUserType) {
            this.saleUserType = saleUserType;
            return this;
        }
        public Integer getSaleUserType() {
            return this.saleUserType;
        }

    }

}
