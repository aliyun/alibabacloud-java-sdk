// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class DescribeAllDBInstanceClassResponseBody extends TeaModel {
    /**
     * <p>The instance specifications.</p>
     */
    @NameInMap("ClassCodeList")
    public java.util.List<DescribeAllDBInstanceClassResponseBodyClassCodeList> classCodeList;

    /**
     * <strong>example:</strong>
     * <p>4773E4EC-025D-509F-AEA9-D53123FDFB0F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAllDBInstanceClassResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAllDBInstanceClassResponseBody self = new DescribeAllDBInstanceClassResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAllDBInstanceClassResponseBody setClassCodeList(java.util.List<DescribeAllDBInstanceClassResponseBodyClassCodeList> classCodeList) {
        this.classCodeList = classCodeList;
        return this;
    }
    public java.util.List<DescribeAllDBInstanceClassResponseBodyClassCodeList> getClassCodeList() {
        return this.classCodeList;
    }

    public DescribeAllDBInstanceClassResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAllDBInstanceClassResponseBodyClassCodeList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>selectdb.xlarge</p>
         */
        @NameInMap("ClassCode")
        public String classCode;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("CpuCores")
        public Long cpuCores;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("DefaultStorageInGB")
        public Long defaultStorageInGB;

        /**
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("MaxStorageInGB")
        public Long maxStorageInGB;

        /**
         * <p>The memory size.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("MemoryInGB")
        public Long memoryInGB;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MinStorageInGB")
        public Long minStorageInGB;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("StepStorageInGB")
        public Long stepStorageInGB;

        public static DescribeAllDBInstanceClassResponseBodyClassCodeList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAllDBInstanceClassResponseBodyClassCodeList self = new DescribeAllDBInstanceClassResponseBodyClassCodeList();
            return TeaModel.build(map, self);
        }

        public DescribeAllDBInstanceClassResponseBodyClassCodeList setClassCode(String classCode) {
            this.classCode = classCode;
            return this;
        }
        public String getClassCode() {
            return this.classCode;
        }

        public DescribeAllDBInstanceClassResponseBodyClassCodeList setCpuCores(Long cpuCores) {
            this.cpuCores = cpuCores;
            return this;
        }
        public Long getCpuCores() {
            return this.cpuCores;
        }

        public DescribeAllDBInstanceClassResponseBodyClassCodeList setDefaultStorageInGB(Long defaultStorageInGB) {
            this.defaultStorageInGB = defaultStorageInGB;
            return this;
        }
        public Long getDefaultStorageInGB() {
            return this.defaultStorageInGB;
        }

        public DescribeAllDBInstanceClassResponseBodyClassCodeList setMaxStorageInGB(Long maxStorageInGB) {
            this.maxStorageInGB = maxStorageInGB;
            return this;
        }
        public Long getMaxStorageInGB() {
            return this.maxStorageInGB;
        }

        public DescribeAllDBInstanceClassResponseBodyClassCodeList setMemoryInGB(Long memoryInGB) {
            this.memoryInGB = memoryInGB;
            return this;
        }
        public Long getMemoryInGB() {
            return this.memoryInGB;
        }

        public DescribeAllDBInstanceClassResponseBodyClassCodeList setMinStorageInGB(Long minStorageInGB) {
            this.minStorageInGB = minStorageInGB;
            return this;
        }
        public Long getMinStorageInGB() {
            return this.minStorageInGB;
        }

        public DescribeAllDBInstanceClassResponseBodyClassCodeList setStepStorageInGB(Long stepStorageInGB) {
            this.stepStorageInGB = stepStorageInGB;
            return this;
        }
        public Long getStepStorageInGB() {
            return this.stepStorageInGB;
        }

    }

}
