// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSafDeOrderResponseBody extends TeaModel {
    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>AE7E6105-7DEB-5125-9B24-DCBC139F6CD2</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Return object</p>
     */
    @NameInMap("resultObject")
    public DescribeSafDeOrderResponseBodyResultObject resultObject;

    public static DescribeSafDeOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSafDeOrderResponseBody self = new DescribeSafDeOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSafDeOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSafDeOrderResponseBody setResultObject(DescribeSafDeOrderResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeSafDeOrderResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class DescribeSafDeOrderResponseBodyResultObject extends TeaModel {
        /**
         * <p>Expiration time</p>
         * 
         * <strong>example:</strong>
         * <p>1728008155799</p>
         */
        @NameInMap("expirationDate")
        public Long expirationDate;

        /**
         * <p>Based on the product type subscribed by the customer, the console permissions are divided into three categories:</p>
         * <pre><code> 1. New Customer: Has not purchased/subscribed to any service.
         *  2. Old Customer (Subscription): Customers who have purchased the SAF product.
         *  3. Pay-As-You-Go: Customers who have purchased the SAF_BAG product or activated SAF_POS.
         * </code></pre>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("openUserType")
        public Integer openUserType;

        public static DescribeSafDeOrderResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeSafDeOrderResponseBodyResultObject self = new DescribeSafDeOrderResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeSafDeOrderResponseBodyResultObject setExpirationDate(Long expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }
        public Long getExpirationDate() {
            return this.expirationDate;
        }

        public DescribeSafDeOrderResponseBodyResultObject setOpenUserType(Integer openUserType) {
            this.openUserType = openUserType;
            return this;
        }
        public Integer getOpenUserType() {
            return this.openUserType;
        }

    }

}
