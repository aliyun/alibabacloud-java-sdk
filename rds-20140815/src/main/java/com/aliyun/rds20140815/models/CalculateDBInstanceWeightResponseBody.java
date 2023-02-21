// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CalculateDBInstanceWeightResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the system-assigned read weights.</p>
     */
    @NameInMap("Items")
    public CalculateDBInstanceWeightResponseBodyItems items;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CalculateDBInstanceWeightResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CalculateDBInstanceWeightResponseBody self = new CalculateDBInstanceWeightResponseBody();
        return TeaModel.build(map, self);
    }

    public CalculateDBInstanceWeightResponseBody setItems(CalculateDBInstanceWeightResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public CalculateDBInstanceWeightResponseBodyItems getItems() {
        return this.items;
    }

    public CalculateDBInstanceWeightResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CalculateDBInstanceWeightResponseBodyItemsDBInstanceWeight extends TeaModel {
        /**
         * <p>The ID of instance.</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        /**
         * <p>The role of the instance. Valid values:</p>
         * <br>
         * <p>*   **Master**: primary instance</p>
         * <p>*   **Readonly**: read-only instance</p>
         */
        @NameInMap("DBInstanceType")
        public String DBInstanceType;

        /**
         * <p>The threshold for the latency of data replication from the primary instance to the read-only instances. The read-only instances start to synchronize data from the primary instance after the time specified by the **ReadonlyInstanceSQLDelayedTime** parameter elapses. Unit: seconds.</p>
         */
        @NameInMap("ReadonlyInstanceSQLDelayedTime")
        public String readonlyInstanceSQLDelayedTime;

        /**
         * <p>The read weight that ApsaraDB RDS calculates in real time for the instance.</p>
         */
        @NameInMap("Weight")
        public String weight;

        public static CalculateDBInstanceWeightResponseBodyItemsDBInstanceWeight build(java.util.Map<String, ?> map) throws Exception {
            CalculateDBInstanceWeightResponseBodyItemsDBInstanceWeight self = new CalculateDBInstanceWeightResponseBodyItemsDBInstanceWeight();
            return TeaModel.build(map, self);
        }

        public CalculateDBInstanceWeightResponseBodyItemsDBInstanceWeight setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public CalculateDBInstanceWeightResponseBodyItemsDBInstanceWeight setDBInstanceType(String DBInstanceType) {
            this.DBInstanceType = DBInstanceType;
            return this;
        }
        public String getDBInstanceType() {
            return this.DBInstanceType;
        }

        public CalculateDBInstanceWeightResponseBodyItemsDBInstanceWeight setReadonlyInstanceSQLDelayedTime(String readonlyInstanceSQLDelayedTime) {
            this.readonlyInstanceSQLDelayedTime = readonlyInstanceSQLDelayedTime;
            return this;
        }
        public String getReadonlyInstanceSQLDelayedTime() {
            return this.readonlyInstanceSQLDelayedTime;
        }

        public CalculateDBInstanceWeightResponseBodyItemsDBInstanceWeight setWeight(String weight) {
            this.weight = weight;
            return this;
        }
        public String getWeight() {
            return this.weight;
        }

    }

    public static class CalculateDBInstanceWeightResponseBodyItems extends TeaModel {
        @NameInMap("DBInstanceWeight")
        public java.util.List<CalculateDBInstanceWeightResponseBodyItemsDBInstanceWeight> DBInstanceWeight;

        public static CalculateDBInstanceWeightResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            CalculateDBInstanceWeightResponseBodyItems self = new CalculateDBInstanceWeightResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public CalculateDBInstanceWeightResponseBodyItems setDBInstanceWeight(java.util.List<CalculateDBInstanceWeightResponseBodyItemsDBInstanceWeight> DBInstanceWeight) {
            this.DBInstanceWeight = DBInstanceWeight;
            return this;
        }
        public java.util.List<CalculateDBInstanceWeightResponseBodyItemsDBInstanceWeight> getDBInstanceWeight() {
            return this.DBInstanceWeight;
        }

    }

}
