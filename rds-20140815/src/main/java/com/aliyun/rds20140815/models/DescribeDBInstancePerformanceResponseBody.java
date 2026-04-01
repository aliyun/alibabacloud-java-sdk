// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstancePerformanceResponseBody extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5xxxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The end time of the query. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm</em>Z format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2012-06-19T15:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The database engine of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("Engine")
    public String engine;

    @NameInMap("PerformanceKeys")
    public DescribeDBInstancePerformanceResponseBodyPerformanceKeys performanceKeys;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A5409D02-D661-4BF3-8F3D-0A814D0574E7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The start time of the query. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm</em>Z format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2012-06-10T15:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDBInstancePerformanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstancePerformanceResponseBody self = new DescribeDBInstancePerformanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstancePerformanceResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeDBInstancePerformanceResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDBInstancePerformanceResponseBody setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeDBInstancePerformanceResponseBody setPerformanceKeys(DescribeDBInstancePerformanceResponseBodyPerformanceKeys performanceKeys) {
        this.performanceKeys = performanceKeys;
        return this;
    }
    public DescribeDBInstancePerformanceResponseBodyPerformanceKeys getPerformanceKeys() {
        return this.performanceKeys;
    }

    public DescribeDBInstancePerformanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBInstancePerformanceResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeDBInstancePerformanceResponseBodyPerformanceKeysPerformanceKeyValuesPerformanceValue extends TeaModel {
        @NameInMap("Date")
        public String date;

        @NameInMap("Value")
        public String value;

        public static DescribeDBInstancePerformanceResponseBodyPerformanceKeysPerformanceKeyValuesPerformanceValue build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancePerformanceResponseBodyPerformanceKeysPerformanceKeyValuesPerformanceValue self = new DescribeDBInstancePerformanceResponseBodyPerformanceKeysPerformanceKeyValuesPerformanceValue();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancePerformanceResponseBodyPerformanceKeysPerformanceKeyValuesPerformanceValue setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public DescribeDBInstancePerformanceResponseBodyPerformanceKeysPerformanceKeyValuesPerformanceValue setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDBInstancePerformanceResponseBodyPerformanceKeysPerformanceKeyValues extends TeaModel {
        @NameInMap("PerformanceValue")
        public java.util.List<DescribeDBInstancePerformanceResponseBodyPerformanceKeysPerformanceKeyValuesPerformanceValue> performanceValue;

        public static DescribeDBInstancePerformanceResponseBodyPerformanceKeysPerformanceKeyValues build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancePerformanceResponseBodyPerformanceKeysPerformanceKeyValues self = new DescribeDBInstancePerformanceResponseBodyPerformanceKeysPerformanceKeyValues();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancePerformanceResponseBodyPerformanceKeysPerformanceKeyValues setPerformanceValue(java.util.List<DescribeDBInstancePerformanceResponseBodyPerformanceKeysPerformanceKeyValuesPerformanceValue> performanceValue) {
            this.performanceValue = performanceValue;
            return this;
        }
        public java.util.List<DescribeDBInstancePerformanceResponseBodyPerformanceKeysPerformanceKeyValuesPerformanceValue> getPerformanceValue() {
            return this.performanceValue;
        }

    }

    public static class DescribeDBInstancePerformanceResponseBodyPerformanceKeysPerformanceKey extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Unit")
        public String unit;

        @NameInMap("ValueFormat")
        public String valueFormat;

        @NameInMap("Values")
        public DescribeDBInstancePerformanceResponseBodyPerformanceKeysPerformanceKeyValues values;

        public static DescribeDBInstancePerformanceResponseBodyPerformanceKeysPerformanceKey build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancePerformanceResponseBodyPerformanceKeysPerformanceKey self = new DescribeDBInstancePerformanceResponseBodyPerformanceKeysPerformanceKey();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancePerformanceResponseBodyPerformanceKeysPerformanceKey setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDBInstancePerformanceResponseBodyPerformanceKeysPerformanceKey setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public DescribeDBInstancePerformanceResponseBodyPerformanceKeysPerformanceKey setValueFormat(String valueFormat) {
            this.valueFormat = valueFormat;
            return this;
        }
        public String getValueFormat() {
            return this.valueFormat;
        }

        public DescribeDBInstancePerformanceResponseBodyPerformanceKeysPerformanceKey setValues(DescribeDBInstancePerformanceResponseBodyPerformanceKeysPerformanceKeyValues values) {
            this.values = values;
            return this;
        }
        public DescribeDBInstancePerformanceResponseBodyPerformanceKeysPerformanceKeyValues getValues() {
            return this.values;
        }

    }

    public static class DescribeDBInstancePerformanceResponseBodyPerformanceKeys extends TeaModel {
        @NameInMap("PerformanceKey")
        public java.util.List<DescribeDBInstancePerformanceResponseBodyPerformanceKeysPerformanceKey> performanceKey;

        public static DescribeDBInstancePerformanceResponseBodyPerformanceKeys build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstancePerformanceResponseBodyPerformanceKeys self = new DescribeDBInstancePerformanceResponseBodyPerformanceKeys();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstancePerformanceResponseBodyPerformanceKeys setPerformanceKey(java.util.List<DescribeDBInstancePerformanceResponseBodyPerformanceKeysPerformanceKey> performanceKey) {
            this.performanceKey = performanceKey;
            return this;
        }
        public java.util.List<DescribeDBInstancePerformanceResponseBodyPerformanceKeysPerformanceKey> getPerformanceKey() {
            return this.performanceKey;
        }

    }

}
