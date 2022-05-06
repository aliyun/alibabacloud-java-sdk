// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBProxyPerformanceResponseBody extends TeaModel {
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("PerformanceKeys")
    public DescribeDBProxyPerformanceResponseBodyPerformanceKeys performanceKeys;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Date")
        public String date;

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
        @NameInMap("Key")
        public String key;

        @NameInMap("ValueFormat")
        public String valueFormat;

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
