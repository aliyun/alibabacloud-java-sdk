// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreatePolarxOrderResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("OrderResultList")
    public java.util.List<CreatePolarxOrderResponseBodyOrderResultList> orderResultList;

    public static CreatePolarxOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePolarxOrderResponseBody self = new CreatePolarxOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePolarxOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePolarxOrderResponseBody setOrderResultList(java.util.List<CreatePolarxOrderResponseBodyOrderResultList> orderResultList) {
        this.orderResultList = orderResultList;
        return this;
    }
    public java.util.List<CreatePolarxOrderResponseBodyOrderResultList> getOrderResultList() {
        return this.orderResultList;
    }

    public static class CreatePolarxOrderResponseBodyOrderResultList extends TeaModel {
        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        @NameInMap("OrderId")
        public Long orderId;

        public static CreatePolarxOrderResponseBodyOrderResultList build(java.util.Map<String, ?> map) throws Exception {
            CreatePolarxOrderResponseBodyOrderResultList self = new CreatePolarxOrderResponseBodyOrderResultList();
            return TeaModel.build(map, self);
        }

        public CreatePolarxOrderResponseBodyOrderResultList setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        public CreatePolarxOrderResponseBodyOrderResultList setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

    }

}
