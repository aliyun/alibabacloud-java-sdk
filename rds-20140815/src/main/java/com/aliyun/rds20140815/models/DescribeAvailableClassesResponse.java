// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeAvailableClassesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DBInstanceClasses")
    @Validation(required = true)
    public java.util.List<DescribeAvailableClassesResponseDBInstanceClasses> DBInstanceClasses;

    public static DescribeAvailableClassesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableClassesResponse self = new DescribeAvailableClassesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableClassesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAvailableClassesResponse setDBInstanceClasses(java.util.List<DescribeAvailableClassesResponseDBInstanceClasses> DBInstanceClasses) {
        this.DBInstanceClasses = DBInstanceClasses;
        return this;
    }
    public java.util.List<DescribeAvailableClassesResponseDBInstanceClasses> getDBInstanceClasses() {
        return this.DBInstanceClasses;
    }

    public static class DescribeAvailableClassesResponseDBInstanceClassesDBInstanceStorageRange extends TeaModel {
        @NameInMap("MaxValue")
        @Validation(required = true)
        public Integer maxValue;

        @NameInMap("MinValue")
        @Validation(required = true)
        public Integer minValue;

        @NameInMap("Step")
        @Validation(required = true)
        public Integer step;

        public static DescribeAvailableClassesResponseDBInstanceClassesDBInstanceStorageRange build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableClassesResponseDBInstanceClassesDBInstanceStorageRange self = new DescribeAvailableClassesResponseDBInstanceClassesDBInstanceStorageRange();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableClassesResponseDBInstanceClassesDBInstanceStorageRange setMaxValue(Integer maxValue) {
            this.maxValue = maxValue;
            return this;
        }
        public Integer getMaxValue() {
            return this.maxValue;
        }

        public DescribeAvailableClassesResponseDBInstanceClassesDBInstanceStorageRange setMinValue(Integer minValue) {
            this.minValue = minValue;
            return this;
        }
        public Integer getMinValue() {
            return this.minValue;
        }

        public DescribeAvailableClassesResponseDBInstanceClassesDBInstanceStorageRange setStep(Integer step) {
            this.step = step;
            return this;
        }
        public Integer getStep() {
            return this.step;
        }

    }

    public static class DescribeAvailableClassesResponseDBInstanceClasses extends TeaModel {
        @NameInMap("DBInstanceClass")
        @Validation(required = true)
        public String DBInstanceClass;

        @NameInMap("StorageRange")
        @Validation(required = true)
        public String storageRange;

        @NameInMap("DBInstanceStorageRange")
        @Validation(required = true)
        public DescribeAvailableClassesResponseDBInstanceClassesDBInstanceStorageRange DBInstanceStorageRange;

        public static DescribeAvailableClassesResponseDBInstanceClasses build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableClassesResponseDBInstanceClasses self = new DescribeAvailableClassesResponseDBInstanceClasses();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableClassesResponseDBInstanceClasses setDBInstanceClass(String DBInstanceClass) {
            this.DBInstanceClass = DBInstanceClass;
            return this;
        }
        public String getDBInstanceClass() {
            return this.DBInstanceClass;
        }

        public DescribeAvailableClassesResponseDBInstanceClasses setStorageRange(String storageRange) {
            this.storageRange = storageRange;
            return this;
        }
        public String getStorageRange() {
            return this.storageRange;
        }

        public DescribeAvailableClassesResponseDBInstanceClasses setDBInstanceStorageRange(DescribeAvailableClassesResponseDBInstanceClassesDBInstanceStorageRange DBInstanceStorageRange) {
            this.DBInstanceStorageRange = DBInstanceStorageRange;
            return this;
        }
        public DescribeAvailableClassesResponseDBInstanceClassesDBInstanceStorageRange getDBInstanceStorageRange() {
            return this.DBInstanceStorageRange;
        }

    }

}
