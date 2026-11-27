// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class CreateDBInstanceResponseBody extends TeaModel {
    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Data")
    public CreateDBInstanceResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4773E4EC-025D-509F-AEA9-D53123FDFB0F</p>
     */
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
        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>selectdb-cn-7213cjv****</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        /**
         * <p>The order ID.</p>
         * 
         * <strong>example:</strong>
         * <p>21137950671****</p>
         */
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
