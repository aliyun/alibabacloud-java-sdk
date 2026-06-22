// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCheckSaleResponseBody extends TeaModel {
    /**
     * <p>The sales information of cloud service configuration check.</p>
     */
    @NameInMap("CheckSale")
    public GetCheckSaleResponseBodyCheckSale checkSale;

    /**
     * <p>The ID of the request. The ID is a unique identifier that Alibaba Cloud generates for the request and can be used to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>F5CF78A7-30AA-59DB-847F-13EE3AE7****</p>
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
         * <p>The number of consumed authorized quotas.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("ConsumeCount")
        public Long consumeCount;

        @NameInMap("InstanceConsumeCount")
        public Long instanceConsumeCount;

        @NameInMap("InstanceHybridPostLatestCycledResourceCount")
        public Long instanceHybridPostLatestCycledResourceCount;

        @NameInMap("InstancePostConsumeCount")
        public Long instancePostConsumeCount;

        @NameInMap("InstancePurchaseCount")
        public Long instancePurchaseCount;

        /**
         * <p>Indicates whether the user is an existing user who used the cloud service configuration check feature before the sales feature was released on July 7, 2023. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The user is an existing user.</li>
         * <li><strong>false</strong>: The user is not an existing user.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("LoyalUser")
        public Boolean loyalUser;

        /**
         * <p>The number of purchased authorized quotas.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("PurchaseCount")
        public Long purchaseCount;

        /**
         * <p>The type of the sales user. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: full-feature user who can use all check items.</li>
         * <li><strong>2</strong>: user who needs to upgrade and can only use check items that were available before the sales feature was released on July 7, 2023.</li>
         * <li><strong>3</strong>: user who needs to purchase the feature and cannot use the cloud service configuration check feature.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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

        public GetCheckSaleResponseBodyCheckSale setInstanceConsumeCount(Long instanceConsumeCount) {
            this.instanceConsumeCount = instanceConsumeCount;
            return this;
        }
        public Long getInstanceConsumeCount() {
            return this.instanceConsumeCount;
        }

        public GetCheckSaleResponseBodyCheckSale setInstanceHybridPostLatestCycledResourceCount(Long instanceHybridPostLatestCycledResourceCount) {
            this.instanceHybridPostLatestCycledResourceCount = instanceHybridPostLatestCycledResourceCount;
            return this;
        }
        public Long getInstanceHybridPostLatestCycledResourceCount() {
            return this.instanceHybridPostLatestCycledResourceCount;
        }

        public GetCheckSaleResponseBodyCheckSale setInstancePostConsumeCount(Long instancePostConsumeCount) {
            this.instancePostConsumeCount = instancePostConsumeCount;
            return this;
        }
        public Long getInstancePostConsumeCount() {
            return this.instancePostConsumeCount;
        }

        public GetCheckSaleResponseBodyCheckSale setInstancePurchaseCount(Long instancePurchaseCount) {
            this.instancePurchaseCount = instancePurchaseCount;
            return this;
        }
        public Long getInstancePurchaseCount() {
            return this.instancePurchaseCount;
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
