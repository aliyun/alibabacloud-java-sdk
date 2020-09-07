// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstancePerformanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("Engine")
    @Validation(required = true)
    public String engine;

    @NameInMap("StartTime")
    @Validation(required = true)
    public String startTime;

    @NameInMap("EndTime")
    @Validation(required = true)
    public String endTime;

    @NameInMap("PerformanceKeys")
    @Validation(required = true)
    public DescribeDBInstancePerformanceResponsePerformanceKeys performanceKeys;

    public static DescribeDBInstancePerformanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstancePerformanceResponse self = new DescribeDBInstancePerformanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstancePerformanceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBInstancePerformanceResponse setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeDBInstancePerformanceResponse setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeDBInstancePerformanceResponse setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDBInstancePerformanceResponse setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDBInstancePerformanceResponse setPerformanceKeys(DescribeDBInstancePerformanceResponsePerformanceKeys performanceKeys) {
        this.performanceKeys = performanceKeys;
        return this;
    }
    public DescribeDBInstancePerformanceResponsePerformanceKeys getPerformanceKeys() {
        return this.performanceKeys;
    }

    public static class DescribeDBInstancePerformanceResponsePerformanceKeysPerformanceKeyValuesPerformanceValue extends TeaModel {
        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        @NameInMap("Date")
        @Validation(required = true)
        public String date;

        public static DescribeDBInstancePerformanceResponsePerformanceKeysPerformanceKeyValuesPerformanceValue build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancePerformanceResponsePerformanceKeysPerformanceKeyValuesPerformanceValue self = new DescribeDBInstancePerformanceResponsePerformanceKeysPerformanceKeyValuesPerformanceValue();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancePerformanceResponsePerformanceKeysPerformanceKeyValuesPerformanceValue setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeDBInstancePerformanceResponsePerformanceKeysPerformanceKeyValuesPerformanceValue setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

    }

    public static class DescribeDBInstancePerformanceResponsePerformanceKeysPerformanceKeyValues extends TeaModel {
        @NameInMap("PerformanceValue")
        @Validation(required = true)
        public java.util.List<DescribeDBInstancePerformanceResponsePerformanceKeysPerformanceKeyValuesPerformanceValue> performanceValue;

        public static DescribeDBInstancePerformanceResponsePerformanceKeysPerformanceKeyValues build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancePerformanceResponsePerformanceKeysPerformanceKeyValues self = new DescribeDBInstancePerformanceResponsePerformanceKeysPerformanceKeyValues();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancePerformanceResponsePerformanceKeysPerformanceKeyValues setPerformanceValue(java.util.List<DescribeDBInstancePerformanceResponsePerformanceKeysPerformanceKeyValuesPerformanceValue> performanceValue) {
            this.performanceValue = performanceValue;
            return this;
        }
        public java.util.List<DescribeDBInstancePerformanceResponsePerformanceKeysPerformanceKeyValuesPerformanceValue> getPerformanceValue() {
            return this.performanceValue;
        }

    }

    public static class DescribeDBInstancePerformanceResponsePerformanceKeysPerformanceKey extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Unit")
        @Validation(required = true)
        public String unit;

        @NameInMap("ValueFormat")
        @Validation(required = true)
        public String valueFormat;

        @NameInMap("Values")
        @Validation(required = true)
        public DescribeDBInstancePerformanceResponsePerformanceKeysPerformanceKeyValues values;

        public static DescribeDBInstancePerformanceResponsePerformanceKeysPerformanceKey build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancePerformanceResponsePerformanceKeysPerformanceKey self = new DescribeDBInstancePerformanceResponsePerformanceKeysPerformanceKey();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancePerformanceResponsePerformanceKeysPerformanceKey setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDBInstancePerformanceResponsePerformanceKeysPerformanceKey setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public DescribeDBInstancePerformanceResponsePerformanceKeysPerformanceKey setValueFormat(String valueFormat) {
            this.valueFormat = valueFormat;
            return this;
        }
        public String getValueFormat() {
            return this.valueFormat;
        }

        public DescribeDBInstancePerformanceResponsePerformanceKeysPerformanceKey setValues(DescribeDBInstancePerformanceResponsePerformanceKeysPerformanceKeyValues values) {
            this.values = values;
            return this;
        }
        public DescribeDBInstancePerformanceResponsePerformanceKeysPerformanceKeyValues getValues() {
            return this.values;
        }

    }

    public static class DescribeDBInstancePerformanceResponsePerformanceKeys extends TeaModel {
        @NameInMap("PerformanceKey")
        @Validation(required = true)
        public java.util.List<DescribeDBInstancePerformanceResponsePerformanceKeysPerformanceKey> performanceKey;

        public static DescribeDBInstancePerformanceResponsePerformanceKeys build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancePerformanceResponsePerformanceKeys self = new DescribeDBInstancePerformanceResponsePerformanceKeys();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancePerformanceResponsePerformanceKeys setPerformanceKey(java.util.List<DescribeDBInstancePerformanceResponsePerformanceKeysPerformanceKey> performanceKey) {
            this.performanceKey = performanceKey;
            return this;
        }
        public java.util.List<DescribeDBInstancePerformanceResponsePerformanceKeysPerformanceKey> getPerformanceKey() {
            return this.performanceKey;
        }

    }

}
