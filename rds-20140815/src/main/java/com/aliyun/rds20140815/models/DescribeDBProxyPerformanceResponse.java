// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBProxyPerformanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("StartTime")
    @Validation(required = true)
    public String startTime;

    @NameInMap("EndTime")
    @Validation(required = true)
    public String endTime;

    @NameInMap("PerformanceKeys")
    @Validation(required = true)
    public DescribeDBProxyPerformanceResponsePerformanceKeys performanceKeys;

    public static DescribeDBProxyPerformanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBProxyPerformanceResponse self = new DescribeDBProxyPerformanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBProxyPerformanceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBProxyPerformanceResponse setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeDBProxyPerformanceResponse setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDBProxyPerformanceResponse setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDBProxyPerformanceResponse setPerformanceKeys(DescribeDBProxyPerformanceResponsePerformanceKeys performanceKeys) {
        this.performanceKeys = performanceKeys;
        return this;
    }
    public DescribeDBProxyPerformanceResponsePerformanceKeys getPerformanceKeys() {
        return this.performanceKeys;
    }

    public static class DescribeDBProxyPerformanceResponsePerformanceKeysPerformanceKeyValuesPerformanceValue extends TeaModel {
        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        @NameInMap("Date")
        @Validation(required = true)
        public String date;

        public static DescribeDBProxyPerformanceResponsePerformanceKeysPerformanceKeyValuesPerformanceValue build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBProxyPerformanceResponsePerformanceKeysPerformanceKeyValuesPerformanceValue self = new DescribeDBProxyPerformanceResponsePerformanceKeysPerformanceKeyValuesPerformanceValue();
            return TeaModel.build(map, self);
        }

        public DescribeDBProxyPerformanceResponsePerformanceKeysPerformanceKeyValuesPerformanceValue setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeDBProxyPerformanceResponsePerformanceKeysPerformanceKeyValuesPerformanceValue setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

    }

    public static class DescribeDBProxyPerformanceResponsePerformanceKeysPerformanceKeyValues extends TeaModel {
        @NameInMap("PerformanceValue")
        @Validation(required = true)
        public java.util.List<DescribeDBProxyPerformanceResponsePerformanceKeysPerformanceKeyValuesPerformanceValue> performanceValue;

        public static DescribeDBProxyPerformanceResponsePerformanceKeysPerformanceKeyValues build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBProxyPerformanceResponsePerformanceKeysPerformanceKeyValues self = new DescribeDBProxyPerformanceResponsePerformanceKeysPerformanceKeyValues();
            return TeaModel.build(map, self);
        }

        public DescribeDBProxyPerformanceResponsePerformanceKeysPerformanceKeyValues setPerformanceValue(java.util.List<DescribeDBProxyPerformanceResponsePerformanceKeysPerformanceKeyValuesPerformanceValue> performanceValue) {
            this.performanceValue = performanceValue;
            return this;
        }
        public java.util.List<DescribeDBProxyPerformanceResponsePerformanceKeysPerformanceKeyValuesPerformanceValue> getPerformanceValue() {
            return this.performanceValue;
        }

    }

    public static class DescribeDBProxyPerformanceResponsePerformanceKeysPerformanceKey extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("ValueFormat")
        @Validation(required = true)
        public String valueFormat;

        @NameInMap("Values")
        @Validation(required = true)
        public DescribeDBProxyPerformanceResponsePerformanceKeysPerformanceKeyValues values;

        public static DescribeDBProxyPerformanceResponsePerformanceKeysPerformanceKey build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBProxyPerformanceResponsePerformanceKeysPerformanceKey self = new DescribeDBProxyPerformanceResponsePerformanceKeysPerformanceKey();
            return TeaModel.build(map, self);
        }

        public DescribeDBProxyPerformanceResponsePerformanceKeysPerformanceKey setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDBProxyPerformanceResponsePerformanceKeysPerformanceKey setValueFormat(String valueFormat) {
            this.valueFormat = valueFormat;
            return this;
        }
        public String getValueFormat() {
            return this.valueFormat;
        }

        public DescribeDBProxyPerformanceResponsePerformanceKeysPerformanceKey setValues(DescribeDBProxyPerformanceResponsePerformanceKeysPerformanceKeyValues values) {
            this.values = values;
            return this;
        }
        public DescribeDBProxyPerformanceResponsePerformanceKeysPerformanceKeyValues getValues() {
            return this.values;
        }

    }

    public static class DescribeDBProxyPerformanceResponsePerformanceKeys extends TeaModel {
        @NameInMap("PerformanceKey")
        @Validation(required = true)
        public java.util.List<DescribeDBProxyPerformanceResponsePerformanceKeysPerformanceKey> performanceKey;

        public static DescribeDBProxyPerformanceResponsePerformanceKeys build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBProxyPerformanceResponsePerformanceKeys self = new DescribeDBProxyPerformanceResponsePerformanceKeys();
            return TeaModel.build(map, self);
        }

        public DescribeDBProxyPerformanceResponsePerformanceKeys setPerformanceKey(java.util.List<DescribeDBProxyPerformanceResponsePerformanceKeysPerformanceKey> performanceKey) {
            this.performanceKey = performanceKey;
            return this;
        }
        public java.util.List<DescribeDBProxyPerformanceResponsePerformanceKeysPerformanceKey> getPerformanceKey() {
            return this.performanceKey;
        }

    }

}
