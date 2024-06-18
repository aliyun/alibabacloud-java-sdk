// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CalculateDBInstanceWeightResponseBody extends TeaModel {
    /**
     * <p>An array that consists of information about the system-assigned read weight.</p>
     */
    @NameInMap("Items")
    public CalculateDBInstanceWeightResponseBodyItems items;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C816A4BF-A6EC-4722-95F9-2055859CCFD2</p>
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
         * <p>The instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6wjk5xxxxxxx</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        /**
         * <p>The type of the instance. Valid values:</p>
         * <ul>
         * <li><strong>Master</strong>: primary instance</li>
         * <li><strong>Readonly</strong>: read-only instance</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Master</p>
         */
        @NameInMap("DBInstanceType")
        public String DBInstanceType;

        /**
         * <p>The latency at which the read-only instances replicate data. The read-only instances replicate data from the primary instance at the latency that is specified by the <strong>ReadonlyInstanceSQLDelayedTime</strong> parameter. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("ReadonlyInstanceSQLDelayedTime")
        public String readonlyInstanceSQLDelayedTime;

        /**
         * <p>The read weight that the system calculates in real time for the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
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
