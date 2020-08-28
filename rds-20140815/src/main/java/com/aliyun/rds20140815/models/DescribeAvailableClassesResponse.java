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

    }

}
