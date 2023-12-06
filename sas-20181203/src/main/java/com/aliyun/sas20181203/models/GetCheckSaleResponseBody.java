// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCheckSaleResponseBody extends TeaModel {
    /**
     * <p>The sales information about the configuration assessment quota.</p>
     */
    @NameInMap("CheckSale")
    public GetCheckSaleResponseBodyCheckSale checkSale;

    /**
     * <p>The request ID.</p>
     */
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
        /**
         * <p>The consumed quota.</p>
         */
        @NameInMap("ConsumeCount")
        public Long consumeCount;

        /**
         * <p>Indicates whether the user is an existing user and whether the user uses the configuration assessment feature before the feature is released for sale on July 07, 2023. Valid values:</p>
         * <br>
         * <p>*   **true**: existing user</p>
         * <p>*   **false**: new user</p>
         */
        @NameInMap("LoyalUser")
        public Boolean loyalUser;

        /**
         * <p>The purchased quota.</p>
         */
        @NameInMap("PurchaseCount")
        public Long purchaseCount;

        /**
         * <p>The type of the user. Valid values:</p>
         * <br>
         * <p>*   **1**: a user who can use all check items.</p>
         * <p>*   **2**: an user who can only use the check items before the release of the feature on July 07, 2023. This type of users must upgrade Security Center before the users can use all check items.</p>
         * <p>*   **3**: a new user who cannot use the configuration assessment feature. This type of users must make a purchase before the users can use the feature.</p>
         */
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
