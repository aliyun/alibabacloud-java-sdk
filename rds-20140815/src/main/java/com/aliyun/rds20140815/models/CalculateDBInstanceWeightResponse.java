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

    }

    public static class CalculateDBInstanceWeightResponseItems extends TeaModel {
        @NameInMap("DBInstanceWeight")
        @Validation(required = true)
        public java.util.List<CalculateDBInstanceWeightResponseItemsDBInstanceWeight> DBInstanceWeight;

        public static CalculateDBInstanceWeightResponseItems build(java.util.Map<String, ?> map) throws Exception {
            CalculateDBInstanceWeightResponseItems self = new CalculateDBInstanceWeightResponseItems();
            return TeaModel.build(map, self);
        }

    }

}
