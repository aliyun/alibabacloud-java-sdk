// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class DescribeDBClusterStorageLimitationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>failed</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Data")
    public DescribeDBClusterStorageLimitationResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <strong>example:</strong>
     * <p>An error occurred while processing your request.</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <strong>example:</strong>
     * <p>4773E4EC-025D-509F-AEA9-D53123FDFB0F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBClusterStorageLimitationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterStorageLimitationResponseBody self = new DescribeDBClusterStorageLimitationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterStorageLimitationResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribeDBClusterStorageLimitationResponseBody setData(DescribeDBClusterStorageLimitationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDBClusterStorageLimitationResponseBodyData getData() {
        return this.data;
    }

    public DescribeDBClusterStorageLimitationResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public DescribeDBClusterStorageLimitationResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public DescribeDBClusterStorageLimitationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDBClusterStorageLimitationResponseBodyDataClassCodeList extends TeaModel {
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
        public Integer cpuCores;

        /**
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("DefaultStorageInGB")
        public Integer defaultStorageInGB;

        /**
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("MaxStorageInGB")
        public Integer maxStorageInGB;

        /**
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("MemoryInGB")
        public Integer memoryInGB;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MinStorageInGB")
        public Integer minStorageInGB;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("StepStorageInGB")
        public Integer stepStorageInGB;

        public static DescribeDBClusterStorageLimitationResponseBodyDataClassCodeList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterStorageLimitationResponseBodyDataClassCodeList self = new DescribeDBClusterStorageLimitationResponseBodyDataClassCodeList();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterStorageLimitationResponseBodyDataClassCodeList setClassCode(String classCode) {
            this.classCode = classCode;
            return this;
        }
        public String getClassCode() {
            return this.classCode;
        }

        public DescribeDBClusterStorageLimitationResponseBodyDataClassCodeList setCpuCores(Integer cpuCores) {
            this.cpuCores = cpuCores;
            return this;
        }
        public Integer getCpuCores() {
            return this.cpuCores;
        }

        public DescribeDBClusterStorageLimitationResponseBodyDataClassCodeList setDefaultStorageInGB(Integer defaultStorageInGB) {
            this.defaultStorageInGB = defaultStorageInGB;
            return this;
        }
        public Integer getDefaultStorageInGB() {
            return this.defaultStorageInGB;
        }

        public DescribeDBClusterStorageLimitationResponseBodyDataClassCodeList setMaxStorageInGB(Integer maxStorageInGB) {
            this.maxStorageInGB = maxStorageInGB;
            return this;
        }
        public Integer getMaxStorageInGB() {
            return this.maxStorageInGB;
        }

        public DescribeDBClusterStorageLimitationResponseBodyDataClassCodeList setMemoryInGB(Integer memoryInGB) {
            this.memoryInGB = memoryInGB;
            return this;
        }
        public Integer getMemoryInGB() {
            return this.memoryInGB;
        }

        public DescribeDBClusterStorageLimitationResponseBodyDataClassCodeList setMinStorageInGB(Integer minStorageInGB) {
            this.minStorageInGB = minStorageInGB;
            return this;
        }
        public Integer getMinStorageInGB() {
            return this.minStorageInGB;
        }

        public DescribeDBClusterStorageLimitationResponseBodyDataClassCodeList setStepStorageInGB(Integer stepStorageInGB) {
            this.stepStorageInGB = stepStorageInGB;
            return this;
        }
        public Integer getStepStorageInGB() {
            return this.stepStorageInGB;
        }

    }

    public static class DescribeDBClusterStorageLimitationResponseBodyData extends TeaModel {
        @NameInMap("ClassCodeList")
        public java.util.List<DescribeDBClusterStorageLimitationResponseBodyDataClassCodeList> classCodeList;

        public static DescribeDBClusterStorageLimitationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterStorageLimitationResponseBodyData self = new DescribeDBClusterStorageLimitationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterStorageLimitationResponseBodyData setClassCodeList(java.util.List<DescribeDBClusterStorageLimitationResponseBodyDataClassCodeList> classCodeList) {
            this.classCodeList = classCodeList;
            return this;
        }
        public java.util.List<DescribeDBClusterStorageLimitationResponseBodyDataClassCodeList> getClassCodeList() {
            return this.classCodeList;
        }

    }

}
