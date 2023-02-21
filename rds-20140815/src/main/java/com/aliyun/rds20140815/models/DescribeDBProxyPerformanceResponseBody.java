// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBProxyPerformanceResponseBody extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>An internal parameter. You do not need to specify this parameter.</p>
     */
    @NameInMap("DBProxyEngineType")
    public String DBProxyEngineType;

    /**
     * <p>The end of the time range that is queried.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>An array that consists of the performance metrics that are returned.</p>
     */
    @NameInMap("PerformanceKeys")
    public DescribeDBProxyPerformanceResponseBodyPerformanceKeys performanceKeys;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The beginning of the time range that is queried.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDBProxyPerformanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBProxyPerformanceResponseBody self = new DescribeDBProxyPerformanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBProxyPerformanceResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeDBProxyPerformanceResponseBody setDBProxyEngineType(String DBProxyEngineType) {
        this.DBProxyEngineType = DBProxyEngineType;
        return this;
    }
    public String getDBProxyEngineType() {
        return this.DBProxyEngineType;
    }

    public DescribeDBProxyPerformanceResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDBProxyPerformanceResponseBody setPerformanceKeys(DescribeDBProxyPerformanceResponseBodyPerformanceKeys performanceKeys) {
        this.performanceKeys = performanceKeys;
        return this;
    }
    public DescribeDBProxyPerformanceResponseBodyPerformanceKeys getPerformanceKeys() {
        return this.performanceKeys;
    }

    public DescribeDBProxyPerformanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBProxyPerformanceResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class DescribeDBProxyPerformanceResponseBodyPerformanceKeysPerformanceKeyValuesPerformanceValue extends TeaModel {
        /**
         * <p>The time when the value of the performance metric was recorded. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("Date")
        public String date;

        /**
         * <p>The value of the performance metric.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeDBProxyPerformanceResponseBodyPerformanceKeysPerformanceKeyValuesPerformanceValue build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBProxyPerformanceResponseBodyPerformanceKeysPerformanceKeyValuesPerformanceValue self = new DescribeDBProxyPerformanceResponseBodyPerformanceKeysPerformanceKeyValuesPerformanceValue();
            return TeaModel.build(map, self);
        }

        public DescribeDBProxyPerformanceResponseBodyPerformanceKeysPerformanceKeyValuesPerformanceValue setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public DescribeDBProxyPerformanceResponseBodyPerformanceKeysPerformanceKeyValuesPerformanceValue setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDBProxyPerformanceResponseBodyPerformanceKeysPerformanceKeyValues extends TeaModel {
        @NameInMap("PerformanceValue")
        public java.util.List<DescribeDBProxyPerformanceResponseBodyPerformanceKeysPerformanceKeyValuesPerformanceValue> performanceValue;

        public static DescribeDBProxyPerformanceResponseBodyPerformanceKeysPerformanceKeyValues build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBProxyPerformanceResponseBodyPerformanceKeysPerformanceKeyValues self = new DescribeDBProxyPerformanceResponseBodyPerformanceKeysPerformanceKeyValues();
            return TeaModel.build(map, self);
        }

        public DescribeDBProxyPerformanceResponseBodyPerformanceKeysPerformanceKeyValues setPerformanceValue(java.util.List<DescribeDBProxyPerformanceResponseBodyPerformanceKeysPerformanceKeyValuesPerformanceValue> performanceValue) {
            this.performanceValue = performanceValue;
            return this;
        }
        public java.util.List<DescribeDBProxyPerformanceResponseBodyPerformanceKeysPerformanceKeyValuesPerformanceValue> getPerformanceValue() {
            return this.performanceValue;
        }

    }

    public static class DescribeDBProxyPerformanceResponseBodyPerformanceKeysPerformanceKey extends TeaModel {
        /**
         * <p>The name of the performance metric.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The format in which the value of the performance metric is returned.</p>
         */
        @NameInMap("ValueFormat")
        public String valueFormat;

        /**
         * <p>An array that consists of the values of the performance metric in the following format: {value1, value2, ...}.</p>
         */
        @NameInMap("Values")
        public DescribeDBProxyPerformanceResponseBodyPerformanceKeysPerformanceKeyValues values;

        public static DescribeDBProxyPerformanceResponseBodyPerformanceKeysPerformanceKey build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBProxyPerformanceResponseBodyPerformanceKeysPerformanceKey self = new DescribeDBProxyPerformanceResponseBodyPerformanceKeysPerformanceKey();
            return TeaModel.build(map, self);
        }

        public DescribeDBProxyPerformanceResponseBodyPerformanceKeysPerformanceKey setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDBProxyPerformanceResponseBodyPerformanceKeysPerformanceKey setValueFormat(String valueFormat) {
            this.valueFormat = valueFormat;
            return this;
        }
        public String getValueFormat() {
            return this.valueFormat;
        }

        public DescribeDBProxyPerformanceResponseBodyPerformanceKeysPerformanceKey setValues(DescribeDBProxyPerformanceResponseBodyPerformanceKeysPerformanceKeyValues values) {
            this.values = values;
            return this;
        }
        public DescribeDBProxyPerformanceResponseBodyPerformanceKeysPerformanceKeyValues getValues() {
            return this.values;
        }

    }

    public static class DescribeDBProxyPerformanceResponseBodyPerformanceKeys extends TeaModel {
        @NameInMap("PerformanceKey")
        public java.util.List<DescribeDBProxyPerformanceResponseBodyPerformanceKeysPerformanceKey> performanceKey;

        public static DescribeDBProxyPerformanceResponseBodyPerformanceKeys build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBProxyPerformanceResponseBodyPerformanceKeys self = new DescribeDBProxyPerformanceResponseBodyPerformanceKeys();
            return TeaModel.build(map, self);
        }

        public DescribeDBProxyPerformanceResponseBodyPerformanceKeys setPerformanceKey(java.util.List<DescribeDBProxyPerformanceResponseBodyPerformanceKeysPerformanceKey> performanceKey) {
            this.performanceKey = performanceKey;
            return this;
        }
        public java.util.List<DescribeDBProxyPerformanceResponseBodyPerformanceKeysPerformanceKey> getPerformanceKey() {
            return this.performanceKey;
        }

    }

}
