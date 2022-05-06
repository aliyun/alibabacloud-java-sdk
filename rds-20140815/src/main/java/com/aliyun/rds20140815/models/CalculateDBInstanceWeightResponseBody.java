// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CalculateDBInstanceWeightResponseBody extends TeaModel {
    @NameInMap("Items")
    public CalculateDBInstanceWeightResponseBodyItems items;

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
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        @NameInMap("DBInstanceType")
        public String DBInstanceType;

        @NameInMap("ReadonlyInstanceSQLDelayedTime")
        public String readonlyInstanceSQLDelayedTime;

        @NameInMap("Role")
        public String role;

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

        public CalculateDBInstanceWeightResponseBodyItemsDBInstanceWeight setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
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
