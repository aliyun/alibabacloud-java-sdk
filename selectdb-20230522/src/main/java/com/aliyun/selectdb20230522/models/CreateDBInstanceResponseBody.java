// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class CreateDBInstanceResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateDBInstanceResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateDBInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDBInstanceResponseBody self = new CreateDBInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDBInstanceResponseBody setData(CreateDBInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateDBInstanceResponseBodyData getData() {
        return this.data;
    }

    public CreateDBInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateDBInstanceResponseBodyData extends TeaModel {
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        @NameInMap("OrderId")
        public Long orderId;

        public static CreateDBInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateDBInstanceResponseBodyData self = new CreateDBInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateDBInstanceResponseBodyData setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public CreateDBInstanceResponseBodyData setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

    }

}
