// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceConfigResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeDBInstanceConfigResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>C458B1E8-1683-3645-B154-6BA32080EEA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBInstanceConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceConfigResponseBody self = new DescribeDBInstanceConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceConfigResponseBody setData(DescribeDBInstanceConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDBInstanceConfigResponseBodyData getData() {
        return this.data;
    }

    public DescribeDBInstanceConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDBInstanceConfigResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>htap</p>
         */
        @NameInMap("ConfigName")
        public String configName;

        @NameInMap("ConfigValue")
        public String configValue;

        @NameInMap("DbInstanceName")
        public String dbInstanceName;

        public static DescribeDBInstanceConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBInstanceConfigResponseBodyData self = new DescribeDBInstanceConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDBInstanceConfigResponseBodyData setConfigName(String configName) {
            this.configName = configName;
            return this;
        }
        public String getConfigName() {
            return this.configName;
        }

        public DescribeDBInstanceConfigResponseBodyData setConfigValue(String configValue) {
            this.configValue = configValue;
            return this;
        }
        public String getConfigValue() {
            return this.configValue;
        }

        public DescribeDBInstanceConfigResponseBodyData setDbInstanceName(String dbInstanceName) {
            this.dbInstanceName = dbInstanceName;
            return this;
        }
        public String getDbInstanceName() {
            return this.dbInstanceName;
        }

    }

}
