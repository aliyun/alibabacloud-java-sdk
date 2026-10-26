// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeAvailableClassesResponseBody extends TeaModel {
    /**
     * <p>The list of available instance specifications.</p>
     */
    @NameInMap("DBInstanceClasses")
    public java.util.List<DescribeAvailableClassesResponseBodyDBInstanceClasses> DBInstanceClasses;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7E4448A6-9FE6-4474-A0C1-AA7CFC772CAC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAvailableClassesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableClassesResponseBody self = new DescribeAvailableClassesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableClassesResponseBody setDBInstanceClasses(java.util.List<DescribeAvailableClassesResponseBodyDBInstanceClasses> DBInstanceClasses) {
        this.DBInstanceClasses = DBInstanceClasses;
        return this;
    }
    public java.util.List<DescribeAvailableClassesResponseBodyDBInstanceClasses> getDBInstanceClasses() {
        return this.DBInstanceClasses;
    }

    public DescribeAvailableClassesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAvailableClassesResponseBodyDBInstanceClassesDBInstanceStorageRange extends TeaModel {
        /**
         * <p>The maximum storage space. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("MaxValue")
        public Integer maxValue;

        /**
         * <p>The minimum storage space. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("MinValue")
        public Integer minValue;

        /**
         * <p>The minimum step size for adjusting the storage space. The storage space increases in fixed increments of 5 GB.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Step")
        public Integer step;

        public static DescribeAvailableClassesResponseBodyDBInstanceClassesDBInstanceStorageRange build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableClassesResponseBodyDBInstanceClassesDBInstanceStorageRange self = new DescribeAvailableClassesResponseBodyDBInstanceClassesDBInstanceStorageRange();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableClassesResponseBodyDBInstanceClassesDBInstanceStorageRange setMaxValue(Integer maxValue) {
            this.maxValue = maxValue;
            return this;
        }
        public Integer getMaxValue() {
            return this.maxValue;
        }

        public DescribeAvailableClassesResponseBodyDBInstanceClassesDBInstanceStorageRange setMinValue(Integer minValue) {
            this.minValue = minValue;
            return this;
        }
        public Integer getMinValue() {
            return this.minValue;
        }

        public DescribeAvailableClassesResponseBodyDBInstanceClassesDBInstanceStorageRange setStep(Integer step) {
            this.step = step;
            return this;
        }
        public Integer getStep() {
            return this.step;
        }

    }

    public static class DescribeAvailableClassesResponseBodyDBInstanceClasses extends TeaModel {
        /**
         * <p>The instance specification.</p>
         * 
         * <strong>example:</strong>
         * <p>rds.mysql.c1.large</p>
         */
        @NameInMap("DBInstanceClass")
        public String DBInstanceClass;

        /**
         * <p>The instance storage range.</p>
         */
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
