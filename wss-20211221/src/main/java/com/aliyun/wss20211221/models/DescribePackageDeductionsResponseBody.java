// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wss20211221.models;

import com.aliyun.tea.*;

public class DescribePackageDeductionsResponseBody extends TeaModel {
    @NameInMap("Deductions")
    public java.util.List<DescribePackageDeductionsResponseBodyDeductions> deductions;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>833C4D2C-09C7-5CE6-8159-06758B964970</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("TotalUsedCoreTime")
    public Float totalUsedCoreTime;

    @NameInMap("TotalUsedTime")
    public Long totalUsedTime;

    public static DescribePackageDeductionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePackageDeductionsResponseBody self = new DescribePackageDeductionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePackageDeductionsResponseBody setDeductions(java.util.List<DescribePackageDeductionsResponseBodyDeductions> deductions) {
        this.deductions = deductions;
        return this;
    }
    public java.util.List<DescribePackageDeductionsResponseBodyDeductions> getDeductions() {
        return this.deductions;
    }

    public DescribePackageDeductionsResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribePackageDeductionsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePackageDeductionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePackageDeductionsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribePackageDeductionsResponseBody setTotalUsedCoreTime(Float totalUsedCoreTime) {
        this.totalUsedCoreTime = totalUsedCoreTime;
        return this;
    }
    public Float getTotalUsedCoreTime() {
        return this.totalUsedCoreTime;
    }

    public DescribePackageDeductionsResponseBody setTotalUsedTime(Long totalUsedTime) {
        this.totalUsedTime = totalUsedTime;
        return this;
    }
    public Long getTotalUsedTime() {
        return this.totalUsedTime;
    }

    public static class DescribePackageDeductionsResponseBodyDeductions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <strong>example:</strong>
         * <p>ecd-6wye9optu0kag****</p>
         */
        @NameInMap("DesktopId")
        public String desktopId;

        /**
         * <strong>example:</strong>
         * <p>DemoComputer</p>
         */
        @NameInMap("DesktopName")
        public String desktopName;

        /**
         * <strong>example:</strong>
         * <p>eds.enterprise_office.4c8g</p>
         */
        @NameInMap("DesktopType")
        public String desktopType;

        /**
         * <strong>example:</strong>
         * <p>2024-07-31T03:00Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>Deleted</p>
         */
        @NameInMap("InstanceState")
        public String instanceState;

        /**
         * <strong>example:</strong>
         * <p>8192</p>
         */
        @NameInMap("Memory")
        public Long memory;

        /**
         * <strong>example:</strong>
         * <p>Windows</p>
         */
        @NameInMap("OsType")
        public String osType;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <strong>example:</strong>
         * <p>2024-07-31T02:00Z</p>
         */
        @NameInMap("StaTime")
        public String staTime;

        /**
         * <strong>example:</strong>
         * <p>4.0</p>
         */
        @NameInMap("UsedCoreTime")
        public Float usedCoreTime;

        /**
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("UsedTime")
        public Long usedTime;

        public static DescribePackageDeductionsResponseBodyDeductions build(java.util.Map<String, ?> map) throws Exception {
            DescribePackageDeductionsResponseBodyDeductions self = new DescribePackageDeductionsResponseBodyDeductions();
            return TeaModel.build(map, self);
        }

        public DescribePackageDeductionsResponseBodyDeductions setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public DescribePackageDeductionsResponseBodyDeductions setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

        public DescribePackageDeductionsResponseBodyDeductions setDesktopName(String desktopName) {
            this.desktopName = desktopName;
            return this;
        }
        public String getDesktopName() {
            return this.desktopName;
        }

        public DescribePackageDeductionsResponseBodyDeductions setDesktopType(String desktopType) {
            this.desktopType = desktopType;
            return this;
        }
        public String getDesktopType() {
            return this.desktopType;
        }

        public DescribePackageDeductionsResponseBodyDeductions setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribePackageDeductionsResponseBodyDeductions setInstanceState(String instanceState) {
            this.instanceState = instanceState;
            return this;
        }
        public String getInstanceState() {
            return this.instanceState;
        }

        public DescribePackageDeductionsResponseBodyDeductions setMemory(Long memory) {
            this.memory = memory;
            return this;
        }
        public Long getMemory() {
            return this.memory;
        }

        public DescribePackageDeductionsResponseBodyDeductions setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public DescribePackageDeductionsResponseBodyDeductions setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribePackageDeductionsResponseBodyDeductions setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribePackageDeductionsResponseBodyDeductions setStaTime(String staTime) {
            this.staTime = staTime;
            return this;
        }
        public String getStaTime() {
            return this.staTime;
        }

        public DescribePackageDeductionsResponseBodyDeductions setUsedCoreTime(Float usedCoreTime) {
            this.usedCoreTime = usedCoreTime;
            return this;
        }
        public Float getUsedCoreTime() {
            return this.usedCoreTime;
        }

        public DescribePackageDeductionsResponseBodyDeductions setUsedTime(Long usedTime) {
            this.usedTime = usedTime;
            return this;
        }
        public Long getUsedTime() {
            return this.usedTime;
        }

    }

}
