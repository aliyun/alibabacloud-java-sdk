// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class CreateDBClusterResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateDBClusterResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>F8900A96-67F7-5274-A41B-7722E1ECF8C9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDBClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDBClusterResponseBody self = new CreateDBClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDBClusterResponseBody setData(CreateDBClusterResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateDBClusterResponseBodyData getData() {
        return this.data;
    }

    public CreateDBClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateDBClusterResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>selectdb-cn-1ls3sg0po0****</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <strong>example:</strong>
         * <p>selectdb-cn-7213cjv****</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        /**
         * <strong>example:</strong>
         * <p>219543646290345</p>
         */
        @NameInMap("OrderId")
        public Long orderId;

        public static CreateDBClusterResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateDBClusterResponseBodyData self = new CreateDBClusterResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateDBClusterResponseBodyData setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public CreateDBClusterResponseBodyData setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public CreateDBClusterResponseBodyData setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

    }

}
