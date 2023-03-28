// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreatePhysicalConnectionOccupancyOrderResponseBody extends TeaModel {
    /**
     * <p>The details.</p>
     */
    @NameInMap("Data")
    public CreatePhysicalConnectionOccupancyOrderResponseBodyData data;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreatePhysicalConnectionOccupancyOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePhysicalConnectionOccupancyOrderResponseBody self = new CreatePhysicalConnectionOccupancyOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePhysicalConnectionOccupancyOrderResponseBody setData(CreatePhysicalConnectionOccupancyOrderResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreatePhysicalConnectionOccupancyOrderResponseBodyData getData() {
        return this.data;
    }

    public CreatePhysicalConnectionOccupancyOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreatePhysicalConnectionOccupancyOrderResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the order that is placed.</p>
         */
        @NameInMap("OrderId")
        public String orderId;

        public static CreatePhysicalConnectionOccupancyOrderResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreatePhysicalConnectionOccupancyOrderResponseBodyData self = new CreatePhysicalConnectionOccupancyOrderResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreatePhysicalConnectionOccupancyOrderResponseBodyData setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

    }

}
