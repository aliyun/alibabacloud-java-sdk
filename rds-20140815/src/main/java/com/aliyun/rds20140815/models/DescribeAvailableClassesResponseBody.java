// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeAvailableClassesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DBInstanceClasses")
    public java.util.List<DescribeAvailableClassesResponseBodyDBInstanceClasses> DBInstanceClasses;

    public static DescribeAvailableClassesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableClassesResponseBody self = new DescribeAvailableClassesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableClassesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAvailableClassesResponseBody setDBInstanceClasses(java.util.List<DescribeAvailableClassesResponseBodyDBInstanceClasses> DBInstanceClasses) {
        this.DBInstanceClasses = DBInstanceClasses;
        return this;
    }
    public java.util.List<DescribeAvailableClassesResponseBodyDBInstanceClasses> getDBInstanceClasses() {
        return this.DBInstanceClasses;
    }

    public static class DescribeAvailableClassesResponseBodyDBInstanceClassesDBInstanceStorageRange extends TeaModel {
        @NameInMap("Step")
        public Integer step;

        @NameInMap("MinValue")
        public Integer minValue;

        @NameInMap("MaxValue")
        public Integer maxValue;

        public static DescribeAvailableClassesResponseBodyDBInstanceClassesDBInstanceStorageRange build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableClassesResponseBodyDBInstanceClassesDBInstanceStorageRange self = new DescribeAvailableClassesResponseBodyDBInstanceClassesDBInstanceStorageRange();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableClassesResponseBodyDBInstanceClassesDBInstanceStorageRange setStep(Integer step) {
            this.step = step;
            return this;
        }
        public Integer getStep() {
            return this.step;
        }

        public DescribeAvailableClassesResponseBodyDBInstanceClassesDBInstanceStorageRange setMinValue(Integer minValue) {
            this.minValue = minValue;
            return this;
        }
        public Integer getMinValue() {
            return this.minValue;
        }

        public DescribeAvailableClassesResponseBodyDBInstanceClassesDBInstanceStorageRange setMaxValue(Integer maxValue) {
            this.maxValue = maxValue;
            return this;
        }
        public Integer getMaxValue() {
            return this.maxValue;
        }

    }

    public static class DescribeAvailableClassesResponseBodyDBInstanceClasses extends TeaModel {
        @NameInMap("DBInstanceClass")
        public String DBInstanceClass;

        @NameInMap("DBInstanceStorageRange")
        public DescribeAvailableClassesResponseBodyDBInstanceClassesDBInstanceStorageRange DBInstanceStorageRange;

        public static DescribeAvailableClassesResponseBodyDBInstanceClasses build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableClassesResponseBodyDBInstanceClasses self = new DescribeAvailableClassesResponseBodyDBInstanceClasses();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableClassesResponseBodyDBInstanceClasses setDBInstanceClass(String DBInstanceClass) {
            this.DBInstanceClass = DBInstanceClass;
            return this;
        }
        public String getDBInstanceClass() {
            return this.DBInstanceClass;
        }

        public DescribeAvailableClassesResponseBodyDBInstanceClasses setDBInstanceStorageRange(DescribeAvailableClassesResponseBodyDBInstanceClassesDBInstanceStorageRange DBInstanceStorageRange) {
            this.DBInstanceStorageRange = DBInstanceStorageRange;
            return this;
        }
        public DescribeAvailableClassesResponseBodyDBInstanceClassesDBInstanceStorageRange getDBInstanceStorageRange() {
            return this.DBInstanceStorageRange;
        }

    }

}
