// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeCustinsResourceInfoResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeCustinsResourceInfoResponseBodyData> data;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCustinsResourceInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustinsResourceInfoResponseBody self = new DescribeCustinsResourceInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCustinsResourceInfoResponseBody setData(java.util.List<DescribeCustinsResourceInfoResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeCustinsResourceInfoResponseBodyData> getData() {
        return this.data;
    }

    public DescribeCustinsResourceInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCustinsResourceInfoResponseBodyData extends TeaModel {
        /**
         * <p>Cpu adjustment deadline.</p>
         */
        @NameInMap("CpuAdjustDeadline")
        public String cpuAdjustDeadline;

        /**
         * <p>Cpu adjustable maximum ratio.</p>
         */
        @NameInMap("CpuAdjustableMaxRatio")
        public String cpuAdjustableMaxRatio;

        /**
         * <p>Maximum CPU usage.</p>
         */
        @NameInMap("CpuAdjustableMaxValue")
        public String cpuAdjustableMaxValue;

        /**
         * <p>CPU usage rate.</p>
         */
        @NameInMap("CpuIncreaseRatio")
        public String cpuIncreaseRatio;

        /**
         * <p>CPU usage rate.</p>
         */
        @NameInMap("CpuIncreaseRatioValue")
        public String cpuIncreaseRatioValue;

        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        /**
         * <p>The maximum number of IO requests per second.</p>
         */
        @NameInMap("IopsAdjustableMaxValue")
        public String iopsAdjustableMaxValue;

        /**
         * <p>Maximum Connection Adjustment Deadline</p>
         */
        @NameInMap("MaxConnAdjustDeadline")
        public String maxConnAdjustDeadline;

        /**
         * <p>Maximum number of concurrent connections.</p>
         */
        @NameInMap("MaxConnAdjustableMaxValue")
        public String maxConnAdjustableMaxValue;

        /**
         * <p>Maximum number of concurrent connections.</p>
         */
        @NameInMap("MaxConnIncreaseRatio")
        public String maxConnIncreaseRatio;

        /**
         * <p>Maximum number of concurrent connections.</p>
         */
        @NameInMap("MaxConnIncreaseRatioValue")
        public String maxConnIncreaseRatioValue;

        /**
         * <p>Maximum iops adjustment deadline.</p>
         */
        @NameInMap("MaxIopsAdjustDeadline")
        public String maxIopsAdjustDeadline;

        /**
         * <p>The maximum number of IO requests per second.</p>
         */
        @NameInMap("MaxIopsIncreaseRatio")
        public String maxIopsIncreaseRatio;

        /**
         * <p>The maximum number of IO requests per second.</p>
         */
        @NameInMap("MaxIopsIncreaseRatioValue")
        public String maxIopsIncreaseRatioValue;

        /**
         * <p>Memory adjustable maximum ratio.</p>
         */
        @NameInMap("MemAdjustableMaxRatio")
        public String memAdjustableMaxRatio;

        /**
         * <p>The maximum value of the resource to be evaluated.</p>
         */
        @NameInMap("MemAdjustableMaxValue")
        public String memAdjustableMaxValue;

        /**
         * <p>Memory adjustment deadline.</p>
         */
        @NameInMap("MemoryAdjustDeadline")
        public String memoryAdjustDeadline;

        /**
         * <p>Memory creation time.</p>
         */
        @NameInMap("MemoryIncreaseRatio")
        public String memoryIncreaseRatio;

        /**
         * <p>Memory usage.</p>
         */
        @NameInMap("MemoryIncreaseRatioValue")
        public String memoryIncreaseRatioValue;

        /**
         * <p>Number of instance CPUs.</p>
         */
        @NameInMap("OriginCpu")
        public String originCpu;

        /**
         * <p>Maximum number of concurrent connections.</p>
         */
        @NameInMap("OriginMaxConn")
        public String originMaxConn;

        /**
         * <p>The maximum number of IO requests per second.</p>
         */
        @NameInMap("OriginMaxIops")
        public String originMaxIops;

        /**
         * <p>Actual memory used.</p>
         */
        @NameInMap("OriginMemory")
        public String originMemory;

        public static DescribeCustinsResourceInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustinsResourceInfoResponseBodyData self = new DescribeCustinsResourceInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeCustinsResourceInfoResponseBodyData setCpuAdjustDeadline(String cpuAdjustDeadline) {
            this.cpuAdjustDeadline = cpuAdjustDeadline;
            return this;
        }
        public String getCpuAdjustDeadline() {
            return this.cpuAdjustDeadline;
        }

        public DescribeCustinsResourceInfoResponseBodyData setCpuAdjustableMaxRatio(String cpuAdjustableMaxRatio) {
            this.cpuAdjustableMaxRatio = cpuAdjustableMaxRatio;
            return this;
        }
        public String getCpuAdjustableMaxRatio() {
            return this.cpuAdjustableMaxRatio;
        }

        public DescribeCustinsResourceInfoResponseBodyData setCpuAdjustableMaxValue(String cpuAdjustableMaxValue) {
            this.cpuAdjustableMaxValue = cpuAdjustableMaxValue;
            return this;
        }
        public String getCpuAdjustableMaxValue() {
            return this.cpuAdjustableMaxValue;
        }

        public DescribeCustinsResourceInfoResponseBodyData setCpuIncreaseRatio(String cpuIncreaseRatio) {
            this.cpuIncreaseRatio = cpuIncreaseRatio;
            return this;
        }
        public String getCpuIncreaseRatio() {
            return this.cpuIncreaseRatio;
        }

        public DescribeCustinsResourceInfoResponseBodyData setCpuIncreaseRatioValue(String cpuIncreaseRatioValue) {
            this.cpuIncreaseRatioValue = cpuIncreaseRatioValue;
            return this;
        }
        public String getCpuIncreaseRatioValue() {
            return this.cpuIncreaseRatioValue;
        }

        public DescribeCustinsResourceInfoResponseBodyData setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeCustinsResourceInfoResponseBodyData setIopsAdjustableMaxValue(String iopsAdjustableMaxValue) {
            this.iopsAdjustableMaxValue = iopsAdjustableMaxValue;
            return this;
        }
        public String getIopsAdjustableMaxValue() {
            return this.iopsAdjustableMaxValue;
        }

        public DescribeCustinsResourceInfoResponseBodyData setMaxConnAdjustDeadline(String maxConnAdjustDeadline) {
            this.maxConnAdjustDeadline = maxConnAdjustDeadline;
            return this;
        }
        public String getMaxConnAdjustDeadline() {
            return this.maxConnAdjustDeadline;
        }

        public DescribeCustinsResourceInfoResponseBodyData setMaxConnAdjustableMaxValue(String maxConnAdjustableMaxValue) {
            this.maxConnAdjustableMaxValue = maxConnAdjustableMaxValue;
            return this;
        }
        public String getMaxConnAdjustableMaxValue() {
            return this.maxConnAdjustableMaxValue;
        }

        public DescribeCustinsResourceInfoResponseBodyData setMaxConnIncreaseRatio(String maxConnIncreaseRatio) {
            this.maxConnIncreaseRatio = maxConnIncreaseRatio;
            return this;
        }
        public String getMaxConnIncreaseRatio() {
            return this.maxConnIncreaseRatio;
        }

        public DescribeCustinsResourceInfoResponseBodyData setMaxConnIncreaseRatioValue(String maxConnIncreaseRatioValue) {
            this.maxConnIncreaseRatioValue = maxConnIncreaseRatioValue;
            return this;
        }
        public String getMaxConnIncreaseRatioValue() {
            return this.maxConnIncreaseRatioValue;
        }

        public DescribeCustinsResourceInfoResponseBodyData setMaxIopsAdjustDeadline(String maxIopsAdjustDeadline) {
            this.maxIopsAdjustDeadline = maxIopsAdjustDeadline;
            return this;
        }
        public String getMaxIopsAdjustDeadline() {
            return this.maxIopsAdjustDeadline;
        }

        public DescribeCustinsResourceInfoResponseBodyData setMaxIopsIncreaseRatio(String maxIopsIncreaseRatio) {
            this.maxIopsIncreaseRatio = maxIopsIncreaseRatio;
            return this;
        }
        public String getMaxIopsIncreaseRatio() {
            return this.maxIopsIncreaseRatio;
        }

        public DescribeCustinsResourceInfoResponseBodyData setMaxIopsIncreaseRatioValue(String maxIopsIncreaseRatioValue) {
            this.maxIopsIncreaseRatioValue = maxIopsIncreaseRatioValue;
            return this;
        }
        public String getMaxIopsIncreaseRatioValue() {
            return this.maxIopsIncreaseRatioValue;
        }

        public DescribeCustinsResourceInfoResponseBodyData setMemAdjustableMaxRatio(String memAdjustableMaxRatio) {
            this.memAdjustableMaxRatio = memAdjustableMaxRatio;
            return this;
        }
        public String getMemAdjustableMaxRatio() {
            return this.memAdjustableMaxRatio;
        }

        public DescribeCustinsResourceInfoResponseBodyData setMemAdjustableMaxValue(String memAdjustableMaxValue) {
            this.memAdjustableMaxValue = memAdjustableMaxValue;
            return this;
        }
        public String getMemAdjustableMaxValue() {
            return this.memAdjustableMaxValue;
        }

        public DescribeCustinsResourceInfoResponseBodyData setMemoryAdjustDeadline(String memoryAdjustDeadline) {
            this.memoryAdjustDeadline = memoryAdjustDeadline;
            return this;
        }
        public String getMemoryAdjustDeadline() {
            return this.memoryAdjustDeadline;
        }

        public DescribeCustinsResourceInfoResponseBodyData setMemoryIncreaseRatio(String memoryIncreaseRatio) {
            this.memoryIncreaseRatio = memoryIncreaseRatio;
            return this;
        }
        public String getMemoryIncreaseRatio() {
            return this.memoryIncreaseRatio;
        }

        public DescribeCustinsResourceInfoResponseBodyData setMemoryIncreaseRatioValue(String memoryIncreaseRatioValue) {
            this.memoryIncreaseRatioValue = memoryIncreaseRatioValue;
            return this;
        }
        public String getMemoryIncreaseRatioValue() {
            return this.memoryIncreaseRatioValue;
        }

        public DescribeCustinsResourceInfoResponseBodyData setOriginCpu(String originCpu) {
            this.originCpu = originCpu;
            return this;
        }
        public String getOriginCpu() {
            return this.originCpu;
        }

        public DescribeCustinsResourceInfoResponseBodyData setOriginMaxConn(String originMaxConn) {
            this.originMaxConn = originMaxConn;
            return this;
        }
        public String getOriginMaxConn() {
            return this.originMaxConn;
        }

        public DescribeCustinsResourceInfoResponseBodyData setOriginMaxIops(String originMaxIops) {
            this.originMaxIops = originMaxIops;
            return this;
        }
        public String getOriginMaxIops() {
            return this.originMaxIops;
        }

        public DescribeCustinsResourceInfoResponseBodyData setOriginMemory(String originMemory) {
            this.originMemory = originMemory;
            return this;
        }
        public String getOriginMemory() {
            return this.originMemory;
        }

    }

}
