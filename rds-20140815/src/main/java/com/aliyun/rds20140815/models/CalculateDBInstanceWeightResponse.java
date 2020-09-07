// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CalculateDBInstanceWeightResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Items")
    @Validation(required = true)
    public CalculateDBInstanceWeightResponseItems items;

    public static CalculateDBInstanceWeightResponse build(java.util.Map<String, ?> map) throws Exception {
        CalculateDBInstanceWeightResponse self = new CalculateDBInstanceWeightResponse();
        return TeaModel.build(map, self);
    }

    public CalculateDBInstanceWeightResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CalculateDBInstanceWeightResponse setItems(CalculateDBInstanceWeightResponseItems items) {
        this.items = items;
        return this;
    }
    public CalculateDBInstanceWeightResponseItems getItems() {
        return this.items;
    }

    public static class CalculateDBInstanceWeightResponseItemsDBInstanceWeight extends TeaModel {
        @NameInMap("DBInstanceId")
        @Validation(required = true)
        public String DBInstanceId;

        @NameInMap("DBInstanceType")
        @Validation(required = true)
        public String DBInstanceType;

        @NameInMap("ReadonlyInstanceSQLDelayedTime")
        @Validation(required = true)
        public String readonlyInstanceSQLDelayedTime;

        @NameInMap("Availability")
        @Validation(required = true)
        public String availability;

        @NameInMap("Weight")
        @Validation(required = true)
        public String weight;

        public static CalculateDBInstanceWeightResponseItemsDBInstanceWeight build(java.util.Map<String, ?> map) throws Exception {
            CalculateDBInstanceWeightResponseItemsDBInstanceWeight self = new CalculateDBInstanceWeightResponseItemsDBInstanceWeight();
            return TeaModel.build(map, self);
        }

        public CalculateDBInstanceWeightResponseItemsDBInstanceWeight setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public CalculateDBInstanceWeightResponseItemsDBInstanceWeight setDBInstanceType(String DBInstanceType) {
            this.DBInstanceType = DBInstanceType;
            return this;
        }
        public String getDBInstanceType() {
            return this.DBInstanceType;
        }

        public CalculateDBInstanceWeightResponseItemsDBInstanceWeight setReadonlyInstanceSQLDelayedTime(String readonlyInstanceSQLDelayedTime) {
            this.readonlyInstanceSQLDelayedTime = readonlyInstanceSQLDelayedTime;
            return this;
        }
        public String getReadonlyInstanceSQLDelayedTime() {
            return this.readonlyInstanceSQLDelayedTime;
        }

        public CalculateDBInstanceWeightResponseItemsDBInstanceWeight setAvailability(String availability) {
            this.availability = availability;
            return this;
        }
        public String getAvailability() {
            return this.availability;
        }

        public CalculateDBInstanceWeightResponseItemsDBInstanceWeight setWeight(String weight) {
            this.weight = weight;
            return this;
        }
        public String getWeight() {
            return this.weight;
        }

    }

    public static class CalculateDBInstanceWeightResponseItems extends TeaModel {
        @NameInMap("DBInstanceWeight")
        @Validation(required = true)
        public java.util.List<CalculateDBInstanceWeightResponseItemsDBInstanceWeight> DBInstanceWeight;

        public static CalculateDBInstanceWeightResponseItems build(java.util.Map<String, ?> map) throws Exception {
            CalculateDBInstanceWeightResponseItems self = new CalculateDBInstanceWeightResponseItems();
            return TeaModel.build(map, self);
        }

        public CalculateDBInstanceWeightResponseItems setDBInstanceWeight(java.util.List<CalculateDBInstanceWeightResponseItemsDBInstanceWeight> DBInstanceWeight) {
            this.DBInstanceWeight = DBInstanceWeight;
            return this;
        }
        public java.util.List<CalculateDBInstanceWeightResponseItemsDBInstanceWeight> getDBInstanceWeight() {
            return this.DBInstanceWeight;
        }

    }

}
